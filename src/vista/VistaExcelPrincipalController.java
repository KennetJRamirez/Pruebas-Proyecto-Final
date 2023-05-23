/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package vista;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

/**
 * FXML Controller class
 *
 * @author Oscar
 */
public class VistaExcelPrincipalController implements Initializable {

    @FXML
    private MenuBar mnOpciones;
    @FXML
    private TableView<String> tblExcel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Crear las columnas dinámicamente
        for (char c = 'A'; c <= 'Z'; c++) {
            TableColumn<String, String> column = new TableColumn<>(String.valueOf(c));
            column.setCellFactory(TextFieldTableCell.forTableColumn());
            column.setEditable(true);
            tblExcel.getColumns().add(column);
        }

        // Crear las filas enumeradas
        for (int i = 1; i <= 100; i++) {
            tblExcel.getItems().add("");
        }
    }

}
