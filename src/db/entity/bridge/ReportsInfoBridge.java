package db.entity.bridge;

import db.entity.Reports;
import java.lang.Integer;
import db.interfaces.*;
import db.entity.ReportsInfo;
import java.sql.SQLException;
import java.lang.String;
import annotations.AutoGenerated;
import visitor.Visitor;
import db.entity.CheckingEnum;

@AutoGenerated
public class ReportsInfoBridge implements IEntityBridge {

	private static final String TableName = "reports_info";

	private static Object _lock = new Object();
	private static ReportsInfoBridge _instance;
	
	private ReportsInfoBridge() { }

	public static ReportsInfoBridge getInstance() {
		if (_instance == null) {
			synchronized(_lock) {
				if (_instance == null) {
					_instance = new ReportsInfoBridge();
				}
			}
		}
		return _instance;
	}

	@Override
	public void populateEntity(IEntity ientity, IGetValue<Integer, String, Object> iterator) throws SQLException, InterruptedException {
		ReportsInfo entity = (ReportsInfo) ientity;
		entity.setId((Integer) iterator.get(0, "id"));
		entity.setYear((Integer) iterator.get(1, "year"));
		entity.setQuarter((Integer) iterator.get(2, "quarter"));
		entity.setReportType((String) iterator.get(3, "report_type"));
		entity.setStationName((String) iterator.get(4, "station_name"));
		entity.setReports((Reports) iterator.get(5, "reports_fk"));
		entity.setCheckingEnum((CheckingEnum) iterator.get(6, "checking_enum_fk"));
	}

	@Override
	public void collectFromEntity(IEntity ientity, ISetValue<Integer, String, Object> iterator) throws SQLException, InterruptedException {
		ReportsInfo entity = (ReportsInfo) ientity;
		iterator.set(0, "id", entity.getId());
		iterator.set(1, "year", entity.getYear());
		iterator.set(2, "quarter", entity.getQuarter());
		iterator.set(3, "report_type", entity.getReportType());
		iterator.set(4, "station_name", entity.getStationName());
		iterator.set(5, "reports_fk", entity.getReports());
		iterator.set(6, "checking_enum_fk", entity.getCheckingEnum());
	}

	@Override
	public void accept(IEntity entity, Visitor visitor) {
		visitor.visit((ReportsInfo) entity);
	}

	@Override
	public String getTableName() {
		return TableName;
	}
}