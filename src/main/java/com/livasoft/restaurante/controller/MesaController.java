package com.livasoft.restaurante.controller;


import com.livasoft.restaurante.service.MesaServiceImpl;
import com.livasoft.restaurante.model.Mesa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/mesas")
public class MesaController {
    @Autowired
    private MesaServiceImpl mesaService;

    @GetMapping
    public List<Mesa> listarMesas(){
        return this.mesaService.listarMesas();
    }
    @GetMapping(value="/{id}")
    public Optional<Mesa> listaPorId(@PathVariable("id") Integer id){
        return this.mesaService.listarPorId(id);
    }
    @PostMapping(consumes = "application/json",produces = "application/json")
    public Mesa registrarMesa(@RequestBody Mesa mesa){
        return this.mesaService.registrarMesa(mesa);
    }
    @PutMapping(consumes = "application/json",produces = "application/json")
    public Mesa actualizarMesa(@RequestBody Mesa mesa){
        return this.mesaService.actualizarMesa(mesa);
    }
    @DeleteMapping(value="/{id}")
    public void eliminarMesa(@PathVariable("id") Integer id){
        this.mesaService.eliminarMesa(id);
    }

}
