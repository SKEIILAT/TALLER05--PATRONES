package com.mycompany.gestordetareas;

public class Correo implements INotificarCanal {
    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificación por correo: " + mensaje);
    }
}