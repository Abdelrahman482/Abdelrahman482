package com.example.site;

public class ResidentialSite extends Site {

    public ResidentialSite(double units, double rate) {
        super(units, rate);
    }

    @Override
    protected double getBaseAmount() {
        return _units * _rate * 0.5;
    }

    @Override
    protected double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE * 0.2;
    }
}
