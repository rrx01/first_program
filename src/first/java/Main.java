package first.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu un numar: ");
        int x=sc.nextInt();
        System.out.println("Rezultatul este: " + x*x);
    }
}
