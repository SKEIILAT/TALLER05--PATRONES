/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestordetareas;

import java.util.List;


public class TareaManager {
    List<Tarea> tareas;
    
    public void addTarea(Tarea tarea){
        System.out.println("Tarea agregada");
    }
    
    public void removeTarea(int tareaId){
        System.out.println("Tarea removida");
    }
    
    public Tarea getTarea(int tareaId){
        Tarea tareaSolicitada = tareas.get(tareaId);
        return tareaSolicitada;
    }
    
    public List<Tarea> getTareas(){
        return tareas;
    }
}
