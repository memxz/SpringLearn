package com.hardes.ssm.pojo;

public class Person {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column person.id
     *
     * @mbg.generated Wed Oct 30 16:28:23 SGT 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column person.userName
     *
     * @mbg.generated Wed Oct 30 16:28:23 SGT 2019
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column person.age
     *
     * @mbg.generated Wed Oct 30 16:28:23 SGT 2019
     */
    private Integer age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column person.mobilePhone
     *
     * @mbg.generated Wed Oct 30 16:28:23 SGT 2019
     */
    private Integer mobilephone;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column person.id
     *
     * @return the value of person.id
     *
     * @mbg.generated Wed Oct 30 16:28:23 SGT 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column person.id
     *
     * @param id the value for person.id
     *
     * @mbg.generated Wed Oct 30 16:28:23 SGT 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column person.userName
     *
     * @return the value of person.userName
     *
     * @mbg.generated Wed Oct 30 16:28:23 SGT 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column person.userName
     *
     * @param username the value for person.userName
     *
     * @mbg.generated Wed Oct 30 16:28:23 SGT 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column person.age
     *
     * @return the value of person.age
     *
     * @mbg.generated Wed Oct 30 16:28:23 SGT 2019
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column person.age
     *
     * @param age the value for person.age
     *
     * @mbg.generated Wed Oct 30 16:28:23 SGT 2019
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column person.mobilePhone
     *
     * @return the value of person.mobilePhone
     *
     * @mbg.generated Wed Oct 30 16:28:23 SGT 2019
     */
    public Integer getMobilephone() {
        return mobilephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column person.mobilePhone
     *
     * @param mobilephone the value for person.mobilePhone
     *
     * @mbg.generated Wed Oct 30 16:28:23 SGT 2019
     */
    public void setMobilephone(Integer mobilephone) {
        this.mobilephone = mobilephone;
    }
}