package com.king.words.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ServiceInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column serviceinfo.serviceId
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private Integer serviceid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column serviceinfo.name
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column serviceinfo.description
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column serviceinfo.action
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private String action;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column serviceinfo.state
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private Integer state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column serviceinfo.createDate
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyyMMddHHmmss")
    private Date createdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column serviceinfo.modifyDate
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyyMMddHHmmss")
    private Date modifydate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table serviceinfo
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column serviceinfo.serviceId
     *
     * @return the value of serviceinfo.serviceId
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public Integer getServiceid() {
        return serviceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column serviceinfo.serviceId
     *
     * @param serviceid the value for serviceinfo.serviceId
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column serviceinfo.name
     *
     * @return the value of serviceinfo.name
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column serviceinfo.name
     *
     * @param name the value for serviceinfo.name
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column serviceinfo.description
     *
     * @return the value of serviceinfo.description
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column serviceinfo.description
     *
     * @param description the value for serviceinfo.description
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column serviceinfo.action
     *
     * @return the value of serviceinfo.action
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public String getAction() {
        return action;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column serviceinfo.action
     *
     * @param action the value for serviceinfo.action
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column serviceinfo.state
     *
     * @return the value of serviceinfo.state
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column serviceinfo.state
     *
     * @param state the value for serviceinfo.state
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column serviceinfo.createDate
     *
     * @return the value of serviceinfo.createDate
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column serviceinfo.createDate
     *
     * @param createdate the value for serviceinfo.createDate
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column serviceinfo.modifyDate
     *
     * @return the value of serviceinfo.modifyDate
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column serviceinfo.modifyDate
     *
     * @param modifydate the value for serviceinfo.modifyDate
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serviceinfo
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serviceid=").append(serviceid);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", action=").append(action);
        sb.append(", state=").append(state);
        sb.append(", createdate=").append(createdate);
        sb.append(", modifydate=").append(modifydate);
        sb.append("]");
        return sb.toString();
    }
}