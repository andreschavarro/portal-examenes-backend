package com.sistema.examenes.repositorios;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.examenes.modelo.Categoria;
import com.sistema.examenes.modelo.Examen;
import com.sistema.examenes.modelo.Pregunta;

public interface ExamenRepository extends JpaRepository<Examen,Long>{
	
	List<Examen> findByCategoria(Categoria categoria);
	
	List<Examen> findByActivo(Boolean estado);
	
	List<Examen> findByCategoriaAndActivo(Categoria categoria,Boolean estado);
				

}
