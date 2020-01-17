package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import java.rmi.Remote;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ResourceBundle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Controller implements Initializable {

    Date now;
    private int i=0;
    public XYChart.Series datos;

    @FXML
    public LineChart<?, ?> char1;

    @FXML
    private CategoryAxis x;

    @FXML
    private NumberAxis y;

    public void  holita2() throws InterruptedException {
        System.out.println("Sigo vivo :'v");

      //  do {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("HH:mm:ss");
            now = new Date();
           // char1.getData().clear();
            //datos.getData().clear();
            //Thread.sleep(2000);

            Integer random = ThreadLocalRandom.current().nextInt(10);
            datos.getData().add(new XYChart.Data(formatoFecha.format(now), random));
      //      char1.getData().add(datos);
            if (datos.getData().size() > 10)
                datos.getData().remove(0);

          /*  try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            i++;
        //}while (i<10);
    }

    public void holita(){

        System.out.println("Hola mundo xD xD");
       /*
            ESTO AGREGA UNA NUEVA FUNCION EN EL MISMO GRAFICO
        XYChart.Series datos2= new XYChart.Series();
        datos2.getData().add(new XYChart.Data("3",10));
        */

        sensorTemperatura sen1 = new sensorTemperatura();

       datos.getData().add(new XYChart.Data("3", 10));
       char1.getData().add(datos);

       sen1.obtenerDato();

        //char1.autosize();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        datos = new XYChart.Series();
        datos.getData().add(new XYChart.Data("1",23));
        char1.getData().addAll(datos);
    }
}
