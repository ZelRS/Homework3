public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        byte a = 78;
        short b = 31655;
        int c = 1568942154;
        long d = 2955648526448258658L;
        float e = 50.235f;
        double f = 100.6599747657;
        System.out.println("Значение переменной с типом byte равно " + a);
        System.out.println("Значение переменной с типом short равно " + b);
        System.out.println("Значение переменной с типом int равно " + c);
        System.out.println("Значение переменной с типом long равно " + d);
        System.out.println("Значение переменной с типом float равно " + e);
        System.out.println("Значение переменной с типом double равно " + f);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        short paper = 480;
        int allStudents = lp + as + ea;
        int forOneStudent = paper / allStudents;
        System.out.println("На каждого ученика рассчитано " + forOneStudent + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte bottle = 16;
        byte time = 2;
        byte bottleForOneMinute = (byte) (bottle / time);
        System.out.println(bottleForOneMinute);
        byte firstInterval = 20;
        short secondInterval = 1440;
        int thirdInterval = secondInterval * 3;
        int fourthInterval = secondInterval * 30;
        int firstResult = bottleForOneMinute * firstInterval;
        int secondResult = bottleForOneMinute * secondInterval;
        int thirdResult = bottleForOneMinute * thirdInterval;
        int fourthResult = bottleForOneMinute * fourthInterval;
        System.out.println("За 20 минут машина произвела " + firstResult + " штук бутылок");
        System.out.println("За сутки машина произвела " + secondResult + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + thirdResult + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + fourthResult + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte allBankOfColor = 120;
        byte wightColorForOneCabinet = 2;
        byte brownColorForOneCabinet = 4;
        int bankForOneCabinet = wightColorForOneCabinet + brownColorForOneCabinet;
        int Cabinet = allBankOfColor / bankForOneCabinet;
        int wightColor = Cabinet * wightColorForOneCabinet;
        int brownColor = Cabinet * brownColorForOneCabinet;
        System.out.println("В школе, где " + Cabinet + " классов, нужно " + wightColor + " банки белой краски и " +
                brownColor + " банки коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        byte bananas = 5;
        short milk = 200;
        byte iceCream = 2;
        byte eggs = 4;
        int bananasWeight = bananas * 80;
        int milkWeight = milk / 100 * 105;
        int iceCreamWeight = iceCream * 100;
        int eggsWeight = eggs * 70;
        int totalWeightGram = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        System.out.println("Спортсмены съедают на завтрак " + totalWeightGram + " грамм еды");
        float totalWeightKilogram = totalWeightGram / 1000f;
        System.out.println("Спортсмены съедают на завтрак " + totalWeightKilogram + " килограмм еды");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        byte totalExcessWeightKilogram = 7;
        short totalExcessWeightGram = (short) (totalExcessWeightKilogram * 1000);
        short shedMinWeightADay = 250;
        short shedMaxWeightADay = 500;
        int daysWithMaxLoss = totalExcessWeightGram / shedMinWeightADay;
        int daysWithMinLoss = totalExcessWeightGram / shedMaxWeightADay;
        int averageDaysLoss = (daysWithMaxLoss + daysWithMinLoss) / 2;
        System.out.println("При похудении на 250 грамм ежедневно спортмену понадобится " + daysWithMaxLoss +
                " дней, а при похудении на 500 грам - " + daysWithMinLoss + " дней");
        System.out.println("В среднем спортмену понадобится " + averageDaysLoss + " день, чтобы похудеть на 7 кг");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int mashaMonthBeforeSalaryIncrease = 67760;
        int denisMonthBeforeSalaryIncrease = 83690;
        int kristinaMonthBeforeSalaryIncrease = 76230;
        byte allowancePercentage = 10;
        float allowancePercentage1 = allowancePercentage / 100f;
        int mashaMonthAfterSalaryIncrease = (int) ((mashaMonthBeforeSalaryIncrease * allowancePercentage1) + mashaMonthBeforeSalaryIncrease);
        int denisMonthAfterSalaryIncrease = (int) ((denisMonthBeforeSalaryIncrease * allowancePercentage1) + denisMonthBeforeSalaryIncrease);
        int kristinaMonthAfterSalaryIncrease = (int) ((kristinaMonthBeforeSalaryIncrease * allowancePercentage1) + kristinaMonthBeforeSalaryIncrease);
        int mashaYearSalaryDifference = (mashaMonthAfterSalaryIncrease - mashaMonthBeforeSalaryIncrease) * 12;
        int denisYearSalaryDifference = (denisMonthAfterSalaryIncrease - denisMonthBeforeSalaryIncrease) * 12;
        int kristinaYearSalaryDifference = (kristinaMonthAfterSalaryIncrease - kristinaMonthBeforeSalaryIncrease) * 12;
        System.out.println("Маша теперь получает " + mashaMonthAfterSalaryIncrease + " рублей в месяц. Годовой доход вырос на "
                + mashaYearSalaryDifference + " рублей");
        System.out.println("Денис теперь получает " + denisMonthAfterSalaryIncrease + " рублей в месяц. Годовой доход вырос на "
                + denisYearSalaryDifference + " рублей");
        System.out.println("Кристина теперь получает " + kristinaMonthAfterSalaryIncrease + " рублей в месяц. Годовой доход вырос на "
                + kristinaYearSalaryDifference + " рублей");
    }
}