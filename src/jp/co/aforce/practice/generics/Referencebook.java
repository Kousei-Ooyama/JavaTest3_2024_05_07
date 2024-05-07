package jp.co.aforce.practice.generics;

public class Referencebook implements Stockable{
	private String title;
	private String company;
	public static final String TYPE="参考書";
	
	public Referencebook(String title, String company) {
		this.title = title;
		this.company = company;
	}
	
	@Override
	public String getTitle() {
		// TODO 自動生成されたメソッド・スタブ
		return this.title;
	}

	@Override
	public String getCompany() {
		// TODO 自動生成されたメソッド・スタブ
		return this.company;
	}

	@Override
	public String getType() {
		// TODO 自動生成されたメソッド・スタブ
		return this.TYPE;
	}
	
}
