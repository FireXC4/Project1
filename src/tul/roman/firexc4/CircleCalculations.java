package tul.roman.firexc4;

import java.util.Scanner;

public class CircleCalculations {
    public static void main(String[] args){
        float t = 0.5f;  //Základní číslo je v duble pro float "f" ale lepší je pracovat s duble
        double r = 0.2;

        Scanner sc = new Scanner(System.in);
        r = sc.nextDouble();
        double CircPath = 2*Math.PI*r;
        double CircArea = Math.PI*Math.pow(r,2);

        System.out.format("Obvod s Polomerem %f je %.2f%n", r, CircPath);
        System.out.format("Plocha s Polomerem %f je %.2f%n", r, CircArea);
    }
}
