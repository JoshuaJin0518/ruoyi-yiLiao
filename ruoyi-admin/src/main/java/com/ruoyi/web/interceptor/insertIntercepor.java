package com.ruoyi.web.interceptor;

//用来拦截insert 进行id的添加

import com.ruoyi.common.utils.DataBus;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.ruoyi_yiliao.uitl.StringUitl;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.executor.Executor;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

@Slf4j
//进行方法的拦截
@Intercepts(@Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class}))
public class insertIntercepor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Object[] args = invocation.getArgs();
        MappedStatement mappedStatement = (MappedStatement) invocation.getArgs()[0];
        if (mappedStatement != null) {
            //获得sql的类型
            SqlCommandType sqlCommandType = mappedStatement.getSqlCommandType();
            if (sqlCommandType.toString().equalsIgnoreCase("insert")) {
//                log.info("sql类型{}", sqlCommandType);
                Object arg = invocation.getArgs()[1];
                Class<?> aClass = arg.getClass();
                for (Field declaredField : aClass.getDeclaredFields()) {
                    declaredField.setAccessible(true);
                    if (declaredField.getName().equalsIgnoreCase("id")) {
                        if (declaredField.get(arg) == null) {
                            String s = SecurityUtils.getUsername() + System.currentTimeMillis();
                            DataBus.TEMP = s;
                            declaredField.set(arg, s);
                            Object o = declaredField.get(arg);
                        }
                    } else if (declaredField.getName().equalsIgnoreCase("operator")
                            || declaredField.getName().equalsIgnoreCase("userName")) {
                        String s = SecurityUtils.getUsername();
                        declaredField.set(arg, s);
                        Object o = declaredField.get(arg);
                    } else if (declaredField.getName().equalsIgnoreCase("createTime")) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-hh HH:mmm:ss");
                        String format = simpleDateFormat.format(new Date(System.currentTimeMillis()));
                        System.out.println(format);
                        //插入时间
                        declaredField.set(arg, format);
                        Object o = declaredField.get(arg);
                    }
                }
            } else if (sqlCommandType.toString().equalsIgnoreCase("update")) {
//                log.info("sql类型{}", sqlCommandType);
                Object arg = invocation.getArgs()[1];
                Class<?> aClass = arg.getClass();
                for (Field declaredField : aClass.getDeclaredFields()) {
                    declaredField.setAccessible(true);
                    if (declaredField.getName().equalsIgnoreCase("updateTime")) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-hh HH:mmm:ss");
                        String format = simpleDateFormat.format(new Date(System.currentTimeMillis()));
                        System.out.println(format);
                        //插入时间
                        declaredField.set(arg, format);
                        Object o = declaredField.get(arg);
                    }
                }
            }
        }

        return invocation.proceed();
    }


    @Override
    public Object plugin(Object target) {
        return Interceptor.super.plugin(target);
    }

    @Override
    public void setProperties(Properties properties) {
        Interceptor.super.setProperties(properties);
    }

//    public void a(Invocation invocation) {
//        Object[] args = invocation.getArgs();
//        MappedStatement mappedStatement = (MappedStatement) invocation.getArgs()[0];
//        //获得方法名
//        String s = StringUitl.lastSubString(".", mappedStatement.getId());
//        //获得对象名
//        String object = StringUitl.cutlast(".", mappedStatement.getId());
//        Object arg = invocation.getArgs()[1];
//        Object id = id(arg);
//        Object status = status(arg);
//        if (object != null && id != null && status != null) {
//            //比较数据是否发生变化
//            if (s.equals("updateTMedicalLisInfo")) {
//                if (StringUitl.itMedicalPacsInfoService(id, status)) {
//                    System.out.println("修改");
//                }
//            }
////            else if (s.equals("updateTMedicalPacsInfo")) {
////                if (objectUitl.itMedicalLisInfoService(id, status)) {
////                    System.out.println("修改");
////                }
////            }
//        }
//    }


    public Object id(Object arg) {
        Class<?> aClass = arg.getClass();
        System.out.println(arg);
        for (Field declaredField : aClass.getDeclaredFields()) {
            declaredField.setAccessible(true);
            if (declaredField.getName().equalsIgnoreCase("id")) {
                try {
                    Object o = declaredField.get(arg);
                    if (o != null) {
                        return o;
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return null;
    }

    public Object status(Object arg) {
        Class<?> aClass = arg.getClass();
        System.out.println(arg);
        for (Field declaredField : aClass.getDeclaredFields()) {
            declaredField.setAccessible(true);
            if (declaredField.getName().equalsIgnoreCase("status")) {
                try {
                    Object o = declaredField.get(arg);
                    if (o != null) {
                        return o;
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return null;
    }
}
