package pe.uni.fiis.Horarios.bean;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;



import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by usuario on 05/06/2015.
 */
public class Excel {
    public static void main(String[] args) throws IOException {
        Workbook libro = new HSSFWorkbook();
        FileOutputStream archivo = new FileOutputStream("D:\\excel\\excel.xls");
        Sheet hoja_1 = libro.createSheet("Horario de Salidas en el Aeropuerto");
        Sheet hoja_2 = libro.createSheet("Horario de Entradas en el Aeropuerto");

        for(int f=0;f<3;f++){
            Row fila = hoja_1.createRow(f);
            Cell celda_0 = fila.createCell(0);
            Cell celda_1 = fila.createCell(1);
            Cell celda_2 = fila.createCell(2);
            Cell celda_3 = fila.createCell(3);
            if(f==0) {
                celda_0.setCellValue("Codigo_Viaje");
                celda_1.setCellValue("Nombre_Viaje");
                celda_2.setCellValue("Lugar_Destino");
                celda_3.setCellValue("Partida");
            }
            if (f==1)
            {
                celda_0.setCellValue("FD 101");
                celda_1.setCellValue("FLY GERMAN");
                celda_2.setCellValue("Peru");
                celda_3.setCellValue("Tue Apr 22 03:00");
            }
        }

        for(int f=0;f<3;f++){
            Row fila = hoja_2.createRow(f);
            Cell celda_0 = fila.createCell(0);
            Cell celda_1 = fila.createCell(1);
            Cell celda_2 = fila.createCell(2);
            Cell celda_3 = fila.createCell(3);
            if(f==0) {
                celda_0.setCellValue("Codigo_Viaje");
                celda_1.setCellValue("Nombre_Viaje");
                celda_2.setCellValue("Lugar_Origen");
                celda_3.setCellValue("Llegada");

            }
            if (f==1)
            {
                celda_0.setCellValue("JP 202");
                celda_1.setCellValue("FLY JAPAN");
                celda_2.setCellValue("RUSSIA");
                celda_3.setCellValue("Mo jun 23 12:50");
            }
        }
        libro.write(archivo);
        archivo.close();

    }

}
