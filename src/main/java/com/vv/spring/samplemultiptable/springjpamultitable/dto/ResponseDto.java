package com.vv.spring.samplemultiptable.springjpamultitable.dto;

public class ResponseDto {

    String custLname;

    public String getCustLname() {
        return custLname;
    }

    public void setCustLname(String custLname) {
        this.custLname = custLname;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    String productType;

    public ResponseDto(String custLname, String productType) {
        this.custLname = custLname;
        this.productType = productType;
    }
}
