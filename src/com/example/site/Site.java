package com.example.site;

public abstract class Site {
    protected double _units;
    protected double _rate;
    public static final double TAX_RATE = 0.1;

    public Site(double units, double rate) {
        this._units = units;
        this._rate = rate;
    }

    public double getBillableAmount() {
        return getBaseAmount() + getTaxAmount();
    }

    protected abstract double getBaseAmount();
    protected abstract double getTaxAmount();
}
