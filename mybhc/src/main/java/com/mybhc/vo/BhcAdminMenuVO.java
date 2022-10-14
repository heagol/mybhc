package com.mybhc.vo;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class BhcAdminMenuVO {
	int rno;
	String mid, mname, mfile, msfile, mcontent, mdate, mpay;
	CommonsMultipartFile file1;
	
	public CommonsMultipartFile getFile1() {
		return file1;
	}
	public String getMpay() {
		return mpay;
	}
	public void setMpay(String mpay) {
		this.mpay = mpay;
	}
	public void setFile1(CommonsMultipartFile file1) {
		this.file1 = file1;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMfile() {
		return mfile;
	}
	public void setMfile(String mfile) {
		this.mfile = mfile;
	}
	public String getMsfile() {
		return msfile;
	}
	public void setMsfile(String msfile) {
		this.msfile = msfile;
	}
	public String getMcontent() {
		return mcontent;
	}
	public void setMcontent(String mcontent) {
		this.mcontent = mcontent;
	}
	public String getMdate() {
		return mdate;
	}
	public void setMdate(String mdate) {
		this.mdate = mdate;
	}
	
	
}
