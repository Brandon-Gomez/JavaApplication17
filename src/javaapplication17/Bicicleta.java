/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;

/**
 *
 * @author estudiante
 */
public class Bicicleta implements Rueda, Silla {
        
    public Bicicleta(){}

    public void avanzar() {
        System.out.println("La bicicleta avanza");
    }
    
    public void detenerse() {
        System.out.println("La bicicleta se detiene");
    }
    
    public void sentarse(){
       System.out.println("Sentarse en bicicleta");
    }
}
