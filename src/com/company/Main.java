package com.company;

public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1); // деление на 0
        Object c = b != 0 ? calc.divide.apply(a, b) : "Попытка деления на 0 !";

        calc.println.accept(c);
    }
}
