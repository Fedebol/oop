package sooper.productos;

import java.time.LocalDate;

import sooper.Caducable;

public class Fresco extends Alimentacion implements Caducable{

	private LocalDate caducidad;
	public Fresco(String referencia, int volumen, int peso, LocalDate caducidad) {
		super(referencia, volumen, peso);
		this.caducidad = caducidad;
	}

	public boolean estaCaducado() {
		return caducidad.isBefore(LocalDate.now());
	}

}
