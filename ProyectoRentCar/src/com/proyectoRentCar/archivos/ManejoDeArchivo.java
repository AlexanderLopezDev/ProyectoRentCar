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
        
        File archivoN = new File("archivoTemp.txt");
        
        try (
            BufferedReader br = new BufferedReader(new FileReader(archivoA));
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoN))
        ) {
            String linea;
            while ((linea = br.readLine()) != null) {
                
                String datos[] = linea.split(";");
                String datosA[] = cadenaA.split(";");
                
                if (datos[0].equals(datosA[0])) {
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
    
    public String[] BuscarDatos(String valor, File archivo) {
        
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        
        try (BufferedReader br = new BufferedReader(new FileReader (archivo))) {
            
            String linea;
            while((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) continue;
                String datos[] = linea.split(";");
                
                if (datos.length < 1) continue;
                
                String valorG = datos[0];
                
                if (valorG.equals(valor)) {
                    return datos;
                }
            }
        } catch(IOException e) {
            System.out.println(e);
        }
        return null;
    }
    
}
