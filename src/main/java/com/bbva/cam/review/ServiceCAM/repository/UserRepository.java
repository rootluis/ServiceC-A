package com.bbva.cam.review.ServiceCAM.repository;

import com.bbva.cam.review.ServiceCAM.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    //@Query("db.col1_user.find{'userId':'userIdVal'}")
    //User findByUserID(String userId, String userIdVal);

    //@Query("{ 'name':{'$regex':?2,'$options':'i'}, sales': {'$gte':?1,'$lte':?2}}")
    //public Page<Product> findByNameAndAgeRange(String name,double ageFrom,double ageTo,Pageable page);



}
