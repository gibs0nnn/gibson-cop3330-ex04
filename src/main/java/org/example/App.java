package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Nathaniel Gibson
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = scanner.next();
        System.out.print("Enter a verb: ");
        String verb = scanner.next();
        System.out.print("Enter a adjective: ");
        String adjective = scanner.next();
        System.out.print("Enter an adverb: ");
        String adverb = scanner.next();
        System.out.println("I like to " + verb + " " + adverb + " when thinking about " + adjective + " " + noun + ".");
    }
}
