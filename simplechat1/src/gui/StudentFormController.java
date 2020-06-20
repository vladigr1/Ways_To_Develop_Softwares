package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Server.ServerUI;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import logic.Faculty;
import logic.Student;

public class StudentFormController implements Initializable {
	private Student s;
		
	@FXML
	private Label lblName;
	@FXML
	private Label lblSurname;
	@FXML
	private Label lblFaculty;
	
	@FXML
	private TextField txtName;
	@FXML
	private TextField txtSurname;
	
	@FXML
	private ComboBox cmbFaculty;
	
	@FXML
    private Button btnExit;
    
    @FXML
    private TextField txtStId;
	
	ObservableList<String> list;
		
	public void loadStudent(Student s1){
		this.s=s1;
		this.txtName.setText(s.getPName());
		this.txtSurname.setText(s.getLName());		
		this.cmbFaculty.setValue(s.getFc().getFName());
		this.txtStId.setText(s.getId());
	}
	
	// creating list of Faculties
	private void setFacultyComboBox() {
		ArrayList<String> al = new ArrayList<String>();	
		al.add("ME");
		al.add("IE");
		al.add("SE");

		
		list = FXCollections.observableArrayList(al);
		cmbFaculty.setItems(list);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {	
		setFacultyComboBox();
	}
	
	@FXML
    void btnClose(ActionEvent event) {
		System.out.println("exit Academic Tool");
		System.exit(0);	//added
    }
	
	@FXML
    void btnSave(ActionEvent event) {
		s.getFc().setFName((String)this.cmbFaculty.getSelectionModel().getSelectedItem());
		s.setPName(txtName.getText());
		s.setId(txtStId.getText());
		s.setLName(txtSurname.getText());
		System.out.println(s);
		//ServerUI.sv.setSt0(s);
		
    }
}
