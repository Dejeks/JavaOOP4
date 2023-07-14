package org.example.Homework.HW10;

import java.util.List;

public class Calculator {
    public static int sum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int multiply(List<Integer> numbers) {
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        return product;
    }

    public static double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Ошибка деления на 0.");
        }
        return dividend / divisor;
    }

    public static String binaryConversion(int number) {
        return Integer.toBinaryString(number);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        System.out.println("Сумма: " + sum(numbers));

        List<Integer> numbersToMultiply = List.of(2, 3, 4);
        System.out.println("Умножение: " + multiply(numbersToMultiply));

        double dividend = 10.0;
        double divisor = 3.0;
        System.out.println("Деление: " + divide(dividend, divisor));

        int numberToConvert = 10;
        System.out.println("Бинарный перевод: " + binaryConversion(numberToConvert));
    }
}
