public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int addBalance = 1100;
        int bonus = 1;
        int addBonus;

        if (addBalance > 1000) {
            addBonus = addBalance / 100 * bonus;
        } else {
            addBonus = 0;
        }

        System.out.println("Итоговый счет: " + (balance + addBalance + addBonus));
        System.out.println("Бонус: " + addBonus);
    }
}