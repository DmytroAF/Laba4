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

    //2
    public static void main(String[] args) {
        int n10 = 0;
        for (int i = 0; i < 10; i++) {
            n10 % 2 = 0 ? System.out.println(n10"--> chetnoe") : System.out.println(n10"--> nechetnoe");
            n10 += 1;
        }

    }
}