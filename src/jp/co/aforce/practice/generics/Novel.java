package jp.co.aforce.practice.generics;

public class Novel implements Stockable{
	private String title;
	private String company;
	public static final String TYPE="小説";
	
	public Novel(String title, String company) {
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
