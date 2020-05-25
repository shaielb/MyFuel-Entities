package db.interfaces;

import java.sql.SQLException;

public interface ISetValue<T1, T2, V> {

	public void set(T1 key1, T2 key2, V value) throws SQLException;
}
