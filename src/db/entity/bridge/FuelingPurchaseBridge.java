package db.entity.bridge;

import java.lang.Integer;
import db.entity.Customer;
import db.entity.FuelingPurchase;
import db.interfaces.*;
import db.entity.SpecialSalesEnum;
import java.sql.SQLException;
import annotations.AutoGenerated;
import java.util.ArrayList;
import java.sql.Timestamp;
import db.entity.FuelEnum;
import visitor.Visitor;
import java.util.List;
import db.entity.Car;
import db.entity.Station;
import java.lang.Double;
import java.lang.String;

@AutoGenerated
public class FuelingPurchaseBridge implements IEntityBridge {

	private static final String TableName = "fueling_purchase";

	private static Object _lock = new Object();
	private static FuelingPurchaseBridge _instance;
	
	private FuelingPurchaseBridge() {}

	public static FuelingPurchaseBridge getInstance() {
		if (_instance == null) {
			synchronized(_lock) {
				if (_instance == null) {
					_instance = new FuelingPurchaseBridge();
				}
			}
		}
		return _instance;
	}

	public IEntity createEntity() {
		return new FuelingPurchase();
	}

	@Override
	public void populateEntity(IEntity ientity, IGetValue<Integer, String, Object, Object> iterator) throws SQLException, InterruptedException {
		FuelingPurchase entity = (FuelingPurchase) ientity;
		entity.setId((Integer) iterator.get(0, "id", entity.getId()));
		entity.setDateTime((Timestamp) iterator.get(1, "date_time", entity.getDateTime()));
		entity.setAmount((Double) iterator.get(2, "amount", entity.getAmount()));
		entity.setPricePerLiter((Double) iterator.get(3, "price_per_liter", entity.getPricePerLiter()));
		entity.setTotalPrice((Double) iterator.get(4, "total_price", entity.getTotalPrice()));
		entity.setPriceType((String) iterator.get(5, "price_type", entity.getPriceType()));
		entity.setCar((Car) iterator.get(6, "car_fk", entity.getCar()));
		entity.setSpecialSalesEnum((SpecialSalesEnum) iterator.get(7, "special_sales_enum_fk", entity.getSpecialSalesEnum()));
		entity.setStation((Station) iterator.get(8, "station_fk", entity.getStation()));
		entity.setFuelEnum((FuelEnum) iterator.get(9, "fuel_enum_fk", entity.getFuelEnum()));
		entity.setCustomer((Customer) iterator.get(10, "customer_fk", entity.getCustomer()));
	}

	@Override
	public void collectFromEntity(IEntity ientity, ISetValue<Integer, String, Object> iterator) throws SQLException, InterruptedException {
		FuelingPurchase entity = (FuelingPurchase) ientity;
		iterator.set(0, "id", entity.getId());
		iterator.set(1, "date_time", entity.getDateTime());
		iterator.set(2, "amount", entity.getAmount());
		iterator.set(3, "price_per_liter", entity.getPricePerLiter());
		iterator.set(4, "total_price", entity.getTotalPrice());
		iterator.set(5, "price_type", entity.getPriceType());
		iterator.set(6, "car_fk", entity.getCar());
		iterator.set(7, "special_sales_enum_fk", entity.getSpecialSalesEnum());
		iterator.set(8, "station_fk", entity.getStation());
		iterator.set(9, "fuel_enum_fk", entity.getFuelEnum());
		iterator.set(10, "customer_fk", entity.getCustomer());
	}

	@Override
	public void accept(IEntity entity, Visitor visitor) {
		visitor.visit((FuelingPurchase) entity);
	}

	@Override
	public String getTableName() {
		return TableName;
	}

	@Override
	public List<IEntity> getForeignEntities(IEntity ientity) {
		FuelingPurchase entity = (FuelingPurchase) ientity;
		List<IEntity> list = new ArrayList<IEntity>();
		list.add(entity.getCar());
		list.add(entity.getSpecialSalesEnum());
		list.add(entity.getStation());
		list.add(entity.getFuelEnum());
		list.add(entity.getCustomer());
		return list;
	}
}