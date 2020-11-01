package WithoutFXML;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.InputStream;

public class Main extends Application{
    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        //Параметры Stage
        stage.setTitle("Hello world Application");
        stage.setWidth(300);
        stage.setHeight(200);

        //Добавление иконки
        InputStream iconStream = getClass().getResourceAsStream("/WithFXML/image/Icon.png");
        Image image = new Image(iconStream);
        stage.getIcons().add(image);

        //Создание и описание Label
        Label label = new Label("String");
        label.setAlignment(Pos.CENTER);

        //Добавить Label на  Scene
        Scene scene = new Scene(label);

        //Добавить Scene на Stage
        stage.setScene(scene);

        //Показать Stage
        stage.show();
    }
}
