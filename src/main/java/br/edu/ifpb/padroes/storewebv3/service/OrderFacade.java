package br.edu.ifpb.padroes.storewebv3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.ifpb.padroes.storewebv3.domain.Order;
import br.edu.ifpb.padroes.storewebv3.domain.Product;
import br.edu.ifpb.padroes.storewebv3.repository.ProductRepository;

public class OrderFacade {

	private OrderService orderService = new OrderService();

	@Autowired
	private ProductRepository productRepository;

	public void criarPedido(Order order) {
		orderService.setOrder(order);
	}

	public List<Product> listarProdutosDisponiveis() {
		return productRepository.getProductList();
	}
}

