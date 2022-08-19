/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.pkg1;

/**
 *
 * @author unalman
 */
public class CalculadoraCelsius {
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i=1; i<=300; i+=20){
         double CalcularCelius;
         double GradosFarenheit=i;
         double Conversion=(i-32)*5/9;
         System.out.println("Para "+i+" Grados farenheit "+Conversion+" es su conversion");
        }
    }
}
