package db.interfaces;

import java.sql.SQLException;

public interface IGetValue<T1, T2, T3, V> {

	public V get(T1 key1, T2 key2, T3 value) throws SQLException;
}
