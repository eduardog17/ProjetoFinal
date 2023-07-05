package com.example.projetofinallll.Controller;

import com.example.projetofinallll.Entity.Maratonista;
import com.example.projetofinallll.Service.MaratonistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v2")
public class ControllerMaratonista {

    @Autowired
    private MaratonistaService maratonistaService;

    @PostMapping("maratonista")
    public ResponseEntity<Maratonista> salvarMaratonista (@RequestBody Maratonista maratonista){
        return ResponseEntity.status(HttpStatus.CREATED).body(maratonistaService.salvarMaratonista(maratonista));
    }
    @GetMapping("maratonista/{id}")
    public Maratonista buscarMaratonistaPorId(@PathVariable long id){
        return maratonistaService.buscarMaratonista(id);

    }
    @GetMapping("maratonistas")
    public List<Maratonista> ListarMaratonista(){ return maratonistaService.listarMaratonista();}
}

