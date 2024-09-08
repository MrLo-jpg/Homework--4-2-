public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int sum = 0;
        int desiredSum = 2_459_000;
        int month = 0;
        while (sum <= desiredSum) {
            sum = sum + 15000;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + sum + " рублей");
        }
        System.out.println();

        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Задача 3");
        int population = 12_000_000;
        int birth = 17;
        int death = 8;
        int growth = birth - death;
        int yearCurrent = 2024;
        for (int year = yearCurrent; year < yearCurrent + 10; year++) {
            population = (growth * population) / 1000 + population;
            System.out.println("Год " + year + "  численность населения составляет " + population);
        }
        System.out.println();

        System.out.println("Задание 4");
        int sumMax = 12_000_000;
        int sumMin = 15_000;
        int monthMax = 0;
        while (sumMin < sumMax) {
            sumMin = (int) (sumMin * 0.07 + sumMin);
            monthMax++;
            System.out.println("Месяц " + monthMax + " сумма накоплений равна " + sumMin + " рублей");
        }
        System.out.println();

        System.out.println("Задание 5 ");
        int sumMaxi = 12_000_000;
        int sumMini = 15_000;
        int monthMaxi = 0;
        while (sumMini < sumMaxi) {
            sumMini = (int) (sumMini * 0.07 + sumMini);
            monthMaxi++;
            if (monthMaxi % 6 == 0) {
                System.out.println("Месяц " + monthMaxi + " сумма накоплений равна " + sumMini + " рублей");
            }
        }
        System.out.println();

        System.out.println("Задание 6");
        int contribution = 15_000;
        int monthMini = 0;
        int monthsMaxi = 12 * 9;
        while (monthMini < monthsMaxi) {
            contribution = (int) (contribution * 0.07 + contribution);
            monthMini++;
            if (monthMini % 6 == 0) {
                System.out.println("Месяц " + monthsMaxi + " сумма накоплений равна " + contribution + " рублей");
            }
        }
        System.out.println();

        System.out.println("Задание 7");
        int friday = 5;
        for (int day = friday; day < 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }
        System.out.println();

        System.out.println("Задание 8");
        int period = 79;
        int firstFlight = 0;
        int start = yearCurrent - 200;
        int end = yearCurrent + 100;
        for (int year = firstFlight; year < end; year += period) {
            if (year > start) {
                System.out.println(year);
            }
        }


    }


}