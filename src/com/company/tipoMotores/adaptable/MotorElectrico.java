package com.company.tipoMotores.adaptable;

public class MotorElectrico {
    private boolean conectado = false;

    public MotorElectrico() {
        System.out.println("Creando motor eléctrico...");
        this.conectado = false;
    }

    public void conectar() {
        System.out.println("Conectando motor eléctrico...");
        this.conectado = true;
    }

    public void activar() {
        if(!this.conectado) {
            System.out.println("No se puede activar porque no está conectado el motor eléctrico...");
        }
        else {
            System.out.println("Está conectado, activando motor eléctrico...");
        }
    }

    public void moverMasRapido() {
        if(!this.conectado) {
            System.out.println("No se puede mover rápido el motor eléctrico porque no está conectado...");
        }
        else {
            System.out.println("Moviendo más rápido, aumentando voltaje del motor eléctrico...");
        }
    }

    public void detener() {
        if(!this.conectado) {
            System.out.println("No se puede detener el motor eléctrico porque no está conectado...");
        }
        else {
            System.out.println("Deteniendo motor eléctrico...");
        }
    }

    public void desconectar() {
        System.out.println("Desconectando motor eléctrico...");
        this.conectado = false;
    }
}
