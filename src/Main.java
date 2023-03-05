public class Main {
    public static void main(String[] args) {
        int money = 0;
        int month = 0;
        while (money <= 2459000) {
            money = money + 15000;
            month++;
            System.out.println("Месяц " + month  + " сумма накоплений равна " + money + " рублей" );
        }

        int number = 1;
        while (number <= 10) {
            System.out.print( number + " ");
            number++;
        }
        System.out.println();

        for(int i =10; i > 0; i-- ) {
        System.out.print(i + " ");
        }
        System.out.println();

       int population = 12_000_000;
        int fertility = 17;
// 17 человек на 1000 и 8
       int mortality = 8;
       int year =0;
       int fertilityMortality = (fertility - mortality)*12000;
      // int populationGrowth= (fertilityMortality)*12_000;
       while (year < 10) {
           population = population + fertilityMortality;
           year ++;
           System.out.println("Год " + year + " численность населения составляет " + population );
       }

        int contribution = 15000;
       int months = 0;
       int i =1;
       int contributionPersent = (contribution * 7)/ 100;
       for (; contribution < 12_000_000; i++) {
           months ++ ;
           contribution = contribution + contributionPersent;
               System.out.println( "Месяц " + i + " Сумма накоплнгий составила " + contribution);
           }

        int pay = 15000;
        int percent = 7;
        int payPercent = (pay*7)/100;
        int pMonth =1;
        for(; pMonth <= 120; pMonth++) {
            pay = pay + payPercent;
            if (pMonth % 6 == 0) {
                System.out.println("Месяц " + pMonth + " составил - " + pay);
            }
        }


        int salary = 15000;
        int chek = 7;
        int salaryChek = (pay*7)/100;
        int sMonth =1;
        for(; sMonth <=9*12; sMonth++) {
            salary = salary + salaryChek;
            if (sMonth % 6 == 0) {
                System.out.println("Месяц " + sMonth + " Сумма вклада = " + salary);
            }
        }

        for(int frayday = 4;frayday <= 31;frayday++ ) {
            if (frayday % 7 == 0) {
                System.out.println("Сегодня пятница, " + frayday + "-е число. Необходимо подготовить отчет");
            }
        }


        int comentOne = 100;
        for (int years = 1823 ; years <= 2123; years ++) {
          if (years % 79 == 0) {
              System.out.println(years);
          }
        }








    }
}