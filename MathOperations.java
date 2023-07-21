package org.example.Homework.HW10;
import java.util.List;
// Класс для выполнения математических операций
public class MathOperations {
    // Метод для получения суммы чисел
    public static int sum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    // Метод для получения произведения чисел
    public static int multiply(List<Integer> numbers) {
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        return product;
    }

    // Метод для деления двух чисел
    public static double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return dividend / divisor;
    }
}
