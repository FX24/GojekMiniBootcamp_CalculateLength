module com.minibootcamp.calculatelength {
 requires javafx.controls;
 requires javafx.fxml;


 opens com.minibootcamp.calculatelength to javafx.fxml;
 exports com.minibootcamp.calculatelength;
}