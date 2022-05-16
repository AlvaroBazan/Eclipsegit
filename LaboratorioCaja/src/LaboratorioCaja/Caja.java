package LaboratorioCaja;
public class Caja {
	int alto;
	int ancho;
	int profundo;

	public int volumen() {
		return alto*ancho*profundo;
	}
	public Caja(int alto,int ancho,int profundo) {
		this.alto=alto;
		this.ancho=ancho;
		this.profundo=profundo;
	}
}


