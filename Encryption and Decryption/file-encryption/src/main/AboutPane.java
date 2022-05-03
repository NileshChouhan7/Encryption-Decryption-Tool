
package main;

import javafx.geometry.Pos;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class AboutPane extends VBox
{
    private static final String PAGE_LINK = "https://www.github.com/luisbraganca/file-encryption";

    private Stage primaryStage;

    public AboutPane(Stage primaryStage)
    {
        super();
        this.primaryStage = primaryStage;
        createWindow();

    }

    private void createWindow()
    {
        VBox contactHBox = new VBox();
        contactHBox.setAlignment(Pos.CENTER);
        Hyperlink website = new Hyperlink(PAGE_LINK);
        
        contactHBox.getChildren().addAll(new Label("1. Do you wish to convert your Music to a form in which others cannot listen to it?\n2. Do you wish to convert your Movies to a form in which others cannot watch them?\n3. Do you wish to convert your Documents to a form in which others cannot read them?\n4. Do you wish to convert your Executable files to a form in which others cannot execute them?\n\nIf your answer to all the above questions is “YES” then this Application is definitely for you.If “Let’s go\nfor Encryption and Decryption File” is the option you select below.It takes all the files you choose and\nall the sub - files  of  the folder (s) you choose , encrypts them  with  the password you enter and thus\nmakes them unreadable.This way, files such as movies,music, odf, documents, images etc. won’t open.\nExecutable file s will not be in a state to be executed.The rendered files will have“..enc ”extension after \nENCRYPTION.\n                           -----Do you want your Encrypted file(s) back in the original form?-----\n\n“Decrypt My Files” is the option you should select.It performs “ Decryption ” of the given encrypted files.\nThe appication does NOT store your password.Instead it uses AES-256 algorithm to verify the password.\n"),website);
        getChildren().addAll(new Label("************* About of Application *************\n\n"), contactHBox);
        website.setOnAction(event -> new HtmlPage(PAGE_LINK).show());
        setAlignment(Pos.CENTER);
        setSpacing(0);
    }

}
