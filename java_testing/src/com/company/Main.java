package com.company;

public class Main {

    public static void main(String[] args) {
        MapTest mapTest = new MapTest();
//        mapTest.step1();
//        mapTest.step2();
//        mapTest.step3();
        mapTest.step3_2();
//        mapTest.step4();



        /*
        * 클래스 이름과 객체를 mock이라고 하긴 했지만 실행하는 입장에서는 Mock을 사용하는지 전혀 알 수도 없고
        * 알 필요조차 없다.
        * mock는 인터페이스만 정의되어 있어도 쉽게 테스트할 수 있다.
        * */
        MonthlyPayDAOMock mock = new MonthlyPayDAOMock();
        mock.setPay("HANBIT01", 1000);
        System.out.println(mock.getPay("HANBIT01"));
        mock.setPay("HANBIT02", 0);

        try{
            System.out.println(mock.getPay("HANBIT02"));
        } catch(Exception e){
            e.printStackTrace();
        }

        System.out.println(mock.getPay("HANBIT03"));
    }
}
