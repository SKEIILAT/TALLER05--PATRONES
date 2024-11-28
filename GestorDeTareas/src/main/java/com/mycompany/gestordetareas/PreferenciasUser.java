package com.mycompany.gestordetareas;

import java.util.HashMap;
import java.util.Map;

public class PreferenciasUser {
    private Map<String, Boolean> preferencias; // Canal -> Activado/Desactivado

    public PreferenciasUser() {
        // Inicializar preferencias con todos los canales desactivados por defecto
        preferencias = new HashMap<>();
        preferencias.put("correo", false);
        preferencias.put("sms", false);
    }

    // Habilitar un canal
    public void habilitarCanal(String canal) {
        if (preferencias.containsKey(canal)) {
            preferencias.put(canal, true);
        } else {
            throw new IllegalArgumentException("Canal no válido: " + canal);
        }
    }

    // Deshabilitar un canal
    public void deshabilitarCanal(String canal) {
        if (preferencias.containsKey(canal)) {
            preferencias.put(canal, false);
        } else {
            throw new IllegalArgumentException("Canal no válido: " + canal);
        }
    }

    // Configurar canales en el TaskManagerNotifications
    public void configuracionCanal(tareaManagerNotifications taskManager) {
        if (preferencias.get("correo")) {
            taskManager.suscribir(new Correo());
        }
        if (preferencias.get("sms")) {
            taskManager.suscribir(new SMS());
        }
    }
}

