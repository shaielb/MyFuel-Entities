package db.entity;

import java.lang.Integer;
import db.entity.HomeHeatingDiscountEnum;
import db.entity.Customer;
import annotations.Column;
import java.io.Serializable;
import annotations.AutoGenerated;
import java.util.ArrayList;
import java.sql.Timestamp;
import db.entity.FuelEnum;
import java.util.List;
import db.entity.OrderUrgencyEnum;
import db.interfaces.IEntity;
import java.lang.Double;
import java.lang.String;
import annotations.Table;

@AutoGenerated
@Table(Name="home_heating_order")
public class HomeHeatingOrder implements IEntity, Serializable {

	private static final long serialVersionUID = 1L;

	@Column(Name="id", Index=0)
	private Integer _id;

	@Column(Name="order_id", Index=1)
	private Integer _order_id;

	@Column(Name="order_time", Index=2)
	private Timestamp _order_time;

	@Column(Name="order_status", Index=3)
	private String _order_status;

	@Column(Name="price_per_liter", Index=4)
	private Double _price_per_liter;

	@Column(Name="total_price", Index=5)
	private Double _total_price;

	@Column(Name="amount", Index=6)
	private Double _amount;

	@Column(Name="customer_fk", Index=7)
	@Table(Name="customer")
	private Customer _customer;

	@Column(Name="order_urgency_enum_fk", Index=8)
	@Table(Name="order_urgency_enum")
	private OrderUrgencyEnum _order_urgency_enum;

	@Column(Name="home_heating_discount_enum_fk", Index=9)
	@Table(Name="home_heating_discount_enum")
	private HomeHeatingDiscountEnum _home_heating_discount_enum;

	@Column(Name="fuel_enum_fk", Index=10)
	@Table(Name="fuel_enum")
	private FuelEnum _fuel_enum;

	public Integer getId() {
		return _id;
	}

	public void setId(Integer id) {
		_id = id;
	}

	public Integer getOrderId() {
		return _order_id;
	}

	public void setOrderId(Integer order_id) {
		_order_id = order_id;
	}

	public Timestamp getOrderTime() {
		return _order_time;
	}

	public void setOrderTime(Timestamp order_time) {
		_order_time = order_time;
	}

	public String getOrderStatus() {
		return _order_status;
	}

	public void setOrderStatus(String order_status) {
		_order_status = order_status;
	}

	public Double getPricePerLiter() {
		return _price_per_liter;
	}

	public void setPricePerLiter(Double price_per_liter) {
		_price_per_liter = price_per_liter;
	}

	public Double getTotalPrice() {
		return _total_price;
	}

	public void setTotalPrice(Double total_price) {
		_total_price = total_price;
	}

	public Double getAmount() {
		return _amount;
	}

	public void setAmount(Double amount) {
		_amount = amount;
	}

	public Customer getCustomer() {
		return _customer;
	}

	public void setCustomer(Customer customer) {
		_customer = customer;
	}

	public OrderUrgencyEnum getOrderUrgencyEnum() {
		return _order_urgency_enum;
	}

	public void setOrderUrgencyEnum(OrderUrgencyEnum order_urgency_enum) {
		_order_urgency_enum = order_urgency_enum;
	}

	public HomeHeatingDiscountEnum getHomeHeatingDiscountEnum() {
		return _home_heating_discount_enum;
	}

	public void setHomeHeatingDiscountEnum(HomeHeatingDiscountEnum home_heating_discount_enum) {
		_home_heating_discount_enum = home_heating_discount_enum;
	}

	public FuelEnum getFuelEnum() {
		return _fuel_enum;
	}

	public void setFuelEnum(FuelEnum fuel_enum) {
		_fuel_enum = fuel_enum;
	}

	public String toString() {
		List<String> list = new ArrayList<String>();
		if (_id != null) {
			list.add("	id: " + _id);
		}
		if (_order_id != null) {
			list.add("	order_id: " + _order_id);
		}
		if (_order_time != null) {
			list.add("	order_time: " + _order_time);
		}
		if (_order_status != null) {
			list.add("	order_status: " + _order_status);
		}
		if (_price_per_liter != null) {
			list.add("	price_per_liter: " + _price_per_liter);
		}
		if (_total_price != null) {
			list.add("	total_price: " + _total_price);
		}
		if (_amount != null) {
			list.add("	amount: " + _amount);
		}
		if (_customer != null) {
			list.add("	customer: " + _customer);
		}
		if (_order_urgency_enum != null) {
			list.add("	order_urgency_enum: " + _order_urgency_enum);
		}
		if (_home_heating_discount_enum != null) {
			list.add("	home_heating_discount_enum: " + _home_heating_discount_enum);
		}
		if (_fuel_enum != null) {
			list.add("	fuel_enum: " + _fuel_enum);
		}
		return "table home_heating_order:\n" + String.join("\n", list);
	}

}