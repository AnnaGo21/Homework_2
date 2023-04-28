package Homework;

import java.util.Scanner;

public class Inputs {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    private int principal;
    private float annualInterest;
    private byte years;

    public Inputs(){
        int principal = (int) readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) readNumber("Period (Years): ", 1, 30);

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

    private double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        scanner.close();
        return value;
    }

}

