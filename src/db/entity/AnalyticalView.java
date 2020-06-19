package db.entity;

import java.util.List;
import java.lang.Integer;
import annotations.Column;
import java.io.Serializable;
import db.interfaces.IEntity;
import java.lang.String;
import annotations.Table;
import annotations.AutoGenerated;
import java.util.ArrayList;
import java.sql.Timestamp;

@AutoGenerated
@Table(Name="analytical_view")
public class AnalyticalView implements IEntity, Serializable {

	private static final long serialVersionUID = 1L;

	@Column(Name="id", Index=0)
	private Integer _id;

	@Column(Name="model_type", Index=1)
	private String _model_type;

	@Column(Name="fuel_type", Index=2)
	private String _fuel_type;

	@Column(Name="date_time", Index=3)
	private Timestamp _date_time;

	@Column(Name="c_id", Index=4)
	private Integer _c_id;

	@Column(Name="customer_id", Index=5)
	private Integer _customer_id;

	@Column(Name="last_rating_time", Index=6)
	private Timestamp _last_rating_time;

	public Integer getId() {
		return _id;
	}

	public void setId(Integer id) {
		_id = id;
	}

	public String getModelType() {
		return _model_type;
	}

	public void setModelType(String model_type) {
		_model_type = model_type;
	}

	public String getFuelType() {
		return _fuel_type;
	}

	public void setFuelType(String fuel_type) {
		_fuel_type = fuel_type;
	}

	public Timestamp getDateTime() {
		return _date_time;
	}

	public void setDateTime(Timestamp date_time) {
		_date_time = date_time;
	}

	public Integer getCId() {
		return _c_id;
	}

	public void setCId(Integer c_id) {
		_c_id = c_id;
	}

	public Integer getCustomerId() {
		return _customer_id;
	}

	public void setCustomerId(Integer customer_id) {
		_customer_id = customer_id;
	}

	public Timestamp getLastRatingTime() {
		return _last_rating_time;
	}

	public void setLastRatingTime(Timestamp last_rating_time) {
		_last_rating_time = last_rating_time;
	}

	public String toString() {
		List<String> list = new ArrayList<String>();
		if (_id != null) {
			list.add("	id: " + _id);
		}
		if (_model_type != null) {
			list.add("	model_type: " + _model_type);
		}
		if (_fuel_type != null) {
			list.add("	fuel_type: " + _fuel_type);
		}
		if (_date_time != null) {
			list.add("	date_time: " + _date_time);
		}
		if (_c_id != null) {
			list.add("	c_id: " + _c_id);
		}
		if (_customer_id != null) {
			list.add("	customer_id: " + _customer_id);
		}
		if (_last_rating_time != null) {
			list.add("	last_rating_time: " + _last_rating_time);
		}
		return "table analytical_view:\n" + String.join("\n", list);
	}

}