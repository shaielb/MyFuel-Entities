package db.entity.bridge;

import java.util.List;
import java.lang.Integer;
import db.entity.PricingModelEnum;
import db.interfaces.*;
import java.sql.SQLException;
import java.lang.String;
import annotations.AutoGenerated;
import java.util.ArrayList;
import visitor.Visitor;

@AutoGenerated
public class PricingModelEnumBridge implements IEntityBridge {

	private static final String TableName = "pricing_model_enum";

	private static Object _lock = new Object();
	private static PricingModelEnumBridge _instance;
	
	private PricingModelEnumBridge() {}

	public static PricingModelEnumBridge getInstance() {
		if (_instance == null) {
			synchronized(_lock) {
				if (_instance == null) {
					_instance = new PricingModelEnumBridge();
				}
			}
		}
		return _instance;
	}

	public IEntity createEntity() {
		return new PricingModelEnum();
	}

	@Override
	public void populateEntity(IEntity ientity, IGetValue<Integer, String, Object, Object> iterator) throws SQLException, InterruptedException {
		PricingModelEnum entity = (PricingModelEnum) ientity;
		entity.setId((Integer) iterator.get(0, "id", entity.getId()));
		entity.setModelTypeKey((String) iterator.get(1, "model_type_key", entity.getModelTypeKey()));
	}

	@Override
	public void collectFromEntity(IEntity ientity, ISetValue<Integer, String, Object> iterator) throws SQLException, InterruptedException {
		PricingModelEnum entity = (PricingModelEnum) ientity;
		iterator.set(0, "id", entity.getId());
		iterator.set(1, "model_type_key", entity.getModelTypeKey());
	}

	@Override
	public void accept(IEntity entity, Visitor visitor) {
		visitor.visit((PricingModelEnum) entity);
	}

	@Override
	public String getTableName() {
		return TableName;
	}

	@Override
	public List<IEntity> getForeignEntities(IEntity ientity) {
		PricingModelEnum entity = (PricingModelEnum) ientity;
		List<IEntity> list = new ArrayList<IEntity>();

		return list;
	}
}