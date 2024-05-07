package jp.co.aforce.reflation;

public class TestEntity {
	private String id;
	private String name;
	
	public TestEntity(String id, String name) {
		super();
		this.id = id;
		this.name =name;
	}
	
	public String getid() {
		return id;
	}
	
	public void setid(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name =name;
	}
}
