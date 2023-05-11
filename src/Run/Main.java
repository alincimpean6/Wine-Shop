package Run;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.*;
import Run.*;
import View.*;

public class Main {
	
	static List<Vin> vinList = new ArrayList<>();
	
	public static int citOptiune(String citire) {
		System.out.print(citire);
		try {
			Scanner s = new Scanner(System.in);
			int I = s.nextInt();
			return I;
		} catch (Exception e) {
			System.out.println("Ai gresit optiunea.");
			citOptiune(citire);
		}
		return 0;
	}
	
	public static int meniu() {
		View.print(" ");
		View.print("1.Citire date fisier");
		View.print("2.Citire date de la tastatura");
		View.print("3.Tabel cu toate marfurile");
		View.print("4.Tabel cu marfa disponibila");
		View.print("5.Tabel cu marfa bine vanduta (peste p procente)");
		return citOptiune("Alege optiune:");
	}
	
	public static void main(String[] args) {
		int opt = meniu();
		while (opt != 0) {
			switch (opt) {
			case 1:
				try {
					Read.readerFromFile(vinList);
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case 2:
				Read.readFromKey(vinList);
				break;
			case 3:
				View.afisVin(vinList);
				break;
			case 4:
				View.afisVinDisponibil(vinList);
				break;
			case 5:
				int procentS = citOptiune("Procent: ");
				View.afisVinProcent(procentS,vinList);
				break;
			default:
				System.out.println("Ai gresit optiunea, mai incearca");
			}
			opt = meniu();
		}
		System.out.println("Program terminat");
	}

}
