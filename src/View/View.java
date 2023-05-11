package View;

import java.util.List;

import Model.*;

public class View {
	public static void capTabel(int nrSemne, String Semne, String CapTabel) {
		linie(nrSemne, Semne);
		System.out.println(CapTabel);
		//linie(nrSemne, Semne);
	}

	public static void linie(int nrSemne, String Semne) {
		for (int i = 0; i < nrSemne; i++)
			System.out.print(Semne);
		System.out.println();
	}
	
	public static void print(String string) {
		System.out.println(string);
	}
	
	public static void afisVinProcent(int procent,List<Vin> vinList) {
		capTabel(84, "=", "| Denumire |    Tip    | Stoc initial |   Vandute    |  Pret Unitar |    Valoare   |");
		for (Vin vin : vinList) {
			int calculvin = vin.getStocInitial() - vin.getVandute();
			int procentVanzare = (int) (((double) vin.getVandute() / vin.getStocInitial()) * 100);
			if (procentVanzare > procent) {
				int itemPrice = vin.getVandute() * vin.getPretUnit();
				linie(84, "-");
				System.out.format("|%-10s| %-10s| %13d| %13d| %13d| %13d|\n", vin.getDenumire(), vin.getTip(),
						vin.getStocInitial(), vin.getVandute(), vin.getPretUnit() , itemPrice);
			}
		}
		linie(84, "=");
	}
	
	public static void afisVin(List<Vin> vinList) {
		capTabel(69, "=", "| Denumire |    Tip    | Stoc initial |   Vandute    |  Pret Unitar |");
		for (Vin vin : vinList) {
			linie(69, "-");
			System.out.format("|%-10s| %-10s| %13d| %13d| %13d|\n", vin.getDenumire(), vin.getTip(),
					vin.getStocInitial(), vin.getVandute(), vin.getPretUnit());
		}
		linie(69, "=");
	}

	public static void afisVinDisponibil(List<Vin> vinList) {
		capTabel(68, "=", "| Denumire |    Tip    | Disponibile |  Pret Unitar | Valoare disp |");
		for (Vin vin : vinList) {
			int calculvin = vin.getStocInitial() - vin.getVandute();
			int calculPret = calculvin * vin.getPretUnit();
			if (calculvin > 0) {
				linie(68, "-");
				System.out.format("|%-10s| %-10s| %12d| %13d| %13d|\n", vin.getDenumire(), vin.getTip(), calculvin,
						vin.getPretUnit(), calculPret);
			}
		}
		linie(68, "=");
	}
}
