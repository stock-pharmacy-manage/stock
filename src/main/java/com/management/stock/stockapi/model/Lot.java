package com.management.stock.stockapi.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Lot {

    @Id
    private String id;
    private String lotNumber;
    private Date premptionDate;
    private int quantity;

    public Lot() {
    }

    public Lot(String lotNumber, Date premptionDate, int quantity) {
        this.lotNumber = lotNumber;
        this.premptionDate = premptionDate;
        this.quantity = quantity;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public Date getPremptionDate() {
        return premptionDate;
    }

    public void setPremptionDate(Date premptionDate) {
        this.premptionDate = premptionDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
