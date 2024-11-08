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
        double base = _units * _rate;
        double tax = base * TAX_RATE;
        return base + tax;
    }
}
