module ru.geekbrains.chatfxapp {
    requires javafx.controls;
    requires javafx.fxml;


    exports ru.gb.obalin.client;
    opens ru.gb.obalin.client to javafx.fxml;
}