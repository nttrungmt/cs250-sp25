package lab06;
public class Contact {
	protected String name, phone, email, group;	//contact information
	
	//constructor methods
	public Contact() {}
	public Contact(String name, String phone, String email, String group) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.group = group;
	}
	
	//get and set methods for each attribute
	public String getName()  {		return name;	}
	public String getPhone() {		return phone;	}
	public String getEmail() {		return email;	}
	public String getGroup() {		return group;	}
	public void setName(String name) 		{	this.name = name;		}
	public void setPhone(String phone)		{	this.phone = phone;		}
	public void setEmail(String email)		{	this.email = email;		}
	public void setGroup(String group)		{	this.group = group;		}
	
	//Return a string representation of a Contact object
	@Override
	public String toString() {
		return "name=" + name + ", phone=" + phone + ", email=" + email
                     + ", group=" + group;	
	}
}
