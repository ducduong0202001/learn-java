package com.examples.Transaction.repository;

import com.examples.Transaction.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User,String> {

    boolean existsByUsername(String username);
    Optional<User> findByUsername(String username);
}
