package com.example.swe206project;

public class User {


    private String userName;
    private int userID;
    private String email;
    private String gender;


    public User(String userName, int userID, String email, String gender) {
        this.userName = userName;
        this.userID = userID;
        this.email = email;
        this.gender = gender;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userID;
    }

    public void setUserId(int userID) {
        this.userID = userID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void joinEvent(String eventName){}

}
class Admin extends User{
    public Admin(String userName, int userID, String email, String gender) {
        super(userName, userID, email, gender);
    }
    void viewAllReservations(){}
    void cancelReservation(String reservationID){}
    void sendCancelEmail(){}
}
class Faculty extends User{
    public Faculty(String userName, int userID, String email, String gender) {
        super(userName, userID, email, gender);
    }
}
class Staff extends User{
    public Staff(String userName, int userID, String email, String gender) {
        super(userName, userID, email, gender);
    }
}

class Student extends User{
    public Student(String userName, int userID, String email, String gender) {
        super(userName, userID, email, gender);
    }
}
class ClubPresident extends Student{
    public ClubPresident(String userName, int userID, String email, String gender) {
        super(userName, userID, email, gender);
    }
}