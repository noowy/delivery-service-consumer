package com.commerce.sn_monitor.domain.cdek;

import com.commerce.sn_monitor.domain.OrderItem;

import java.util.List;

public class CdekThreSholdDelivery
{
	@JsonProperty("Threshold")
	private String threshold;
	
	@JsonProperty("Sum")
	private String sum;
	
	@JsonProperty("Vat_sum")
	private String vat_sum;
	
	@JsonProperty("Vat_rate")
	private String vat_rate;
}