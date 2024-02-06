package com.sistema.examenes.servicios;

import java.util.List;
import java.util.Set;

import com.sistema.examenes.modelo.Examen;


public interface ExamenService{

    Examen agregarExamen(Examen examen);

	Examen actualizarExamen(Examen examen);

	Set<Examen> obtenerExamenes();

	Examen obtenerExamen(Long examenId);

	void eliminarExamen(Long examenId);

	List<Examen> obtenerExamenesActivos();

}



