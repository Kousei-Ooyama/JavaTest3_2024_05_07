package jp.co.aforce.practice.generics;

public class Bookshelf <T extends Stockable>{
	private T item;
	
	public void stockBook(T item) {
		this.item = item;
	}
	
	public String getItemTitle() {
		if(item == null) {
			return "なにもありません";
		}else {
			return item.getTitle();
		}
	}
	
	public String getItemCompany() {
		if(item == null) {
			return "なにもありません";
		}else {
			return item.getCompany();
		}
	}
	
	public String getItemType() {
		if(item == null) {
			return "なにもありません";
		}else {
			return item.getType();
		}
	}
}
