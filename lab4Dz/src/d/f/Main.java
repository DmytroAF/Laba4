package d.f;

import org.w3c.dom.ls.LSOutput;

//1. Решить логические вычисления:
//        a. true && false || true && !false
//        b. false || false || !true && false
//        c. !false && (false || true && true)
//        d. 4 > 8 && !(7 == 0)
//        e. !(true && false || false && true) && !(true && 4 <= 5)
//        2. Написать программу, которая выводит на экран (с новой строки) числа от 0 до 10
//        и возле каждого пишет четное это число или нечетное.
//        Пример
//        1 -> нечетное
//        2 -> четное
//        и т д.
//        3. Написать программу, которая выводит информацию о дне неделе.
//        Например для понедельника – пятницы выводит сообщение “Это рабочий
//        день”, а для субботы и воскресенья выводит “Это выходной!”
//        4. Написать программу, которая считает факториал числа и выводит
//        промежуточные значения на экран.
//        Условие: если промежуточное значение >1000, завершить цикл предварительно
//        написав в консоли “Достигнут максимально возможный результат”.
//        5. Написать программу, которая выводит на экран каждое 3-е i-ое значение цикла.
public class Main {

    public static void main(String[] args) {
        //#2, фор, иф, свич, инкремент, остаток от деления, брейк
        int n10 = 0;
        for (int i = 0; i < 10; i++) {
            if (n10 == 0) {
                System.out.println(n10 + " - чётность нуля вызывает сомнения в среде людей, недостаточно знакомых с математикой");
                n10++;
            }
            switch (n10%2) {
                case 0:
                    System.out.println(n10 + " - чет");
                    break;
                case 1:
                    System.out.println(n10 + " - нечет");
                    break;
            }
            n10++;
        }
        //#3
        String denNedeli = "Monday";
        switch (denNedeli) {
            case "Sunday":
                System.out.println("Holyday");
                break;
            case "Saturday":
                System.out.println("Holyday");
                break;
            default:
                System.out.println("Working day");
                break;
        }
        //#4 факториал числа
        int factorialOtChisla = 0;
        int resultatVicisleniyaFactoriala = 1;



    }
}