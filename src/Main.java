public class Main {
    public static void main(String[] args) {

        // Задача 1
        byte numberOne = 7;
        short numberTwo = 188;
        int numberThree = 999999;
        long numberFour = 1567943753L;
        float numberFive = 88f;
        double numberSix = 779966d;
        System.out.println("Значение переменной с типом byte = " + numberOne);
        System.out.println("Значение переменной с типом short = " + numberTwo);
        System.out.println("Значение переменной с типом int = " + numberThree);
        System.out.println("Значение переменной с типом long = " + numberFour);
        System.out.println("Значение переменной с типом float = " + numberFive);
        System.out.println("Значение переменной с типом double = " + numberSix);

        // Задача 2
        float one = 27.12f;
        System.out.println(one);
        long two = 987678965549L;
        System.out.println(two);
        float three = 2.786f;
        System.out.println(three);
        short four = 569;
        System.out.println(four);
        short five = -159;
        System.out.println(five);
        short six = 27897;
        System.out.println(six);
        byte seven = 67;
        System.out.println(seven);

        // Задача 3
        byte firstTeacher = 23;
        byte secondTeacher = 27;
        byte thirdTeacher = 30;
        short paper = 480;
        int allStudent = firstTeacher + secondTeacher + thirdTeacher;
        int totalPaper = paper / allStudent;
        System.out.println("На каждого ученика рассчитано " + totalPaper + " листов бумаги.");

        // Задача 4
        byte bottles = 16;
        byte time = 2;
        int bottlesInOneMinute = bottles / time; // резултат бутылок за 1 минуту
        int resultTwentyMinutes = bottlesInOneMinute * 20;
        System.out.println("За 20 минут, машина произвела " + resultTwentyMinutes + " штук бутылок.");
        int inDayHours = 24; // Сколько часов в сутках
        int minutesInHour = 60; // Сколько минут в одном часе
        int inDayMinutes = inDayHours * minutesInHour; // Вычисляем сколько минут в сутках
        int bottlesInOneDay = inDayMinutes * bottlesInOneMinute;
        System.out.println("В сутки, машина произвела " + bottlesInOneDay + " штук бутылок.");
        int minutesInThreeDays = inDayMinutes * 3; // Вычисляем сколько  минут в 3-х днях
        int bottlesInThreeDays = minutesInThreeDays * bottlesInOneMinute;
        System.out.println("За 3 дня, машина произвела " + bottlesInThreeDays + " штук бутылок.");
        // Когда сделал, подумал, что можно было сделать проще, в одну строчку
        int bottlesInThreeDaysVariant2 = bottlesInOneDay * 3;
        System.out.println("Вариант №2 - За 3 дня, машина произвела " + bottlesInThreeDaysVariant2 + " штук бутылок.");
        int bottlesInOneMonth = bottlesInOneDay * 30;
        System.out.println("За месяц, машина произвела " + bottlesInOneMonth + " штук бутылок.");

        // Задача 5
        byte totalBanksPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int classInSchool = totalBanksPaint / (whitePaint + brownPaint); // Вычисляем сколько классов в школе
        int whitePaintBanks = classInSchool * 2;
        int brownPaintBanks = classInSchool * 4;
        System.out.println("В школе, где, " + classInSchool + " классов, нужно " + whitePaintBanks + " банок белой краски и " + brownPaintBanks + " банок коричневой краски.");

        // Задача 6
        byte bananas = 5;
        byte weightOneBanana = 80;
        int weightBananas = bananas * weightOneBanana; // Вес пяти бананов в граммах.
        int weightMilk = 105 * 2; // Вес молока в граммах
        int oneIceCream = 100;
        int weightIceCream = oneIceCream * 2; // Вес двух брикетов мороженного
        int eggs = 4;
        int weightOneEgg = 70;
        int weightEggs = eggs * weightOneEgg;
        int weightBreakfastGr = weightBananas + weightMilk + weightIceCream + weightEggs; // Вес завтрака в граммах.
        System.out.println("Вес завтрака в граммах = " + weightBreakfastGr + " гр.");
        int grPerKg = 1000;
        float weightBreakfastKg = weightBreakfastGr / (float)grPerKg;
        System.out.println("Вес завтрака в киллограммах = " + weightBreakfastKg + " кг.");

        // Задача 7
        int loseWeightKg = 7;
        int kgPerGr = 1000;
        int loseWeightGr = loseWeightKg * kgPerGr; // Вычисляем сколько грамм в 7 кг.
        int loseOneWeight = 250;
        int loseTwoWeight = 500;
        int resultOne = loseWeightGr / loseOneWeight; // Кол-во дней при сбросе 250гр.
        int resultTwo = loseWeightGr / loseTwoWeight; // Кол-во дней при сбросе 500гр.
        System.out.println(resultOne + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм.");
        System.out.println(resultTwo + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм.");
        int middleDays = (resultOne + resultTwo) / 2;
        System.out.println("В среднем, нужен " + middleDays + " день, чтобы добиться результата похудения.");

        // Задача 8
        int salaryMaria = 67760; // зарплата сотрудника в месяц
        int salaryDenis = 83690;
        int salaryKris = 76230;
        int percentMaria = (salaryMaria * 10) / 100; // сумма 10 процентов от зарплаты.
        int percentDenis = (salaryDenis * 10) / 100;
        int percentKris = (salaryKris * 10) / 100;
        int salaryAfterUpMaria = salaryMaria + percentMaria; // сумма после прибавки 10 процентов к зарплате
        int salaryAfterUpDenis = salaryDenis + percentDenis;
        int salaryAfterUpKris = salaryKris + percentKris;
        int year = 12;
        int salaryYearMaria = salaryMaria * year; // Зарплата в год до поднятия
        int salaryYearDenis = salaryDenis * year;
        int salaryYearKris = salaryKris * year;
        int salaryYearAfterUpMaria = salaryAfterUpMaria * year; // Зарплата в год после поднятия
        int salaryYearAfterUpDenis = salaryAfterUpDenis * year;
        int salaryYearAfterUpKris = salaryAfterUpKris * year;
        int salaryDifferenceMaria = salaryYearAfterUpMaria - salaryYearMaria; // Разница зп в год
        int salaryDifferenceDenis = salaryYearAfterUpDenis - salaryYearDenis;
        int salaryDifferenceKris = salaryYearAfterUpKris - salaryYearKris;
        System.out.println("Маша теперь получает " + salaryAfterUpMaria + " рублей. Годовой доход вырос на " + salaryDifferenceMaria + " рублей.");
        System.out.println("Денис теперь получает " + salaryAfterUpDenis + " рублей. Годовой доход вырос на " + salaryDifferenceDenis + " рублей.");
        System.out.println("Кристина теперь получает " + salaryAfterUpKris + " рубля. Годовой доход вырос на " + salaryDifferenceKris + " рублей.");
    }
}