package ru.rajyx;

import org.mindrot.jbcrypt.BCrypt;

import java.io.Console;


public class JBCryptEncrypt {
    public static void main(String[] args) {
        Console console = System.console();
        String password = new String(console.readPassword("Enter your password!\n"));
        String salt = BCrypt.gensalt();
        System.out.println(
                "Hash -> " + BCrypt.hashpw(password, salt)
        );
    }
}