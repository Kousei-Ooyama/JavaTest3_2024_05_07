package jp.co.aforce.practice.generics;

public class Main {
	public static void main(String[] args) {
		//練習問題２
		Bookshelf<Comics> comicsBookshelf= new Bookshelf<>(); 
		Bookshelf<Referencebook> referencebookBookshelf= new Bookshelf<>(); 
		Bookshelf<Novel> novelBookshelf= new Bookshelf<>(); 
		
		Comics comics = new Comics("ワンピース", "集英社");
		Referencebook referencebook = new Referencebook("スラスラわかる Java", "翔泳社");
		Novel novel = new Novel("マスカレード・ホテル", "集英社");
		
		comicsBookshelf.stockBook(comics);
		referencebookBookshelf.stockBook(referencebook);
		novelBookshelf.stockBook(novel);
		
		System.out.println("タイトル："+comicsBookshelf.getItemTitle());
		System.out.println("出版会社："+comicsBookshelf.getItemCompany());
		System.out.println("種類　　："+comicsBookshelf.getItemType()+"\n");
		
		System.out.println("タイトル："+referencebookBookshelf.getItemTitle());
		System.out.println("出版会社："+referencebookBookshelf.getItemCompany());
		System.out.println("種類　　："+referencebookBookshelf.getItemType()+"\n");
		
		System.out.println("タイトル："+novelBookshelf.getItemTitle());
		System.out.println("出版会社："+novelBookshelf.getItemCompany());
		System.out.println("種類　　："+novelBookshelf.getItemType()+"\n");
		
		
	}
}
