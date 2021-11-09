package application;


<<<<<<< HEAD
//import com.jfoenix.controls.JFXTextField;
=======

>>>>>>> 6497dc4f2eb468ea989664c129d4e5a43853acb4

import java.io.File;

import java.nio.file.FileSystems;
import java.nio.file.Path;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.FileChooser.ExtensionFilter;

public class ImagePickerController {

    @FXML // fx:id="idImageURL"
<<<<<<< HEAD
   // private JFXTextField idImageURL; // Value injected by FXMLLoader (Material desing version)
=======
>>>>>>> 6497dc4f2eb468ea989664c129d4e5a43853acb4
    private TextField idImageURL; // Value injected by FXMLLoader

 
    @FXML // fx:id="imgPreview"
    private ImageView imgPreview; // Value injected by FXMLLoader
    private Image image;

    @FXML
    void onAccept(ActionEvent event) {
    	Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    	if (idImageURL.getText()!=null && !idImageURL.getText().equals(""))
    		{
    		image = new Image(idImageURL.getText(), false);
    		}
    		
		stage.close();
    }
    
    @FXML
    void onCancel(ActionEvent event) {
    	idImageURL.setText("");
<<<<<<< HEAD
    	image = null;
=======
>>>>>>> 6497dc4f2eb468ea989664c129d4e5a43853acb4
    	Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.close();
    }
    
    @FXML
    void onFileDialog(ActionEvent event) {
    	FileChooser fileChooser = new FileChooser();
    	 fileChooser.setTitle("Open Resource File");
    	 fileChooser.getExtensionFilters().addAll(
    	         new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"),
    	         new ExtensionFilter("All Files", "*.*"));
    	 Window parentStage = ((Node) event.getSource()).getScene().getWindow();
    	 File selectedFile = fileChooser.showOpenDialog(parentStage);
    	 //Getting the URI for the local file
    	 if (selectedFile != null) {
    		 Path path = FileSystems.getDefault().getPath(
    				 selectedFile.getAbsolutePath());
    		 idImageURL.setText(path.toUri().toString());
    	 }
    }

    @FXML
    void onImagePreview(ActionEvent event) {
    	image = new Image(idImageURL.getText(),
  			  false);
        imgPreview.setImage(image);
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert idImageURL != null : "fx:id=\"idImageURL\" was not injected: check your FXML file 'ImagePicker.fxml'.";
        assert imgPreview != null : "fx:id=\"imgPreview\" was not injected: check your FXML file 'ImagePicker.fxml'.";
<<<<<<< HEAD
        Image image = new Image("file:./images/noImage.jpg", true);
=======
        Image image = new Image("images/noImage.jpg", true);
>>>>>>> 6497dc4f2eb468ea989664c129d4e5a43853acb4
        imgPreview.setImage(image);

    }
    
    String getFileImagePath(){
    	return idImageURL.getText();
    }
    
    Image getImage(){
    	return image;
    }
}