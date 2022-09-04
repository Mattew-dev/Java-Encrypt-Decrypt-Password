package com.main.password;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class JavaBase64 {
    
    public static void main(String[] args) {
    	
        String Provapassword = "ciao come stai?";
    	
    	//codificatore
        Encoder encoder = Base64.getEncoder();
        String passwordEncrypt = encoder.encodeToString(Provapassword.getBytes());
        System.out.println("Password Encrypt: " +passwordEncrypt);
        
        //decodificatore
        Decoder decoder = Base64.getDecoder();
        byte[] bytes = decoder.decode(passwordEncrypt);
                 
        System.out.println("Password Decrypt: " +new String(bytes));
    }
 
}
