package ru.mulyukin.java.basic.homework.part2.homework15;

import java.io.InputStream;

public class CalculatorApp {

    private char sing;

    public CalculatorApp() {
        this.sing = sing;
    }

    public int calculator(char sing, int a, int b){
        int result = 0;
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

