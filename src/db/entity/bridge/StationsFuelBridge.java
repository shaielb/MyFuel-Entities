package db.entity.bridge;

import db.entity.StationsFuel;
import java.util.List;
import java.lang.Integer;
import db.entity.Station;
import db.interfaces.*;
import java.lang.Double;
import java.sql.SQLException;
import annotations.AutoGenerated;
import java.util.ArrayList;
import db.entity.FuelEnum;
import visitor.Visitor;

@AutoGenerated
public class StationsFuelBridge implements IEntityBridge {

	private static final String TableName = "stations_fuel";

	private static Object _lock = new Object();
	private static StationsFuelBridge _instance;
	
	private StationsFuelBridge() {}

	public static StationsFuelBridge getInstance() {
		if (_instance == null) {
			synchronized(_lock) {
				if (_instance == null) {
					_instance = new StationsFuelBridge();
				}
			}
		}
		return _instance;
	}

	public IEntity createEntity() {
		return new StationsFuel();
	}

	@Override
	public void populateEntity(IEntity ientity, IGetValue<Integer, String, Object, Object> iterator) throws SQLException, InterruptedException {
		StationsFuel entity = (StationsFuel) ientity;
		entity.setId((Integer) iterator.get(0, "id", entity.getId()));
		entity.setCurrentAmount((Double) iterator.get(1, "current_amount", entity.getCurrentAmount()));
		entity.setFuelLowLevel((Double) iterator.get(2, "fuel_low_level", entity.getFuelLowLevel()));
		entity.setMaxAmount((Double) iterator.get(3, "max_amount", entity.getMaxAmount()));
		entity.setFuelEnum((FuelEnum) iterator.get(4, "fuel_enum_fk", entity.getFuelEnum()));
		entity.setStation((Station) iterator.get(5, "station_fk", entity.getStation()));
	}

	@Override
	public void collectFromEntity(IEntity ientity, ISetValue<Integer, String, Object> iterator) throws SQLException, InterruptedException {
		StationsFuel entity = (StationsFuel) ientity;
		iterator.set(0, "id", entity.getId());
		iterator.set(1, "current_amount", entity.getCurrentAmount());
		iterator.set(2, "fuel_low_level", entity.getFuelLowLevel());
		iterator.set(3, "max_amount", entity.getMaxAmount());
		iterator.set(4, "fuel_enum_fk", entity.getFuelEnum());
		iterator.set(5, "station_fk", entity.getStation());
	}

	@Override
	public void accept(IEntity entity, Visitor visitor) {
		visitor.visit((StationsFuel) entity);
	}

	@Override
	public String getTableName() {
		return TableName;
	}

	@Override
	public List<IEntity> getForeignEntities(IEntity ientity) {
		StationsFuel entity = (StationsFuel) ientity;
		List<IEntity> list = new ArrayList<IEntity>();
		list.add(entity.getFuelEnum());
		list.add(entity.getStation());
		return list;
	}
}
