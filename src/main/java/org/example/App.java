/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Ben Phung
 */

package org.example;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println( "What is your name? " );
        String name = scan.nextLine();
        System.out.println( "Hello, " +name+ " , nice to meet you!" );

    }
}
