package com.proyectoRentCar.archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManejoDeArchivo {
    
    public void GuardarDatos(String cadena, File archivo) {
        try {
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo,true))) {
                bw.write(cadena);
                bw.newLine();
            }
                
        } catch(IOException e) {
            System.out.println(e);
        }
    }
    
    public void ModificarDatos(String cadenaA, String cadenaN, File archivoA) { 
        
        File archivoN = new File("archivoTemp");
        
        try (
            BufferedReader br = new BufferedReader(new FileReader(archivoA));
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoN))
        ) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.equals(cadenaA)) {
                    bw.write(cadenaN);
                } else {
                    bw.write(linea);
                } 
                bw.newLine();
            }
        }catch (IOException e) {
            System.out.println(e);
            return;
        } 
        
        if (!archivoA.delete()) {
            System.out.println("No se pudo borrar el archivo original");
        return;
        }
        
         if (!archivoN.renameTo(archivoA)) {
            System.out.println("No se pudo renombrar el archivo");
        }
        
    }
    
    public void BorrarDatos(File f) {
        try {
            if (f.exists()) {
                f.delete();
            }
        }  catch(Exception e) {
            System.out.println(e);
        }
    }
    
}
