package com.example;

public class Main {

    public static void main(String[] args) {


        Product p1 = new Product("P123", "Laptop", 1200.0, 50);

    
        Product p2 = new Product();

        
        p2.setId("P456");
        p2.setNombre("Mouse");
        p2.setPrecio(25.0);
        p2.setStock(100);

    
        System.out.println("Producto 1 - Nombre: " + p1.getNombre());
        System.out.println("Producto 1 - Precio: " + p1.getPrecio());

        System.out.println("Producto 2 - Nombre: " + p2.getNombre());
        System.out.println("Producto 2 - Stock: " + p2.getStock());

        
        System.out.println("\nRepresentación completa:");
        System.out.println(p1);
        System.out.println(p2);
    }
}