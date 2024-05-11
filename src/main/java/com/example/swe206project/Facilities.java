package com.example.swe206project;

public class Facilities {

    private String facilityID;
    private String reservationID;
    private boolean isAvailable;

    private String gender;

    public Facilities(String facilityID, String reservationID, String gender) {
        this.facilityID = facilityID;
        this.reservationID = reservationID;
        this.gender = gender;
        isAvailable = true;
    }

    public String getFacilityID() {return facilityID;}

    public String getReservationID() {
        return reservationID;
    }

    public boolean checkAvailability() {
        return isAvailable;
    }

    public void setUnAvailable(){ isAvailable = false;}
    public void setAvailable(){ isAvailable = true;}
}
class Gym extends Facilities {


    public Gym(String facilityID, String reservationID, String gender) {
        super(facilityID, reservationID, gender);
    }}
class SportCourt extends Facilities {


    public SportCourt(String facilityID, String reservationID, String gender) {
        super(facilityID, reservationID, gender);
    }}
class SwimmingPool extends Facilities {


    public SwimmingPool(String facilityID, String reservationID, String gender) {
        super(facilityID, reservationID, gender);
    }}
class Classroom {
    private String roomID;
    private String reservationID;

    private String capacity;
    private String genderRestriction;

    public Classroom(String roomID, String reservationID, String capacity, String genderRestriction) {
        this.roomID = roomID;
        this.reservationID = reservationID;
        this.capacity = capacity;
        this.genderRestriction = genderRestriction;

    }
}
class Labs {
    private String roomID;
    private String reservationID;
    private String capacity;


    private String genderRestriction;

    public Labs(String roomID, String reservationID, String capacity,String genderRestriction) {
        this.roomID = roomID;
        this.reservationID = reservationID;
        this.capacity = capacity;
        this.genderRestriction = genderRestriction;

    }
}
