package com.esprit.firstspring.Controller;
import com.esprit.firstspring.Services.IReservationService;
import com.esprit.firstspring.entities.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
    @Autowired
    IReservationService reservationService;

    @GetMapping("/get-all")
    public List<Reservation> retrieveAllReservations(){
        return reservationService.retrieveAllReservations();
    }
    @PutMapping("/update-reservation")
    public Reservation updateReservation(Reservation res){
        return reservationService.updateReservation(res);
    }

    @GetMapping("/get-reservation/{id}")
    public Reservation retrieveReservation(@PathVariable("id") Long id){
        return reservationService.retrieveReservation(id);
    }
}
