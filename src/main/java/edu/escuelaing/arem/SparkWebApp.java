/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem;
import static spark.Spark.*;
/**
 *
 * @author david.caycedo
 */
public class SparkWebApp {
    public static void main(String[] args) { 
        port(getPort());
        get("/hello", (req, res) -> "Hello Heroko <br>  <br> Digite los numeros separados por comas: <br>  <input type=\"text\" name=\"fname\"><br>  <input type=\"button\" value=\"Click me\">");
    }
    
    
    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>HTML Forms</h2>"
                + "<form action=\"/results\">"
                + "  First name:<br>"
                + "  <input type=\"text\" name=\"firstname\" value=\"Mickey\">"
                + "  <br>"
                + "  Last name:<br>"
                + "  <input type=\"text\" name=\"lastname\" value=\"Mouse\">"
                + "  <br><br>"
                + "  <input type=\"submit\" value=\"Submit\">"
                + "</form>"
                + "<p>If you click the \"Submit\" button, the form-data will be sent to a page called \"/results\".</p>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

    private static String resultsPage(Request req, Response res) {
        return req.queryParams("firstname") + " " +
                req.queryParams("lastname");
    }
    static int getPort() {  
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
            
          }        return 4567; //returns default port if heroku-port isn't set(i.e. on localhost)    }
}
}
