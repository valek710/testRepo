package org.example;

import com.github.javafaker.Faker;

/**
 * Hello world!
 */
public class TestClass {

    public static void main(String[] args) {
        System.out.println(Faker.instance().date().birthday(18, 60));
    }
}
