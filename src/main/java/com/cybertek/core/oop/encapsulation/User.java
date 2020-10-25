package com.cybertek.core.oop.encapsulation;

import com.cybertek.core.enums.Gender;
import com.cybertek.core.oop.inheritance.BaseEntity;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


public class User extends BaseEntity {

    private String firstName;
    private String lastName;
    private Role role;  // Composition
    private Gender gender;

    public User(long id, LocalDateTime insertDateTime, long insertUserId, LocalDateTime lastUpdateDateTime, long lastUpdateUserId, String firstName, String lastName, Role role, Gender gender) {
        super(id, insertDateTime, insertUserId, lastUpdateDateTime, lastUpdateUserId);
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.gender = gender;
    }


//no need anymore ----------- used lombok
//    public User() {
//    }
//
//    public User(String firstName, String lastName, Role role) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.role = role;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public Role getRole() {
//        return role;
//    }
//
//    public void setRole(Role role) {
//        this.role = role;
//    }


}
