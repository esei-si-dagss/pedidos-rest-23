package es.uvigo.mei.pedidos;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import es.uvigo.mei.pedidos.daos.AlmacenDAO;
import es.uvigo.mei.pedidos.daos.ArticuloAlmacenDAO;
import es.uvigo.mei.pedidos.daos.ArticuloDAO;
import es.uvigo.mei.pedidos.daos.ClienteDAO;
import es.uvigo.mei.pedidos.daos.FamiliaDAO;
import es.uvigo.mei.pedidos.daos.PedidoDAO;
import es.uvigo.mei.pedidos.entidades.Almacen;
import es.uvigo.mei.pedidos.entidades.Articulo;
import es.uvigo.mei.pedidos.entidades.ArticuloAlmacen;
import es.uvigo.mei.pedidos.entidades.Cliente;
import es.uvigo.mei.pedidos.entidades.Direccion;
import es.uvigo.mei.pedidos.entidades.Familia;
import es.uvigo.mei.pedidos.entidades.LineaPedido;
import es.uvigo.mei.pedidos.entidades.Pedido;

@SpringBootApplication
public class PedidosSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PedidosSpringApplication.class, args);
	}

}
