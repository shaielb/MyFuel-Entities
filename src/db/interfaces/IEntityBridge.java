package db.interfaces;

import java.sql.SQLException;
import java.util.List;

import visitor.Visitor;

public interface IEntityBridge {

	public IEntity createEntity();
	
	public void populateEntity(IEntity ientity, IGetValue<Integer, String, Object, Object> iterator) throws SQLException, InterruptedException;

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
	
	public List<IEntity> getForeignEntities(IEntity ientity);

	void accept(IEntity ientity, Visitor visitor);

}
