package com.esprit.firstspring.Controller;

import com.esprit.firstspring.Services.IBlocService;
import com.esprit.firstspring.entities.Bloc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
public class BlocController {
    @Autowired
    IBlocService blocService;

    @GetMapping("/get-all")
    public List<Bloc> getAll(){
        return blocService.retrieveBlocs();
    }

    @PostMapping("/add-Bloc")
    public Bloc addBlocs(@RequestBody Bloc bloc){
        return blocService.addBloc(bloc);
    }

    @PutMapping("/update-Bloc")
    public Bloc updateBloc(@RequestBody Bloc f){
        return blocService.updateBloc(B);
    }

    @GetMapping("/get-Bloc/{id}")
    public Bloc getBloc(@PathVariable("id") Long id){
        return blocService.retrieveBloc(id);
    }
    @DeleteMapping("/delete-Bloc/{id}")
    public void removeBloc(@PathVariable("id") Long id){
        blocService.removeBloc(id);
    }

}