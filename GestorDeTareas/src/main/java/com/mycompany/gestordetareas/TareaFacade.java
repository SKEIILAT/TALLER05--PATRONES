/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestordetareas;

import java.util.Date;
import java.util.List;

public class TareaFacade {
    public void createTarea(int id, String title, String description, Date dueDate, int priority, String status){
        System.out.println("Tarea Creada");
    }
    
    public void updateTarea(int id, String title, String description, Date dueDate, int priority, String status){
        System.out.println("Tarea actualizada");
    }
    
    public void deleteTarea(int tareaId){
        System.out.println("Tarea eliminada");
    }
    
    public List<Tarea> listAllTarea(){
        return null;
    }
}
