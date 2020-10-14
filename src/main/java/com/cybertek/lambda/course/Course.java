package com.cybertek.lambda.course;

@FunctionalInterface  // sadece 1 tane abstract method varsa bu anotation i koyabilirsin , olmasa da olur . Lambda ile object cretae edebilmek icin 1 tane metod olmasi gerekiyor,
public interface Course {
    void study();
}
