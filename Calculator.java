package org.example.Homework.HW10;

import java.util.List;

// Основной класс калькулятора
public class Calculator {
    private List<Integer> numbers;

    public Calculator(List<Integer> numbers) {
        this.numbers = numbers;
    }

    // Метод для получения суммы чисел
    public int sum() {
        return MathOperations.sum(numbers);
    }

    // Метод для получения произведения чисел
    public int multiply() {
        return MathOperations.multiply(numbers);
    }

    // Метод для деления двух чисел
    public double divide(double dividend, double divisor) {
        return MathOperations.divide(dividend, divisor);
    }

    // Метод для преобразования числа в двоичное представление
    public String binaryConversion(int number) {
        return BinaryConverter.toBinary(number);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Calculator calculator = new Calculator(numbers);

        System.out.println("Sum: " + calculator.sum());

        List<Integer> numbersToMultiply = List.of(2, 3, 4);
        calculator = new Calculator(numbersToMultiply);
        System.out.println("Product: " + calculator.multiply());

        double dividend = 10.0;
        double divisor = 3.0;
        System.out.println("Division: " + calculator.divide(dividend, divisor));

        int numberToConvert = 10;
        System.out.println("Binary conversion: " + calculator.binaryConversion(numberToConvert));
    }
}
