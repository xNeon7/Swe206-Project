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

import javax.swing.text.View;

public class  ProjectController {
    ArrayList<Reservation> Reservations = new ArrayList<>();

    @FXML
    private Button AccountButton;
    @FXML
    private RadioButton rMale, rFemale;
    @FXML
    private RadioButton rStudent, rFaculty, rStaff;
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
    private ImageView SportCourt;

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
    private Button JoinButton;

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
    private AnchorPane JoinEventPage;

    @FXML
    private Label RoomIDLabel;

    @FXML
    private Label ReservationErrorInfoLabel;

    @FXML
    private TextField RoomIDInput;
    @FXML
    private TextField ParticipantsInput;
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
    private Label EnterEventLabel;

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
    private AnchorPane ViewEventsPage;

    @FXML
    void JoinButtonClick(ActionEvent event){
        SuccessLabel.setText("You have registered in an event!");
        JoinEventPage.setVisible(false);
        Homepage();

    }
    @FXML
    void MakeReservationButtonClick(ActionEvent event) {
    ChoicePage.setVisible(true);
    HideHomepage();
    ImagesHbox.setVisible(true);
    SuccessLabel.setVisible(false);
    SuccessLabel.setText("You have Successfully made a Reservation");
    }

    @FXML
    void OpenReservationEventButtonClick(ActionEvent event) {
        ChoicePage.setVisible(true);
        HideHomepage();
        ImagesHbox.setVisible(true);
        SuccessLabel.setVisible(false);
        SuccessLabel.setText("You have Successfully Opened a Reservation Event");

    }
    @FXML
    void JoinReservationEventButtonClick(ActionEvent event) {
        HideHomepage();
        JoinEventPage.setVisible(true);
        JoinButton.setText("Join Event");
        EnterEventLabel.setText("Enter the Name of the Event you Would like to Join");
        SuccessLabel.setText("You have Successfully Joined an Event");
    }
    @FXML
    void ViewAllReservationsButtonClick(ActionEvent event) {
        HideHomepage();
        ViewEventsPage.setVisible(true);
    }

    @FXML
    void CancelReservationButtonClick(ActionEvent event) {
        JoinEventPage.setVisible(true);
        HideHomepage();
        JoinButton.setText("Cancel Reservation");
        EnterEventLabel.setText("Enter the Name of the Event you Would like to Remove");
        SuccessLabel.setText("You have Cancelled a Reservation");


    }
    @FXML
    void HomeButtonClick(ActionEvent event) {
    Homepage();
    clearInputs();
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
    clearInputs();

    }

    @FXML
    void ClassroomButtonClick(ActionEvent event) {
        ReservationInfoPage.setVisible(true);
        ChoicePage.setVisible(false);
        ImagesHbox.setVisible(false);
    }
    @FXML
    void ComputerLabButtonClick(ActionEvent event) {
        ReservationInfoPage.setVisible(true);
        ChoicePage.setVisible(false);
        ImagesHbox.setVisible(false);
    }
    @FXML
    void SportCourtButtonClick(ActionEvent event) {
        ReservationInfoPage.setVisible(true);
        ChoicePage.setVisible(false);
        ImagesHbox.setVisible(false);
    }
    @FXML
    void GymButtonClick(ActionEvent event) {
        ReservationInfoPage.setVisible(true);
        ChoicePage.setVisible(false);
        ImagesHbox.setVisible(false);
    }
    @FXML
    void SwimmingPoolButtonClick(ActionEvent event) {
        ReservationInfoPage.setVisible(true);
        ChoicePage.setVisible(false);
        ImagesHbox.setVisible(false);

    }
    @FXML
    public String getGender() {
        if (rMale.isSelected()) {
            return "Male";
        } else if (rFemale.isSelected()) {
            return "Female";
        } else {
            return null;
        }
    }
    public String getType() {
        if (rStudent.isSelected()) {
            return "Student selected";
        } else if (rFaculty.isSelected()) {
            return "Faculty selected";
        } else if (rStaff.isSelected()) {
            return "Staff selected";
        } else {
            return null;
        }
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
        clearRadioButtons();
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
        clearRadioButtons();
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
        JoinEventPage.setVisible(false);
        ViewEventsPage.setVisible(false);
    }
    void HideHomepage(){
        ImagesHbox.setVisible(false);
        ButtonsHbox.setVisible(false);
        LiketodoLabel.setVisible(false);
        WelcomeLabel.setVisible(false);
        AdminButtonsHbox.setVisible(false);
    }
    public void clearRadioButtons() {
        rMale.setSelected(false);
        rFemale.setSelected(false);
        rStudent.setSelected(false);
        rFaculty.setSelected(false);
        rStaff.setSelected(false);
    }
    public void clearInputs(){
        ReservationReasonInput.clear();
        DateInput.clear();
        StartTimeInput.clear();
        EndTimeInput.clear();
        ParticipantsInput.clear();
        RoomIDInput.clear();


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
        Image image8 = new Image(getClass().getResource("/com/example/swe206project/SportCourt.jpg").toString());
        SportCourt.setImage(image8);

    }

}


