package db.entity;

import java.util.List;
import java.lang.Integer;
import annotations.Column;
import db.interfaces.IEnum;
import java.io.Serializable;
import db.interfaces.IEntity;
import java.lang.String;
import annotations.Table;
import annotations.AutoGenerated;
import java.util.ArrayList;

@AutoGenerated
@Table(Name="pricing_model_enum")
public class PricingModelEnum implements IEntity, IEnum, Serializable {

	private static final long serialVersionUID = 1L;

	@Column(Name="id", Index=0)
	private Integer _id;

	@Column(Name="model_type_key", Index=1)
	private String _model_type_key;

	public Integer getId() {
		return _id;
	}

	public void setId(Integer id) {
		_id = id;
	}

	@Override
	public String getKey() {
		return _model_type_key;
	}

	public String getModelTypeKey() {
		return _model_type_key;
	}

	public void setModelTypeKey(String model_type_key) {
		_model_type_key = model_type_key;
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof IEnum) {
			return getKey().equals(((IEnum) other).getKey());
		}
		return false;
	}

	public String toString() {
		List<String> list = new ArrayList<String>();
		if (_id != null) {
			list.add("	id: " + _id);
		}
		if (_model_type_key != null) {
			list.add("	model_type_key: " + _model_type_key);
		}
		return "table pricing_model_enum:\n" + String.join("\n", list);
	}

}