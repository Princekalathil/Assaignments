package com.prince.learningappserverside.service;


import com.prince.learningappserverside.domain.Course;

import com.prince.learningappserverside.domain.PriceDetails;
import com.prince.learningappserverside.domain.PricingComponent;

import com.prince.learningappserverside.domain.User;
import org.springframework.http.ResponseEntity;

import java.awt.print.Pageable;
import java.util.List;

public interface LearningAppService {
    ResponseEntity<User> createUser(User user);

    ResponseEntity<User> getUser(Long id);

    ResponseEntity<Course> createCourse(Course course);

    ResponseEntity<Course> getCourse(Long id);

    ResponseEntity<PricingComponent> createPricingComponent(PricingComponent pricingComponent);

    ResponseEntity<PricingComponent> getPricingComponent(Long id);


    User getDatasFromRegion(String region);

    ResponseEntity<PriceDetails> createPriceDetails(PriceDetails priceDetails);

    ResponseEntity<List<User>> getAllUsers();
}
