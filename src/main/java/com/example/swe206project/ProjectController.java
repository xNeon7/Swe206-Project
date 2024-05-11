package com.example.swe206project;

import javafx.scene.layout.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.*;
import javafx.scene.control.*;

import java.lang.reflect.Type;
import java.time.format.DateTimeFormatter;
import java.io.File;
import java.util.*;
import java.time.LocalDateTime;
import javafx.event.ActionEvent;

public class ProjectController {
    ArrayList<Reservation> Reservations = new ArrayList<>();

    @FXML
    private Button AccountButton;

    @FXML
    private ImageView AccountIcon;

    @FXML
    private Label AlreadyRegisteredLabel;

    @FXML
    private HBox EmailBar;

    @FXML
    private TextField EmailInput;

    @FXML
    private HBox GenderBar;

    @FXML
    private Button HomeButton;

    @FXML
    private ImageView HomeIcon;

    @FXML
    private Button KfupmButton;

    @FXML
    private ImageView KfupmIcon;

    @FXML
    private Button LoginButton;

    @FXML
    private Label LoginLabel;

    @FXML
    private HBox MenuBar;

    @FXML
    private PasswordField PasswordInput;

    @FXML
    private VBox RegisterBar;

    @FXML
    private Button RegisterButton;

    @FXML
    private Label RegisterLabel;

    @FXML
    private TextField SearchBar;

    @FXML
    private HBox TypeBar;

    @FXML
    private TextField UsernameInput;


    @FXML
    void HomeButtonClick(ActionEvent event) {

    }

    @FXML
    void AccountButtonClick(ActionEvent event) {
    Login();
    }

    @FXML
    void KfupmButtonClick(ActionEvent event) {

    }
    @FXML
    void RegisterButtonClick(ActionEvent event) {
        MenuBar.setVisible(true);
        RegisterBar.setVisible(false);
    }
    @FXML
    void LoginButtonClick(ActionEvent event) {
        if (LoginLabel.getText().equals("Login!")) {
            Login();
        }
        else {
            Register();
        }
    }

    public void initialize() {

    try{
        Image image = new Image(getClass().getResource("/com/example/swe206project/Home.png").toString());
        HomeIcon.setImage(image);
            Image image2 = new Image(getClass().getResource("/com/example/swe206project/Account.png").toString());
        AccountIcon.setImage(image2);
        Image image3 = new Image(getClass().getResource("/com/example/swe206project/Kfupm.png").toString());
        KfupmIcon.setImage(image3);}
            catch (Exception e) {
                System.out.println("Error loading image: " + e.getMessage());

            }
        Register();
    }
    void Register(){MenuBar.setVisible(false);
        RegisterBar.setVisible(true);
        EmailBar.setVisible(true);
        TypeBar.setVisible(true);
        GenderBar.setVisible(true);
        RegisterLabel.setText("Register");
        RegisterButton.setText("Register");
        LoginLabel.setText("Login!");
        UsernameInput.clear();
        PasswordInput.clear();
        EmailInput.clear();
        AlreadyRegisteredLabel.setText("Already Registered?");

    }
    void Login(){
        MenuBar.setVisible(false);
        RegisterBar.setVisible(true);
        EmailBar.setVisible(false);
        TypeBar.setVisible(false);
        GenderBar.setVisible(false);
        RegisterLabel.setText("Login");
        RegisterButton.setText("Login");
        LoginLabel.setText("Register!");
        AlreadyRegisteredLabel.setText("Already have an account?");
        UsernameInput.clear();
        PasswordInput.clear();
        EmailInput.clear();

    }
    public boolean findReservation(Reservation Res) {
        for (Reservation reservation : Reservations) {

            if (reservation.getReservationID().equals(Res.getReservationID())) {
                return true;
            }}
        return false;
    }
}


