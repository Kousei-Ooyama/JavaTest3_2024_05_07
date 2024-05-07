package jp.co.aforce.thread;

public class BankAccount {
	private int balance;//通帳残高
	
	public BankAccount(int b) {
		balance = b;
	}
	
	//※修正箇所
	//publicの後にsynchronizedを付け加える。
	public synchronized int getMoney(int request) {
		//残高が要求以上であれば
		if(balance + request >= 0) {
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
			
			}
			//取引を行う
			balance += request;
			System.out.println(request+"円取引されました");
			System.out.println("残高は"+balance+"円です");
			return -request;
		}else {
			System.out.println("お金が足りません");
			System.out.println("残高は"+balance+"円です");
			return 0;
		}
	}
}
