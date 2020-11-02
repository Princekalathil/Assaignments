package com.prince.learningappserverside.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Locale;

@Entity
public class User {
    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private Long id;
    private String name;
    private Long age;
    private String region;





    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public User(Long id, String name, Long age, String region) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.region = region;
    }

    public User() {
    }
}
