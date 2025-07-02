module jour5.job3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;

    opens jour5.job3 to javafx.fxml;
    exports jour5.job3;
}