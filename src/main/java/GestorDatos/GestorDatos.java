package GestorDatos;


import modelo.*;

import java.io.*;
import java.util.List;

public class GestorDatos {
    public static void leerArchivoLibros(Biblioteca biblioteca, String direccionArchivo) {
        String textoArchivo = "";
        try {
            File archivo = new File(direccionArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            while ((textoArchivo = br.readLine()) != null) {
                String[] data = textoArchivo.split(",");
                biblioteca.agregarLibro(new Libro(data[0], data[1]));
            }
        } catch (Exception e) {
            System.out.println("Documento no disponible, favor contactar con administrador");
        }
    }

    public static boolean registrarLibro(Libro libro, String direccionArchivo) {
        boolean lineaVacia = false;
        try {
            File file = new File(direccionArchivo);
            if (!file.exists()) {
                file.createNewFile();
                lineaVacia = true;
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);

            if (!lineaVacia) {
                bw.newLine();
            }
            bw.write(libro.getNombreLibro() + "," + libro.getAutor());
            bw.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error al ingresar dato, favor contactar con administrador");
            return false;
        }
    }

    // Puedes agregar métodos similares para usuarios, bibliotecarios y préstamos
}
