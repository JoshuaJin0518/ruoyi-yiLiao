package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Stu;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2023-07-10
 */
public interface StuMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Stu selectStuById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param stu 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Stu> selectStuList(Stu stu);

    /**
     * 新增【请填写功能名称】
     * 
     * @param stu 【请填写功能名称】
     * @return 结果
     */
    public int insertStu(Stu stu);

    /**
     * 修改【请填写功能名称】
     * 
     * @param stu 【请填写功能名称】
     * @return 结果
     */
    public int updateStu(Stu stu);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteStuById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStuByIds(Long[] ids);
}
