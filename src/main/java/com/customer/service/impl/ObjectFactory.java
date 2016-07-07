
package com.customer.service.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.customer.service.impl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddCustomer_QNAME = new QName("http://impl.service.customer.com/", "addCustomer");
    private final static QName _ModifyCustomer_QNAME = new QName("http://impl.service.customer.com/", "modifyCustomer");
    private final static QName _DeleteCustomerIdResponse_QNAME = new QName("http://impl.service.customer.com/", "deleteCustomerIdResponse");
    private final static QName _AddCustomerResponse_QNAME = new QName("http://impl.service.customer.com/", "addCustomerResponse");
    private final static QName _GetCustomerIdResponse_QNAME = new QName("http://impl.service.customer.com/", "getCustomerIdResponse");
    private final static QName _DeleteCustomerId_QNAME = new QName("http://impl.service.customer.com/", "deleteCustomerId");
    private final static QName _GetCustomerId_QNAME = new QName("http://impl.service.customer.com/", "getCustomerId");
    private final static QName _ModifyCustomerResponse_QNAME = new QName("http://impl.service.customer.com/", "modifyCustomerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.customer.service.impl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddCustomer }
     * 
     */
    public AddCustomer createAddCustomer() {
        return new AddCustomer();
    }

    /**
     * Create an instance of {@link ModifyCustomer }
     * 
     */
    public ModifyCustomer createModifyCustomer() {
        return new ModifyCustomer();
    }

    /**
     * Create an instance of {@link AddCustomerResponse }
     * 
     */
    public AddCustomerResponse createAddCustomerResponse() {
        return new AddCustomerResponse();
    }

    /**
     * Create an instance of {@link DeleteCustomerIdResponse }
     * 
     */
    public DeleteCustomerIdResponse createDeleteCustomerIdResponse() {
        return new DeleteCustomerIdResponse();
    }

    /**
     * Create an instance of {@link GetCustomerIdResponse }
     * 
     */
    public GetCustomerIdResponse createGetCustomerIdResponse() {
        return new GetCustomerIdResponse();
    }

    /**
     * Create an instance of {@link DeleteCustomerId }
     * 
     */
    public DeleteCustomerId createDeleteCustomerId() {
        return new DeleteCustomerId();
    }

    /**
     * Create an instance of {@link GetCustomerId }
     * 
     */
    public GetCustomerId createGetCustomerId() {
        return new GetCustomerId();
    }

    /**
     * Create an instance of {@link ModifyCustomerResponse }
     * 
     */
    public ModifyCustomerResponse createModifyCustomerResponse() {
        return new ModifyCustomerResponse();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link OrdersDetails }
     * 
     */
    public OrdersDetails createOrdersDetails() {
        return new OrdersDetails();
    }

    /**
     * Create an instance of {@link Items }
     * 
     */
    public Items createItems() {
        return new Items();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.customer.com/", name = "addCustomer")
    public JAXBElement<AddCustomer> createAddCustomer(AddCustomer value) {
        return new JAXBElement<AddCustomer>(_AddCustomer_QNAME, AddCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.customer.com/", name = "modifyCustomer")
    public JAXBElement<ModifyCustomer> createModifyCustomer(ModifyCustomer value) {
        return new JAXBElement<ModifyCustomer>(_ModifyCustomer_QNAME, ModifyCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomerIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.customer.com/", name = "deleteCustomerIdResponse")
    public JAXBElement<DeleteCustomerIdResponse> createDeleteCustomerIdResponse(DeleteCustomerIdResponse value) {
        return new JAXBElement<DeleteCustomerIdResponse>(_DeleteCustomerIdResponse_QNAME, DeleteCustomerIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.customer.com/", name = "addCustomerResponse")
    public JAXBElement<AddCustomerResponse> createAddCustomerResponse(AddCustomerResponse value) {
        return new JAXBElement<AddCustomerResponse>(_AddCustomerResponse_QNAME, AddCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.customer.com/", name = "getCustomerIdResponse")
    public JAXBElement<GetCustomerIdResponse> createGetCustomerIdResponse(GetCustomerIdResponse value) {
        return new JAXBElement<GetCustomerIdResponse>(_GetCustomerIdResponse_QNAME, GetCustomerIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomerId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.customer.com/", name = "deleteCustomerId")
    public JAXBElement<DeleteCustomerId> createDeleteCustomerId(DeleteCustomerId value) {
        return new JAXBElement<DeleteCustomerId>(_DeleteCustomerId_QNAME, DeleteCustomerId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.customer.com/", name = "getCustomerId")
    public JAXBElement<GetCustomerId> createGetCustomerId(GetCustomerId value) {
        return new JAXBElement<GetCustomerId>(_GetCustomerId_QNAME, GetCustomerId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.customer.com/", name = "modifyCustomerResponse")
    public JAXBElement<ModifyCustomerResponse> createModifyCustomerResponse(ModifyCustomerResponse value) {
        return new JAXBElement<ModifyCustomerResponse>(_ModifyCustomerResponse_QNAME, ModifyCustomerResponse.class, null, value);
    }

}
