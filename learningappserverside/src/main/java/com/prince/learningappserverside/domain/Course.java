package com.prince.learningappserverside.domain;

import javax.persistence.*;

@Entity
public class Course {

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private Long id;

    private String courseName;

    private String inspector;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    @OneToOne
    private PricingComponent pricingComponent;


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInspector() {
        return inspector;
    }

    public void setInspector(String inspector) {
        this.inspector = inspector;
    }

    public PricingComponent getPricingComponent() {
        return pricingComponent;
    }

    public void setPricingComponent(PricingComponent pricingComponent) {
        this.pricingComponent = pricingComponent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", inspector='" + inspector + '\'' +
                '}';
    }
}
