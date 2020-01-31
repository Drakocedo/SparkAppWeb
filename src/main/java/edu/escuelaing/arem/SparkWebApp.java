/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem;
import edu.escuelaing.arem.calculos.LinkedList;
import static edu.escuelaing.arem.calculos.Operaciones.*;
import spark.Request;
import spark.Response;
import static spark.Spark.*;
/**
 *
 * @author david.caycedo
 */
public class SparkWebApp {
    
    /**
     * This main method uses SparkWeb static methods and lambda functions to
     * create a simple Hello World web app. It maps the lambda function to the
     * /hello relative URL.
     */
 
    public static void main(String[] args) { 
        port(getPort());
       get("/inputdata", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));
    }
    
    
    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>Taller 2 AREP</h2>"
                + "<form action=\"/results\">"
                + " Ingrese los numeros separados por coma (,) :<br>"
                + "  <input type=\"text\" name=\"lista\" >"
                + "  <br>"
                + "  <input type=\"submit\" value=\"Calcular\">"
                + "</form>"
                + "<p>If you click the \"Calcular\" button, the form-data will be sent to a page called \"/results\".</p>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

    private static String resultsPage(Request req, Response res) {
        LinkedList<Double> datos = new LinkedList<Double>();
        String numeros= req.queryParams("lista");
        String[] numerosLista = numeros.split(",");
        
        for (String p:numerosLista){
            datos.add(Double.parseDouble(p));
        }
        
        String respuestam = String.valueOf(media(datos));
        String respuestas = String.valueOf(desviacion(datos));
        
         String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>Taller 2 AREP</h2>"
                + "La media de los numeros es: "
                + respuestam  
                + "  <br>" 
                + "La desviacion estandar es: " 
                + respuestas 
                + "</form>"
                + "</body>"
                + "</html>";
                 
        
        
        
        return pageContent;
    }
    /**
     * This method reads the default port as specified by the PORT variable in
     * the environment.
     *
     * Heroku provides the port automatically so you need this to run the
     * project on Heroku.
     */
    static int getPort() {  
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
            
          }        return 4567; //returns default port if heroku-port isn't set(i.e. on localhost)    }
}
}
