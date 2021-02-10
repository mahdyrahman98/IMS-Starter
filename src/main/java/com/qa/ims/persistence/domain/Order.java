package com.qa.ims.persistence.domain;

import java.util.List;

public class Order {
	
	private Long orderid;
	private Long customerid;
	private Double ordervalue;
	private List<Item> items;

	
	
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public Order(Long orderid, Long customerid, Double ordervalue, List<Item> items) {
		super();
		this.orderid = orderid;
		this.customerid = customerid;
		this.ordervalue = ordervalue;
		this.items = items;
	}
	
	public Order(Long customerid) {
	super();
	
		this.customerid = customerid;
		
		
		// TODO Auto-generated constructor stub
	}
	
	public Order(Long orderid, Long customerid, Double ordervalue) {
		super();
		this.orderid = orderid;
		this.customerid = customerid;
		this.ordervalue = ordervalue;
	}
	public Order(Long customerid, Double ordervalue) {
		super();
		this.customerid = customerid;
		this.ordervalue = ordervalue;
		// TODO Auto-generated constructor stub
	}
	public Long getOrderId() {
		return orderid;
	}
	public void setOrderId(Long orderid) {
		this.orderid = orderid;
	}
	public Long getCustomerId() {
		return customerId();
	}

		
	private Long customerId() {
		// TODO Auto-generated method stub
		return null;
	}


	
	public void setCustomerId(Long customerid) {
		this.customerid = customerid;
	}
	public Double getOrderValue() {
		return ordervalue;
	}
	public void setOrderValue(Double ordervalue) {
		this.ordervalue = ordervalue;
	}

	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", customerid=" + customerid + ", ordervalue=" + ordervalue
				+ ", orderdate=" +  "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerid == null) ? 0 : customerid.hashCode());
		result = prime * result + ((items == null) ? 0 : items.hashCode());
		result = prime * result + ((orderid == null) ? 0 : orderid.hashCode());
		result = prime * result + ((ordervalue == null) ? 0 : ordervalue.hashCode());
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
		if (ordervalue == null) {
			if (other.ordervalue != null)
				return false;
		} else if (!ordervalue.equals(other.ordervalue))
			return false;
		return true;
	}
	
	
	
}
