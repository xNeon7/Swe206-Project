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
    private HBox AdminButtonsHbox;

    @FXML
    private Label AlreadyRegisteredLabel;

    @FXML
    private HBox ButtonsHbox;

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
    private HBox ImagesHbox;

    @FXML
    private Button KfupmButton;

    @FXML
    private ImageView KfupmIcon;

    @FXML
    private Label LiketodoLabel;

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
    private Label RegisterErrorLabel;

    @FXML
    private Label RegisterLabel;

    @FXML
    private TextField SearchBar;

    @FXML
    private HBox TypeBar;
    @FXML
    private AnchorPane ReservationInfoPage;

    @FXML
    private AnchorPane ChoicePage;

    @FXML
    private TextField DateInput;
    @FXML
    private TextField StartTimeInput;
    @FXML
    private TextField EndTimeInput;
    @FXML
    private TextField ReservationReasonInput;
    @FXML
    private Label SuccessLabel;

    @FXML
    private TextField UsernameInput;

    @FXML
    private Label WelcomeLabel;
    @FXML

    private ImageView ClassroomImage;
    @FXML

    private ImageView GymImage;
    @FXML

    private ImageView LabImage;
    @FXML
    private ImageView SwimImage;

    @FXML
    void MakeReservationButtonClick(ActionEvent event) {
    ChoicePage.setVisible(true);
    HideHomepage();
    }

    @FXML
    void OpenReservationEventButtonClick(ActionEvent event) {

    }
    @FXML
    void JoinReservationEventButtonClick(ActionEvent event) {

    }
    @FXML
    void ViewAllReservationsButtonClick(ActionEvent event) {

    }

    @FXML
    void CancelReservationButtonClick(ActionEvent event) {

    }
    @FXML
    void HomeButtonClick(ActionEvent event) {
    Homepage();
    }

    @FXML
    void AccountButtonClick(ActionEvent event) {
    Login();
    ChoicePage.setVisible(false);
    ReservationInfoPage.setVisible(false);
    }

    @FXML
    void KfupmButtonClick(ActionEvent event) {

    }
    @FXML
    void RegisterButtonClick(ActionEvent event) {
        Homepage();
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
    @FXML
    void ConfirmButtonClick(ActionEvent event) {
    Homepage();
    SuccessLabel.setVisible(true);

    }

    @FXML
    void ExClick(ActionEvent event) {
        ReservationInfoPage.setVisible(true);
        ChoicePage.setVisible(false);

    }
    public void initialize() {

        try {
            initializeImages();
        }catch (Exception e) {
            System.out.println("Error loading image: " + e.getMessage());
        }
            Register();
        }

    void Register () {
        MenuBar.setVisible(false);
        RegisterBar.setVisible(true);
        EmailBar.setVisible(true);
        TypeBar.setVisible(true);
        GenderBar.setVisible(true);
        HideHomepage();
        RegisterLabel.setText("Register");
        RegisterButton.setText("Register");
        LoginLabel.setText("Login!");
        UsernameInput.clear();
        PasswordInput.clear();
        EmailInput.clear();
        AlreadyRegisteredLabel.setText("Already Registered?");

        }
    void Login () {
        MenuBar.setVisible(false);
        RegisterBar.setVisible(true);
        EmailBar.setVisible(false);
        TypeBar.setVisible(false);
        GenderBar.setVisible(false);
        HideHomepage();
        RegisterLabel.setText("Login");
        RegisterButton.setText("Login");
        LoginLabel.setText("Register!");
        AlreadyRegisteredLabel.setText("Dont have an account?");
        UsernameInput.clear();
        PasswordInput.clear();
        EmailInput.clear();

    }
    void Homepage () {
        MenuBar.setVisible(true);
        RegisterBar.setVisible(false);
        ImagesHbox.setVisible(true);
        ButtonsHbox.setVisible(true);
        LiketodoLabel.setVisible(true);
        WelcomeLabel.setVisible(true);
        ChoicePage.setVisible(false);
        ReservationInfoPage.setVisible(false);
        SuccessLabel.setVisible(false);
    }
    void HideHomepage(){
        ImagesHbox.setVisible(false);
        ButtonsHbox.setVisible(false);
        LiketodoLabel.setVisible(false);
        WelcomeLabel.setVisible(false);
        AdminButtonsHbox.setVisible(false);
    }
    public boolean findReservation (Reservation Res){
        for (Reservation reservation : Reservations) {

            if (reservation.getReservationID().equals(Res.getReservationID())) {
                return true;
            }
        }
        return false;
    }
    void initializeImages () { Image image = new Image(getClass().getResource("/com/example/swe206project/Home.png").toString());
        HomeIcon.setImage(image);
        Image image2 = new Image(getClass().getResource("/com/example/swe206project/Account.png").toString());
        AccountIcon.setImage(image2);
        Image image3 = new Image(getClass().getResource("/com/example/swe206project/Kfupm.png").toString());
        KfupmIcon.setImage(image3);
        Image image4 = new Image(getClass().getResource("/com/example/swe206project/Lab.jpg").toString());
        LabImage.setImage(image4);
        Image image5 = new Image(getClass().getResource("/com/example/swe206project/Classroom.Jpg").toString());
        ClassroomImage.setImage(image5);
        Image image6 = new Image(getClass().getResource("/com/example/swe206project/Gym.jpg").toString());
        GymImage.setImage(image6);
        Image image7 = new Image(getClass().getResource("/com/example/swe206project/Swim.jpg").toString());
        SwimImage.setImage(image7);


    }

}


