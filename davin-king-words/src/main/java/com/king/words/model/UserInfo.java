package com.king.words.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class UserInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.userId
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.organize
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private String organize;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.name
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.namePin
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private String namepin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.sex
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private Integer sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.email
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.phone
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.zoneqq
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private String zoneqq;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.address
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.state
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private Integer state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.applyDate
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyyMMddHHmmss")
    private Date applydate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.acceptDate
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyyMMddHHmmss")
    private Date acceptdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.accepterId
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private Integer accepterid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.accepter
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private String accepter;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.remark
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.birthDate
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyyMMddHHmmss")
    private Date birthdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table userinfo
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.userId
     *
     * @return the value of userinfo.userId
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.userId
     *
     * @param userid the value for userinfo.userId
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.organize
     *
     * @return the value of userinfo.organize
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public String getOrganize() {
        return organize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.organize
     *
     * @param organize the value for userinfo.organize
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setOrganize(String organize) {
        this.organize = organize == null ? null : organize.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.name
     *
     * @return the value of userinfo.name
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.name
     *
     * @param name the value for userinfo.name
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.namePin
     *
     * @return the value of userinfo.namePin
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public String getNamepin() {
        return namepin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.namePin
     *
     * @param namepin the value for userinfo.namePin
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setNamepin(String namepin) {
        this.namepin = namepin == null ? null : namepin.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.sex
     *
     * @return the value of userinfo.sex
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.sex
     *
     * @param sex the value for userinfo.sex
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.email
     *
     * @return the value of userinfo.email
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.email
     *
     * @param email the value for userinfo.email
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.phone
     *
     * @return the value of userinfo.phone
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.phone
     *
     * @param phone the value for userinfo.phone
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.zoneqq
     *
     * @return the value of userinfo.zoneqq
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public String getZoneqq() {
        return zoneqq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.zoneqq
     *
     * @param zoneqq the value for userinfo.zoneqq
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setZoneqq(String zoneqq) {
        this.zoneqq = zoneqq == null ? null : zoneqq.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.address
     *
     * @return the value of userinfo.address
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.address
     *
     * @param address the value for userinfo.address
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.state
     *
     * @return the value of userinfo.state
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.state
     *
     * @param state the value for userinfo.state
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.applyDate
     *
     * @return the value of userinfo.applyDate
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public Date getApplydate() {
        return applydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.applyDate
     *
     * @param applydate the value for userinfo.applyDate
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.acceptDate
     *
     * @return the value of userinfo.acceptDate
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public Date getAcceptdate() {
        return acceptdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.acceptDate
     *
     * @param acceptdate the value for userinfo.acceptDate
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setAcceptdate(Date acceptdate) {
        this.acceptdate = acceptdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.accepterId
     *
     * @return the value of userinfo.accepterId
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public Integer getAccepterid() {
        return accepterid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.accepterId
     *
     * @param accepterid the value for userinfo.accepterId
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setAccepterid(Integer accepterid) {
        this.accepterid = accepterid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.accepter
     *
     * @return the value of userinfo.accepter
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public String getAccepter() {
        return accepter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.accepter
     *
     * @param accepter the value for userinfo.accepter
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setAccepter(String accepter) {
        this.accepter = accepter == null ? null : accepter.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.remark
     *
     * @return the value of userinfo.remark
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.remark
     *
     * @param remark the value for userinfo.remark
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.birthDate
     *
     * @return the value of userinfo.birthDate
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public Date getBirthdate() {
        return birthdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.birthDate
     *
     * @param birthdate the value for userinfo.birthDate
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", organize=").append(organize);
        sb.append(", name=").append(name);
        sb.append(", namepin=").append(namepin);
        sb.append(", sex=").append(sex);
        sb.append(", email=").append(email);
        sb.append(", phone=").append(phone);
        sb.append(", zoneqq=").append(zoneqq);
        sb.append(", address=").append(address);
        sb.append(", state=").append(state);
        sb.append(", applydate=").append(applydate);
        sb.append(", acceptdate=").append(acceptdate);
        sb.append(", accepterid=").append(accepterid);
        sb.append(", accepter=").append(accepter);
        sb.append(", remark=").append(remark);
        sb.append(", birthdate=").append(birthdate);
        sb.append("]");
        return sb.toString();
    }
}