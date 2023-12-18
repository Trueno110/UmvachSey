package com.example.umvachsey;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    private ObservableList<String> notes = FXCollections.observableArrayList();
    public TextField NoteTextField;
    public ListView<String> NoteTextView;
    public Label NameLable;

    public void AddClickButton(ActionEvent actionEvent) {
        notes.add(NoteTextField.getText());
        NoteTextView.setItems(notes);
    }

    public void DeleteClickButton(ActionEvent actionEvent) {
        notes.remove(notes.size()-1);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        NameLable.setText(LoginController.UserName);
        
    }
}
