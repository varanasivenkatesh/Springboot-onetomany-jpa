package com.vv.spring.samplemultiptable.springjpamultitable.repository;

import com.vv.spring.samplemultiptable.springjpamultitable.dto.ResponseDto;
import com.vv.spring.samplemultiptable.springjpamultitable.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {


@Query("SELECT new com.vv.spring.samplemultiptable.springjpamultitable.dto.ResponseDto(c.custLname, p.productType) from Customer c JOIN c.products p")
    public List<ResponseDto> getCombinedInfo();
}
