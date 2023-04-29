package Homework;

import java.util.Scanner;

public class Inputs {
    
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    private int principal;
    private float annualInterest;
    private byte years;

    public Inputs(){
        //Passing scanner as an argument, because Visual Studio wouldn't let me run this program, until I  
        //closed scanner. But after scanner.close(), there was an error
        Scanner scanner = new Scanner(System.in);
        int principal = (int) readNumber(scanner, "Principal: ", 1000, 1_000_000);
        float annualInterest = (float) readNumber(scanner, "Annual Interest Rate: ", 1, 30);
        byte years = (byte) readNumber(scanner, "Period (Years): ", 1, 30);

        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public int getPrincipal() {
        return principal;
    }

    public float getAnnualInterest() {
        return annualInterest;
    }

    public byte getYears() {
        return years;
    }

    private double readNumber(Scanner scanner, String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }

}

