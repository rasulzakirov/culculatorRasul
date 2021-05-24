
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String rom = "i";
        String rom2 = "v";
        String rom3 = "x";
        System.out.println("Give from 1 to 10");
        System.out.println("Give from I to X");


try {

    Scanner scanner = new Scanner(System.in);
    String a = scanner.next();
    Normal normal = new Normal(a);
    RomanNumbers romanNumbers = new RomanNumbers(a);
    if (a.contains("I") || a.contains("V") || a.contains("X")) {
        romanNumbers.findOperator();
    }else if (a.contains("I") || a.contains("V") ||a.contains("X") && a.contains("1")||a.contains("2")
            || a.contains("3") || a.contains("4")||a.contains("5") || a.contains("6")
    || a.contains("7")||a.contains("8") || a.contains("9") || a.contains("0")){
         throw new  MyException("Wrong numbers");

    }
    else {
        normal.findOperator();
    }

}catch (MyException exception){
    System.out.println(exception.getMessage());
}
catch ( ArithmeticException arithmeticException){
    System.out.println(arithmeticException.getMessage());
}
catch (Exception exception){
    System.out.println(exception.getMessage());
}




    }



}

class MyException extends Exception{




    public MyException(String message) {
        super(message);
    }
}
