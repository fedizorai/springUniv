package com.esprit.firstspring.Repositories;

import com.esprit.firstspring.entities.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReservationRepository extends CrudRepository<Reservation,Long> {
}