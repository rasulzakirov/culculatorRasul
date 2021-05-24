package com.company;

public class Normal implements Functionable {
    String input = " ";

    public Normal(String input) {
        this.input = input;
    }
@Override
    public  void findOperator(){
          if (input.contains("+")) add();
         else  if (input.contains("-")) subtract();
         else if (input.contains("*")) multiply();
         else if (input.contains("/"))divide();


    }




@Override
    public void add() {
    char number1 = getChar(input,0);
    char number2 = getChar(input,2);
    String num1= String.valueOf(number1);
    String num2= String.valueOf(number2);
    int n1 = Integer.valueOf(num1);
    int n2 = Integer.valueOf(num2);
    System.out.println(n1+n2);
    }
@Override
    public void subtract() {
   char number1 = getChar(input,0);
   char number2 = getChar(input,2);
  String num1= String.valueOf(number1);
  String num2= String.valueOf(number2);
  int n1 = Integer.valueOf(num1);
  int n2 = Integer.valueOf(num2);
  System.out.println(n1-n2);


    }

@Override
    public void multiply() {
    char number1 = getChar(input,0);
    char number2 = getChar(input,2);
    String num1= String.valueOf(number1);
    String num2= String.valueOf(number2);
    int n1 = Integer.valueOf(num1);
    int n2 = Integer.valueOf(num2);
    System.out.println(n1*n2);
    }

@Override
    public void divide() {
    char number1 = getChar(input,0);
    char number2 = getChar(input,2);
    String num1= String.valueOf(number1);
    String num2= String.valueOf(number2);
    int n1 = Integer.valueOf(num1);
    int n2 = Integer.valueOf(num2);
    System.out.println(n1/n2);
    }

    public static char getChar(String input,int index){
        return input.toCharArray()[index];
    }

}
