package com.prince.learningappserverside.domain;

import javax.persistence.*;

@Entity
public class PriceDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double gst;
    private double tax;
    private double vat;
    private double conversionCharge;

    /*public PricingComponent getPricingComponent() {
        return pricingComponent;
    }*/

    /*public void setPricingComponent(PricingComponent pricingComponent) {
        this.pricingComponent = pricingComponent;
    }*/

    /*@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "pricing_component_id")
    private PricingComponent pricingComponent;*/


    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }





    public double getGst() {
        return gst;
    }

    public void setGst(double gst) {
        this.gst = gst;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public double getConversionCharge() {
        return conversionCharge;
    }

    public void setConversionCharge(double conversionCharge) {
        this.conversionCharge = conversionCharge;
    }


}
