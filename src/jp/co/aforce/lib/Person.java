package jp.co.aforce.lib;

public class Person {
	private int id;
	private String name;
	private String gender;
	private int age;
	private String profession;
	
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
	
	public void getInformation() {
		System.out.println(
				"ID："+this.id+" 名前："+this.name+" 性別："+this.gender+
				" 年齢："+this.age+" 職業："+profession);
	}
}
