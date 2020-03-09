package ofx

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.layout.StackPane
import javafx.stage.Stage

class App {
    static void main(String[] args) {
        Application.launch(HelloFx, args)
    }
}

class HelloFx extends Application {

    @Override
    void start(Stage stage) {
        def javaVersion = System.getProperty("java.version")
        def javafxVersion = System.getProperty("javafx.version")
        Label l = new Label("Hello, JavaFX $javafxVersion, running on Java $javaVersion.")
        Scene scene = new Scene(new StackPane(l), 640, 480)
        stage.setScene(scene)
        stage.show()
    }

}
