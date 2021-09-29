package br.edu.ifpb.padroes.storewebv3.service;

import org.springframework.stereotype.Service;

import br.edu.ifpb.padroes.storewebv3.domain.Order;

@Service
public class OrderService {

	private Order order;
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public Order getOrder() {
		return order;
	}
}

