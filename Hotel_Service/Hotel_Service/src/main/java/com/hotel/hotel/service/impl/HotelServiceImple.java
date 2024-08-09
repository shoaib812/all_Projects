package com.hotel.hotel.service.impl;

import com.hotel.hotel.entity.Hotel;
import com.hotel.hotel.exception.ResourceNotFoundeEcxeption;
import com.hotel.hotel.repository.HotelRepository;
import com.hotel.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImple implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel createHotel(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel get(String id) {
        return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundeEcxeption(" Hotel with given id not found !!! "));
    }

    @Override
    public void deleteHotel(String id) {
        if(get(id) != null) {
            hotelRepository.deleteById(id);
        }
    }
}
