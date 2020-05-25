package db.interfaces;

import visitor.Visitor;

public interface IEntityBridge {

	void populateEntity(IEntity ientity, IGetValue<Integer, String, Object> iterator) throws Exception;

	void collectFromEntity(IEntity ientity, ISetValue<Integer, String, Object> iterator) throws Exception;
	
	String getTableName();

	/*String getUpdateStr();

	String getInsertStr();

	String[] getFieldsNames();

	Object[] getFieldsValues();

	String[] getFieldsValuesAsStrings();

	Integer getId();

	void setEntity(IEntity initialReports);

	IEntity getEntity();*/

	void accept(IEntity ientity, Visitor visitor);

}
