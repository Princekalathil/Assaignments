package com.prince.learningappserverside.service.impl;


import com.prince.learningappserverside.domain.Course;
import com.prince.learningappserverside.domain.PriceDetails;
import com.prince.learningappserverside.domain.PricingComponent;

import com.prince.learningappserverside.domain.User;

import com.prince.learningappserverside.repo.CourseRepo;

import com.prince.learningappserverside.repo.PriceDetailsRepo;
import com.prince.learningappserverside.repo.PricingComponentRepo;

import com.prince.learningappserverside.repo.UserRepo;
import com.prince.learningappserverside.service.LearningAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@Service
public class LearningAppServiceImpl implements LearningAppService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    CourseRepo courseRepo;

    @Autowired
    PricingComponentRepo pricingComponenRepo;

    @Autowired
    PriceDetailsRepo priceDetailsRepo;

    @Override
    public ResponseEntity<User> createUser(User user) {

        return ResponseEntity.ok().body(userRepo.save(user));
    }

    @Override
    public ResponseEntity<User> getUser(Long id) {

        return ResponseEntity.ok().body(userRepo.getOne(id));
    }

    @Override
    public ResponseEntity<Course> createCourse(Course course) {
        return ResponseEntity.ok().body(courseRepo.save(course));
    }

    @Override
    public ResponseEntity<Course> getCourse(Long id) {
        return ResponseEntity.ok().body(courseRepo.getOne(id));
    }

    @Override
    public ResponseEntity<PricingComponent> createPricingComponent(PricingComponent pricingComponent) {
        return ResponseEntity.ok().body(pricingComponenRepo.save(pricingComponent));
    }

    @Override
    public ResponseEntity<PricingComponent> getPricingComponent(Long id) {
        return ResponseEntity.ok().body(pricingComponenRepo.getOne(id));
    }

    @Override
    public User getDatasFromRegion(String region) {
        return userRepo.getByRegionIgnoreCase(region);
    }

    @Override
    public ResponseEntity<PriceDetails> createPriceDetails(PriceDetails priceDetails) {

        return ResponseEntity.ok(priceDetailsRepo.save(priceDetails));
    }

    @Override
    public ResponseEntity<List<User>> getAllUsers() {

        return ResponseEntity.ok(userRepo.findAll());
    }


}
