package com.fmh.hotel.HotelService.services;

import com.fmh.hotel.HotelService.entities.Hotel;

import java.util.List;

public interface HotelService {

    //Create
    Hotel create(Hotel hotel);

    //Get All
    List<Hotel> getAll();

    //Get Single
    Hotel get(String id);
}
