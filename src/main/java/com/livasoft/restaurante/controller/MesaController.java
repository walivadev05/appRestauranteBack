package com.livasoft.restaurante.controller;


import com.livasoft.restaurante.service.MesaService;
import com.livasoft.restaurante.model.Mesa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/mesas")
public class MesaController {
    private final MesaService mesaService;

    @Autowired
    public MesaController(MesaService mesaService) {
        this.mesaService = mesaService;
    }

    @GetMapping
    public  List<Mesa> getMesas(){
        return this.mesaService.getMesas();
    }
    @PostMapping
    public void saveMesa(@RequestBody Mesa mesa){
        this.mesaService.newMesa(mesa);
    }

}
