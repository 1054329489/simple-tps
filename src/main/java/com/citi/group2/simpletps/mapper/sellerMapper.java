package com.citi.group2.simpletps.mapper;

import com.citi.group2.simpletps.entity.seller;

public interface sellerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer sId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller
     *
     * @mbggenerated
     */
    int insert(seller record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller
     *
     * @mbggenerated
     */
    int insertSelective(seller record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller
     *
     * @mbggenerated
     */
    seller selectByPrimaryKey(Integer sId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(seller record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(seller record);
}