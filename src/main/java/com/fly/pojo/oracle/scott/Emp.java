package com.fly.pojo.oracle.scott;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Emp implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SCOTT.EMP.EMPNO
     *
     * @mbg.generated Fri Jun 22 10:10:34 CST 2018
     */
    private Short empno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SCOTT.EMP.ENAME
     *
     * @mbg.generated Fri Jun 22 10:10:35 CST 2018
     */
    private String ename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SCOTT.EMP.JOB
     *
     * @mbg.generated Fri Jun 22 10:10:35 CST 2018
     */
    private String job;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SCOTT.EMP.MGR
     *
     * @mbg.generated Fri Jun 22 10:10:35 CST 2018
     */
    private Short mgr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SCOTT.EMP.HIREDATE
     *
     * @mbg.generated Fri Jun 22 10:10:35 CST 2018
     */
    private Date hiredate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SCOTT.EMP.SAL
     *
     * @mbg.generated Fri Jun 22 10:10:35 CST 2018
     */
    private BigDecimal sal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SCOTT.EMP.COMM
     *
     * @mbg.generated Fri Jun 22 10:10:35 CST 2018
     */
    private BigDecimal comm;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SCOTT.EMP.DEPTNO
     *
     * @mbg.generated Fri Jun 22 10:10:35 CST 2018
     */
    private Short deptno;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SCOTT.EMP.EMPNO
     *
     * @return the value of SCOTT.EMP.EMPNO
     *
     * @mbg.generated Fri Jun 22 10:10:35 CST 2018
     */
    public Short getEmpno() {
        return empno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SCOTT.EMP.EMPNO
     *
     * @param empno the value for SCOTT.EMP.EMPNO
     *
     * @mbg.generated Fri Jun 22 10:10:35 CST 2018
     */
    public void setEmpno(Short empno) {
        this.empno = empno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SCOTT.EMP.ENAME
     *
     * @return the value of SCOTT.EMP.ENAME
     *
     * @mbg.generated Fri Jun 22 10:10:35 CST 2018
     */
    public String getEname() {
        return ename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SCOTT.EMP.ENAME
     *
     * @param ename the value for SCOTT.EMP.ENAME
     *
     * @mbg.generated Fri Jun 22 10:10:35 CST 2018
     */
    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SCOTT.EMP.JOB
     *
     * @return the value of SCOTT.EMP.JOB
     *
     * @mbg.generated Fri Jun 22 10:10:35 CST 2018
     */
    public String getJob() {
        return job;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SCOTT.EMP.JOB
     *
     * @param job the value for SCOTT.EMP.JOB
     *
     * @mbg.generated Fri Jun 22 10:10:35 CST 2018
     */
    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SCOTT.EMP.MGR
     *
     * @return the value of SCOTT.EMP.MGR
     *
     * @mbg.generated Fri Jun 22 10:10:35 CST 2018
     */
    public Short getMgr() {
        return mgr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SCOTT.EMP.MGR
     *
     * @param mgr the value for SCOTT.EMP.MGR
     *
     * @mbg.generated Fri Jun 22 10:10:35 CST 2018
     */
    public void setMgr(Short mgr) {
        this.mgr = mgr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SCOTT.EMP.HIREDATE
     *
     * @return the value of SCOTT.EMP.HIREDATE
     *
     * @mbg.generated Fri Jun 22 10:10:35 CST 2018
     */
    public Date getHiredate() {
        return hiredate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SCOTT.EMP.HIREDATE
     *
     * @param hiredate the value for SCOTT.EMP.HIREDATE
     *
     * @mbg.generated Fri Jun 22 10:10:35 CST 2018
     */
    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SCOTT.EMP.SAL
     *
     * @return the value of SCOTT.EMP.SAL
     *
     * @mbg.generated Fri Jun 22 10:10:35 CST 2018
     */
    public BigDecimal getSal() {
        return sal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SCOTT.EMP.SAL
     *
     * @param sal the value for SCOTT.EMP.SAL
     *
     * @mbg.generated Fri Jun 22 10:10:35 CST 2018
     */
    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SCOTT.EMP.COMM
     *
     * @return the value of SCOTT.EMP.COMM
     *
     * @mbg.generated Fri Jun 22 10:10:35 CST 2018
     */
    public BigDecimal getComm() {
        return comm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SCOTT.EMP.COMM
     *
     * @param comm the value for SCOTT.EMP.COMM
     *
     * @mbg.generated Fri Jun 22 10:10:35 CST 2018
     */
    public void setComm(BigDecimal comm) {
        this.comm = comm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SCOTT.EMP.DEPTNO
     *
     * @return the value of SCOTT.EMP.DEPTNO
     *
     * @mbg.generated Fri Jun 22 10:10:35 CST 2018
     */
    public Short getDeptno() {
        return deptno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SCOTT.EMP.DEPTNO
     *
     * @param deptno the value for SCOTT.EMP.DEPTNO
     *
     * @mbg.generated Fri Jun 22 10:10:35 CST 2018
     */
    public void setDeptno(Short deptno) {
        this.deptno = deptno;
    }
}