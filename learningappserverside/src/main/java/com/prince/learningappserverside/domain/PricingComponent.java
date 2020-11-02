package com.prince.learningappserverside.domain;

import javax.persistence.*;

@Entity
@Table(name = "pricing_component")
public class PricingComponent {

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private Long id;
    private double courseFees;

    public PriceDetails getPriceDetails() {
        return priceDetails;
    }

    public void setPriceDetails(PriceDetails priceDetails) {
        this.priceDetails = priceDetails;
    }

    @OneToOne/*(mappedBy = "pricingComponent")*/
    private PriceDetails priceDetails;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getCourseFees() {
        return courseFees;
    }

    public void setCourseFees(double courseFees) {
        this.courseFees = courseFees;
    }


}
