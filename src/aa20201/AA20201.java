/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa20201;

import aa20201.data.Grafica;
import busquedas.BusquedaSecuencial;
import busquedas.Busquedas;
import busquedas.GeneradorDatos;
import ordenamiento.Burbuja;
import java.util.Arrays;
import ordenamiento.BurbujaOptimizada;
import ordenamiento.InsertionSort;
import ordenamiento.MergeSort;
import ordenamiento.QuickSort;
/**
 *
 * @author working
 */
public class AA20201 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n = 10000;
//        int[] aux = null;
//        int[] aux1 = null;
//        int[] aux2 = null;
        int[] aux3 = null;
        int[] aux4 = null;
//        double[] tiempos = new double[n];
//        double[] tiempos1 = new double[n];
//        double[] tiempos2 = new double[n];
        double[] tiempos3 = new double[n];
        double[] tiempos4 = new double[n];
//        Burbuja b = new Burbuja();
//        BurbujaOptimizada b1 = new BurbujaOptimizada();
//        InsertionSort b2 = new InsertionSort();
        MergeSort b3 = new MergeSort();
        QuickSort b4 = new QuickSort();
        
       


        // complejidad algoritmica Sumatoria ( Generar los datos aleatorios + busqueda + almacenar el tiempo)
        for (int j = 0; j < n; j++){
//            aux = GeneradorDatos.generarArregloPeorCaso(j);
//            aux1 = GeneradorDatos.generarArregloPeorCaso(j);
//            aux2 = GeneradorDatos.generarArregloPeorCaso(j);
            aux3 = GeneradorDatos.generarArregloPeorCaso(j);
            aux4 = GeneradorDatos.generarArregloPeorCaso(j);
//            b.ordenar(aux);
//            b1.ordenar(aux1);
//            b2.ordenar(aux2);
            b3.ordenar(aux3);
            b4.ordenar(aux4, 0, aux4.length-1);
            

//            tiempos[j] = (int) b.gettTotal();
//            tiempos1[j] = (int) b1.gettTotal();
//            tiempos2[j] = (int) b2.gettTotal();
            tiempos3[j] = (int) b3.gettTotal();
            tiempos4[j] = (int) b4.gettTotal();
 
        }  
        
//        for(int element:aux){
//        System.out.println(element);
//        }
//        System.out.println(b.gettTotal());
//        System.out.println(b1.gettTotal());
//        System.out.println(b2.gettTotal());
        System.out.println(b3.gettTotal());
        System.out.println(b4.gettTotal());
        
        Grafica g1 = new Grafica("N","Tiempo","Tiempos");
//        g1.agregarSerie("Burbuja",tiempos);
//        g1.agregarSerie("BurbujaOptimizada",tiempos1);
//        g1.agregarSerie("InsertSort",tiempos2);
        g1.agregarSerie("MergeSort",tiempos3);
        g1.agregarSerie("QuickSort",tiempos4);
        g1.crearGrafica();
        g1.muestraGrafica();
       
       
    }
    
}
