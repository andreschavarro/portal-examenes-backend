package com.sistema.examenes.repositorios;


import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.examenes.modelo.Examen;
import com.sistema.examenes.modelo.Pregunta;


public interface PreguntaRepository  extends JpaRepository<Pregunta, Long>{
	
	Set<Pregunta> findByExamen(Examen examen);
	

}
