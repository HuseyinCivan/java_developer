package com.cybertek.core.oop.encapsulation;

import com.cybertek.core.enums.Gender;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


public class User {

    private String firstName;
    private String lastName;
    private Role role;  // Composition
    private Gender gender;



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
