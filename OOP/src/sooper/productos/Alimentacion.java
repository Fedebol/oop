package sooper.productos;

import sooper.IProducto;
import sooper.enums.Categoria;

public class Alimentacion extends Producto {

	public Alimentacion(String referencia, int volumen, int peso) {
		super(referencia, volumen, peso);
	}

	@Override
	public Categoria getCategoria() {
		return Categoria.ALIMENTACION;
	}

	@Override
	public boolean esCompatible(IProducto p) {
		return Categoria.ALIMENTACION.equals(p.getCategoria());
	}

}
