package com.example.umvachsey;

import Data.User;
import Data.Users;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    public static String UserName;
    public TextField LoginTextField;
    public PasswordField PassvordTextField;

    @FXML
    protected void SignInButtonClick(ActionEvent actionEvent) throws IOException {
        if (CheckData()) {
            openMainMenu();
        } else {
            System.out.println("АААААААААААААААААААААААААААА ЖЕНЯ ПАМАГИ!!!!!!!!!!!!!!!!!");
        }
    }

    private void openMainMenu() throws IOException {
        Stage mainStage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),720,540);
        mainStage.setTitle("MyNote");
        mainStage.setScene(scene);
        mainStage.show();
    }

    private boolean CheckData() {
        for (User user : Users.userAccounts) {
            if ((user.getLogin().equals(LoginTextField.getText()))
                    && (user.getPassvord().equals(PassvordTextField.getText()))) {
                UserName=user.getName();
                return true;
            }
        }
        return false;
    }


    @FXML
    protected void SigUpButtonClick(ActionEvent actionEvent) {
    }
}