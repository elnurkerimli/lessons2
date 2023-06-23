/**
 * @author ELNUR KARIMLI
 * PROJECT_NAME : springboot-multithreading-example
 */

package com.developer.springbootmultithreadingexample.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table (name = "USER_TBL")
@AllArgsConstructor
@NoArgsConstructor

public class User {
    @Id
    @GeneratedValue
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String gender;
    private String ip_address;

    public void setName(String datum) {
    }
}
