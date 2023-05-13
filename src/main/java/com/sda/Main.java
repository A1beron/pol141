package com.sda;

import com.sda.provider.FileUserProvider;
import com.sda.provider.UserProvider;

public class Main {

    public static void main(String[] args) {
        UserProvider userProvider = new FileUserProvider();
        System.out.println(userProvider.getAllUser());

    }

}
