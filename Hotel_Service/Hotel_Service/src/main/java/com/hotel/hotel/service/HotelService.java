package com.hotel.hotel.service;

import com.hotel.hotel.entity.Hotel;

import java.util.List;

public interface HotelService {

    //create
    public Hotel createHotel(Hotel hotel);

    //getAll
    public List<Hotel> getAll();


    //getSingle
    public Hotel get(String id);

    //delete
    public void deleteHotel(String id);

}
