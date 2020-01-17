package com.vv.spring.samplemultiptable.springjpamultitable.entity;


import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", custFname='" + custFname + '\'' +
                ", custLname='" + custLname + '\'' +
                ", custType='" + custType + '\'' +
                '}';
    }

    @Id
    @GeneratedValue
    Integer id;
    String custFname;
    String custLname;
    String custType;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "cp_fk" ,referencedColumnName = "id")
    List<Product> products;


    public Customer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustFname() {
        return custFname;
    }

    public void setCustFname(String custFname) {
        this.custFname = custFname;
    }

    public String getCustLname() {
        return custLname;
    }

    public void setCustLname(String custLname) {
        this.custLname = custLname;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }
}
