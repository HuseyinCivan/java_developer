package com.cybertek.lambda.sorting;

import com.cybertek.core.oop.encapsulation.Role;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Data

//bunlarin yerine sadece @Data da konabilir
/*
@Getter
@Setter
@ToString

 */


public class Employee {

    private Integer employeeID;
    private String employeeFirstName;
    private String employeeLastName;
    private String employeeCity;
    private Role role;



    //toString methodunu bu sekkilde override etmek yerine yukarida @toString annotation i kullanailirz
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "employeeID=" + employeeID +
//                ", employeeFirstName='" + employeeFirstName + '\'' +
//                ", employeeLastName='" + employeeLastName + '\'' +
//                ", employeeCity='" + employeeCity + '\'' +
//                ", role=" + role +
//                '}';
//    }
}
