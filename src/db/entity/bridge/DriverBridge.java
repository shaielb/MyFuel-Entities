package db.entity.bridge;

import java.util.List;
import java.lang.Integer;
import db.entity.Customer;
import db.interfaces.*;
import db.entity.Driver;
import java.sql.SQLException;
import annotations.AutoGenerated;
import java.util.ArrayList;
import db.entity.Person;
import visitor.Visitor;

@AutoGenerated
public class DriverBridge implements IEntityBridge {

	private static final String TableName = "driver";

	private static Object _lock = new Object();
	private static DriverBridge _instance;
	
	private DriverBridge() {}

	public static DriverBridge getInstance() {
		if (_instance == null) {
			synchronized(_lock) {
				if (_instance == null) {
					_instance = new DriverBridge();
				}
			}
		}
		return _instance;
	}

	public IEntity createEntity() {
		return new Driver();
	}

	@Override
	public void populateEntity(IEntity ientity, IGetValue<Integer, String, Object, Object> iterator) throws SQLException, InterruptedException {
		Driver entity = (Driver) ientity;
		entity.setId((Integer) iterator.get(0, "id", entity.getId()));
		entity.setCustomer((Customer) iterator.get(1, "customer_fk", entity.getCustomer()));
		entity.setPerson((Person) iterator.get(2, "person_fk", entity.getPerson()));
	}

	@Override
	public void collectFromEntity(IEntity ientity, ISetValue<Integer, String, Object> iterator) throws SQLException, InterruptedException {
		Driver entity = (Driver) ientity;
		iterator.set(0, "id", entity.getId());
		iterator.set(1, "customer_fk", entity.getCustomer());
		iterator.set(2, "person_fk", entity.getPerson());
	}

	@Override
	public void accept(IEntity entity, Visitor visitor) {
		visitor.visit((Driver) entity);
	}

	@Override
	public String getTableName() {
		return TableName;
	}

	@Override
	public List<IEntity> getForeignEntities(IEntity ientity) {
		Driver entity = (Driver) ientity;
		List<IEntity> list = new ArrayList<IEntity>();
		list.add(entity.getCustomer());
		list.add(entity.getPerson());
		return list;
	}
}
