package Run;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import Model.Vin;
import Run.*;

public class Read {
	
	public static void readFromKey(List<Vin> vinList) {
		int n;
		n = Main.citOptiune("Cate date o sa introduci? :");

		for (int i = 0; i < n; i++) {
			System.out.print("Vin:");
			Scanner s = new Scanner(System.in);
			String bij = s.nextLine();

			System.out.print("Tip:");
			String mat = s.nextLine();

			int stoc = Main.citOptiune("Stoc initial:");

			int pret = Main.citOptiune("Pret:");

			int vandute = Main.citOptiune("Numar vandute:");

			vinList.add(new Vin(bij, mat, stoc, vandute, pret));
		}
	}

	public static void readerFromFile(List<Vin> vinList) throws IOException {
		BufferedReader fisIn = new BufferedReader(
				new FileReader("C:\\Users\\CIL2CLJ\\eclipse-workspace\\ExamenVin\\src\\Run\\vin.txt"));
		String s;

		while ((s = fisIn.readLine()) != null) {
			String bij[] = s.split(",");
			vinList.add(new Vin(bij[0], bij[1], Integer.parseInt(bij[2]), Integer.parseInt(bij[3]),
					Integer.parseInt(bij[4])));
		}
		fisIn.close();
	}
}
