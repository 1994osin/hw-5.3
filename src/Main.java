public class Main {
    public static void main(String[] args) {
        // Task 1
        int theAmountInTheGlassJarBank = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += theAmountInTheGlassJarBank;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();

        // Task 2
        int amountToBank = 29000;
        int totalMoneyInTheBank = 0;
        for (int i = 1; i <= 12; i++) {
            totalMoneyInTheBank = totalMoneyInTheBank + totalMoneyInTheBank / 100;
            totalMoneyInTheBank += amountToBank;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalMoneyInTheBank + " рублей");
        }
    }
}