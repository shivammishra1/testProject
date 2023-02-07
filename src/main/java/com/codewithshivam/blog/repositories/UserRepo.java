package com.codewithshivam.blog.repositories;

import com.codewithshivam.blog.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users,Integer> {
}
