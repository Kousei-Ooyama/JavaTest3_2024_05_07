package jp.co.aforce.practice.generics;

public class Comics implements Stockable{
	private String title;
	private String company;
	public static final String TYPE="漫画";
	
	public Comics(String title, String company) {
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
