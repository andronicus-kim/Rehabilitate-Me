package com.andronicus.rehabilitateme;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andronicus on 3/31/2018.
 */

public class ActivityUtil {

    public static List<User> getUsersList(){
        List<User> users = new ArrayList<>();
        User user1 = new User("Duncan",23,"Smoking");
        User user2 = new User("Leah",26,"Cocaine");
        User user3 = new User("Ahmed",18,"Heroine");
        User user4 = new User("Rachel",21,"Alcohol");
        User user5 = new User("David",43,"Alcohol");
        User user6 = new User("Kevin",18,"Cocaine");
        User user7 = new User("Maggy",28,"Smoking");
        User user8 = new User("Chris",19,"LSD");
        User user9 = new User("Moses",28,"Alcohol");
        User user10 = new User("Susan",30,"LSD");
        User user11 = new User("Grace",23,"Alcohol");
        User user12 = new User("Joe",34,"Alcohol");
        User user13 = new User("Juma",52,"Tobacco");
        User user14 = new User("Jane",32,"Alcohol");
        User user15 = new User("Skyler",24,"Smoking");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);
        users.add(user11);
        users.add(user12);
        users.add(user13);
        users.add(user14);
        users.add(user15);
        return users;
    }
}
