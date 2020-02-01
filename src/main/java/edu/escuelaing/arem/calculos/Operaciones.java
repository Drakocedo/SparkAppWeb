package edu.escuelaing.arem.calculos;

import java.util.List;

public class Operaciones {
	
        /**
         * @param datos lista de lo numeros a calcular
         * @return media de los datos
         */
	public static double media(List<Double> datos) {
        double con = 0;
        for (double k : datos) {
            con += k;
        }
        double promedio = con /= datos.size();
        return promedio;
    }

    /**
     * @param datos lista de lo numeros a calcular
     * @return desviacion estandar de los datos
     */
    public static double desviacion(List<Double> datos) {
        int size = datos.size();
        double con = 0;

        for (double n : datos) {
            con += Math.pow((n - media(datos)), 2);
        }
        con /= (size - 1);
        return Math.sqrt(con);
    }
}

