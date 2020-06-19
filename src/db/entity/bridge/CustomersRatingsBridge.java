package db.entity.bridge;

import java.util.List;
import java.lang.Integer;
import db.entity.CustomersRatings;
import db.interfaces.*;
import java.sql.SQLException;
import java.lang.String;
import annotations.AutoGenerated;
import java.util.ArrayList;
import java.sql.Timestamp;
import db.entity.AnalyticalRatings;
import visitor.Visitor;

@AutoGenerated
public class CustomersRatingsBridge implements IEntityBridge {

	private static final String TableName = "customers_ratings";

	private static Object _lock = new Object();
	private static CustomersRatingsBridge _instance;
	
	private CustomersRatingsBridge() {}

	public static CustomersRatingsBridge getInstance() {
		if (_instance == null) {
			synchronized(_lock) {
				if (_instance == null) {
					_instance = new CustomersRatingsBridge();
				}
			}
		}
		return _instance;
	}

	public IEntity createEntity() {
		return new CustomersRatings();
	}

	@Override
	public void populateEntity(IEntity ientity, IGetValue<Integer, String, Object, Object> iterator) throws SQLException, InterruptedException {
		CustomersRatings entity = (CustomersRatings) ientity;
		entity.setId((Integer) iterator.get(0, "id", entity.getId()));
		entity.setCustomerId((Integer) iterator.get(1, "customer_id", entity.getCustomerId()));
		entity.setCustomerPricingModel((String) iterator.get(2, "customer_pricing_model", entity.getCustomerPricingModel()));
		entity.setFuelType((String) iterator.get(3, "fuel_type", entity.getFuelType()));
		entity.setFuelingPurchaseHour((Timestamp) iterator.get(4, "fueling_purchase_hour", entity.getFuelingPurchaseHour()));
		entity.setAnalyticalRatings((AnalyticalRatings) iterator.get(5, "analytical_ratings_fk", entity.getAnalyticalRatings()));
	}

	@Override
	public void collectFromEntity(IEntity ientity, ISetValue<Integer, String, Object> iterator) throws SQLException, InterruptedException {
		CustomersRatings entity = (CustomersRatings) ientity;
		iterator.set(0, "id", entity.getId());
		iterator.set(1, "customer_id", entity.getCustomerId());
		iterator.set(2, "customer_pricing_model", entity.getCustomerPricingModel());
		iterator.set(3, "fuel_type", entity.getFuelType());
		iterator.set(4, "fueling_purchase_hour", entity.getFuelingPurchaseHour());
		iterator.set(5, "analytical_ratings_fk", entity.getAnalyticalRatings());
	}

	@Override
	public void accept(IEntity entity, Visitor visitor) {
		visitor.visit((CustomersRatings) entity);
	}

	@Override
	public String getTableName() {
		return TableName;
	}

	@Override
	public List<IEntity> getForeignEntities(IEntity ientity) {
		CustomersRatings entity = (CustomersRatings) ientity;
		List<IEntity> list = new ArrayList<IEntity>();
		list.add(entity.getAnalyticalRatings());
		return list;
	}
}
