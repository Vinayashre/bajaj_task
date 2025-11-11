package com.vinayashreebajajtask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vinayashreebajajtask.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
