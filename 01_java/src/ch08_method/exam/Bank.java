/**
 * 기능 목록
 * 
 * 계좌생성 할 수 있다.
 * 잔액조회 가능해야 한다.
 * 입금 할 수 있다.
 * 출금 할 수 있다.
 */
package ch08_method.exam;

public class Bank {
	int money;
//	int money = 0;
	
	/** 계좌 생성 */
	void makeAccount() {
		money = 10000;
	}
	
	/** 입금 */
	void deposit(int m) {
		money += m;
	}
	
	/**  출금 */
	void withdraw(int m) {
		// 출금요청 금액이 잔액보다 큰지 확인
		if (m > money) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= m;
	}
	
	/**  잔액 */
	int getBalance() {
		return money;
	}
}













