package com.esprit.firstspring.Repositories;


import com.esprit.firstspring.entities.Chambre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IChambreRepository extends CrudRepository<Chambre,Long> {
}