package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import java.rmi.Remote;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private XYChart.Series datos;
    private int i=5;
    @FXML
    private LineChart<?, ?> char1;

    @FXML
    private CategoryAxis x;

    @FXML
    private NumberAxis y;

    public void  holita2(){
        System.out.println("Sigo vivo :'v");

        datos.getData().add(new XYChart.Data(String.valueOf(i), 10));
        char1.getData().add(datos);
        i++;

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
