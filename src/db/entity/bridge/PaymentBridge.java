package db.entity.bridge;

import java.util.List;
import java.lang.Integer;
import java.lang.Boolean;
import db.interfaces.*;
import db.entity.Payment;
import java.sql.SQLException;
import java.lang.String;
import annotations.AutoGenerated;
import java.util.ArrayList;
import visitor.Visitor;

@AutoGenerated
public class PaymentBridge implements IEntityBridge {

	private static final String TableName = "payment";

	private static Object _lock = new Object();
	private static PaymentBridge _instance;
	
	private PaymentBridge() {}

	public static PaymentBridge getInstance() {
		if (_instance == null) {
			synchronized(_lock) {
				if (_instance == null) {
					_instance = new PaymentBridge();
				}
			}
		}
		return _instance;
	}

	public IEntity createEntity() {
		return new Payment();
	}

	@Override
	public void populateEntity(IEntity ientity, IGetValue<Integer, String, Object, Object> iterator) throws SQLException, InterruptedException {
		Payment entity = (Payment) ientity;
		entity.setId((Integer) iterator.get(0, "id", entity.getId()));
		entity.setCreditCardNumber((String) iterator.get(1, "credit_card_number", entity.getCreditCardNumber()));
		entity.setExpirationDateYear((Integer) iterator.get(2, "expiration_date_year", entity.getExpirationDateYear()));
		entity.setExpirationDateMonth((Integer) iterator.get(3, "expiration_date_month", entity.getExpirationDateMonth()));
		entity.setCvv((Integer) iterator.get(4, "cvv", entity.getCvv()));
		entity.setCompanyCreditCard((String) iterator.get(5, "company_credit_card", entity.getCompanyCreditCard()));
		entity.setCash((Boolean) iterator.get(6, "cash", entity.getCash()));
	}

	@Override
	public void collectFromEntity(IEntity ientity, ISetValue<Integer, String, Object> iterator) throws SQLException, InterruptedException {
		Payment entity = (Payment) ientity;
		iterator.set(0, "id", entity.getId());
		iterator.set(1, "credit_card_number", entity.getCreditCardNumber());
		iterator.set(2, "expiration_date_year", entity.getExpirationDateYear());
		iterator.set(3, "expiration_date_month", entity.getExpirationDateMonth());
		iterator.set(4, "cvv", entity.getCvv());
		iterator.set(5, "company_credit_card", entity.getCompanyCreditCard());
		iterator.set(6, "cash", entity.getCash());
	}

	@Override
	public void accept(IEntity entity, Visitor visitor) {
		visitor.visit((Payment) entity);
	}

	@Override
	public String getTableName() {
		return TableName;
	}

	@Override
	public List<IEntity> getForeignEntities(IEntity ientity) {
		Payment entity = (Payment) ientity;
		List<IEntity> list = new ArrayList<IEntity>();

		return list;
	}
}