package db.entity.bridge;

import java.util.List;
import db.entity.HomeHeatingDiscountEnum;
import java.lang.Integer;
import db.interfaces.*;
import java.lang.Double;
import java.sql.SQLException;
import java.lang.String;
import annotations.AutoGenerated;
import java.util.ArrayList;
import visitor.Visitor;

@AutoGenerated
public class HomeHeatingDiscountEnumBridge implements IEntityBridge {

	private static final String TableName = "home_heating_discount_enum";

	private static Object _lock = new Object();
	private static HomeHeatingDiscountEnumBridge _instance;
	
	private HomeHeatingDiscountEnumBridge() {}

	public static HomeHeatingDiscountEnumBridge getInstance() {
		if (_instance == null) {
			synchronized(_lock) {
				if (_instance == null) {
					_instance = new HomeHeatingDiscountEnumBridge();
				}
			}
		}
		return _instance;
	}

	public IEntity createEntity() {
		return new HomeHeatingDiscountEnum();
	}

	@Override
	public void populateEntity(IEntity ientity, IGetValue<Integer, String, Object, Object> iterator) throws SQLException, InterruptedException {
		HomeHeatingDiscountEnum entity = (HomeHeatingDiscountEnum) ientity;
		entity.setId((Integer) iterator.get(0, "id", entity.getId()));
		entity.setDiscountDescriptionKey((String) iterator.get(1, "discount_description_key", entity.getDiscountDescriptionKey()));
		entity.setDiscount((Double) iterator.get(2, "discount", entity.getDiscount()));
	}

	@Override
	public void collectFromEntity(IEntity ientity, ISetValue<Integer, String, Object> iterator) throws SQLException, InterruptedException {
		HomeHeatingDiscountEnum entity = (HomeHeatingDiscountEnum) ientity;
		iterator.set(0, "id", entity.getId());
		iterator.set(1, "discount_description_key", entity.getDiscountDescriptionKey());
		iterator.set(2, "discount", entity.getDiscount());
	}

	@Override
	public void accept(IEntity entity, Visitor visitor) {
		visitor.visit((HomeHeatingDiscountEnum) entity);
	}

	@Override
	public String getTableName() {
		return TableName;
	}

	@Override
	public List<IEntity> getForeignEntities(IEntity ientity) {
		HomeHeatingDiscountEnum entity = (HomeHeatingDiscountEnum) ientity;
		List<IEntity> list = new ArrayList<IEntity>();

		return list;
	}
}
