package com.prince.learningappserverside.web.rest;

import com.prince.learningappserverside.domain.PriceDetails;
import com.prince.learningappserverside.domain.PricingComponent;
import com.prince.learningappserverside.domain.User;
import com.prince.learningappserverside.domain.Course;
import com.prince.learningappserverside.service.LearningAppService;

import io.github.jhipster.web.util.PaginationUtil;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


//import org.springframework.data.domain.Pageable;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Learn")
public class LearningAppController {



    @Autowired
    LearningAppService learnService;

    @PostMapping("/user")
    ResponseEntity<User> createUser(@RequestBody User user){
       return learnService.createUser(user);
    }
    @GetMapping("/user/id")
    ResponseEntity<User> getUser(@PathVariable Long id){
        return learnService.getUser(id);
    }
    @GetMapping("/user/region")
    public User getDatasfromRegion(@PathVariable String region){

        return learnService.getDatasFromRegion(region);
    }
    @GetMapping("/users")
    ResponseEntity<List<User>> getAllUsers(){
        return learnService.getAllUsers();
    }
    @PostMapping("/course")
    ResponseEntity<Course> createCourse(@RequestBody Course course){
        return learnService.createCourse(course);
    }
    @GetMapping("/course/id")
    ResponseEntity<Course> getCourse(@PathVariable Long id){
        return learnService.getCourse(id);
    }
    @PostMapping("/pricingComponent")
    ResponseEntity<PricingComponent> createPricingComponent(@RequestBody PricingComponent pricingComponent){
        return learnService.createPricingComponent(pricingComponent);
    }
    @GetMapping("/pricingComponent/id")
    ResponseEntity<PricingComponent> getPricingComponent(@PathVariable Long id){
        return learnService.getPricingComponent(id);
    }
    @PostMapping("/priceDetails")
    ResponseEntity<PriceDetails> createPriceDetails(@RequestBody PriceDetails priceDetails){
        return learnService.createPriceDetails(priceDetails);
    }
}
