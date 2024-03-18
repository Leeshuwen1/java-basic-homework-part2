package ru.mulyukin.java.basic.homework.part2.homework15;

import java.io.InputStream;

public class CalculatorApp {

    private final Character sing;

    public CalculatorApp() {
        this.sing = null;
    }

    public int calculator(int a, int b){
        int result = 0;
        sing.charValue();
        if(sing == '+'){
            result = a + b;
            System.out.println(a + " + " + b + " = " + result);
        } else if (sing == '-') {
            result = a - b;
            System.out.println(a + " - " + b + " = " + result);
        } else if (sing == '*') {
            result = a * b;
            System.out.println(a + " * " + b + " = " + result);
        } else if (sing == '/') {
            result = a / b;
            System.out.println(a + " / " + b + " = " + result);
        }else {
            System.out.println("Вы ввели не верную операцию");
        }
        return result;
    }
}

