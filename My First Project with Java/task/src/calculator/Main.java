package calculator;

import javax.swing.text.Style;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Earned amount:");
        int bubbleGumIncome = 202;
        System.out.println("Bubblegum: $" + bubbleGumIncome);
        int toffeeIncome = 118;
        System.out.println("Toffee: $" + toffeeIncome);
        int iceCreamIncome = 2250;
        System.out.println("Ice cream: $" + iceCreamIncome);
        int chocolateIncome = 1680;
        System.out.println("Milk chocolate: $" + chocolateIncome);
        int doughnutIncome = 1075;
        System.out.println("Doughnut: $" + doughnutIncome);
        int pancakeIncome = 80;
        System.out.println("Pancake: $" + pancakeIncome);

        int totalIncome = bubbleGumIncome + toffeeIncome + iceCreamIncome + chocolateIncome
                + doughnutIncome + pancakeIncome;

        System.out.println();

        System.out.println("Income: $" + totalIncome);

        System.out.println("Staff expenses:");
        int staffExpenses = scanner.nextInt();
        System.out.println("Other expenses:");
        int otherExpenses = scanner.nextInt();
        int netIncome = totalIncome - staffExpenses - otherExpenses;
        System.out.println("Net income: $%d".formatted(netIncome));
    }
}