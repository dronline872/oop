package Lesson_7.calculator;

public class ComplexCalculatorImpl implements ComplexCalculator {
    @Override
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        double realPart = a.getRealPart() + b.getRealPart();
        double imaginaryPart = a.getImaginaryPart() + b.getImaginaryPart();
        return new Complex(realPart, imaginaryPart);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        double realPart = a.getRealPart() * b.getRealPart() - a.getImaginaryPart() * b.getImaginaryPart();
        double imaginaryPart = a.getRealPart() * b.getImaginaryPart() + a.getImaginaryPart() * b.getRealPart();
        return new Complex(realPart, imaginaryPart);
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        double denominator = b.getRealPart() * b.getRealPart() + b.getImaginaryPart() * b.getImaginaryPart();
        double realPart = (a.getRealPart() * b.getRealPart() + a.getImaginaryPart() * b.getImaginaryPart()) / denominator;
        double imaginaryPart = (a.getImaginaryPart() * b.getRealPart() - a.getRealPart() * b.getImaginaryPart()) / denominator;
        return new Complex(realPart, imaginaryPart);
    }
}