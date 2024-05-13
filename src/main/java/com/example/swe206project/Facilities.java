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


    private int roomNumber;

    //private String reservationID;

    private int capacity;
    private String genderRestriction;

    public Classroom(int roomNumber, int capacity, String genderRestriction ) {

        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.genderRestriction = genderRestriction;

    }

    @Override
    public String toString() {
        return ("Room Number: " + roomNumber + ", Capacity: " + capacity + ", Gender restriction: " + genderRestriction);
    }
}
class Labs {
    private int LabNumber;

    private int capacity;

    private String genderRestriction;

    public Labs(int LabNumber, int capacity, String genderRestriction) {
        this.LabNumber = LabNumber;
        this.capacity = capacity;
        this.genderRestriction = genderRestriction;

    }
    @Override
    public String toString() {
        if(LabNumber<1000){
            if(LabNumber<10){
                return ("Room Number: 000" + LabNumber + ", Capacity: " + capacity + ", Gender restriction: " + genderRestriction);
            }
            else {
                return ("Room Number: 00" + LabNumber + ", Capacity: " + capacity + ", Gender restriction: " + genderRestriction);

            }
        }
        else {
            return ("Room Number: " + LabNumber + ", Capacity: " + capacity + ", Gender restriction: " + genderRestriction);
        }
    }
}
