package db.entity.bridge;

import java.util.List;
import java.lang.Integer;
import db.entity.CustomersRatingsView;
import db.interfaces.*;
import java.lang.Double;
import java.sql.SQLException;
import java.lang.String;
import annotations.AutoGenerated;
import java.util.ArrayList;
import java.sql.Timestamp;
import visitor.Visitor;

@AutoGenerated
public class CustomersRatingsViewBridge implements IEntityBridge {

	private static final String TableName = "customers_ratings_view";

	private static Object _lock = new Object();
	private static CustomersRatingsViewBridge _instance;
	
	private CustomersRatingsViewBridge() {}

	public static CustomersRatingsViewBridge getInstance() {
		if (_instance == null) {
			synchronized(_lock) {
				if (_instance == null) {
					_instance = new CustomersRatingsViewBridge();
				}
			}
		}
		return _instance;
	}

	public IEntity createEntity() {
		return new CustomersRatingsView();
	}

	@Override
	public void populateEntity(IEntity ientity, IGetValue<Integer, String, Object, Object> iterator) throws SQLException, InterruptedException {
		CustomersRatingsView entity = (CustomersRatingsView) ientity;
		entity.setId((Integer) iterator.get(0, "id", entity.getId()));
		entity.setModelType((String) iterator.get(1, "model_type", entity.getModelType()));
		entity.setFuelingDateTime((Timestamp) iterator.get(2, "fueling_date_time", entity.getFuelingDateTime()));
		entity.setFuelTypeKey((String) iterator.get(3, "fuel_type_key", entity.getFuelTypeKey()));
		entity.setAnalyticalRating((Double) iterator.get(4, "analytical_rating", entity.getAnalyticalRating()));
	}

	@Override
	public void collectFromEntity(IEntity ientity, ISetValue<Integer, String, Object> iterator) throws SQLException, InterruptedException {
		CustomersRatingsView entity = (CustomersRatingsView) ientity;
		iterator.set(0, "id", entity.getId());
		iterator.set(1, "model_type", entity.getModelType());
		iterator.set(2, "fueling_date_time", entity.getFuelingDateTime());
		iterator.set(3, "fuel_type_key", entity.getFuelTypeKey());
		iterator.set(4, "analytical_rating", entity.getAnalyticalRating());
	}

	@Override
	public void accept(IEntity entity, Visitor visitor) {
		visitor.visit((CustomersRatingsView) entity);
	}

	@Override
	public String getTableName() {
		return TableName;
	}

	@Override
	public List<IEntity> getForeignEntities(IEntity ientity) {
		CustomersRatingsView entity = (CustomersRatingsView) ientity;
		List<IEntity> list = new ArrayList<IEntity>();

		return list;
	}
}