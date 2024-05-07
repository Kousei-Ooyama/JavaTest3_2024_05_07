package jp.co.aforce.steram;

public class Person {
	private int id;
	private String name;
	private String gender;
	private int age;
	private String profession;
	
	//======セットメソッド======
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	//=======ゲッターメソッド========
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getProfession() {
		return this.profession;
	}

}
