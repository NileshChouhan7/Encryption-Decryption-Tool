**# Encryption-Decryption-Tool**


A JavaFX Application that encrypts a file using AES encryption.

Preview
![Loading_page](https://user-images.githubusercontent.com/88261729/166429061-a5f52880-e4c1-4b53-8fdf-ffa33df0d9c4.png)
![Encryption_page](https://user-images.githubusercontent.com/88261729/166429089-80169a54-d02c-4c8d-ae58-6b3d2ba73427.png)
![Choose_file](https://user-images.githubusercontent.com/88261729/166429113-88a6fe04-e33c-4978-89af-f97dfbf7a237.png)
![Encrypt_Pwd_page](https://user-images.githubusercontent.com/88261729/166429146-a50cfd76-3ba6-407c-b3f1-7197522a752c.png)
![Encrypt_successful](https://user-images.githubusercontent.com/88261729/166428984-ea555adb-92fd-45ac-b29e-a9ad60039cee.png)

**#Technical details**

This application allows you to encrypt a file using the AES encryption algorithm, asking you for a password to use it as its key. During the file transformation process, it's guaranteed that no data is lost: It's never the original file that is encrypted but a copy of it. And during the name changes, if there's already a file with that same name, a new one is used. For example:

We have the file: Example.pdf,doc,image etc
If we encrypt it, it becomes. Example.pdf.enc
Now if we decrypt it back, it won't replace the original Example.pdf, it will create a new one named "(1) Example.pdf", incrementing the number inside the parentheses untill it finds an unused file name.
Functionalities

File encryption (or safely cancel it without crashing the application)
File decryption (or safely cancel it without crashing the application)
Select the file using a file chooser
Friendly graphical user interface showing the progress of the task
Embedded web browser on the "about" pane that opens this GitHub page

**Author's**
https://github.com/NileshChouhan7
https://github.com/mr-mohit-rathore
