package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long secId;

    @Column(nullable = false)
    private String secName;

    @Column(nullable = false)
    private double purchasePrice;

    @Column(nullable = false)
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "categoryId", nullable = false)
    private Category category;

    protected Security() {
    }

    public Security(String secName, double purchasePrice, int quantity, Category category) {
        this.secName = secName;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.category = category;
    }

    public long getSecId() {
        return secId;
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}