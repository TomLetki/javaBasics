package Exceptions;

import java.util.Scanner;

public class ExceptionsTest {
    public static void main(String[] args) throws InvalidAgeexception {
        System.out.println("podaj wiek ");
        Scanner skaner = new Scanner(System.in);
        int wiek= skaner.nextInt();
        if(wiek<0){
            throw new InvalidAgeexception("Age is not valid");
        }
        if(wiek>=18){
            System.out.println("You are an adrult");
        }else {
            System.out.println("You are too young");
        }
        }
    }

