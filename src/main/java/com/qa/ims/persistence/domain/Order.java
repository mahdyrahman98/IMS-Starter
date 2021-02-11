package com.qa.ims.persistence.domain;

import java.util.List;

public class Order {

	private Long orderid;
	private Long customerid;
	private List<Item> items;

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Order(Long orderid, Long customerid, List<Item> items) {
		super();
		this.orderid = orderid;
		this.customerid = customerid;
		this.items = items;
	}

	public Order(Long customerid) {
		super();

		this.customerid = customerid;

	}

	public Order(Long orderid, Long customerid) {
		super();
		this.orderid = orderid;
		this.customerid = customerid;
	}

	public Long getOrderId() {
		return orderid;
	}

	public void setOrderId(Long orderid) {
		this.orderid = orderid;
	}

	public Long getCustomerId() {
		return customerid;
	}

	public void setCustomerId(Long customerid) {
		this.customerid = customerid;
	}

	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", customerid=" + customerid + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerid == null) ? 0 : customerid.hashCode());
		result = prime * result + ((items == null) ? 0 : items.hashCode());
		result = prime * result + ((orderid == null) ? 0 : orderid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (customerid == null) {
			if (other.customerid != null)
				return false;
		} else if (!customerid.equals(other.customerid))
			return false;
		if (items == null) {
			if (other.items != null)
				return false;
		} else if (!items.equals(other.items))
			return false;
		if (orderid == null) {
			if (other.orderid != null)
				return false;
		} else if (!orderid.equals(other.orderid))
			return false;

		return true;
	}

}
