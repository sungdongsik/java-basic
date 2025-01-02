package class1.ex;

public class Account {
    int balance; // 잔액

    // 입금 메서드
    int deposit(int amount){
        return balance += amount;
    }

    // 출금 메서드
    void withdraw(int amount){
        //
        if(balance >= amount){
            balance -= amount;
        }else {
            System.out.println("잔액 부족");
            System.out.println("잔고: " + balance);
        }

    }
}
