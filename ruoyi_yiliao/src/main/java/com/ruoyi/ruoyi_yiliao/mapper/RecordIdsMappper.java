package com.ruoyi.ruoyi_yiliao.mapper;

import com.ruoyi.ruoyi_yiliao.domain.RecordId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RecordIdsMappper {

    //获得所有
//    @Select("  SELECT r.`id`, a.`name`, r.`createTime`\n" +
//            "        FROM `t_medical_outpatientdoctor_receiverecord` r\n" +
//            "        \n" +
//            "        INNER JOIN `t_medical_cost_outpatient_info` i ON i.`id` = r.`outpatientId`\n" +
//            "        INNER JOIN `t_medical_cost_person_archives` a ON a.`id` = i.`personId`")
    List<RecordId> getAll();

    //根据接诊记录id
    @Select("SELECT ar.`name`,ar.`id`,r.`doctorId` FROM\n" +
            "t_medical_outpatientDoctor_action a INNER JOIN t_medical_outpatientDoctor_receiveRecord r\n" +
            "ON a.`opDoctorReceiveRecordId` = r.`id` INNER JOIN t_medical_cost_outpatient_info i\n" +
            "ON  r.`outpatientId` = i.`id` INNER JOIN t_medical_cost_person_archives ar \n" +
            "ON  ar.`id` = i.`personId` where a.id=#{rid}")
    List<RecordId> getId(String rid);
}
