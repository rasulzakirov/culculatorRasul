package com.company;

public class RomanNumbers  implements Functionable {


    String input = " ";


    public RomanNumbers(String input) {
        this.input = input;
    }

    @Override
    public  void findOperator(){
        if (input.contains("+")){
            add();
        }
        else  if (input.contains("-")){
            subtract();
        }
        else if (input.contains("*")){
            multiply();
        }
        else if (input.contains("/")){
            divide();
        }


    }




    @Override
    public void add() {
        char number1 = getChar(input,0);
        char number2 = getChar(input,2);
        String num1= String.valueOf(number1);
        String num2= String.valueOf(number2);


        int sum = romanConvert(num1)+romanConvert(num2);

        System.out.println( IntegerToRomanNumeral(sum));
    }
    @Override
    public void subtract() {
        char number1 = getChar(input,0);
        char number2 = getChar(input,2);
        String num1= String.valueOf(number1);
        String num2= String.valueOf(number2);
        int sub = romanConvert(num1)-romanConvert(num2);

        System.out.println( IntegerToRomanNumeral(sub));


    }

    @Override
    public void multiply() {
        char number1 = getChar(input,0);
        char number2 = getChar(input,2);
        String num1= String.valueOf(number1);
        String num2= String.valueOf(number2);

       int mul =  romanConvert(num1)*romanConvert(num2);
        System.out.println(IntegerToRomanNumeral(mul));
    }

    @Override
    public void divide() {
        char number1 = getChar(input,0);
        char number2 = getChar(input,2);
        String num1= String.valueOf(number1);
        String num2= String.valueOf(number2);

       int div = romanConvert(num1)/romanConvert(num2);
        System.out.println(IntegerToRomanNumeral(div));
    }

    public static char getChar(String input,int index){
        return input.toCharArray()[index];
    }



    public static String IntegerToRomanNumeral(int input) {
        if (input < 1 || input > 3999)
            return "Invalid Roman Number Value";
        String s = "";
        while (input >= 1000) {
            s += "M";
            input -= 1000;        }
        while (input >= 900) {
            s += "CM";
            input -= 900;
        }
        while (input >= 500) {
            s += "D";
            input -= 500;
        }
        while (input >= 400) {
            s += "CD";
            input -= 400;
        }
        while (input >= 100) {
            s += "C";
            input -= 100;
        }
        while (input >= 90) {
            s += "XC";
            input -= 90;
        }
        while (input >= 50) {
            s += "L";
            input -= 50;
        }
        while (input >= 40) {
            s += "XL";
            input -= 40;
        }
        while (input >= 10) {
            s += "X";
            input -= 10;
        }
        while (input >= 9) {
            s += "IX";
            input -= 9;
        }
        while (input >= 5) {
            s += "V";
            input -= 5;
        }
        while (input >= 4) {
            s += "IV";
            input -= 4;
        }
        while (input >= 1) {
            s += "I";
            input -= 1;
        }
        return s;
    }






























    public static int romanConvert(String roman)
    {
        int decimal = 0;

        String romanNumeral = roman.toUpperCase();
        for(int x = 0;x<romanNumeral.length();x++)
        {
            char convertToDecimal = roman.charAt(x);

            switch (convertToDecimal)
            {
                case 'M':
                    decimal += 1000;
                    break;

                case 'D':
                    decimal += 500;
                    break;

                case 'C':
                    decimal += 100;
                    break;

                case 'L':
                    decimal += 50;
                    break;

                case 'X':
                    decimal += 10;
                    break;

                case 'V':
                    decimal += 5;
                    break;

                case 'I':
                    decimal += 1;
                    break;
            }
        }
        if (romanNumeral.contains("IV"))
        {
            decimal-=2;
        }
        if (romanNumeral.contains("IX"))
        {
            decimal-=2;
        }
        if (romanNumeral.contains("XL"))
        {
            decimal-=10;
        }
        if (romanNumeral.contains("XC"))
        {
            decimal-=10;
        }
        if (romanNumeral.contains("CD"))
        {
            decimal-=100;
        }
        if (romanNumeral.contains("CM"))
        {
            decimal-=100;
        }
        return decimal;
    }

    }





