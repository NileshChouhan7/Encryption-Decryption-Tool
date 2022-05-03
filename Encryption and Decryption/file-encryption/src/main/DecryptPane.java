
package main;

import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import security.FileEncryption;

public class DecryptPane extends SecurityPane {

    public DecryptPane(Stage primaryStage) {
        super(primaryStage);
    }

    @Override
    protected void createDoButton() {
        doButton = new Button();
        doButton.setText("Decrypt...");
        setAlignment(Pos.CENTER);
        getChildren().addAll(new Label("'Choose Any Type Of File To Decrypt'"));
        doButton.setOnAction(event -> new PasswordWindow(pathTextField.getText(), FileEncryption.DECRYPT_MODE));
    }

    @Override
    protected void addExtensionFilters(ObservableList<FileChooser.ExtensionFilter> extensionFilters) {
        extensionFilters.add(new FileChooser.ExtensionFilter("Encrypted files (*.enc)", "*.enc"));
    }
}
