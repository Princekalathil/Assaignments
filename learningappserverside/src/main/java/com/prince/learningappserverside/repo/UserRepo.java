package com.prince.learningappserverside.repo;


import com.prince.learningappserverside.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {


    User getByRegionIgnoreCase(String region);

    //Object getRegionBaseData(String region);
}
