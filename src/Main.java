public class Main {
    public static void main(String[] args)
    {
        System.out.println("Задача 1");

        int targetAmount = 2459000;
        int monthlyDeposit = 15000;
        int totalSavings = 0;
        int month = 0;

        while (totalSavings < targetAmount) {
            totalSavings =totalSavings + monthlyDeposit;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSavings + " рублей");
        }

        System.out.println();
        System.out.println("Задача 2");

        int num = 1;
        while (num <= 10) {
            System.out.print(num + " ");
            num++;
        }

        System.out.println();

        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Задача 3");

        double population = 12_000_000;
        double birthRate = 17.0 / 1000;
        double deathRate = 8.0 / 1000;

        for (int year = 1; year <= 10; year++) {
            double births = population * birthRate;
            double deaths = population * deathRate;
            double populationIncrease = births - deaths;

            population += populationIncrease;

            System.out.println("Год " + year + ", численность населения составляет " + (int)population + " человек");
        }
        System.out.println();
        System.out.println("Задача 4");

        double initialDeposit = 15_000;
        double totalAmount = 12_000_000;
        double monthlyInterestRate = 0.07;
        int months = 0;

        while (initialDeposit < totalAmount) {

            initialDeposit *= (1 + monthlyInterestRate);
            months++;


            System.out.println("Месяц " + months + ", сумма накоплений составляет " + (int)initialDeposit + " рублей");
        }

        System.out.println("Василию понадобится " + months + " месяцев для накопления " + totalAmount + " рублей");

        System.out.println();
        System.out.println("Задача 5");

        double initialDeposit1 = 15_000;
        double totalAmount1 = 12_000_000;
        double monthlyInterestRate1 = 0.07;
        int months1 = 0;

        while (initialDeposit1 < totalAmount1) {

            initialDeposit1 *= (1 + monthlyInterestRate1);
            months1++;


            if (months1 % 6 == 0) {
                System.out.println("Месяц " + months1 + ", сумма накоплений составляет " + (int)initialDeposit1 + " рублей");
            }
        }

        System.out.println("Василию понадобится " + months1 + " месяцев для накопления " + totalAmount1 + " рублей");

        System.out.println();
        System.out.println("Задача 6");

        double initialDeposit3 = 15_000;
        double annualInterestRate3 = 0.07;
        int numberOfYears3 = 9;
        int monthsInHalfYear4 = 6;
        double savings = initialDeposit3;

        for (int year = 1; year <= numberOfYears3; year++) {

            for (int month3 = 1; month3 <= monthsInHalfYear4; month3++) {
                savings *= (1 + annualInterestRate3);
            }

            System.out.println("Полгода " + year + ", сумма накоплений составляет " + (int)savings + " рублей");
        }
        System.out.println();
        System.out.println("Задача 7");
        int firstFriday = 3;

        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }

        System.out.println();
        System.out.println("Задача 8");

        int currentYear = 2023;
        int yearsToGoBack = 200;
        int yearsToCalculate = 100;

        int startYear = currentYear - yearsToGoBack;
        int endYear = currentYear + yearsToCalculate;

        int cometAppearanceYear = 0;


        for (int year = startYear; year <= currentYear; year++) {
            if (year % 79 == 0) {
                cometAppearanceYear = year;
                System.out.println(cometAppearanceYear);
            }
        }

        for (int year = currentYear + 1; year <= endYear; year++) {
            if (year % 79 == 0) {
                cometAppearanceYear = year;
                System.out.println(cometAppearanceYear);
                break;
            }
        }

    }


}
