package com.fiap.ec.backend_consultas.service;

import com.fiap.ec.backend_consultas.model.Paciente;
import com.fiap.ec.backend_consultas.repository.PacienteRepository;

import java.util.List;

public class PacienteService {
    private final PacienteRepository repository;

    public PacienteService(PacienteRepository repository) {
        this.repository = repository;
    }

    public Paciente salvar(Paciente especialidade) {
        return repository.save(especialidade);
    }

    public List<Paciente> listar() {
        return repository.findAll();
    }
}
