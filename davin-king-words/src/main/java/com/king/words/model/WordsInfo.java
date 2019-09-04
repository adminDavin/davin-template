package com.king.words.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class WordsInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wordsinfo.wordsId
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private Integer wordsid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wordsinfo.docId
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private String docid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wordsinfo.userId
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wordsinfo.textContent
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private String textcontent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wordsinfo.initPage
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private Integer initpage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wordsinfo.pageNum
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private Integer pagenum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wordsinfo.state
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private Integer state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wordsinfo.createTime
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyyMMddHHmmss")
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wordsinfo.updateTime
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyyMMddHHmmss")
    private Date updatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wordsinfo
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wordsinfo.wordsId
     *
     * @return the value of wordsinfo.wordsId
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public Integer getWordsid() {
        return wordsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wordsinfo.wordsId
     *
     * @param wordsid the value for wordsinfo.wordsId
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setWordsid(Integer wordsid) {
        this.wordsid = wordsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wordsinfo.docId
     *
     * @return the value of wordsinfo.docId
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public String getDocid() {
        return docid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wordsinfo.docId
     *
     * @param docid the value for wordsinfo.docId
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setDocid(String docid) {
        this.docid = docid == null ? null : docid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wordsinfo.userId
     *
     * @return the value of wordsinfo.userId
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wordsinfo.userId
     *
     * @param userid the value for wordsinfo.userId
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wordsinfo.textContent
     *
     * @return the value of wordsinfo.textContent
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public String getTextcontent() {
        return textcontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wordsinfo.textContent
     *
     * @param textcontent the value for wordsinfo.textContent
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setTextcontent(String textcontent) {
        this.textcontent = textcontent == null ? null : textcontent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wordsinfo.initPage
     *
     * @return the value of wordsinfo.initPage
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public Integer getInitpage() {
        return initpage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wordsinfo.initPage
     *
     * @param initpage the value for wordsinfo.initPage
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setInitpage(Integer initpage) {
        this.initpage = initpage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wordsinfo.pageNum
     *
     * @return the value of wordsinfo.pageNum
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public Integer getPagenum() {
        return pagenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wordsinfo.pageNum
     *
     * @param pagenum the value for wordsinfo.pageNum
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setPagenum(Integer pagenum) {
        this.pagenum = pagenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wordsinfo.state
     *
     * @return the value of wordsinfo.state
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wordsinfo.state
     *
     * @param state the value for wordsinfo.state
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wordsinfo.createTime
     *
     * @return the value of wordsinfo.createTime
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wordsinfo.createTime
     *
     * @param createtime the value for wordsinfo.createTime
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wordsinfo.updateTime
     *
     * @return the value of wordsinfo.updateTime
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wordsinfo.updateTime
     *
     * @param updatetime the value for wordsinfo.updateTime
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wordsinfo
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wordsid=").append(wordsid);
        sb.append(", docid=").append(docid);
        sb.append(", userid=").append(userid);
        sb.append(", textcontent=").append(textcontent);
        sb.append(", initpage=").append(initpage);
        sb.append(", pagenum=").append(pagenum);
        sb.append(", state=").append(state);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append("]");
        return sb.toString();
    }
}