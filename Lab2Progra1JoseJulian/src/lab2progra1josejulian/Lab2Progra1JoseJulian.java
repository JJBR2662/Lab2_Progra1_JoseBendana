/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2progra1josejulian;

import java.util.Scanner;

/**
 *
 * @author bayer
 */
public class Lab2Progra1JoseJulian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese A: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese B: ");
        int num2 = sc.nextInt();
        int nummayor = 1;
        int nummenor = 2;
        int mcd;
        while (nummayor != nummenor){
            if (num1 > num2){
                nummayor=num1;
                nummenor=num2;
            }else{
                nummayor=num2;
                nummenor=num1;
            }
            nummayor=nummayor-nummenor;
        }
        System.out.println("El MCD de "+num1+" y "+num2+" es: "+nummayor);
    }
    
}
