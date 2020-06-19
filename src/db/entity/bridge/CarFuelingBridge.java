package db.entity.bridge;

import java.util.List;
import java.lang.Integer;
import db.interfaces.*;
import db.entity.CarFueling;
import java.lang.Double;
import java.sql.SQLException;
import java.lang.String;
import annotations.AutoGenerated;
import java.util.ArrayList;
import visitor.Visitor;

@AutoGenerated
public class CarFuelingBridge implements IEntityBridge {

	private static final String TableName = "car_fueling";

	private static Object _lock = new Object();
	private static CarFuelingBridge _instance;
	
	private CarFuelingBridge() {}

	public static CarFuelingBridge getInstance() {
		if (_instance == null) {
			synchronized(_lock) {
				if (_instance == null) {
					_instance = new CarFuelingBridge();
				}
			}
		}
		return _instance;
	}

	public IEntity createEntity() {
		return new CarFueling();
	}

	@Override
	public void populateEntity(IEntity ientity, IGetValue<Integer, String, Object, Object> iterator) throws SQLException, InterruptedException {
		CarFueling entity = (CarFueling) ientity;
		entity.setId((Integer) iterator.get(0, "id", entity.getId()));
		entity.setMonthlyFuelAmount((Double) iterator.get(1, "monthly_fuel_amount", entity.getMonthlyFuelAmount()));
		entity.setMonthOfFuel((String) iterator.get(2, "month_of_fuel", entity.getMonthOfFuel()));
	}

	@Override
	public void collectFromEntity(IEntity ientity, ISetValue<Integer, String, Object> iterator) throws SQLException, InterruptedException {
		CarFueling entity = (CarFueling) ientity;
		iterator.set(0, "id", entity.getId());
		iterator.set(1, "monthly_fuel_amount", entity.getMonthlyFuelAmount());
		iterator.set(2, "month_of_fuel", entity.getMonthOfFuel());
	}

	@Override
	public void accept(IEntity entity, Visitor visitor) {
		visitor.visit((CarFueling) entity);
	}

	@Override
	public String getTableName() {
		return TableName;
	}

	@Override
	public List<IEntity> getForeignEntities(IEntity ientity) {
		CarFueling entity = (CarFueling) ientity;
		List<IEntity> list = new ArrayList<IEntity>();

		return list;
	}
}
