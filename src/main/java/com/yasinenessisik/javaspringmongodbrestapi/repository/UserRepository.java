package com.yasinenessisik.javaspringmongodbrestapi.repository;

import com.yasinenessisik.javaspringmongodbrestapi.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {

}
