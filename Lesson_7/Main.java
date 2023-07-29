package Lesson_7;

import Lesson_7.calculator.Complex;
import Lesson_7.calculator.ComplexCalculator;
import Lesson_7.calculator.ComplexCalculatorImpl;
import Lesson_7.calculator.ComplexNumber;

public class Main {
    public static void main(String[] args) {
        // Создаем два комплексных числа
        ComplexNumber a = new Complex(2, 3);
        ComplexNumber b = new Complex(1, -1);

        // Создаем калькулятор комплексных чисел
        ComplexCalculator calculator = new ComplexCalculatorImpl();

        // Производим операции над комплексными числами
        ComplexNumber sum = calculator.add(a, b);
        ComplexNumber product = calculator.multiply(a, b);
        ComplexNumber quotient = calculator.divide(a, b);

        // Выводим результаты
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + sum);
        System.out.println("a * b = " + product);
        System.out.println("a / b = " + quotient);
    }
}