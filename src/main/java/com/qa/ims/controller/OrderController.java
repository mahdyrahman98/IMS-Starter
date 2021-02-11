package com.qa.ims.controller;

import java.sql.SQLException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.persistence.domain.Orderitem;
import com.qa.ims.utils.Utils;

public class OrderController implements CrudController<Order> {
	
	public static final Logger LOGGER = LogManager.getLogger();

	private OrderDAO orderDAO;
	private Utils utils;
	
	
	public OrderController(OrderDAO orderDAO, Utils utils) {
		super();
		this.orderDAO = orderDAO;
		this.utils = utils;
	}

	/**
	 * Reads all orders to the logger
	 */
	@Override
	public List<Order> readAll() {
		List<Order> orders = orderDAO.readAll();
		for (Order order : orders) {
			LOGGER.info(order);
		}
		return orders;
	}

	/**
	 * Creates a order by taking in user input
	 * @throws SQLException 
	 */
	@Override
	public Order create() throws SQLException {
		
		boolean additem = true;
		LOGGER.info("Please enter customerID");
		Long customerid = utils.getLong();
		Order order = orderDAO.create(new Order (customerid));
		while (additem) {
			LOGGER.info("Do you want to add an item?: y/n");
			String choice = utils.getString();
			if(choice.toLowerCase().equals("y")) {
		LOGGER.info("please enter itemid");
		Long itemid = utils.getLong();
		LOGGER.info("Please enter how much of this item that you want");
		Long quantity = utils.getLong();
		Order order1 = orderDAO.generate(new Orderitem (itemid, quantity));
		LOGGER.info("Do you want to add anything else?");}	
		else  {
			additem = false;
			
		}
			
		}
		LOGGER.info("Order generated");
		return order;
	}

	
		
		
	

	/**
	 * Updates an existing order by taking in user input
	 */
	@Override
	public Order update() {
		
		boolean removeitem = true;
		LOGGER.info("Please enter the orderid of the order you would like to update");
		Long orderid = utils.getLong();
		Order order = orderDAO.update(new Order(orderid));
		while (removeitem) {
			LOGGER.info("Do you want to remove an item?: y/n");
			String choice = utils.getString();
			if(choice.toLowerCase().equals("y")) {
		LOGGER.info("please enter itemid");
		Long itemid = utils.getLong();
		Order order1 = orderDAO.edit(new Orderitem(itemid));
		LOGGER.info("Do you want to remove anything else from your order?");}
		else  {
			removeitem = false;
			
		}
		LOGGER.info("order updated");
	}
		return order;
		}
	

	/**
	 * Deletes an existing order by the id of the order
	 * 
	 * @return
	 */
	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the order you would like to delete");
		Long orderid = utils.getLong();
		return orderDAO.delete(orderid);
	}
	

}


