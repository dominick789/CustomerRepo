package net.javaguides.customer.service;

import net.javaguides.customer.entity.customer_det;

import java.util.List;

public interface customerService {
    customer_det createCustomer(customer_det customerDet);

    customer_det getCustomerById(Long customerId);

    List<customer_det> getAllCustomer();

    customer_det updateCustomer(customer_det customerDet);

    void deleteCustomer(Long customerId);
}
