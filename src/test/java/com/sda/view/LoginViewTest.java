package com.sda.view;

import com.sda.api.UserLoginData;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.assertj.core.api.Assertions.assertThat;

class LoginViewTest {

    private final UserLoginData exampleUserLoginData = new UserLoginData(
            "testUser",
            "testPassword"
    );

    @Test
    void shouldProvideUserLoginDataBasedOnScannerInput() throws FileNotFoundException {
        //when
        LoginView loginView = new LoginView(
                new File("src/test/resources/login_test_input")
        );
        //then
        assertThat(exampleUserLoginData).isEqualTo(loginView.getData());
    }

}