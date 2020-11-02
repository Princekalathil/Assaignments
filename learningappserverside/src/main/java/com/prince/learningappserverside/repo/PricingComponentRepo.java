package com.prince.learningappserverside.repo;


import com.prince.learningappserverside.domain.PricingComponent;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PricingComponentRepo extends JpaRepository<PricingComponent,Long> {


}
