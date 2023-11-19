package pdf;

import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import modelo.Libro;

import java.io.FileOutputStream;
import java.util.List;

class GeneradorPDF {
    public static void generarPDFBiblioteca(List<Libro> libros, String nombreArchivo) {
        try (PdfWriter writer = new PdfWriter(new FileOutputStream(nombreArchivo + ".pdf"));
             PdfDocument pdf = new PdfDocument(writer);
             Document document = new Document(pdf, PageSize.A4)) {

            document.add(new Paragraph("Lista de Libros en la Biblioteca:"));
            document.add(new Paragraph("\n")); // Salto de línea

            for (Libro libro : libros) {
                document.add(new Paragraph("Nombre: " + libro.getNombreLibro()));
                document.add(new Paragraph("Autor: " + libro.getAutor()));
                document.add(new Paragraph("------"));
                document.add(new Paragraph("\n")); // Salto de línea
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Supongamos que tienes una lista de libros en tu biblioteca
        List<Libro> librosEnBiblioteca = obtenerLibrosDesdeTuBiblioteca();

        // Llama al método para generar el PDF
        generarPDFBiblioteca(librosEnBiblioteca, "ListaLibrosBiblioteca");
    }

    // Método de ejemplo para obtener libros (ajústalo según tu implementación real)
    private static List<Libro> obtenerLibrosDesdeTuBiblioteca() {
        // Aquí deberías obtener la lista de libros de tu biblioteca
        // Supongamos que ya tienes una lista creada para el ejemplo
        return List.of(
                new Libro("Libro1", "Autor1"),
                new Libro("Libro2", "Autor2"),
                new Libro("Libro3", "Autor3")
        );
    }
}

