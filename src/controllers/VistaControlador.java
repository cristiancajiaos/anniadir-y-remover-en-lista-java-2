package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.VistaModelo;
import view.Vista;

public class VistaControlador implements ActionListener {
    private Vista vista;
    private VistaModelo vistaModelo;

    public VistaControlador(Vista vista, VistaModelo vistaModelo) {
        this.vista = vista;
        this.vistaModelo = vistaModelo;
        this.vista.btnAgregarLista.addActionListener(this);
        this.vista.btnRemoverLista.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vista.btnAgregarLista) {
            String textoAgregarLista = this.vista.campoAgregarLista.getText();
            this.vista.lista.setText(this.vistaModelo.agregarLista(textoAgregarLista).toString());
            this.vista.campoAgregarLista.setText("");
        } else if (e.getSource() == this.vista.btnRemoverLista) {
            String textoRemoverLista = this.vista.campoRemoverLista.getText();
            this.vista.lista.setText(this.vistaModelo.removerTextoDeLista(textoRemoverLista).toString());
            this.vista.campoRemoverLista.setText("");
        }
    }
    

}
