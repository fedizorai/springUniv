package com.esprit.firstspring.Repositories;

import com.esprit.firstspring.entities.Universite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUniversiteRepository extends CrudRepository<Universite,Long> {
}