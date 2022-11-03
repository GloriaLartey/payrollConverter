package com.mycompany.scannerkeyboard;

import java.util.Scanner;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */


import java.util.Scanner;
public class temperatureEx {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        System.out.println();
        
        
        String username;
        
 
        System.out.println("Enter your Name:");
        username = input.next();
        System.out.println("Hello " + username  +"!");
        double celsiusGrade;
        System.out.println( "Please enter you temperature in degree Celcuis:");
        celsiusGrade= input.nextDouble();
        double fahrenheitGrade = (1.8*celsiusGrade)+32;
        System.out.println(username + ", your Fahrenheit grade is " + fahrenheitGrade );
    
    }
}
