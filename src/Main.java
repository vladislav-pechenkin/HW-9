public class Main {
    public static void main(String[] args) {

        System.out.println("Задача № 1");

        int[] salaries = {35750, 41050, 27560, 45850, 49670};
        int allExpenses = 0;
        for (int i = 0; i < salaries.length; i++) {
            allExpenses += salaries[i];
        }
        System.out.println("Сумма трат за месяц составила " + allExpenses + " рублей.");

        System.out.println();
        System.out.println("Задача № 2");

        int[] salariesPerWeek = {11500, 12300, 17800, 14540, 14250};
        int maxExpenses = salariesPerWeek[0];
        int minExpenses = salariesPerWeek[0];
        for (final int current : salariesPerWeek) {
            if (current > maxExpenses) {
                maxExpenses = current;
            }
            if (minExpenses > current) {
                minExpenses = current;
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxExpenses + " рублей.");
        System.out.println("Минимальная сумма трат за неделю составила " + minExpenses + " рублей.");

        System.out.println();
        System.out.println("Задача № 3");

        int[] theAmountIsWeekly = {9050, 7800, 8360, 6800, 9840};
        double expenses = 0;
        double expenses1 = 0;
        for (int i = 0; i < theAmountIsWeekly.length; i++) {
            expenses += theAmountIsWeekly[i];
            expenses1 = expenses / theAmountIsWeekly.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + expenses1 + " рублей.");

        System.out.println();
        System.out.println("Задача № 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.println(reverseFullName[i]);
        }
    }
}