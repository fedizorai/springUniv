package com.esprit.firstspring.Repositories;

import com.esprit.firstspring.entities.Bloc;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlocRepository extends CrudRepository<Bloc,Long> {
}
