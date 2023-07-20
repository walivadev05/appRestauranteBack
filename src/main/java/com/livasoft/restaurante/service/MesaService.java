package com.livasoft.restaurante.service;

import com.livasoft.restaurante.model.Mesa;
import com.livasoft.restaurante.repository.MesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MesaService {

    private final MesaRepository mesaRepository;
    @Autowired
    public MesaService(MesaRepository mesaRepository) {
        this.mesaRepository = mesaRepository;
    }

    public List<Mesa> getMesas(){
        return this.mesaRepository.findAll();
    }
    public void newMesa(Mesa mesa) {
        //this.mesaRepository.save(mesa);
        /*Optional<Mesa> res = mesaRepository.findMesaByName(mesa.getNombre());
        if (res.isPresent()){
            throw new IllegalStateException("Ya existe la mesa");
        }*/
        this.mesaRepository.save(mesa);
    }
}
