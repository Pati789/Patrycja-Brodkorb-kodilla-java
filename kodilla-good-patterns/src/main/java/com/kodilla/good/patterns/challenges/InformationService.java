package com.kodilla.good.patterns.challenges;

import java.sql.SQLOutput;

public class InformationService {
    public void inform (String name, String mail, String userName) {
        System.out.println("E-mail send to: " + mail + ":" +  "\n" + name + ", \nThank you for choosing our shop!" +"\n" + userName);
    }
}
