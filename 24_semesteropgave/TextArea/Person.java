package View;

public class Person {
	
	private String name;
    private String lastName;
    private String city;
    private int age;
    
    public Person(String name, String lastName, String city, int age) 
    {
		this.setName(name);
		this.setLastName(lastName);
		this.setCity(city);
		this.setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String toString()
	{
		return "\t" +name + "\t" + lastName + "\t" + city + "\t" + age;
				
	}

}
