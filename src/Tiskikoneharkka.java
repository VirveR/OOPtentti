public class Tiskikoneharkka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}//main

class Tiskikone {
	//attribuutit
	private int ohjelma = 0;
	private boolean paalla = false;
	
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

}//tiskikone
