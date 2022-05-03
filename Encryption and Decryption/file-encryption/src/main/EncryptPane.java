
package main;

import javax.swing.text.StyledEditorKit.BoldAction;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import security.FileEncryption;

public class EncryptPane extends SecurityPane {

    public EncryptPane(Stage primaryStage) {
        super(primaryStage);
    }

    @Override
    protected void createDoButton() {
        doButton = new Button();
        doButton.setText("Encrypt...");
        setAlignment(Pos.CENTER);
        getChildren().addAll(new Label("'Choose Any Type Of File To Encrypt'"));
        
        doButton.setAlignment(Pos.CENTER);
        doButton.setOnAction(event -> new PasswordWindow(pathTextField.getText(), FileEncryption.ENCRYPT_MODE));
    }
}
