package com.cybertek;

import com.cybertek.core.Loops;
import com.cybertek.core.Methods;
import com.cybertek.core.SelectionStatements;
import com.cybertek.core.enums.Gender;
import com.cybertek.core.enums.Status;
import com.cybertek.core.oop.abstraction.implementation.UserServiceImplementation;
import com.cybertek.core.oop.abstraction.service.UserService;
import com.cybertek.core.oop.encapsulation.Role;
import com.cybertek.core.oop.encapsulation.User;
import com.cybertek.core.oop.inheritance.BaseEntity;
import com.cybertek.core.oop.inheritance.Project;
import com.cybertek.core.oop.polimorphism.Employee;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");


        //*******CORE*********//
        Methods methods = new Methods();
        methods.methodA();
        methods.methodA("Apple");
        System.out.println(methods.methodB());
        System.out.println(methods.methodB(5));
        Methods.methodC();

        //******LOOPS********/
        Loops.demoForIterator();
        Loops.demoForEach();

        //******SELECTIONS********///
        SelectionStatements.demoIfStatement();
        SelectionStatements.demoSwitchCaseStatement();

        System.out.println();
        //******OOP-Encapsulation********//

        User user = new User("Huseyin", "Civan", new Role(1, "Developer"), Gender.MALE);
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        user.getRole().getDescription();


        System.out.println();
        //******OOP-Inheritance********//

        //create a project object ! homework


//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        LocalDateTime dateTime = LocalDateTime.of(1984, 6, 5, 12, 30);
//        String formattedDateTime = dateTime.format(formatter); // "1986-04-08 12:30"
//
//        System.out.println("dateTime = " + dateTime);
//        System.out.println("formattedDateTime = " + formattedDateTime);

     //Project(long id, LocalDateTime insertDateTime,
        //                   long insertUserId, LocalDateTime lastUpdateDateTime,
        //                   long lastUpdateUserId, String projectCode, String projectName,
        //                   User assignedManager, LocalDate startDate, LocalDate endDate,
        //                   String projectStatus, String projectDetail)

        long id = 111999;
        LocalDateTime insertDateTime = LocalDateTime.of(2020,10,10,8,0);
        long insertUserId = 111;
        LocalDateTime lastUpdateDateTime=LocalDateTime.of(2020,10,12,18,45);
        long lastUpdateUserId=111;
        String projectCode="ProjectCode01";
        String projectName="ProjectName01";
        User assignedManager= new User("F","L",new Role(123,"Manager"),Gender.FEMALE);
        LocalDate startDate=LocalDate.of(2020,10,10);
        LocalDate endDate=LocalDate.of(2021,04,30);
        Status projectStatus=Status.IN_PROGRESS;
        String projectDetail="ProjectDetail01";

        Project project = new Project(id,insertDateTime,insertUserId,lastUpdateDateTime,lastUpdateUserId,projectCode,
                projectName,assignedManager,startDate,endDate,projectStatus,projectDetail);


        System.out.println();
        System.out.println("interface");
        //******OOP-Interface********//

        UserService userService = new UserService();
        System.out.println(userService.userByFirstName("Mike").getLastName());


        System.out.println();
        System.out.println("polymorphism");
        //******OOP-POlimorphism********//

        //reference type         object type
        Employee employee = new Employee();
        BaseEntity employee2 = new Employee();
        UserServiceImplementation userServiceImplementation = new UserService();

        employee.getEmployeeHours();

        ((Employee) employee2).getEmployeeHours();  //down casting


        System.out.println();
        System.out.println("enums");
        //******OOP-enums********//

        System.out.println(Gender.FEMALE);
        System.out.println(Status.IN_PROGRESS.getValue().substring(2));


    }


}
