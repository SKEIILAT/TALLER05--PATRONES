package com.mycompany.gestordetareas;

public class VistaListaSimple implements VistaStrategy{
  @Override
  public void VisualizarTarea(Tarea tarea){
    System.out.println("Se visualiza la lista simple");
  }
}
