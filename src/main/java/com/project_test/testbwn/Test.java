package com.project_test.testbwn;

public class Test {

    public static void main(String[] args){
        Dog d = new Dog();
        d.setWeight(d.weight);
        System.out.println("el perro pesa unos "+ d.getWeight()+" Kilos");
    }
}
