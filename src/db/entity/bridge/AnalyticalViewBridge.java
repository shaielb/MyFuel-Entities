package db.entity.bridge;

import java.util.List;
import java.lang.Integer;
import db.interfaces.*;
import java.sql.SQLException;
import java.lang.String;
import db.entity.AnalyticalView;
import annotations.AutoGenerated;
import java.util.ArrayList;
import java.sql.Timestamp;
import visitor.Visitor;

@AutoGenerated
public class AnalyticalViewBridge implements IEntityBridge {

	private static final String TableName = "analytical_view";

	private static Object _lock = new Object();
	private static AnalyticalViewBridge _instance;
	
	private AnalyticalViewBridge() {}

	public static AnalyticalViewBridge getInstance() {
		if (_instance == null) {
			synchronized(_lock) {
				if (_instance == null) {
					_instance = new AnalyticalViewBridge();
				}
			}
		}
		return _instance;
	}

	public IEntity createEntity() {
		return new AnalyticalView();
	}

	@Override
	public void populateEntity(IEntity ientity, IGetValue<Integer, String, Object, Object> iterator) throws SQLException, InterruptedException {
		AnalyticalView entity = (AnalyticalView) ientity;
		entity.setId((Integer) iterator.get(0, "id", entity.getId()));
		entity.setModelType((String) iterator.get(1, "model_type", entity.getModelType()));
		entity.setFuelType((String) iterator.get(2, "fuel_type", entity.getFuelType()));
		entity.setDateTime((Timestamp) iterator.get(3, "date_time", entity.getDateTime()));
		entity.setCId((Integer) iterator.get(4, "c_id", entity.getCId()));
		entity.setCustomerId((Integer) iterator.get(5, "customer_id", entity.getCustomerId()));
		entity.setLastRatingTime((Timestamp) iterator.get(6, "last_rating_time", entity.getLastRatingTime()));
	}

	@Override
	public void collectFromEntity(IEntity ientity, ISetValue<Integer, String, Object> iterator) throws SQLException, InterruptedException {
		AnalyticalView entity = (AnalyticalView) ientity;
		iterator.set(0, "id", entity.getId());
		iterator.set(1, "model_type", entity.getModelType());
		iterator.set(2, "fuel_type", entity.getFuelType());
		iterator.set(3, "date_time", entity.getDateTime());
		iterator.set(4, "c_id", entity.getCId());
		iterator.set(5, "customer_id", entity.getCustomerId());
		iterator.set(6, "last_rating_time", entity.getLastRatingTime());
	}

	@Override
	public void accept(IEntity entity, Visitor visitor) {
		visitor.visit((AnalyticalView) entity);
	}

	@Override
	public String getTableName() {
		return TableName;
	}

	@Override
	public List<IEntity> getForeignEntities(IEntity ientity) {
		AnalyticalView entity = (AnalyticalView) ientity;
		List<IEntity> list = new ArrayList<IEntity>();

		return list;
	}
}
