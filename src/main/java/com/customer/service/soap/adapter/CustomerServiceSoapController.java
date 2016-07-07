package com.customer.service.soap.adapter;

import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.customer.service.impl.AddCustomer;
import com.customer.service.impl.AddCustomerResponse;
@Component
@Endpoint
public class CustomerServiceSoapController {

	public static final String NAMESPACE_URI = "http://impl.service.customer.com/";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "/addCustomer")
	@ResponsePayload
	public AddCustomerResponse addCustomer(@RequestPayload AddCustomer arg0) {
		System.out.println("Demo ");
		AddCustomerResponse response = new AddCustomerResponse();
		response.setReturn("Demo");
		return response;
	}

	public String modifyCustomer(com.customer.service.impl.Customer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteCustomerId(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public com.customer.service.impl.Customer getCustomerId(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
