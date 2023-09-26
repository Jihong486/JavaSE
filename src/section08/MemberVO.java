package section08;

public class MemberVO {
	// 접근제한자 private은 다른 클래스에서 사용못하고 해당class에서만 사용가능.
	private String id;
	private String password;
	private String name;
	private String mobile;
	private String email;
	
	//접근제한자 public은 다른 클래스에서 사용 가능.
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
