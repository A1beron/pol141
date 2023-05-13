package com.sda;

import com.sda.provider.FileUserProivder;
import com.sda.provider.UserProvider;

public class Main {

    public static void main(String[] args) {
        UserProvider userProvider = new FileUserProivder();
        userProvider.getAllUser();

    }

}
