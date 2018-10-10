package com.management.stock.stockapi.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Product {

    @Id
    private String id;
    private String code;
    private String nom;
    private String dci1;
    private String dosage1;
    private String dosage_unit;
    private String presentation;
    private String ppv;
    private String ph;
    private String br_price;
    private String global_priceps;
    private String remboursement_rate;
    private int quantity;
    private List<Lot> lots;

    public Product(){
    }
    public Product(String code, String nom, String dci1, String dosage1, String dosage_unit, String presentation, String ppv, String ph, String br_price, String global_priceps, String remboursement_rate, int quantity, List<Lot> lots) {
        this.code = code;
        this.nom = nom;
        this.dci1 = dci1;
        this.dosage1 = dosage1;
        this.dosage_unit = dosage_unit;
        this.presentation = presentation;
        this.ppv = ppv;
        this.ph = ph;
        this.br_price = br_price;
        this.global_priceps = global_priceps;
        this.remboursement_rate = remboursement_rate;
        this.quantity = quantity;
        this.lots = lots;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDci1() {
        return dci1;
    }

    public void setDci1(String dci1) {
        this.dci1 = dci1;
    }

    public String getDosage1() {
        return dosage1;
    }

    public void setDosage1(String dosage1) {
        this.dosage1 = dosage1;
    }

    public String getDosage_unit() {
        return dosage_unit;
    }

    public void setDosage_unit(String dosage_unit) {
        this.dosage_unit = dosage_unit;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public String getPpv() {
        return ppv;
    }

    public void setPpv(String ppv) {
        this.ppv = ppv;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getBr_price() {
        return br_price;
    }

    public void setBr_price(String br_price) {
        this.br_price = br_price;
    }

    public String getGlobal_priceps() {
        return global_priceps;
    }

    public void setGlobal_priceps(String global_priceps) {
        this.global_priceps = global_priceps;
    }

    public String getRemboursement_rate() {
        return remboursement_rate;
    }

    public void setRemboursement_rate(String remboursement_rate) {
        this.remboursement_rate = remboursement_rate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<Lot> getLots() {
        return lots;
    }

    public void setLots(List<Lot> lots) {
        this.lots = lots;
    }
}
