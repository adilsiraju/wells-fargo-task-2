package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long portfolioId;

    @ManyToOne
    @JoinColumn(name = "secId", nullable = false)
    private Security security;

    @ManyToOne
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;

    protected Portfolio() {
    }

    public Portfolio(Security security, Client client) {
        this.security = security;
        this.client = client;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}