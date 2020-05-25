package db.interfaces;

import java.sql.SQLException;

public interface IGetValue<T1, T2, V> {

	public V get(T1 key1, T2 key2) throws SQLException;
}
