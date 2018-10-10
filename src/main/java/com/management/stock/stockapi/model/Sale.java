package com.management.stock.stockapi.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Document(collection="sale")
public class Sale {
    @Id
    private String id;

    private Date date;

    private long amount;

    private int product_number;

    private Customer customer;

    private List<Product> products;


    public Sale(){}

    public Sale(Date date, long amount, int product_number, Customer customer,List<Product> products) {
        this.date = date;
        this.amount = amount;
        this.product_number = product_number;
        this.customer = customer;
        this.products = products;
    }


    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public int getProduct_number() {
        return product_number;
    }

    public void setProduct_number(int product_number) {
        this.product_number = product_number;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sale sale = (Sale) o;
        return amount == sale.amount &&
                product_number == sale.product_number &&
                Objects.equals(id, sale.id) &&
                Objects.equals(date, sale.date) &&
                Objects.equals(customer, sale.customer);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, date, amount, product_number, customer);
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", amount=" + amount +
                ", product_number=" + product_number +
                ", customer=" + customer +
                '}';
    }
}