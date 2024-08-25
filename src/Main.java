public class Main {
    public static void main(String[] args) {
        int dogs = 146;
        byte cats = 6;
        short smallFrogs = 30000;
        long cases = 2000000L;
        float shugar = 3.75f;
        double starLink = 987_678_965;
        System.out.println("значение переменной dogs с типом int равно " + dogs);
        System.out.println("Значение переменной cats с типом byte равно " + cats);
        System.out.println("Значение переменной smallFrogs с типом short равно "+ smallFrogs );
        System.out.println("Значение переменной cases с типом long равно" + cases);
        System.out.println("Значение переменной shugar с типом float равно " + shugar);
        System.out.println("Значение переменной starLink с типом double равно " + starLink);
        System.out.println();

        float rabbit = 27.12f;
        long spaceArea = 987_678_965_549l;
        float bearVolume = 2.786f;
        short cars = 569;
        short degrees = -159;
        short bags = 27897;
        byte apples = 67;

        byte ludmilaClass = 23;
        byte annaClass = 27;
        byte ekaterinaClass = 30;
        int totaPaperSheets = 480;
        int sheetsperPeople = totaPaperSheets / (ludmilaClass+annaClass+ekaterinaClass);
        System.out.println("На каждого ученика рассчитано " + sheetsperPeople+ " листов бумаги");
        System.out.println();

        byte bottlesperMinute = 16/2;
        int bottleper20Minutes = bottlesperMinute * 20;
        int bottleperDay = bottlesperMinute * 60 * 24;
        int bottlesper3Day = bottleperDay *3;
        int bottlesperMounth = bottlesper3Day*10;
        System.out.println("За 20 минут машина произвела " + bottleper20Minutes + " штук бутылок");
        System.out.println("За 1 сутки машина произвела " + bottleperDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesper3Day + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlesperMounth + " штук бутылок");
        System.out.println();

        int totalPaint = 120;
        int whitePaint = 2;
        int brownPaint = 4;
        int totalClasses = totalPaint / (whitePaint+brownPaint);
        int totalWhitePaint = totalClasses * whitePaint;
        int totalBrownPaint = totalClasses * brownPaint;
        System.out.println("В школе, где "+ totalClasses +  " классов, нужно "+ totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");
        System.out.println();

        int bananas = 5 * 80;
        float milk = 200 * 1.05f;
        int icecream = 2 * 100;
        int eggs = 4 * 70;
        float sportMealWeight = bananas + milk + icecream + eggs ;
        float weightinKg = sportMealWeight / 1000;
        System.out.println("Общий вес спортивного завтрака = " +weightinKg+ "кг");
        System.out.println();

        int kg = 7 * 1000;
        int minGrams = 250;
        int maxGrams = 500;
        int maxDays = kg/ minGrams;
        int minDays = kg/ maxGrams;
        System.out.println("Максимум дней "+ maxDays );
        System.out.println("Минимум дней "+ minDays );
        System.out.println("В среднем это "+ (maxDays+minDays)/2 +" дней");
        System.out.println();

        int mashaSalary = 67_760 ;
        int denisSalary = 83_690 ;
        int krisSalary = 76_230;
        int mashaYear = mashaSalary * 12;
        int denisYear= denisSalary * 12;
        int krisYear = krisSalary * 12;
        float increaseMasha = mashaSalary * 1.1f;
        float increaseDenis = denisSalary * 1.1f;
        float increaseKris = krisSalary* 1.1f;
        float diffMasha = increaseMasha * 12;
        float diffDenis = increaseDenis * 12;
        float diffKris = increaseKris * 12;
        System.out.println("Маша теперь получает "+increaseMasha+" рублей. Годовой доход вырос на "+(diffMasha-mashaYear)+" рублей");
        System.out.println("Денис теперь получает "+increaseDenis+" рублей. Годовой доход вырос на "+(diffDenis-denisYear)+" рублей");
        System.out.println("Кристина теперь получает "+increaseKris+" рублей. Годовой доход вырос на "+(diffKris-krisYear)+" рублей");



    }
}