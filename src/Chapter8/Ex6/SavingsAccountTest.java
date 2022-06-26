package Chapter8.Ex6;

public class SavingsAccountTest {

    public static void main(String[] args) {
        SavingsAccount client1 = new SavingsAccount(1000);
        SavingsAccount client2 = new SavingsAccount(3000);

        SavingsAccount.modifyInterestRate(4);

        for (int i = 0; i < 12; i++) {
            client1.calculateMonthlyInterest();
            client2.calculateMonthlyInterest();
        }

        System.out.printf("Client1 %s%n", client1);
        System.out.printf("Client2 %s%n", client2);

        SavingsAccount.modifyInterestRate(5);

        client1.calculateMonthlyInterest();
        client2.calculateMonthlyInterest();

        System.out.printf("Client1 %s%n", client1);
        System.out.printf("Client2 %s%n", client2);
    }
}
