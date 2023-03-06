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

    private static void task1() {
        System.out.println("Задача1");
        int money = 0;
        int month = 0;
        while (money <= 2459000) {
            money = money + 15000;
            month++;
            System.out.println("Месяц " + month  + " сумма накоплений равна " + money + " рублей" );
        }

    }

    private static void task2() {
        System.out.println("Задача2");
           int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();

            for (int i = 10; i > 0; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        private static void task3 () {
            System.out.println("Задача3");
            int population = 12_000_000;
            int fertility = 17;
// 17 человек на 1000 и 8
            int mortality = 8;
            int year = 0;
            //int fertilityMortality = (fertility - mortality) * 12000;
            // int populationGrowth= (fertilityMortality)*12_000;
            while (year < 10) {
                population = population + (fertility - mortality) * 12000;
                year++;
                System.out.println("Год " + year + " численность населения составляет " + population);
            }
        }

        private static void task4() {
            System.out.println("Задача4");

            int contribution = 15000;
            int months = 0;
            int i = 1;
            //int contributionPersent = (contribution * 7) / 100;
            for (; contribution < 12_000_000; i++) {
                months++;
                contribution = contribution + (contribution * 7) / 100;
                System.out.println("Месяц " + i + " Сумма накоплнгий составила " + contribution);
            }
        }

        private static void task5() {
        System.out.println("Задача5");
            int pay = 15000;
            int percent = 7;
            int payPercent = (pay * 7) / 100;
            int pMonth = 1;
            for (; pMonth <= 120; pMonth++) {
                pay = pay + payPercent;
                if (pMonth % 6 == 0) {
                    System.out.println("Месяц " + pMonth + " составил - " + pay);
                }
            }
        }

        private static void task6() {
        System.out.println("Задача6");
            int salary = 15000;
            int chek = 7;
            int salaryChek = (salary * 7) / 100;
            int sMonth = 1;
            for (; sMonth <= 9 * 12; sMonth++) {
                salary = salary + salaryChek;
                if (sMonth % 6 == 0) {
                    System.out.println("Месяц " + sMonth + " Сумма вклада = " + salary);
                }
            }
        }

        private static void task7() {
        System.out.println("Задача7");
            for (int frayday = 3; frayday <= 31; frayday+=7) {
                System.out.println("Сегодня пятница, " + frayday + "-е число. Необходимо подготовить отчет");
                }
            }

        private static void task8() {
            System.out.println("Задача8");
            int comentOne = 100;
            for (int years = 1823; years <= 2123; years++) {
                if (years % 79 == 0) {
                    System.out.println(years);
                }
            }
        }
    }
