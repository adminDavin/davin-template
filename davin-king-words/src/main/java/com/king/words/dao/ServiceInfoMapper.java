package com.king.words.dao;

import com.king.words.model.ServiceInfo;
import com.king.words.model.ServiceInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serviceinfo
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    long countByExample(ServiceInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serviceinfo
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    int deleteByExample(ServiceInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serviceinfo
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    int deleteByPrimaryKey(Integer serviceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serviceinfo
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    int insert(ServiceInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serviceinfo
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    int insertSelective(ServiceInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serviceinfo
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    List<ServiceInfo> selectByExample(ServiceInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serviceinfo
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    ServiceInfo selectByPrimaryKey(Integer serviceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serviceinfo
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    int updateByExampleSelective(@Param("record") ServiceInfo record, @Param("example") ServiceInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serviceinfo
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    int updateByExample(@Param("record") ServiceInfo record, @Param("example") ServiceInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serviceinfo
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    int updateByPrimaryKeySelective(ServiceInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serviceinfo
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    int updateByPrimaryKey(ServiceInfo record);
}