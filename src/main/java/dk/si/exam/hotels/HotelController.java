package dk.si.exam.hotels;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dk.si.exam.hotels.Hotel;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelRepo repo;
    private Hotel Hotel;

    @GetMapping("/hotels")
    public List<Hotel> getAllHotels(){
        return (List<Hotel>) repo.findAll();
    }

}
