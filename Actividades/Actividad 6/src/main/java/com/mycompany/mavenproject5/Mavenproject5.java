/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;

    import com.itextpdf.text.Document;
    import com.itextpdf.text.pdf.PdfWriter;
    import com.itextpdf.text.pdf.PdfPTable;
    import com.itextpdf.text.Paragraph;
    import com.itextpdf.text.DocumentException;
    import java.io.IOException;
    import java.io.FileOutputStream;
    import com.itextpdf.text.BaseColor;
    import com.itextpdf.text.pdf.PdfPCell;

/**
 *
 * @author mynor
 */
public class Mavenproject5 {

     public static void main(String[] args) {
        int i,j;
        String[][] Paises = {
            {"Guatemala","Ciudad de Guatemala","17"},
            {"Mexico","Ciudad de Mexico","126"},
            {"España","Madrid","47"},
            {"Japon","Tokio","125"},
        };
        try {
           Document PDF = new Document();
           PdfWriter.getInstance(PDF, new FileOutputStream("Actividad6.pdf"));
           PDF.open();
           PDF.add(new Paragraph("INFORMACION DE ALGUNOS PAISES"));
           PDF.add(new Paragraph(" ")); 
           PdfPTable tabla = new PdfPTable(3);       
           tabla.setWidthPercentage(100);
           tabla.setWidths(new float[]{3, 1, 2});
           PdfPCell celda1 = new PdfPCell(new Paragraph("Pais"));
           celda1.setBackgroundColor(BaseColor.ORANGE);
           tabla.addCell(celda1);
           PdfPCell celda2 = new PdfPCell(new Paragraph("Capital"));
           celda2.setBackgroundColor(BaseColor.ORANGE);
           tabla.addCell(celda2);
           PdfPCell celda3 = new PdfPCell(new Paragraph("Poblacion (En millones)"));
           celda3.setBackgroundColor(BaseColor.ORANGE);
           tabla.addCell(celda3);
           for (i = 0; i < Paises.length; i++) {
             for (j = 0; j < Paises[i].length; j++) {
                tabla.addCell(Paises[i][j]);
             }
           }
           PDF.add(tabla);
           PDF.close();
           System.out.println("El documento se ha creado con exito");
           
        }catch (DocumentException | java.io.IOException e){
            System.out.println("ERROR: No se pudo crear el archivo");
        }    
    }
}

