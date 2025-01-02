package class1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        // 1만원 입금
        account.deposit(10000);

        // 9천원 출금
        account.withdraw(9000);

        // 계좌에서 2000원 출금 시도
        account.withdraw(2000);
    }
}
