package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class ProgramBar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill costumer;
		costumer = new Bill();
		
		System.out.printf("Sexo: ");
		costumer.gender = sc.next().charAt(0);
		System.out.printf("Quantidade de cervejas: ");
		costumer.beer = sc.nextInt();
		System.out.printf("Quantidade de refrigerantes: ");
		costumer.softDrink = sc.nextInt();
		System.out.printf("Quantidade de espetinhos: ");
		costumer.barbecue = sc.nextInt();
		
		
		System.out.println(costumer);
				
				
				
		sc.close();		
		

	}

}
