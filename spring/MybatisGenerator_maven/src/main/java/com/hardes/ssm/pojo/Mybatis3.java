package com.hardes.ssm.pojo;

import java.util.Date;

public class Mybatis3 {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mybatis3.id
     *
     * @mbg.generated Wed Oct 30 16:28:23 SGT 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mybatis3.username
     *
     * @mbg.generated Wed Oct 30 16:28:23 SGT 2019
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mybatis3.birthday
     *
     * @mbg.generated Wed Oct 30 16:28:23 SGT 2019
     */
    private Date birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mybatis3.sex
     *
     * @mbg.generated Wed Oct 30 16:28:23 SGT 2019
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mybatis3.address
     *
     * @mbg.generated Wed Oct 30 16:28:23 SGT 2019
     */
    private String address;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mybatis3.id
     *
     * @return the value of mybatis3.id
     *
     * @mbg.generated Wed Oct 30 16:28:23 SGT 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mybatis3.id
     *
     * @param id the value for mybatis3.id
     *
     * @mbg.generated Wed Oct 30 16:28:23 SGT 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mybatis3.username
     *
     * @return the value of mybatis3.username
     *
     * @mbg.generated Wed Oct 30 16:28:23 SGT 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mybatis3.username
     *
     * @param username the value for mybatis3.username
     *
     * @mbg.generated Wed Oct 30 16:28:23 SGT 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mybatis3.birthday
     *
     * @return the value of mybatis3.birthday
     *
     * @mbg.generated Wed Oct 30 16:28:23 SGT 2019
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mybatis3.birthday
     *
     * @param birthday the value for mybatis3.birthday
     *
     * @mbg.generated Wed Oct 30 16:28:23 SGT 2019
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mybatis3.sex
     *
     * @return the value of mybatis3.sex
     *
     * @mbg.generated Wed Oct 30 16:28:23 SGT 2019
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mybatis3.sex
     *
     * @param sex the value for mybatis3.sex
     *
     * @mbg.generated Wed Oct 30 16:28:23 SGT 2019
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mybatis3.address
     *
     * @return the value of mybatis3.address
     *
     * @mbg.generated Wed Oct 30 16:28:23 SGT 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mybatis3.address
     *
     * @param address the value for mybatis3.address
     *
     * @mbg.generated Wed Oct 30 16:28:23 SGT 2019
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}