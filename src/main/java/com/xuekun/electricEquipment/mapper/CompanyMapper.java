package com.xuekun.electricEquipment.mapper;

import com.xuekun.electricEquipment.pojo.Company;
import java.util.List;

public interface CompanyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer companyId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company
     *
     * @mbggenerated
     */
    int insert(Company record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company
     *
     * @mbggenerated
     */
    Company selectByPrimaryKey(Integer companyId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company
     *
     * @mbggenerated
     */
    List<Company> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Company record);
}