package WithFXML;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.InputStream;
import java.net.URL;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch();
    }

    public static void btClicked(Button button, Label label) {
        System.out.println("Button clicked - " + button.getText());
        label.setText(button.getText());
        button.setText("Click me again!");
        int rotate = (int) (button.getRotate() + 30);
        button.setStyle("-fx-background-color: blue; -fx-text-fill: white; -fx-rotate: " + rotate);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //Параметры Stage
        stage.setTitle("Hello world Application");
        stage.setWidth(300);
        stage.setHeight(400);

        //Добавление иконки
        InputStream iconStream = getClass().getResourceAsStream("/WithFXML/image/Icon.png");
        Image image = new Image(iconStream);
        stage.getIcons().add(image);

        //Подключение Scene
        URL xmlURL = getClass().getResource("/WithFXML/Scene.fxml");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(xmlURL);

        Parent root = loader.load();

        stage.setScene(new Scene(root));

        //Показать Stage
        stage.show();
    }
}
