package com.mycompany.gestordetareas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class tareaManagerNotifications {
    private List<Tarea> tareas; // Lista de tareas
    private List<INotificarCanal> suscriptores; // Lista de canales suscritos

    public tareaManagerNotifications() {
        this.tareas = new ArrayList<>();
        this.suscriptores = new ArrayList<>();
    }

    // Suscribir un canal
    public void suscribir(INotificarCanal canal) {
        suscriptores.add(canal);
    }

    // Desuscribir un canal
    public void desuscribir(INotificarCanal canal) {
        suscriptores.remove(canal);
    }

    // Notificar a todos los suscriptores
    public void notificarSuscriptores(String mensaje) {
        for (INotificarCanal canal : suscriptores) {
            canal.notificar(mensaje);
        }
    }

    public void verificarVencimiento(Date fechaActual) {
        for (Tarea tarea : tareas) {
            if (!tarea.getEstado().equals("Vencido") && tarea.getFechaVencimiento().before(fechaActual)) {
                notificarSuscriptores("La tarea '" + tarea.getTitulo() + "' está próxima a vencer.");
            }
        }
    }
    public void marcar_completo(Tarea tarea) {
        tarea.setEstado("Completado");
        notificarSuscriptores("La tarea '" + tarea.getTitulo() + "' se ha completado.");
    }
    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }
}