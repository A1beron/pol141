package com.sda.view;

import com.sda.api.UserLoginData;
import com.sda.controller.LoginController;
import com.sda.controller.LoginControllerImpl;

import java.util.Scanner;

public class LoginView implements View {

    private Scanner scanner;
    private LoginController loginController;

    public LoginView() {
        this.scanner = new Scanner(System.in);
        this.loginController = new LoginControllerImpl();
    }

    @Override
    public void display() {
        loginController.login(getData()).display();
    }

    UserLoginData getData() {
        System.out.println("Podaj Login");
        String login = scanner.nextLine();
        System.out.println("Podaj hasło");
        String password = scanner.nextLine();
        return new UserLoginData(login, password);
    }

}
