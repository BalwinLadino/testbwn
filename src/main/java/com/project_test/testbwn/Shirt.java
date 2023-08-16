package com.project_test.testbwn;

public class Shirt {
    public int shirtId = 0; //0 Por defecto
    public String description = "Descripcion requerida";
    public char colorCode = 'u';
    public double price = 0 ;
    public int quantity = 0;
    public void displayShirtInfo(){
        System.out.println("Shirt ID: "+ shirtId);
        System.out.println("Shirt Description: " + description);
        System.out.println("Shirt Color: " + colorCode);
        System.out.println("Shirt Prince: "+ price);
        System.out.println("Shirt quantity: "+quantity);
    }
}
