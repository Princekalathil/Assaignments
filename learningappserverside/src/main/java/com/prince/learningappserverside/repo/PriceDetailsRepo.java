package com.prince.learningappserverside.repo;

import com.prince.learningappserverside.domain.PriceDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceDetailsRepo extends JpaRepository<PriceDetails,Long> {

}
