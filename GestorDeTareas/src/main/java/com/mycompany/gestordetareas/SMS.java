package com.mycompany.gestordetareas;

public class SMS implements INotificarCanal {
    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificación por SMS: " + mensaje);
    }
}
