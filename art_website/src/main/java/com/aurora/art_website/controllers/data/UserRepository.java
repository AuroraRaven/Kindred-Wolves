package com.aurora.art_website.controllers.data;
import com.aurora.art_website.models.User;
import org.springframework.data.repository.CrudRepository;
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);

}