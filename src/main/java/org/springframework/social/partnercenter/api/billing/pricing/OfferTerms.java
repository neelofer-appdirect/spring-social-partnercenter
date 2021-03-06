package org.springframework.social.partnercenter.api.billing.pricing;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfferTerms {
	@JsonProperty("name")
	private String name;
	@JsonProperty("discount")
	private double discount;
	private List<String> excludedMeterIds;
	private String effectiveDate;

	public String getName() {
		return name;
	}

	public OfferTerms setName(String name) {
		this.name = name;
		return this;
	}

	public double getDiscount() {
		return discount;
	}

	public OfferTerms setDiscount(double discount) {
		this.discount = discount;
		return this;
	}

	public List<String> getExcludedMeterIds() {
		return excludedMeterIds;
	}

	public OfferTerms setExcludedMeterIds(List<String> excludedMeterIds) {
		this.excludedMeterIds = excludedMeterIds;
		return this;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public OfferTerms setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
		return this;
	}
}
