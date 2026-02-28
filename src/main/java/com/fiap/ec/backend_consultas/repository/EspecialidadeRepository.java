package com.fiap.ec.backend_consultas.repository;

import com.fiap.ec.backend_consultas.model.Especialidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecialidadeRepository extends JpaRepository<Especialidade, Long> {
}
