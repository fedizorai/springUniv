package com.esprit.firstspring.Repositories;



import com.esprit.firstspring.entities.Etudiant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IEtudiantRepository extends CrudRepository<Etudiant,Long> {
}