package lab06;
import java.util.ArrayList;
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

	public static ArrayList<Contact> getSampleData() {
		ArrayList<Contact> list = new ArrayList<>();
		list.add(new Contact("Tamekah Stafford","(746) 824-8981","quis.pede@protonmail.couk","Friend"));
		list.add(new Contact("Irma Melendez","(758) 586-8178","arcu@google.org","Family"));
		list.add(new Contact("Kenneth Bullock","1-382-141-7788","nullam.enim@google.org", "Friend"));
		list.add(new Contact("Troy Rush","(425) 321-2541","ultrices.posure.cubilia@icloud.net", "Other"));
		list.add(new Contact("Kennan Carney","(254) 947-3933","id@yahoo.ca", "Friend"));
		return list;
	}
}
