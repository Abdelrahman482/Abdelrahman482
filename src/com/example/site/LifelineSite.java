package com.example.site;

public class LifelineSite extends Site {

    public LifelineSite(double units, double rate) {
        super(units, rate);
    }

    @Override
    protected double getBaseAmount() {
        return _units * _rate;
    }

    @Override
    protected double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE;
    }
}
