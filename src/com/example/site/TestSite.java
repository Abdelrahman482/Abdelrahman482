package com.example.site;

public class TestSite {
    public static void main(String[] args) {
        Site residential = new ResidentialSite(100, 5);
        System.out.println("Residential Billable Amount: " + residential.getBillableAmount());

        Site lifeline = new LifelineSite(100, 5);
        System.out.println("Lifeline Billable Amount: " + lifeline.getBillableAmount());
    }
}
