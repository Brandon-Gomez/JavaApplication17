/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;

/**
 *
 * @author estudiante
 */
public class Carro implements Rueda{
    
     public Carro(){
         
     }
     
     @Override
     public void avanzar(){
         System.out.println("El carro avanza");
     } 
     
     @Override
     public void detenerse(){
         System.out.println("El carro se avanza");
     }
    
}
 