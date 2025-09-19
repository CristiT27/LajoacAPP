package com.LajoacApp.Lajoac.repository;

import com.LajoacApp.Lajoac.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
