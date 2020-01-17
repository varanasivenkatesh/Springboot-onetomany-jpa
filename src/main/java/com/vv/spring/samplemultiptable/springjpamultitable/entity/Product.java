package com.vv.spring.samplemultiptable.springjpamultitable.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Product {

    @Id
            @GeneratedValue
    Integer id;
    String productName;
    String productType;
    Integer productPrice;




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public Product() {
    }

    public  Product(String productName,String productType, Integer productPrice)
    {
        this.productName = productType;
        this.productType = productType;
        this.productPrice = productPrice;


    }
}
