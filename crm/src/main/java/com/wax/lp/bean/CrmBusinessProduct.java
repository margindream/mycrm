package com.wax.lp.bean;

public class CrmBusinessProduct {
    private Integer id;

    private Integer businessid;

    private Integer productid;

    private Float salesprice;

    private Float estimateprice;

    private Integer amount;

    private Integer discountrate;

    private Integer taxrate;

    private Float unitprice;

    private Float subtotal;

    private String description;

    private Float subtotalval;

    private Float discountprice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Integer businessid) {
        this.businessid = businessid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Float getSalesprice() {
        return salesprice;
    }

    public void setSalesprice(Float salesprice) {
        this.salesprice = salesprice;
    }

    public Float getEstimateprice() {
        return estimateprice;
    }

    public void setEstimateprice(Float estimateprice) {
        this.estimateprice = estimateprice;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getDiscountrate() {
        return discountrate;
    }

    public void setDiscountrate(Integer discountrate) {
        this.discountrate = discountrate;
    }

    public Integer getTaxrate() {
        return taxrate;
    }

    public void setTaxrate(Integer taxrate) {
        this.taxrate = taxrate;
    }

    public Float getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Float unitprice) {
        this.unitprice = unitprice;
    }

    public Float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Float getSubtotalval() {
        return subtotalval;
    }

    public void setSubtotalval(Float subtotalval) {
        this.subtotalval = subtotalval;
    }

    public Float getDiscountprice() {
        return discountprice;
    }

    public void setDiscountprice(Float discountprice) {
        this.discountprice = discountprice;
    }
}