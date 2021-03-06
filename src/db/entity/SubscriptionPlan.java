package db.entity;

import java.util.List;
import java.lang.Integer;
import db.entity.Customer;
import annotations.Column;
import java.io.Serializable;
import db.interfaces.IEntity;
import db.entity.FuelCompanyEnum;
import annotations.Table;
import annotations.AutoGenerated;
import java.util.ArrayList;
import db.entity.SubscriptionPlanRatesEnum;

@AutoGenerated
@Table(Name="subscription_plan")
public class SubscriptionPlan implements IEntity, Serializable {

	private static final long serialVersionUID = 1L;

	@Column(Name="id", Index=0)
	private Integer _id;

	@Column(Name="fuel_company_enum_fk", Index=1)
	@Table(Name="fuel_company_enum")
	private FuelCompanyEnum _fuel_company_enum;

	@Column(Name="customer_fk", Index=2)
	@Table(Name="customer")
	private Customer _customer;

	@Column(Name="subscription_plan_rates_enum_fk", Index=3)
	@Table(Name="subscription_plan_rates_enum")
	private SubscriptionPlanRatesEnum _subscription_plan_rates_enum;

	public Integer getId() {
		return _id;
	}

	public void setId(Integer id) {
		_id = id;
	}

	public FuelCompanyEnum getFuelCompanyEnum() {
		return _fuel_company_enum;
	}

	public void setFuelCompanyEnum(FuelCompanyEnum fuel_company_enum) {
		_fuel_company_enum = fuel_company_enum;
	}

	public Customer getCustomer() {
		return _customer;
	}

	public void setCustomer(Customer customer) {
		_customer = customer;
	}

	public SubscriptionPlanRatesEnum getSubscriptionPlanRatesEnum() {
		return _subscription_plan_rates_enum;
	}

	public void setSubscriptionPlanRatesEnum(SubscriptionPlanRatesEnum subscription_plan_rates_enum) {
		_subscription_plan_rates_enum = subscription_plan_rates_enum;
	}

	public String toString() {
		List<String> list = new ArrayList<String>();
		if (_id != null) {
			list.add("	id: " + _id);
		}
		if (_fuel_company_enum != null) {
			list.add("	fuel_company_enum: " + _fuel_company_enum);
		}
		if (_customer != null) {
			list.add("	customer: " + _customer);
		}
		if (_subscription_plan_rates_enum != null) {
			list.add("	subscription_plan_rates_enum: " + _subscription_plan_rates_enum);
		}
		return "table subscription_plan:\n" + String.join("\n", list);
	}

}