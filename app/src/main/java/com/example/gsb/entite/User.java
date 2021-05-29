package com.example.gsb.entite;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class User {

    private String login;
    private String pass;
    private boolean active;

    public User() {
        super();
    }

    public User(String login, String pass) {
        super();
        this.login = login;
        this.pass = md5(pass);
        this.active = true;
    }

    /*private String md5Pass(String hashInput) {
        String hashedOutput = null;
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        hashedOutput = bCryptPasswordEncoder.encode(hashInput);
        return hashedOutput;
    }*/

    public String md5(String s) {
        try {
            // Create MD5 Hash
            MessageDigest digest = MessageDigest.getInstance("MD5");
            digest.update(s.getBytes());
            byte messageDigest[] = digest.digest();

            // Create Hex String
            StringBuffer hexString = new StringBuffer();
            for (int i=0; i<messageDigest.length; i++)
                hexString.append(Integer.toHexString(0xFF & messageDigest[i]));
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
}
