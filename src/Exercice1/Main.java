package Exercice1;

import java.util.Scanner;

public class Main {
	public static void main(String [] args) {

		Scanner keybord = new Scanner(System.in);
		System.out.println("Press the quantity :");
		double qte = keybord.nextDouble();
		System.out.println("Press the unit Price :");
		float unitPrice = keybord.nextFloat();
		//Product P = new Product();
		System.out.println("Totale price is :"+Product.calculateTotlPrice(qte, unitPrice));
	}
}
