/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestordetareas;

import java.util.Date;

/**
 *
 * @author USUARIO
 */
public abstract class Tarea {
    private int id;
    private String titulo;
    private String descripcion;
    private int prioridad;
    private Date fechaVencimiento;
    private String estado;
    
    public abstract void visualizarTarea(VistaStrategy v);

    
}
