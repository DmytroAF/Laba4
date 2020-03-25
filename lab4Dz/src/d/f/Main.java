package d.f;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

//1. Решить логические вычисления:
//        a. true && false || true && !false = false
//        b. false || false || !true && false = false
//        c. !false && (false || true && true) = false
//        d. 4 > 8 && !(7 == 0) = false
//        e. !(true && false || false && true) && !(true && 4 <= 5) = false
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
            switch (n10 % 2) {
                case 0:
                    System.out.println(n10 + " - чет");
                    break;
                case 1:
                    System.out.println(n10 + " - нечет");
                    break;
            }
            n10++;
        }
        //spacer
        System.out.println("-------3--------");
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
        //spacer
        System.out.println("-------4-------");
        //#4 факториал числа
        int factorialOtChisla = 10;
        int resultatVichisleniyaFactoriala = 1;
        for (int i = 1; i <= factorialOtChisla; i++) {
            resultatVichisleniyaFactoriala = resultatVichisleniyaFactoriala * i;
            System.out.println(resultatVichisleniyaFactoriala);
            if (resultatVichisleniyaFactoriala > 1000) {
                System.out.println("Dostignut resultat over 1000");
                break;
            }


        }
        System.out.println("-------5-------");
        //#5 вывод каждого 3 значения, для генерации значения используем часть кода задания 4
        //добавляем счетчик итераций
        int factorialOtChisla1 = 15;
        int resultatVichisleniyaFactoriala1 = 1;
        int tripleCounter = 0;
        for (int i = 1; i <= factorialOtChisla1; i++) {
            resultatVichisleniyaFactoriala1 = resultatVichisleniyaFactoriala1 * i;
            tripleCounter++;
            if (tripleCounter%3 == 0) {
                System.out.println("Next third value - " + resultatVichisleniyaFactoriala1);
            }


        }
    }
}