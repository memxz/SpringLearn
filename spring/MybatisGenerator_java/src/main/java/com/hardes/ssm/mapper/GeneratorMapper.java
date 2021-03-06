package com.hardes.ssm.mapper;

import com.hardes.ssm.pojo.Generator;
import com.hardes.ssm.pojo.GeneratorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GeneratorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table generator
     *
     * @mbg.generated Wed Oct 30 15:52:46 SGT 2019
     */
    long countByExample(GeneratorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table generator
     *
     * @mbg.generated Wed Oct 30 15:52:46 SGT 2019
     */
    int deleteByExample(GeneratorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table generator
     *
     * @mbg.generated Wed Oct 30 15:52:46 SGT 2019
     */
    int deleteByPrimaryKey(String user);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table generator
     *
     * @mbg.generated Wed Oct 30 15:52:46 SGT 2019
     */
    int insert(Generator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table generator
     *
     * @mbg.generated Wed Oct 30 15:52:46 SGT 2019
     */
    int insertSelective(Generator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table generator
     *
     * @mbg.generated Wed Oct 30 15:52:46 SGT 2019
     */
    List<Generator> selectByExample(GeneratorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table generator
     *
     * @mbg.generated Wed Oct 30 15:52:46 SGT 2019
     */
    Generator selectByPrimaryKey(String user);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table generator
     *
     * @mbg.generated Wed Oct 30 15:52:46 SGT 2019
     */
    int updateByExampleSelective(@Param("record") Generator record, @Param("example") GeneratorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table generator
     *
     * @mbg.generated Wed Oct 30 15:52:46 SGT 2019
     */
    int updateByExample(@Param("record") Generator record, @Param("example") GeneratorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table generator
     *
     * @mbg.generated Wed Oct 30 15:52:46 SGT 2019
     */
    int updateByPrimaryKeySelective(Generator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table generator
     *
     * @mbg.generated Wed Oct 30 15:52:46 SGT 2019
     */
    int updateByPrimaryKey(Generator record);
}