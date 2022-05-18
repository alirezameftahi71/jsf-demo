import java.io.Serializable;

public class Person implements Serializable {
	private static int id;
	private int uid;
	private String fName;
	private String lName;
	private int age;

	public Person() {
	}

	public Person(String fName, String lName, int age) {
		this.uid = id++;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
