package db.entity;

import java.lang.Integer;
import annotations.Column;
import java.lang.Boolean;
import db.interfaces.IEnum;
import java.io.Serializable;
import db.entity.FuelCompanyEnum;
import annotations.AutoGenerated;
import java.util.ArrayList;
import java.util.List;
import db.interfaces.IEntity;
import java.lang.Double;
import java.lang.String;
import annotations.Table;

@AutoGenerated
@Table(Name="special_sales_enum")
public class SpecialSalesEnum implements IEntity, IEnum, Serializable {

	private static final long serialVersionUID = 1L;

	@Column(Name="id", Index=0)
	private Integer _id;

	@Column(Name="sale_id", Index=1)
	private Integer _sale_id;

	@Column(Name="title_key", Index=2)
	private String _title_key;

	@Column(Name="amount_limitation", Index=3)
	private Double _amount_limitation;

	@Column(Name="active_sale", Index=4)
	private Boolean _active_sale;

	@Column(Name="sale_discount", Index=5)
	private Double _sale_discount;

	@Column(Name="fuel_company_enum_fk", Index=6)
	@Table(Name="fuel_company_enum")
	private FuelCompanyEnum _fuel_company_enum;

	public Integer getId() {
		return _id;
	}

	public void setId(Integer id) {
		_id = id;
	}

	public Integer getSaleId() {
		return _sale_id;
	}

	public void setSaleId(Integer sale_id) {
		_sale_id = sale_id;
	}

	@Override
	public String getKey() {
		return _title_key;
	}

	public String getTitleKey() {
		return _title_key;
	}

	public void setTitleKey(String title_key) {
		_title_key = title_key;
	}

	public Double getAmountLimitation() {
		return _amount_limitation;
	}

	public void setAmountLimitation(Double amount_limitation) {
		_amount_limitation = amount_limitation;
	}

	public Boolean getActiveSale() {
		return _active_sale;
	}

	public void setActiveSale(Boolean active_sale) {
		_active_sale = active_sale;
	}

	public Double getSaleDiscount() {
		return _sale_discount;
	}

	public void setSaleDiscount(Double sale_discount) {
		_sale_discount = sale_discount;
	}

	public FuelCompanyEnum getFuelCompanyEnum() {
		return _fuel_company_enum;
	}

	public void setFuelCompanyEnum(FuelCompanyEnum fuel_company_enum) {
		_fuel_company_enum = fuel_company_enum;
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
		if (_sale_id != null) {
			list.add("	sale_id: " + _sale_id);
		}
		if (_title_key != null) {
			list.add("	title_key: " + _title_key);
		}
		if (_amount_limitation != null) {
			list.add("	amount_limitation: " + _amount_limitation);
		}
		if (_active_sale != null) {
			list.add("	active_sale: " + _active_sale);
		}
		if (_sale_discount != null) {
			list.add("	sale_discount: " + _sale_discount);
		}
		if (_fuel_company_enum != null) {
			list.add("	fuel_company_enum: " + _fuel_company_enum);
		}
		return "table special_sales_enum:\n" + String.join("\n", list);
	}

}