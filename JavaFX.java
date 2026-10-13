import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class JavaFX extends Application {
 
    @Override
    public void start(Stage stage) {
        Label titulo = new Label("Evaluador de calificaciones");
        titulo.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");
 
        TextField campoNombre = new TextField();
        campoNombre.setPromptText("Nombre del estudiante");
        campoNombre.setMaxWidth(250);
 
        TextField campoNota = new TextField();
        campoNota.setPromptText("Nota (0-100)");
        campoNota.setMaxWidth(250);
 
        Button boton = new Button("Evaluar");
        boton.setStyle("-fx-background-color: #003355; -fx-text-fill: white;");
 
        Label resultado = new Label("");
        resultado.setStyle("-fx-font-size: 16px; -fx-padding: 10;");
 
        boton.setOnAction(e -> {
            String nombre = campoNombre.getText();
 
            try {
                int nota = Integer.parseInt(campoNota.getText());
 
                if (nota < 0 || nota > 100) {
                    resultado.setText("Nota inválida");
                    resultado.setStyle("-fx-font-size: 16px; -fx-padding: 10; -fx-background-color: gray;");
                } else if (nota >= 70) {
                    resultado.setText(nombre + ": Aprobado");
                    resultado.setStyle("-fx-font-size: 16px; -fx-padding: 10; -fx-background-color: #14fa46;");
                } else if (nota >= 60) {
                    resultado.setText(nombre + ": Completivo");
                    resultado.setStyle("-fx-font-size: 16px; -fx-padding: 10; -fx-background-color: #fbff19;");
                } else {
                    resultado.setText(nombre + ": Reprobado");
                    resultado.setStyle("-fx-font-size: 16px; -fx-padding: 10; -fx-background-color: #f53b3b;");
                }
            } catch (NumberFormatException ex) {
                resultado.setText("Nota inválida");
                resultado.setStyle("-fx-font-size: 16px; -fx-padding: 10; -fx-background-color: gray;");
            }
        });
 
        VBox contenedor = new VBox(15);
        contenedor.setAlignment(Pos.CENTER);
        contenedor.getChildren().addAll(titulo, campoNombre, campoNota, boton, resultado);
 
        Scene escena = new Scene(contenedor, 400, 350);
 
        stage.setTitle("Evaluador");
        stage.setScene(escena);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}
