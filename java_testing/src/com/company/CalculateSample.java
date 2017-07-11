package com.company;

/**
 * Created by junkyu on 2017. 7. 11..
 */
public class CalculateSample {
    int number1, number2;
    public CalculateSample(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getSum(){
        return number1 + number2;
    }

    public double getAverage(){
        return (number1+number2) / 2.0;
    }

    public int getMultiply(){
        return number1 * number2;
    }

    public double getDivide() throws Exception{
        return number1/number2;
    }
}
