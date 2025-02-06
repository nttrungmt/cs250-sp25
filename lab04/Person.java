package lab04;
public class Person {
	private int ssn;		//person's ssn
	private String name;	       //person's name
	private String birthday;	//person's birthday, e.g. "1/21/2000"
	
	public Person() {};         //empty constructor method
       public Person(int ssn, String name, String birthday) {
		this.ssn = ssn;
		this.name = name;
		this.birthday = birthday;
	}
	
	public int getSSN()                    { return ssn;	       }
	public void setSSN(int ssn)            { this.ssn = ssn;	}
	public String getName()                { return name;         }
	public void setName(String name)       {	this.name = name;	}
	public String getBirthDay()            { return birthday;	  }
	public void setBirthDay(String bDay)   { this.birthday = bDay;  }

	public String toString() {
		return "Person: " + ssn + ", " + name + ", " + birthDay;
	}
}
