package com.codeup.adlister.util;

import org.mindrot.jbcrypt.BCrypt;

public class Password {
    private static final int ROUNDS = 12;

    public static String hash(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt(ROUNDS));
    }

    public static boolean check(String password, String hash) {
        return BCrypt.checkpw(password, hash);
    }

    public static void main(String[] args) {
        String pw = "password";
        String hash1 = hash(pw);
        String hash2 = hash(pw);
        System.out.println(hash1);
        System.out.println(hash2);
        System.out.println(check(pw, hash1));
        System.out.println(check(pw, hash2));
    }
}
