package com.gt.sj.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncriptarPass {
    public static void main(String[] args) { 
        var password = "0096";
        System.out.println("Password: "+password);//imprime el password original
        System.out.println("Password encriptado: "+encriptarPass(password));//imprime el password encriptado
    }
    
    //Método para encriptar password
    public static String encriptarPass(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
    
}
