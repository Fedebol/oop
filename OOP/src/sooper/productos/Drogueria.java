package sooper.productos;

import sooper.IProducto;
import sooper.enums.Categoria;

public class Drogueria extends Producto {

	public Drogueria(String referencia, int volumen, int peso) {
		super(referencia, volumen, peso);
	}

	@Override
	public Categoria getCategoria() {
		return Categoria.DROGUERIA;
	}

	@Override
	public boolean esCompatible(IProducto p) {
		return !Categoria.ALIMENTACION.equals(p.getCategoria()) && !Categoria.MASCOTAS.equals(p.getCategoria());
	}

}
