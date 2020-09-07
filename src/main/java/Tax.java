
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author frys
 */
public class Tax {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("How much money did you spend:");
        double moneySpent = keyboard.nextDouble();
        
        //Display amount purchased 
        System.out.println("You have spent " +"$"+ moneySpent +" dollars");
       
        //Solve State tax
        double stateSalesTax = moneySpent * 0.04;
       System.out.println("Your state tax is " +"$"+ stateSalesTax);
       
       // Solve county sales tax
       double countySalesTax = moneySpent * 0.02;
       System.out.println("Your county tax is " +"$"+ countySalesTax);
    
       double totalSales = countySalesTax + stateSalesTax;
       System.out.println("Your toal tax is " +"$"+ totalSales);
       
       // Total Purchase 
        double totalPurchase = moneySpent + totalSales;
       System.out.println("Your toal purchase is " +"$"+ totalPurchase);
    }
}
