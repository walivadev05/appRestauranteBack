package com.livasoft.restaurante.service;

import com.livasoft.restaurante.model.Mesa;

import java.util.List;
import java.util.Optional;

public interface MesaService {
    List<Mesa> listarMesas();
    Optional<Mesa> listarPorId(Integer id);
    Mesa registrarMesa(Mesa mesa);
    Mesa actualizarMesa(Mesa mesa);
    void eliminarMesa(Integer id);
}
