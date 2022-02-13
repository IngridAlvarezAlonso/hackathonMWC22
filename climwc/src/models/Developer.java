package models;

public class Developer {
	private String name;
	private String email;
	private String category; //TODO: Mirar de hacer un tipo de dato "category"
	private String phone;
	private String date; //TODO: Mejora: Ponerlo en formato fecha.
	
	public Developer(String name, String email, String category, String phone, String date) {
		super();
		this.name = name;
		this.email = email;
		this.category = category;
		this.phone = phone;
		this.date = date;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
