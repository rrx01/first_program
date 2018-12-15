package first.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Afla patratul unui numar");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu un numar: ");
        int x=sc.nextInt();
        System.out.println("Rezultatul este: " + x*x);
        System.exit(0);
    }
}
