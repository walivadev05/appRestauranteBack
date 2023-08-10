package com.livasoft.restaurante.service;

import com.livasoft.restaurante.model.Mesa;
import com.livasoft.restaurante.repository.MesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MesaServiceImpl implements MesaService {

    private final MesaRepository mesaRepository;
    @Autowired
    public MesaServiceImpl(MesaRepository mesaRepository) {
        this.mesaRepository = mesaRepository;
    }

    @Override
    public List<Mesa> listarMesas() {
        return mesaRepository.findAll();
    }

    @Override
    public Optional<Mesa> listarPorId(Integer id) {
        return mesaRepository.findById(id);
    }

    @Override
    public Mesa registrarMesa(Mesa mesa) {
        return mesaRepository.save(mesa);
    }

    @Override
    public Mesa actualizarMesa(Mesa mesa) {
        return mesaRepository.save(mesa);
    }

    @Override
    public void eliminarMesa(Integer id ) {
        this.mesaRepository.deleteById(id);
    }
}
