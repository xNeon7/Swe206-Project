package com.example.swe206project;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class Reservation {
    private String reservationID;
    private String userID;
    private String facilityID;
    private Date reservationDate;
    private LocalTime startingTime;
    private LocalTime endingTime;
    private String reservationReason;

    public Reservation(String reservationID, String userID, String facilityID, Date reservationDate,
                       LocalTime startingTime, LocalTime endingTime, String reservationReason) {
        this.reservationID = reservationID;
        this.userID = userID;
        this.facilityID = facilityID;
        this.reservationDate = reservationDate;
        this.startingTime = startingTime;
        this.endingTime = endingTime;
        this.reservationReason = reservationReason;


    }


    public String getReservationID(){return reservationID;}

 class Event extends Reservation{
    private String eventName;
    private int requiredParticipants;
    private int currentParticipants;
     public Event(String reservationID, String userID, String facilityID, Date reservationDate,
                  LocalTime startingTime, LocalTime endingTime, String reservationReason,
                  String eventName, int requiredParticipants, int currentParticipants) {
         super(reservationID, userID, facilityID, reservationDate, startingTime, endingTime, reservationReason);
         this.eventName = eventName;
         this.requiredParticipants = requiredParticipants;
         this.currentParticipants = currentParticipants;


     }
         public void openEvent(String eventName){}

 }}