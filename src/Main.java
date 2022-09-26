public class Main {
    public static void main(String[] args) {


        System.out.println("Задание №1");

        byte bananas = 7;
        System.out.println("Значение переменной bananas с типом byte равно " + bananas);
        short apple = - 300;
        System.out.println("Значение переменной bananas с типом byte равно " + apple);
        int pork = 1596545555;
        System.out.println("Значение переменной bananas с типом byte равно " + pork);
        long onion =9223372036854775805L;
        System.out.println("Значение переменной bananas с типом byte равно " + onion);
        float сucumbers = 7.35f;
        System.out.println("Значение переменной bananas с типом byte равно " + сucumbers);
        double tomato = 8.5537d;
        System.out.println("Значение переменной bananas с типом byte равно " + tomato);

        System.out.println("Задание №2");

        float one = 27.12f;
        System.out.println(one);
        long two = 987678965549L;
        System.out.println(two);
        double three = 2.786;
        System.out.println(three);
        boolean four = true;
        System.out.println(four);
        char five = 569;
        System.out.println(five);
        short six = 159;
        System.out.println(six);
        int seven = 27897;
        System.out.println(seven);
        byte eight = 67;
        System.out.println(eight);

        System.out.println("Задание №3");

        int LydmilaPavlovna = 23;
        int AnnaSergeevna = 27;
        int EkaterinaAndreevna = 30;
        int allPapper = 480;
        int allStudents = LydmilaPavlovna + AnnaSergeevna + EkaterinaAndreevna;
        int perStudents = allPapper / allStudents;
        System.out.println(perStudents);

        System.out.println("Задание №4");

        int oneMinute = 8;
        int min20 = oneMinute * 20;
        System.out.println("За 20 минут машина произвела бутылок " + min20);
        int day1 = oneMinute * 24 * 60;
        System.out.println("За 1 день машина произвела " + day1);
        int day3 = day1 * 3;
        System.out.println("За 3 дня машина произвела " + day3);
        int month1 = day1 * 30;
        System.out.println("За 1 месяц машина произвела " + month1);

        System.out.println("Задание №5");

        int allPaint = 120;
        int whitePaintOne = 2;
        int brownPaintOne = 4;
        int allClass = allPaint / (whitePaintOne + brownPaintOne);
        int allWhitePaint = whitePaintOne * allClass;
        int allBrownPaint = brownPaintOne * allClass;
        System.out.println("В школе, где " + allClass +  " классов, нужно " + allWhitePaint + " банок белой краски и " + allBrownPaint + " банок коричневой краски");

        System.out.println("Задание №6");

        short banana = 80;
        short milk = 105;
        short iceCream = 100;
        short  eggs = 70;
        double allGramm = banana * 5 + milk * 2 + iceCream * 2 + eggs * 4;
        System.out.println("Общая масса завтрака " + allGramm +  " грамм ");
        double KG = allGramm / 1000;
        System.out.println("Общая масса завтрака " + KG + "кг");

        System.out.println("Задание №7");

        int allGramm1 = 7000;
        int firstDay = 250;
        int secondDay = 500;
        int twentyHfDays = allGramm1 / firstDay;
        System.out.println("Потребуется " + twentyHfDays + " дней при ежедневном похудении на 250 грамм");
        int fiftyHdays = allGramm1 / secondDay;
        System.out.println("Потребуется " + fiftyHdays + " дней при ежедневном похудении на 500 грамм");
        int averageValueGramm = (fiftyHdays + secondDay) / 2;
        int averageDays = allGramm1 / averageValueGramm;
        System.out.println("Потребуется " + averageDays + " дней при ежедневном похудении на 375 грамм");

        System.out.println("Задание №8");
        System.out.println("Зарплата сотрудников в месяц до повышения");
        int maria = 67760;
        System.out.println("Зарплата Марии в месяц составляет " + maria + " рублей");
        int denis = 83690;
        System.out.println("Зарплата Дениса в месяц составляет " + denis + " рублей");
        int kristina = 76230;
        System.out.println("Зарплата Кристины в месяц составляет " + kristina + " рублей");
        System.out.println("Зарплата сотрудников после повышения");
        int mariaPlusTenProcent = (int) (maria + (maria * 0.1 ));
        System.out.println("Зарплата Марии в месяц после повышения составляет " + mariaPlusTenProcent + " рублей");
        int denisPlusTenProcent = (int) (denis + (denis * 0.1 ));
        System.out.println("Зарплата Дениса в месяц после повышения составляет " + denisPlusTenProcent + " рублей");
        int kristinaPlusTenProcent = (int) (kristina + (kristina * 0.1));
        System.out.println("Зарплата Кристины в месяц после повышения составляет " + kristinaPlusTenProcent + " рублей");

        System.out.println("Разница между годовым доходом до и после вышения");

        int differenceMariaYear = (mariaPlusTenProcent * 12) - (maria * 12);
        System.out.println("Разница между годовым доходом до и после повышения Марии " + differenceMariaYear + " рублей в год");
        int differenceDenisYear = (denisPlusTenProcent * 12) - (denis * 12);
        System.out.println("Разница между годовым доходом до и после повышения Дениса " + differenceDenisYear + " рублей в год");
        int differenceKristinaYear = (kristinaPlusTenProcent * 12) - (kristina * 12);
        System.out.println("Разница между годовым доходом до и после повышения Кристины " + differenceKristinaYear + " рублей в год");

    }
}