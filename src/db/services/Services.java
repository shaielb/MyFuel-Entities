package db.services;

import db.entity.bridge.ReportsInfoBridge;
import db.entity.Reports;
import java.util.Map;
import db.entity.bridge.EmployeeBridge;
import db.entity.bridge.ReportsBridge;
import db.entity.bridge.CheckingEnumBridge;
import db.interfaces.*;
import db.entity.Employee;
import db.entity.ReportsInfo;
import annotations.AutoGenerated;
import java.util.HashMap;
import db.entity.CheckingEnum;

@AutoGenerated
public class Services {

	public interface Instansiate<T> {
		T create();
	}

	private static Map<String, Instansiate<IEntity>> _entityMap = 
			new HashMap<String, Instansiate<IEntity>>();

	private static Map<String, IEntityBridge> _bridgeMap = 
			new HashMap<String, IEntityBridge>();

	public static void initialize() {
		_entityMap.put("reports_info", () -> new ReportsInfo());
		_bridgeMap.put("reports_info", ReportsInfoBridge.getInstance());
		_entityMap.put("reports", () -> new Reports());
		_bridgeMap.put("reports", ReportsBridge.getInstance());
		_entityMap.put("employee", () -> new Employee());
		_bridgeMap.put("employee", EmployeeBridge.getInstance());
		_entityMap.put("checking_enum", () -> new CheckingEnum());
		_bridgeMap.put("checking_enum", CheckingEnumBridge.getInstance());
	}

	public static IEntity createEntity(String table) {
		return _entityMap.get(table).create();
	}

	public static IEntityBridge getBridge(String table) {
		return _bridgeMap.get(table);
	}

}