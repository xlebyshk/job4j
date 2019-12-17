package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        //не знаю надо ли менять полностью метод. Просто закоментирую часть чтоб вывод в консоль был более понятен
        /*
        int euro = rubleToEuro(140);
        int dollar = rubleToDollar(180);
        int rubE = euroToRuble(2);
        int rubD = dollarToRuble(5);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + dollar + " dollar.");
        System.out.println("2 euro are " + rubE + " ruble.");
        System.out.println("5 dollars are " + rubD + " ruble.");*/
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        int in1 = 180;
        int expected1 = 3;
        int out1 = rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("180 rubles are 3. Test result : " + passed1);

        int in2 = 2;
        int expected2 = 140;
        int out2 = euroToRuble(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("2 euro are 140. Test result : " + passed2);

        int in3 = 5;
        int expected3 = 300;
        int out3 = dollarToRuble(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("5 dollars are 300. Test result : " + passed3);

    }
}
