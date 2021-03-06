package db.entity.bridge;

import java.util.List;
import java.lang.Integer;
import db.interfaces.*;
import java.lang.Double;
import java.sql.SQLException;
import java.lang.String;
import annotations.AutoGenerated;
import db.entity.FuelEnum;
import java.util.ArrayList;
import visitor.Visitor;

@AutoGenerated
public class FuelEnumBridge implements IEntityBridge {

	private static final String TableName = "fuel_enum";

	private static Object _lock = new Object();
	private static FuelEnumBridge _instance;
	
	private FuelEnumBridge() {}

	public static FuelEnumBridge getInstance() {
		if (_instance == null) {
			synchronized(_lock) {
				if (_instance == null) {
					_instance = new FuelEnumBridge();
				}
			}
		}
		return _instance;
	}

	public IEntity createEntity() {
		return new FuelEnum();
	}

	@Override
	public void populateEntity(IEntity ientity, IGetValue<Integer, String, Object, Object> iterator) throws SQLException, InterruptedException {
		FuelEnum entity = (FuelEnum) ientity;
		entity.setId((Integer) iterator.get(0, "id", entity.getId()));
		entity.setFuelTypeKey((String) iterator.get(1, "fuel_type_key", entity.getFuelTypeKey()));
		entity.setMaxPricePerType((Double) iterator.get(2, "max_price_per_type", entity.getMaxPricePerType()));
		entity.setSupplierPricePerLiter((Double) iterator.get(3, "supplier_price_per_liter", entity.getSupplierPricePerLiter()));
	}

	@Override
	public void collectFromEntity(IEntity ientity, ISetValue<Integer, String, Object> iterator) throws SQLException, InterruptedException {
		FuelEnum entity = (FuelEnum) ientity;
		iterator.set(0, "id", entity.getId());
		iterator.set(1, "fuel_type_key", entity.getFuelTypeKey());
		iterator.set(2, "max_price_per_type", entity.getMaxPricePerType());
		iterator.set(3, "supplier_price_per_liter", entity.getSupplierPricePerLiter());
	}

	@Override
	public void accept(IEntity entity, Visitor visitor) {
		visitor.visit((FuelEnum) entity);
	}

	@Override
	public String getTableName() {
		return TableName;
	}

	@Override
	public List<IEntity> getForeignEntities(IEntity ientity) {
		FuelEnum entity = (FuelEnum) ientity;
		List<IEntity> list = new ArrayList<IEntity>();

		return list;
	}
}
