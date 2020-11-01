package WithFXML;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    public Label label1;
    public Button button;

    public void ButtonClick(ActionEvent actionEvent) {
        Main.btClicked(button, label1);
    }
}
