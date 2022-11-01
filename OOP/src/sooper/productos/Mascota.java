package sooper.productos;

import sooper.IProducto;
import sooper.enums.Categoria;

public class Mascota extends Producto {

	public Mascota(String referencia, int volumen, int peso) {
		super(referencia, volumen, peso);
	}

	@Override
	public Categoria getCategoria() {
		return Categoria.MASCOTAS;
	}

	@Override
	public boolean esCompatible(IProducto p) {
		return !Categoria.DROGUERIA.equals(p.getCategoria());
	}

}
