package org.example;

import org.mindrot.jbcrypt.BCrypt;


public class Main {
    public static void main(String[] args) {
        String salt = BCrypt.gensalt();
        System.out.println(
                BCrypt.hashpw("SomePassword", salt)
        );
    }
}