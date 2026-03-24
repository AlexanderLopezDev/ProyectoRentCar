package com.proyectoRentCar.archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ManejoDeArchivo {
    
    public void GuardarDatos(String cadena, File archivo) {
        try {
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
            
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true));
            bw.write(cadena + "\r\n");
            bw.close();
        } catch(IOException e) {
            System.out.println(e);
        }
    }
    
}
