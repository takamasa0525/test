package com.internousdev.ecsite.dto;

public class AdminDTO {
	private String adminId;
	private String adminPassword;
	private String adminName;
	private boolean adminFlg = false;

	public String getAdminId(){
		return adminId;
	}
	public void setAdminId(String adminId){
		this.adminId = adminId;
	}
	public String getAdminPassword(){
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword){
		this.adminPassword = adminPassword;
	}
	public String getAdminName(){
		return adminName;
	}
	public void setAdminName(String adminName){
		this.adminName = adminName;
	}
	public boolean getAdminFlg(){
		return adminFlg;
	}
	public void setAdminFlg(boolean adminFlg){
		this.adminFlg = adminFlg;
	}
}
