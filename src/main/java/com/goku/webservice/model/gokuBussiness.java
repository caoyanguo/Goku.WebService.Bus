package com.goku.webservice.model;

import java.util.Date;

public class gokuBussiness extends gokuBussinessKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goku_bussiness.sqltemplate
     *
     * @mbg.generated
     */
    private String sqltemplate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goku_bussiness.createdate
     *
     * @mbg.generated
     */
    private Date createdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goku_bussiness.useflag
     *
     * @mbg.generated
     */
    private String useflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goku_bussiness.remarks
     *
     * @mbg.generated
     */
    private String remarks;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goku_bussiness.sqltemplate
     *
     * @return the value of goku_bussiness.sqltemplate
     *
     * @mbg.generated
     */
    public String getSqltemplate() {
        return sqltemplate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goku_bussiness.sqltemplate
     *
     * @param sqltemplate the value for goku_bussiness.sqltemplate
     *
     * @mbg.generated
     */
    public void setSqltemplate(String sqltemplate) {
        this.sqltemplate = sqltemplate == null ? null : sqltemplate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goku_bussiness.createdate
     *
     * @return the value of goku_bussiness.createdate
     *
     * @mbg.generated
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goku_bussiness.createdate
     *
     * @param createdate the value for goku_bussiness.createdate
     *
     * @mbg.generated
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goku_bussiness.useflag
     *
     * @return the value of goku_bussiness.useflag
     *
     * @mbg.generated
     */
    public String getUseflag() {
        return useflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goku_bussiness.useflag
     *
     * @param useflag the value for goku_bussiness.useflag
     *
     * @mbg.generated
     */
    public void setUseflag(String useflag) {
        this.useflag = useflag == null ? null : useflag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goku_bussiness.remarks
     *
     * @return the value of goku_bussiness.remarks
     *
     * @mbg.generated
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goku_bussiness.remarks
     *
     * @param remarks the value for goku_bussiness.remarks
     *
     * @mbg.generated
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}