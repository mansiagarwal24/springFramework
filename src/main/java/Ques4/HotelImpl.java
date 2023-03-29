/*
    Get a Spring Bean from application context and display its properties.
*/

package Ques4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

interface Hotel{
    void rating();
}
@Component
class Leela implements Hotel{
    @Override
    public void rating() {
        System.out.println("5 star rating");
    }
}

class JWMarriot implements Hotel{
    @Override
    public void rating() {
        System.out.println("7 star rating");
    }
}
@Component
public class HotelImpl {
    private String hotelName;
    private String location;
    @Autowired
    Hotel hotel;

    public String getHotelName() {
        return hotelName;
    }

//    public HotelImpl(String hotelName, String location) {
//        this.hotelName = hotelName;
//         this.location = location;
//    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public void getHotel(){
        hotel.rating();
    }
}
