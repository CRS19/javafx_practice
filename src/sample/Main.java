package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Main extends Application {

    final int WINDOW_SIZE = 10;
    @FXML
    public LineChart<?, ?> char1;

    @Override
    public void start(Stage primaryStage) throws Exception{

        Controller a = new Controller();



        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();

/*
        final SimpleDateFormat fechaFormatoSimple = new SimpleDateFormat("HH:mm:ss");

        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

        // put dummy data onto graph per second
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            // get a random integer between 0-10
            Integer random = ThreadLocalRandom.current().nextInt(10);

            // Update the chart
            Platform.runLater(() -> {
                // get current time
                Date now = new Date();
                // put random number with current time
                a.datos.getData().add(new XYChart.Data<>(fechaFormatoSimple.format(now), random));
                if (a.datos.getData().size() > WINDOW_SIZE)
                    a.datos.getData().remove(0);
            });
        }, 0, 1, TimeUnit.SECONDS);




    }

*/
    }

    public static void main(String[] args) {
        launch(args);
    }
}
