package com.vv.spring.samplemultiptable.springjpamultitable.repository;

import com.vv.spring.samplemultiptable.springjpamultitable.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
