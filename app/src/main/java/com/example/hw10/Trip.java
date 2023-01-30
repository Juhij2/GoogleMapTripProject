package com.example.hw10;

import com.google.type.LatLng;

import java.io.Serializable;
/*
Assignment: InClass10
    Name: Juhi Jayant Jadhav
    Name: Saifuddin Mohammed
    Group No: 05
    File Name: Trip.java
 */
public class Trip implements Serializable {

    public String id;
    public String desc;
    public String startDateTime;
    public String endDateTime;
    public Double startLat;
    public Double startLng;
    public Double endLat;
    public Double endLng;
    public String userId;
    public String status;
    public String distance;
}
