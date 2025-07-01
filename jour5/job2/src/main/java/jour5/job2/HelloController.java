package jour5.job2;

import javafx.fxml.FXML;
import javafx.application.Platform;

public class HelloController {

    @FXML
    protected void onQuitButtonClick() {
        Platform.exit();
    }
}