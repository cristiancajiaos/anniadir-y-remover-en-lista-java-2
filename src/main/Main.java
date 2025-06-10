package main;

import controllers.VistaControlador;
import models.VistaModelo;
import view.Vista;

public class Main {
    public static void main(String[] args) {
        Vista vista = new Vista();
        VistaModelo vistaModelo = new VistaModelo();
        VistaControlador vistaControlador = new VistaControlador(vista, vistaModelo);
        vista.setVisible(true);
    }

}
