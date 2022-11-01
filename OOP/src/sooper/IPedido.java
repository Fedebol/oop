package sooper;

import java.util.Set;

public interface IPedido {
	
	String getReferncia();
	Set<IProducto> getProductos();
	Set<IContenedor> getContenedores();
	void addContenedor(IContenedor contenedor);
	IContenedor addProducto (IProducto producto);

}
