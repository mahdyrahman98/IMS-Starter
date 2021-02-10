package com.qa.ims.persistence.domain;

public class Orderitem {
	
	private Long orderitemid;
	private Long orderid;
	private Long itemid;
	private Long itemquantity;
	public Orderitem(Long orderitemid, Long orderid, Long itemid, Long itemquantity) {
		super();
		this.orderitemid = orderitemid;
		this.orderid = orderid;
		this.itemid = itemid;
		this.itemquantity = itemquantity;
	}

	
	public Orderitem(Long itemid, Long itemquantity) {
		
		super();
		this.itemid = itemid;
		this.itemquantity = itemquantity;

	}
	public Long getOrderItemId() {
		return orderitemid;
	}
	public void setOrderItemId(Long orderitemid) {
		this.orderitemid = orderitemid;
	}
	public Long getOrderId() {
		return orderid;
	}
	public void setOrderId(Long orderid) {
		this.orderid = orderid;
	}
	public Long getItemId() {
		return itemid;
	}
	public void setItemId(Long itemid) {
		this.itemid = itemid;
	}
	public Long getItemQuantity() {
		return itemquantity;
	}
	public void setItemQuantity(Long itemquantity) {
		this.itemquantity = itemquantity;
	}
	@Override
	public String toString() {
		return "Orderitem [orderitemid=" + orderitemid + ", orderid=" + orderid + ", itemid=" + itemid
				+ ", orderquantity=" + itemquantity + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((itemid == null) ? 0 : itemid.hashCode());
		result = prime * result + ((orderid == null) ? 0 : orderid.hashCode());
		result = prime * result + ((orderitemid == null) ? 0 : orderitemid.hashCode());
		result = prime * result + ((itemquantity == null) ? 0 : itemquantity.hashCode());
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
		Orderitem other = (Orderitem) obj;
		if (itemid == null) {
			if (other.itemid != null)
				return false;
		} else if (!itemid.equals(other.itemid))
			return false;
		if (orderid == null) {
			if (other.orderid != null)
				return false;
		} else if (!orderid.equals(other.orderid))
			return false;
		if (orderitemid == null) {
			if (other.orderitemid != null)
				return false;
		} else if (!orderitemid.equals(other.orderitemid))
			return false;
		if (itemquantity == null) {
			if (other.itemquantity != null)
				return false;
		} else if (!itemquantity.equals(other.itemquantity))
			return false;
		return true;
	}
	

}
