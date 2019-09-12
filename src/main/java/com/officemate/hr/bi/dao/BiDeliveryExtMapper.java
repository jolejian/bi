package com.officemate.hr.bi.dao;

import com.officemate.hr.bi.entity.BiDelivery;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface BiDeliveryExtMapper {

    @Select({
            "select",
            "delivery_id, delivery_line, location",
            "from bi_delivery",
            "where delivery_id = #{deliveryId,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="delivery_id", property="deliveryId", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="delivery_line", property="deliveryLine", jdbcType=JdbcType.VARCHAR),
            @Result(column="location", property="location", jdbcType=JdbcType.VARCHAR)
    })
    BiDelivery selectByPrimaryKeyX(Integer deliveryId);
}
