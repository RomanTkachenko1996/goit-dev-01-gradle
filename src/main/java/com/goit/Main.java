package com.goit;

import com.goit.dto.User;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        String name = new GsonBuilder()
                .setPrettyPrinting()
                .create()
                .toJson(new User("Roman","Tkachenko"));
        System.out.println(name);
    }
}