package com.cybertek.streams.excercises;


import com.cybertek.core.enums.Gender;
import com.cybertek.core.enums.Status;
import com.cybertek.core.oop.encapsulation.User;
import com.cybertek.core.oop.inheritance.Project;

import javax.xml.crypto.Data;
import java.time.Period;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {

    }


    //Task-1
    public static List<Project> getListOfProject() {

        List<Project> listOfProjects = DataGenerator.getProjects();
        return listOfProjects;

    }


//Task-2

    public static List<Project> getListOfProject(Status status) {

        List<Project> listOfProjects = DataGenerator.getProjects()
                .stream().filter(st -> st.getProjectStatus().equals(status)).collect(Collectors.toList());
        return listOfProjects;
    }


    //Task-3
    public static List<Project> getListOfProject(User manager) {
        List<Project> listOfProjects = DataGenerator.getProjects()
                .stream().filter(m -> m.getAssignedManager().equals(manager)).collect(Collectors.toList());

        return listOfProjects;
    }

    //Task-4
    public static List<Project> getProjectByProjectCode(String projectCode) {

        List<Project> listOfProjects = DataGenerator.getProjects()
                .stream().filter(pc -> pc.getProjectCode().equals(projectCode)).collect(Collectors.toList());

        return listOfProjects;
    }


    // Task-5
    public static List<User> getListUsers() {
        List<User> listOfUsers = DataGenerator.getUsers();
        return listOfUsers;
    }


    //Task-6
    public static User getUserByFirstName(String firstName) {

        User user = DataGenerator.getUsers().stream().filter(n -> n.getFirstName().equals(firstName)).findFirst().get();
        return user;

    }


//    //Task-7
//    public static String getUserByUserId(Long id) {
//
//
//    }


    //Task-8
    public static List<User> deleteUser(String firstName) {
        List<User> user = DataGenerator.getUsers().stream().filter(f -> !f.getFirstName().equals(firstName)).collect(Collectors.toList());
        return user;

    }


    // Task-9
    public static List<Project> updateProjectStatus(Status oldStatus, Status newStatus) {
        List<Project> listOfProject = DataGenerator.getProjects();

        listOfProject.stream().filter(os -> os.getProjectStatus().equals(oldStatus)).forEach(ns -> ns.setProjectStatus(newStatus));
        return listOfProject;
    }


    //Task-10
    public static List<Project> findProjectByManager(User manager) {
        List<Project> projects = DataGenerator.getProjects();

        projects.stream().filter(m -> m.getAssignedManager().equals(manager)).collect(Collectors.toList());


        return projects;

    }


    //Task-11 - Period
    public static Integer totalProjectDurationForManager(User manager) {
        List<Project> projectList = DataGenerator.getProjects();

        Project p = projectList.stream().filter(m-> m.getAssignedManager().equals(manager)).findFirst().get();
        Period period = Period.between(p.getStartDate(),p.getEndDate());


        return  period.getDays();

    }


    //Task-12
    public static long findTotalMaleInCompany() {
        List<User> maleUsers= DataGenerator.getUsers();


        return maleUsers.stream().filter(m-> m.getGender().equals(Gender.MALE)).count();


    }


}


