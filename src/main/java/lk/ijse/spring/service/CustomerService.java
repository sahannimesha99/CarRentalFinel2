package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;

import java.util.List;


public interface CustomerService {
    void saveCustomer(CustomerDTO dto);

    void updateCustomer(CustomerDTO dto);

    CustomerDTO searchCustomer(String id);

    void deleteCustomer(String id);

    List<CustomerDTO> getAllCustomers();
}
