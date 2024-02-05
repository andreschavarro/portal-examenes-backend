package com.sistema.examenes.servicios;

import java.util.Set;

import com.sistema.examenes.modelo.Examen;
import com.sistema.examenes.modelo.Pregunta;

public interface PreguntaService {
	
    Pregunta agregarPregunta(Pregunta pregunta);

    Pregunta actualizarPregunta(Pregunta pregunta);

    Set<Pregunta> obtenerPreguntas();

    Pregunta obtenerPregunta(Long preguntaId);

    Set<Pregunta> obtenerPreguntasDelExamen(Examen examen);

    void eliminarPregunta(Long preguntaId);

    Pregunta listarPregunta(Long preguntaId);

}
