package com.rustam.ms_customer.controller;

import com.rustam.ms_customer.dto.CustomerDto;
import com.rustam.ms_customer.service.CustomerService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/customer")
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
public class CustomerController {

    CustomerService customerService;

    public ResponseEntity<CustomerDto> saveCustomer(@RequestBody CustomerDto customerDto){
        return new ResponseEntity<>(customerService.save(customerDto), HttpStatus.CREATED);
    }

}
