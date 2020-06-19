package db.entity.bridge;

import java.lang.Integer;
import db.entity.HomeHeatingDiscountEnum;
import db.entity.Customer;
import db.interfaces.*;
import java.sql.SQLException;
import annotations.AutoGenerated;
import java.util.ArrayList;
import java.sql.Timestamp;
import db.entity.FuelEnum;
import visitor.Visitor;
import java.util.List;
import db.entity.OrderUrgencyEnum;
import java.lang.Double;
import db.entity.HomeHeatingOrder;
import java.lang.String;

@AutoGenerated
public class HomeHeatingOrderBridge implements IEntityBridge {

	private static final String TableName = "home_heating_order";

	private static Object _lock = new Object();
	private static HomeHeatingOrderBridge _instance;
	
	private HomeHeatingOrderBridge() {}

	public static HomeHeatingOrderBridge getInstance() {
		if (_instance == null) {
			synchronized(_lock) {
				if (_instance == null) {
					_instance = new HomeHeatingOrderBridge();
				}
			}
		}
		return _instance;
	}

	public IEntity createEntity() {
		return new HomeHeatingOrder();
	}

	@Override
	public void populateEntity(IEntity ientity, IGetValue<Integer, String, Object, Object> iterator) throws SQLException, InterruptedException {
		HomeHeatingOrder entity = (HomeHeatingOrder) ientity;
		entity.setId((Integer) iterator.get(0, "id", entity.getId()));
		entity.setOrderId((Integer) iterator.get(1, "order_id", entity.getOrderId()));
		entity.setOrderTime((Timestamp) iterator.get(2, "order_time", entity.getOrderTime()));
		entity.setOrderStatus((String) iterator.get(3, "order_status", entity.getOrderStatus()));
		entity.setPricePerLiter((Double) iterator.get(4, "price_per_liter", entity.getPricePerLiter()));
		entity.setTotalPrice((Double) iterator.get(5, "total_price", entity.getTotalPrice()));
		entity.setAmount((Double) iterator.get(6, "amount", entity.getAmount()));
		entity.setCustomer((Customer) iterator.get(7, "customer_fk", entity.getCustomer()));
		entity.setOrderUrgencyEnum((OrderUrgencyEnum) iterator.get(8, "order_urgency_enum_fk", entity.getOrderUrgencyEnum()));
		entity.setHomeHeatingDiscountEnum((HomeHeatingDiscountEnum) iterator.get(9, "home_heating_discount_enum_fk", entity.getHomeHeatingDiscountEnum()));
		entity.setFuelEnum((FuelEnum) iterator.get(10, "fuel_enum_fk", entity.getFuelEnum()));
	}

	@Override
	public void collectFromEntity(IEntity ientity, ISetValue<Integer, String, Object> iterator) throws SQLException, InterruptedException {
		HomeHeatingOrder entity = (HomeHeatingOrder) ientity;
		iterator.set(0, "id", entity.getId());
		iterator.set(1, "order_id", entity.getOrderId());
		iterator.set(2, "order_time", entity.getOrderTime());
		iterator.set(3, "order_status", entity.getOrderStatus());
		iterator.set(4, "price_per_liter", entity.getPricePerLiter());
		iterator.set(5, "total_price", entity.getTotalPrice());
		iterator.set(6, "amount", entity.getAmount());
		iterator.set(7, "customer_fk", entity.getCustomer());
		iterator.set(8, "order_urgency_enum_fk", entity.getOrderUrgencyEnum());
		iterator.set(9, "home_heating_discount_enum_fk", entity.getHomeHeatingDiscountEnum());
		iterator.set(10, "fuel_enum_fk", entity.getFuelEnum());
	}

	@Override
	public void accept(IEntity entity, Visitor visitor) {
		visitor.visit((HomeHeatingOrder) entity);
	}

	@Override
	public String getTableName() {
		return TableName;
	}

	@Override
	public List<IEntity> getForeignEntities(IEntity ientity) {
		HomeHeatingOrder entity = (HomeHeatingOrder) ientity;
		List<IEntity> list = new ArrayList<IEntity>();
		list.add(entity.getCustomer());
		list.add(entity.getOrderUrgencyEnum());
		list.add(entity.getHomeHeatingDiscountEnum());
		list.add(entity.getFuelEnum());
		return list;
	}
}