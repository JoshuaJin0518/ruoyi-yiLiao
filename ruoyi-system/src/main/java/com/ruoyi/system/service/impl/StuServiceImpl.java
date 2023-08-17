package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StuMapper;
import com.ruoyi.system.domain.Stu;
import com.ruoyi.system.service.IStuService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-07-10
 */
@Service
public class StuServiceImpl implements IStuService 
{
    @Autowired
    private StuMapper stuMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Stu selectStuById(Long id)
    {
        return stuMapper.selectStuById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param stu 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Stu> selectStuList(Stu stu)
    {
        return stuMapper.selectStuList(stu);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param stu 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertStu(Stu stu)
    {
        return stuMapper.insertStu(stu);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param stu 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateStu(Stu stu)
    {
        return stuMapper.updateStu(stu);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteStuByIds(Long[] ids)
    {
        return stuMapper.deleteStuByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteStuById(Long id)
    {
        return stuMapper.deleteStuById(id);
    }
}
