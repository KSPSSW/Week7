package com.mycompany.usermanagement;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kissa
 */
public class TestUser {
    public static void main(String[] args) {
        User admin = new User(1,"admin","Administrator","pass@1234",'M','A');
        User user1 = new User(2,"user1","User1","pass@1234",'F','U');
        User user2 = new User(3,"user2","User2","pass@1234",'M','U');
        ArrayList<User> userList = new ArrayList<>(); // Generic type 
        userList.add(admin);
        userList.add(user1);
        userList.add(user2);
        for(int i = 0;i<userList.size();i++){
            System.out.println(userList.get(i));
        }
        
       
    }
}
