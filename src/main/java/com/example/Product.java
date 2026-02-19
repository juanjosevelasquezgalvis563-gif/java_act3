package com.example;

public class Product {

    private String id;
    private String nombre;
    private double precio;
    private int stock;

    public Product() {
        this.id = null;
        this.nombre = null;
        this.precio = 0.0;
        this.stock = 0;
    }

    
    public Product(String id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

  
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio no puede ser negativo");
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("El stock no puede ser negativo");
        }
    }


    public String toString() {
        return "Producto [ID: " + id +
               ", Nombre: " + nombre +
               ", Precio: " + precio +
               ", Stock: " + stock + "]";
    }
}
