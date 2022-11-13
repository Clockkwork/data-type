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

    public static void task1() {
        System.out.println(" Задача №1 ");
        byte type = 120;
        System.out.println("Значение переменной с типом " + " byte " + " равно " + type);
        short frog = 200;
        System.out.println("Значение переменной с типом " + " short " + " равно " + frog);
        int apple = 30000;
        System.out.println("Значение переменной с типом " + " int " + " равно " + apple);
        long cat = 365L;
        System.out.println("Значение переменной с типом " + " long " + " равно " + cat);
        float dog = 5.55f;
        System.out.println("Значение переменной с типом " + " float " + " равно " + dog);
        double snake = 666.666;
        System.out.println("Значение переменной с типом " + " double " + " равно " + snake);
    }

    public static void task2() {
        System.out.println(" Задача №2 ");
        byte google = 67;
        System.out.println(google);
        int cucumber = 27897;
        System.out.println(cucumber);
        long potato = 987678965549L;
        System.out.println(potato);
        float snake = 27.12f;
        System.out.println(snake);
        double dog = 2.786;
        System.out.println(dog);
        short cat = -159;
        System.out.println(cat);
        int car = 569;
        System.out.println(car);
    }

    public static void task3() {
        System.out.println(" Задача №3 ");
        int firstClass = 23;
        int secondClass = 27;
        int thirdClass = 30;
        int allPapers = 480;
        int classes = allPapers / (firstClass + secondClass + thirdClass);
        System.out.println("На каждого ученика рассчитано по " + classes + " листов бумаги ");
    }

    public static void task4() {
        System.out.println(" Задача №4 ");
        int car = 16;
        System.out.println(" За две минуты машины произвела " + car + " штук бутылок ");
        int oneMinute = 8;
        System.out.println(" За одну минуту машина произвела " + oneMinute + " штук бутылок ");
        int twentyMinutes = oneMinute * 20;
        System.out.println(" За 20 минут машина произвела " + twentyMinutes + " штук бутылок ");
        int day = oneMinute * 1440;
        System.out.println(" За один день машина произвела " + day + " штук бутылок ");
        int threeDays = oneMinute * 1440 * 3;
        System.out.println(" За три дня машина произвела " + threeDays + " штук бутылок ");
        int month = oneMinute * 44640;
        System.out.println(" За один месяц машина произвела " + month + " штук бутылок ");
    }

    public static void task5() {
        System.out.println(" Задача №5 ");
        int school = 120;
        int paintOneClass = 6;
        int classes = school / paintOneClass;
        System.out.println(classes);
        int paintWhite = classes * 2;
        int paintBrown = classes * 4;
        System.out.println("В школе,где " + classes + " классов " + " нужно " + paintWhite + " банок белой краски и "
                + paintBrown + " банок коричневой краски ");
    }

    public static void task6() {
        System.out.println(" Задача №6 ");
        int bananas = 400;
        int milk = 210;
        int iceCream = 200;
        int egs = 280;
        int weight = bananas + milk + iceCream + egs;
        System.out.println( weight + " Грамм ");
        float kg = weight / 1000f;
        System.out.println( kg + " Килограмм ");
    }
    public static void task7(){
        System.out.println(" Задача №7 ");
        int weight = 7000;
        int day = 250;
        int total = weight / day;
        System.out.println( total + " Дней " + " если спорстмен будет каждый день терять по 250 грамм ");
        int totals = total / 2;
        System.out.println(totals + " Дней " + " если спорстмен будет каждый день терять по 500 грамм ");
    }
    public static void task8(){
        System.out.println(" Задача №8 ");
        System.out.println("Зарплата до повышения:");
        int yearMasha = 67760;
        System.out.println(yearMasha + " рублей ");
        int yearDeniska = 83690;
        System.out.println(yearDeniska + " рублей ");
        int yearKris = 76230;
        System.out.println(yearKris + " рублей ");
        System.out.println("10% От текущей зарпалты:");
        float Masha = 67760 / 100f * 10;
        System.out.println(Masha + " рублей ");
        float Denis = 83690 / 100f * 10;
        System.out.println(Denis + " рублей ");
        float Kristina = 76230 / 100f * 10;
        System.out.println(Kristina + " рублей ");
        System.out.println("Повышение зарплаты на 10%:");
        int maria = 67760 + 6776;
        System.out.println(maria + " рублей ");
        int denis = 83690 + 8369;
        System.out.println(denis + " рублей ");
        int kristina = 76230 + 7623;
        System.out.println(kristina + " рублей ");
        System.out.println("Годовой доход после повышения зарплаты:");
        int yearMaria = maria * 12;
        System.out.println(yearMaria + " рублей ");
        int yearDenis = denis * 12;
        System.out.println(yearDenis + " рублей ");
        int yearKristina = kristina * 12;
        System.out.println(yearKristina + " рублей ");
        System.out.println("Годовой доход до повышения:");
        int lastYearMaria = 67760 * 12;
        System.out.println(lastYearMaria + " рублей ");
        int lastYearDenis = 83690 * 12;
        System.out.println(lastYearDenis + " рублей ");
        int lastYearKristina = 76230;
        System.out.println(lastYearKristina + " рублей ");
        System.out.println("Текущая зарплата и разница между годовым доходом:");
        int mashaMoney =yearMaria - lastYearMaria;
        System.out.println("Маша теперь получает " + maria + " рублей.Годовой доход вырос на " + mashaMoney +
                " рублей ");
        int denisMoney = yearDenis - lastYearDenis;
        System.out.println("Денис теперь получает " + denis + " рублей.Годовой доход вырос на " + denisMoney +
                " рублей ");
        int kristinaMoney = yearKristina - lastYearKristina;
        System.out.println("Кристина теперь получает " + kristina + " рублей.Годовой доход вырос на " + kristinaMoney +
                " рублей ");
    }
}
