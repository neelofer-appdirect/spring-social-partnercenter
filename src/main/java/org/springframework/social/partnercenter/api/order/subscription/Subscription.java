package org.springframework.social.partnercenter.api.order.subscription;

import java.util.Map;

import org.springframework.social.partnercenter.api.Link;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Subscription {
	private String id;
	private String offerId;
	private String offerName;
	private String partnerId;
	private String friendlyName;
	private int quantity;
	private String unitType;
	private String creationDate;
	private String effectiveStartDate;
	private String commitmentEndDate;
	private SubscriptionStatus status;
	private String billingType;
	private String billingCycle;
	private String contractType;
	private boolean autoRenewEnabled;
	private String orderId;
	private Map<String, Link> links;
	private Map<String, String> attributes;

	public String getId() {
		return id;
	}

	public Subscription setId(String id) {
		this.id = id;
		return this;
	}

	public String getOfferId() {
		return offerId;
	}

	public Subscription setOfferId(String offerId) {
		this.offerId = offerId;
		return this;
	}

	public String getOfferName() {
		return offerName;
	}

	public Subscription setOfferName(String offerName) {
		this.offerName = offerName;
		return this;
	}

	public String getPartnerId() {
		return partnerId;
	}

	public Subscription setPartnerId(String partnerId) {
		this.partnerId = partnerId;
		return this;
	}

	public String getFriendlyName() {
		return friendlyName;
	}

	public Subscription setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
		return this;
	}

	public int getQuantity() {
		return quantity;
	}

	public Subscription setQuantity(int quantity) {
		this.quantity = quantity;
		return this;
	}

	public String getUnitType() {
		return unitType;
	}

	public Subscription setUnitType(String unitType) {
		this.unitType = unitType;
		return this;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public Subscription setCreationDate(String creationDate) {
		this.creationDate = creationDate;
		return this;
	}

	public String getEffectiveStartDate() {
		return effectiveStartDate;
	}

	public Subscription setEffectiveStartDate(String effectiveStartDate) {
		this.effectiveStartDate = effectiveStartDate;
		return this;
	}

	public String getCommitmentEndDate() {
		return commitmentEndDate;
	}

	public Subscription setCommitmentEndDate(String commitmentEndDate) {
		this.commitmentEndDate = commitmentEndDate;
		return this;
	}

	public SubscriptionStatus getStatus() {
		return status;
	}

	public Subscription setStatus(SubscriptionStatus status) {
		this.status = status;
		return this;
	}

	public String getBillingType() {
		return billingType;
	}

	public Subscription setBillingType(String billingType) {
		this.billingType = billingType;
		return this;
	}

	public String getBillingCycle() {
		return billingCycle;
	}

	public Subscription setBillingCycle(String billingCycle) {
		this.billingCycle = billingCycle;
		return this;
	}

	public String getContractType() {
		return contractType;
	}

	public Subscription setContractType(String contractType) {
		this.contractType = contractType;
		return this;
	}

	public boolean isAutoRenewEnabled() {
		return autoRenewEnabled;
	}

	public Subscription setAutoRenewEnabled(boolean autoRenewEnabled) {
		this.autoRenewEnabled = autoRenewEnabled;
		return this;
	}

	public String getOrderId() {
		return orderId;
	}

	public Subscription setOrderId(String orderId) {
		this.orderId = orderId;
		return this;
	}

	public Map<String, Link> getLinks() {
		return links;
	}

	public Subscription setLinks(Map<String, Link> links) {
		this.links = links;
		return this;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public Subscription setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
		return this;
	}

	public static SubscriptionBuilder builder(){
		return new SubscriptionBuilder();
	}

	public static class SubscriptionBuilder{
		private String id;
		private String offerId;
		private String offerName;
		private String partnerId;
		private String friendlyName;
		private int quantity;
		private String unitType;
		private String creationDate;
		private String effectiveStartDate;
		private String commitmentEndDate;
		private SubscriptionStatus status;
		private String billingType;
		private String billingCycle;
		private String contractType;
		private boolean autoRenewEnabled;
		private String orderId;
		private Map<String, Link> links;
		private Map<String, String> attributes;

		public SubscriptionBuilder id(String id) {
			this.id = id;
			return this;
		}

		public SubscriptionBuilder offerId(String offerId) {
			this.offerId = offerId;
			return this;
		}

		public SubscriptionBuilder offerName(String offerName) {
			this.offerName = offerName;
			return this;
		}

		public SubscriptionBuilder partnerId(String partnerId) {
			this.partnerId = partnerId;
			return this;
		}

		public SubscriptionBuilder friendlyName(String friendlyName) {
			this.friendlyName = friendlyName;
			return this;
		}

		public SubscriptionBuilder quantity(int quantity) {
			this.quantity = quantity;
			return this;
		}

		public SubscriptionBuilder unitType(String unitType) {
			this.unitType = unitType;
			return this;
		}

		public SubscriptionBuilder creationDate(String creationDate) {
			this.creationDate = creationDate;
			return this;
		}

		public SubscriptionBuilder effectiveStartDate(String effectiveStartDate) {
			this.effectiveStartDate = effectiveStartDate;
			return this;
		}

		public SubscriptionBuilder commitmentEndDate(String commitmentEndDate) {
			this.commitmentEndDate = commitmentEndDate;
			return this;
		}

		public SubscriptionBuilder status(SubscriptionStatus status) {
			this.status = status;
			return this;
		}

		public SubscriptionBuilder billingType(String billingType) {
			this.billingType = billingType;
			return this;
		}

		public SubscriptionBuilder billingCycle(String billingCycle) {
			this.billingCycle = billingCycle;
			return this;
		}

		public SubscriptionBuilder contractType(String contractType) {
			this.contractType = contractType;
			return this;
		}

		public SubscriptionBuilder autoRenewEnabled(boolean autoRenewEnabled) {
			this.autoRenewEnabled = autoRenewEnabled;
			return this;
		}

		public SubscriptionBuilder orderId(String orderId) {
			this.orderId = orderId;
			return this;
		}

		public SubscriptionBuilder links(Map<String, Link> links) {
			this.links = links;
			return this;
		}

		public SubscriptionBuilder attributes(Map<String, String> attributes) {
			this.attributes = attributes;
			return this;
		}

		public Subscription build(){
			Subscription subscription = new Subscription();
			subscription.setId(id);
			subscription.setContractType(contractType);
			subscription.setStatus(status);
			subscription.setLinks(links);
			subscription.setAttributes(attributes);
			subscription.setOfferId(offerId);
			subscription.setOrderId(orderId);
			subscription.setAutoRenewEnabled(autoRenewEnabled);
			subscription.setBillingCycle(billingCycle);
			subscription.setBillingType(billingType);
			subscription.setContractType(contractType);
			subscription.setCommitmentEndDate(commitmentEndDate);
			subscription.setEffectiveStartDate(effectiveStartDate);
			subscription.setCreationDate(creationDate);
			subscription.setFriendlyName(friendlyName);
			subscription.setOfferName(offerName);
			subscription.setQuantity(quantity);
			subscription.setPartnerId(partnerId);
			subscription.setUnitType(unitType);

			return subscription;
		}
	}
}
