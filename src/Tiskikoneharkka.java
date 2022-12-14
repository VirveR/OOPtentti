public class Tiskikoneharkka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}//main

class Tiskikone {
	//attribuutit
	private int ohjelma = 0; ///1, 2 tai 3
	private boolean paalla = false; //on tai off
	
	//rakentajat
	public Tiskikone() {
		ohjelma = 0;
		paalla = false;
	}
	
	public Tiskikone(int ohjelma, boolean paalla) {
		this.ohjelma = ohjelma;
		this.paalla = paalla;
	}
	
	//setterit ja getterit
	public void setOhjelma(int ohjelma) {
		this.ohjelma = ohjelma;
	}
	public int getOhjelma() {
		return this.ohjelma;
	}
	public void setPaalla(boolean paalla) {
		this.paalla = paalla;
	}
	public boolean getPaalla() {
		return this.paalla;
	}
	
	//metodit
	//laittaa tiskikoneen päälle tai pois
	public void turnOnOff() {
		if (paalla) {
			paalla = false;
		}
		else {
			paalla = true;
		}
	}
	
	//valitsee halutun ohjelman
	public void valitseOhjelma(int ohjelma) {
		if (ohjelma == 1) {
			this.setOhjelma(1);
			System.out.println("NORMAALI");
		}
		else if (ohjelma == 2) {
			this.setOhjelma(2);
			System.out.println("AUTO");
		}
		else if (ohjelma == 3) {
			this.setOhjelma(3);
			System.out.println("INTENSIIVINEN");
		}
	}
	
	//tulostaa tiedot
	public void tulostaTiedot() {
		System.out.print("Onko tiskikone päällä: ");
		if (this.getPaalla()) {
			System.out.println("on");
		}
		else {
			System.out.println("ei ole");
		}
		System.out.println("valittu ohjelma: " + this.getOhjelma());
	}

}//tiskikone
