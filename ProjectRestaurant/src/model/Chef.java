package model;

public class Chef extends User {
	
	private String id;
    private String name;
    private String email;
    private String address;
    private String gender;
	
	public Chef(String username, String password, String id, String name, String email, String address,
			String gender) {
		super(username, password);
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.gender = gender;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
    
    
}
