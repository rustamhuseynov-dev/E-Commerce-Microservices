package com.rustam.ms_customer.service;

import com.rustam.ms_customer.dto.CustomerDto;
import com.rustam.ms_customer.model.Customer;
import com.rustam.ms_customer.repository.CustomerRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
public class CustomerService {

    CustomerRepository customerRepository;

    public CustomerDto save(CustomerDto customerDto) {
        Customer customer = Customer.builder()
                .name(customerDto.getName())
                .surname(customerDto.getSurname())
                .build();
    }
}
