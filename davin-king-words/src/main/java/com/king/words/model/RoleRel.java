package com.king.words.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RoleRel implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rolerel.roleRelId
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private Integer rolerelid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rolerel.roleId
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private Integer roleid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rolerel.authId
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private Integer authid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rolerel.state
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private Integer state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rolerel.createDate
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyyMMddHHmmss")
    private Date createdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rolerel.expireDate
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyyMMddHHmmss")
    private Date expiredate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rolerel
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rolerel.roleRelId
     *
     * @return the value of rolerel.roleRelId
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public Integer getRolerelid() {
        return rolerelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rolerel.roleRelId
     *
     * @param rolerelid the value for rolerel.roleRelId
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setRolerelid(Integer rolerelid) {
        this.rolerelid = rolerelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rolerel.roleId
     *
     * @return the value of rolerel.roleId
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rolerel.roleId
     *
     * @param roleid the value for rolerel.roleId
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rolerel.authId
     *
     * @return the value of rolerel.authId
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public Integer getAuthid() {
        return authid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rolerel.authId
     *
     * @param authid the value for rolerel.authId
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setAuthid(Integer authid) {
        this.authid = authid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rolerel.state
     *
     * @return the value of rolerel.state
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rolerel.state
     *
     * @param state the value for rolerel.state
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rolerel.createDate
     *
     * @return the value of rolerel.createDate
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rolerel.createDate
     *
     * @param createdate the value for rolerel.createDate
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rolerel.expireDate
     *
     * @return the value of rolerel.expireDate
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public Date getExpiredate() {
        return expiredate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rolerel.expireDate
     *
     * @param expiredate the value for rolerel.expireDate
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setExpiredate(Date expiredate) {
        this.expiredate = expiredate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rolerel
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rolerelid=").append(rolerelid);
        sb.append(", roleid=").append(roleid);
        sb.append(", authid=").append(authid);
        sb.append(", state=").append(state);
        sb.append(", createdate=").append(createdate);
        sb.append(", expiredate=").append(expiredate);
        sb.append("]");
        return sb.toString();
    }
}