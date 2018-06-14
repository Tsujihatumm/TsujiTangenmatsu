package jp.co.axiz.web.entity;

public class User {

	private Integer userId;
	private String userName;
	private String telNo;
	private String password;

	@Override
	public String toString() {
		return "User [id=" + userId + ", name=" + userName + ", tel=" + telNo + ",pass"+password+ "]";
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
