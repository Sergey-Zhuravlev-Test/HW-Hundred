public class Main {
    public static void main(String[] args) {

        int initialBalance = 100;
        int payment1 = 100;
        int bonus1;

        if (payment1 > 1000) {
            bonus1 = payment1 / 100;
        } else {
            bonus1 = 0;
        }

        int finalBalance1 = (initialBalance + payment1 + bonus1);

        int payment2 = 1100;
        int bonus2;

        if (payment2 > 1000) {
            bonus2 = payment2 / 100;
        } else {
            bonus2 = 0;
        }

        int finalBalance2 = (initialBalance + payment2 + bonus2);


        System.out.println("Баланс после пополнения счета на 100 рублей = " + (finalBalance1));
        System.out.println("Баланс после пополнения счета на 1100 рублей = " + (finalBalance2));
    }
}