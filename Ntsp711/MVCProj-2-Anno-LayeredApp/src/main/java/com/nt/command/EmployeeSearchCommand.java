package com.nt.command;




public class EmployeeSearchCommand {
//	private int eno;
	private String ename;
	private String desg;
	private float salary;
	private int deptno;
	private int mgrno;
	public EmployeeSearchCommand() {
		System.out.println("command 0-param constructor");
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public int getMgrno() {
		return mgrno;
	}
	public void setMgrno(int mgrno) {
		this.mgrno = mgrno;
	}

}
