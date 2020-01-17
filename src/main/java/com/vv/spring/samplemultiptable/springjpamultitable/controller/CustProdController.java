package com.vv.spring.samplemultiptable.springjpamultitable.controller;

import com.vv.spring.samplemultiptable.springjpamultitable.dto.ResponseDto;
import com.vv.spring.samplemultiptable.springjpamultitable.entity.Customer;
import com.vv.spring.samplemultiptable.springjpamultitable.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustProdController {

    @Autowired
    CustomerRepository customerRepository;
    @PostMapping("/sendDetails")
    public void postMessages(@RequestBody  Customer customer)
    {
        Customer cust  = customerRepository.save(customer);
        System.out.println("Customer ::"+cust);
    }

    @GetMapping("/getCustProdDetails")
    public List<Customer> getCustProdDtl()
    {
       List<Customer> customers = customerRepository.findAll();
        return  customers;
    }

    @GetMapping("/getCobinedInfo")
    public List<ResponseDto> getCombined()
    {
       List<ResponseDto> responseDtosv= customerRepository.getCombinedInfo();
        return  responseDtosv;
    }
}
