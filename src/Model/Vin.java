package Model;

public class Vin {
	private String denumire;
	private String tip;
	private int StocInitial;
	private int Vandute;
	private int PretUnit;
	
	public Vin (String denumire, String tip, int StocInitial, int PretUnit) {
		this(denumire,tip,StocInitial,0,PretUnit);
	}
	
	public Vin (String denumire, String tip, int StocInitial, int Vandute, int PretUnit) {
		this.denumire = denumire;
		this.tip = tip;
		this.StocInitial = StocInitial;
		this.Vandute = Vandute;
		this.PretUnit = PretUnit;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public int getStocInitial() {
		return StocInitial;
	}

	public void setStocInitial(int stocInitial) {
		StocInitial = stocInitial;
	}

	public int getVandute() {
		return Vandute;
	}

	public void setVandute(int vandute) {
		Vandute = vandute;
	}

	public int getPretUnit() {
		return PretUnit;
	}

	public void setPretUnit(int pretUnit) {
		PretUnit = pretUnit;
	}
}
