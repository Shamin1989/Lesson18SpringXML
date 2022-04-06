package ru.learnUp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
        Calculator calculator = context.getBean(Calculator.class);
        long arg1;
        long arg2;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Введите число 1: ");
            try {
                arg1 = sc.nextLong();
            } catch (Exception e) {
                System.out.print("Разрешен ввод только чисел!");
                break;
            }
            System.out.print("Введите число 2: ");
            try {
                arg2 = sc.nextLong();
            } catch (Exception e) {
                System.out.print("Разрешен ввод только чисел!");
                break;
            }

            System.out.println("Сумма чисел = " + calculator.sum(arg1, arg2));
            System.out.println("Разница этих чисел = " + calculator.subtract(arg1, arg2));
            System.out.println("Деление чисел = " + calculator.divide(arg1, arg2));
            System.out.println("Умножение чисел = " + calculator.multiply(arg1, arg2));
            System.out.println();

        }
    }
}
