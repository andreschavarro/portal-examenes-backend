package com.sistema.examenes.repositorios;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.examenes.modelo.Examen;
import com.sistema.examenes.modelo.Pregunta;

public interface ExamenRepository extends JpaRepository<Examen,Long>{
				

}
