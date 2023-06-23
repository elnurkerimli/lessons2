/**
 * @author ELNUR KARIMLI
 * PROJECT_NAME : springboot-multithreading-example
 */

package com.developer.springbootmultithreadingexample.repository;

import com.developer.springbootmultithreadingexample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Integer> {
}
