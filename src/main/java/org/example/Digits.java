package org.example;

public class Digits {
    public double digitNumbersAverage(int number){

//        double average=44;
//        String number2 = String.valueOf(number);
//        int numberLen = number2.length();
//        Character []numbers = new Character[number2.length()];
//        for(int i=0;i<number2.length();i++){
//            numbers[i] = number2.charAt(i);
//        }
        //int total = 0;
        int countDigits=0;
        int digit = 0;

        while(number>0){
            digit += number%10;
            number /=10;
            countDigits++;
        }

        return digit/countDigits;
    }
}
