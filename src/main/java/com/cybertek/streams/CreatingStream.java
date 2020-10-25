package com.cybertek.streams;

import com.cybertek.core.collections.ArrayLists;
import com.cybertek.core.oop.encapsulation.Role;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingStream {

    // creating a stream from an Array

    String [] courses = {"Java","JS","TS","API","SELENIUM"};

    Stream<String> courseStream = Arrays.stream(courses);


    //Creating a Stream from a Collection

    Stream<Role> roleStream = ArrayLists.createRoleList().stream();


    //Creating a Stream from Specific Values
    Stream<Integer> stream = Stream.of(1,2,3,4,5,6);




}
