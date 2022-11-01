package sooper;

import java.time.LocalDate;

import sooper.contenedores.Bolsa;
import sooper.contenedores.Caja;
import sooper.productos.Congelado;
import sooper.productos.Fresco;
import sooper.productos.Higiene;

public class Supermercado {

	public static void main(String[] args) {
		IPedido miPedido = new Pedido("pedido001");
		
		IContenedor bolsa1 = new Bolsa("B111", 40, 25, 900);
		IContenedor caja1 = new Caja("C222", 30, 50, 75);
		miPedido.addContenedor(caja1);
		miPedido.addContenedor(bolsa1);
		
		IProducto manzanas = new Fresco("MNZ", 1000, 1500, LocalDate.now().plusDays(20));
		IProducto helado = new Congelado("HLD", 800, 1000);
		IProducto papelWc = new Higiene("PWC", 500, 2500);
		IProducto peras = new Fresco("PER", 800, 1200, LocalDate.now().plusDays(5));
		
		IContenedor contManzana = miPedido.addProducto(manzanas);
		IContenedor contHelado = miPedido.addProducto(helado);
		IContenedor contPapel = miPedido.addProducto(papelWc);
		IContenedor contPeras = miPedido.addProducto(peras);
	}

}
