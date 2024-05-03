package com.study.springboot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AccessAllClassInPackageTest {

    @Test
    void findAllClassesUsingClassLoader() {
        AccessAllClassInPackage instance = new AccessAllClassInPackage();

        Set<Class> classes = instance.findAllClassesUsingClassLoader(
                "com.study.springboot");

        Assertions.assertEquals(3, classes.size());
    }
}