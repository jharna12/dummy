package com.customer.service;

import java.util.Collections;

public class OrderClientFallback implements OrderClient {
	@Override
	public Object getOrdersForCustomer(int customerId) {
		return Collections.emptyList();
	}

}
