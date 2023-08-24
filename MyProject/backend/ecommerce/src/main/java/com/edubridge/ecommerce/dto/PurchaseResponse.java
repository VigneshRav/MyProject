package com.edubridge.ecommerce.dto;

import lombok.Data;

@Data
public class PurchaseResponse {

    private String orderTrackingNumber= "";


	public String getOrderTrackingNumber() {
		return orderTrackingNumber;
	}


	public PurchaseResponse(String orderTrackingNumber) {
		super();
		this.orderTrackingNumber = orderTrackingNumber;
	}
    

}