import java.util.SortedMap;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        System.out.println("Задание 2");
        for (int a = 10; a >= 1; a--) {
            System.out.println(a);
        }

        System.out.println("Задание 3");
        for (int b = 0; b <= 17; b = b + 2) {
            System.out.println(b);
        }

        System.out.println("Задание 4");
        for (int c = 10; c >= -10; c = c - 1){
            System.out.println(c);
        }

        System.out.println("Задание 5");
        for (int yeaar = 1904; yeaar <= 2096; yeaar = yeaar +4) {
            System.out.println(yeaar +" год является високосным");
        }

        System.out.println("Задание 6");
        for (int d = 7; d <= 98; d = d + 7) {
            System.out.println(d);
        }

        System.out.println("Задание 7");
        for (int e = 1; e <= 512; e = e * 2) {
            System.out.println(e);
        }

        System.out.println("Задание 8");
        int salary = 29000;
        int total = 0;
        for (int t = 1; t <= 12; t++) {
            total = total + salary;
            System.out.println("Месяц " +t +" сумма накоплений равна " +total +" рублей");
        }

        System.out.println("Задание 9");
        int salary1 = 29000;
        int total1 = 0;
        for (int f = 1; f <= 12; f++){
            total1 = total1 + total1/100;
            total1 = total1 + salary1;
            System.out.println("Месяц " +f +" сумма накоплений равна " +total1 +" рублей");
        }

        System.out.println("Задание 10");
            for (int p = 1; p <=10; p++){
            int y = 2 * p;
            System.out.println("2 * " +p +" = " +y);
        }
    }
}