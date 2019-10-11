package AutoMobile;

import java.net.URL;
import java.util.ResourceBundle;

import Auto.Model.Archivio;
import Auto.Model.Auto;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class AutoController {
	Archivio arch = new Archivio();
	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private TextField txtTarga;

	@FXML
	private TextField TxtAuto;

	@FXML
	private TextField txtKm;

	@FXML
	private TextField TxtAnno;

	@FXML
	private TextField TxtPrezzo;

	@FXML
	private Button btnAdd;

	@FXML
	private Button btnDelete;

	@FXML
	private Button TxtCerca;
	@FXML
	private Button btnOrdina;
	@FXML
	private ListView<Auto> lwCanc;
	private ObservableList<Auto> observableLista2;

	@FXML
	private ListView<Auto> lwAuto;
	private ObservableList<Auto> observableLista;
	@FXML
	private TextField txtFind;
	@FXML
	private Button btnView;

	@FXML
	private TextField TxtrResult;
	@FXML
    private Button btnClear;


	@FXML
	void onAdd(ActionEvent event) {
		arch.addAuto(txtTarga.getText(), TxtAuto.getText(), TxtAnno.getText(), TxtPrezzo.getText());
		onLista(event);
	}
	 @FXML
	    void onClear(ActionEvent event) {
		 	arch.clear();
		 	onLista2(event);
	    }
	@FXML
	void onOrdina(ActionEvent event) {
		arch.ordineAuto();
		onLista(event);
	}

	@FXML
	void onDelete(ActionEvent event) {
		arch.deleteAuto(txtTarga.getText());
		onLista(event);
	}

	@FXML
	void onSearch(ActionEvent event) {

		TxtrResult.setText(arch.searchAuto(txtFind.getText()));

	}

	@FXML
	void onLista(ActionEvent event) {
		observableLista = FXCollections.observableList(arch.getArchivio());
		lwAuto.setItems(observableLista);

	}

	@FXML
	void onView(ActionEvent event) {
		observableLista2 = FXCollections.observableList(arch.getArchivio2());
		lwCanc.setItems(observableLista2);
	}
	@FXML
	void onLista2(ActionEvent event) {
		observableLista2 = FXCollections.observableList(arch.getArchivio2());
		lwCanc.setItems(observableLista2);
	}
	public void setModel(Archivio model) {

		model = arch;
	}

	@FXML
	void initialize() {
		assert txtTarga != null : "fx:id=\"txtTarga\" was not injected: check your FXML file 'AutoView.fxml'.";
		assert TxtAuto != null : "fx:id=\"TxtAuto\" was not injected: check your FXML file 'AutoView.fxml'.";
		assert txtKm != null : "fx:id=\"txtKm\" was not injected: check your FXML file 'AutoView.fxml'.";
		assert TxtAnno != null : "fx:id=\"TxtAnno\" was not injected: check your FXML file 'AutoView.fxml'.";
		assert TxtPrezzo != null : "fx:id=\"TxtPrezzo\" was not injected: check your FXML file 'AutoView.fxml'.";
		assert btnAdd != null : "fx:id=\"btnAdd\" was not injected: check your FXML file 'AutoView.fxml'.";
		assert btnDelete != null : "fx:id=\"btnDelete\" was not injected: check your FXML file 'AutoView.fxml'.";
		assert TxtCerca != null : "fx:id=\"TxtCerca\" was not injected: check your FXML file 'AutoView.fxml'.";
		assert TxtrResult != null : "fx:id=\"TxtrResult\" was not injected: check your FXML file 'AutoView.fxml'.";
		assert btnOrdina != null : "fx:id=\"btnOrdina\" was not injected: check your FXML file 'AutoView.fxml'.";
		assert lwAuto != null : "fx:id=\"lwAuto\" was not injected: check your FXML file 'AutoView.fxml'.";
		assert txtFind != null : "fx:id=\"txtFind\" was not injected: check your FXML file 'AutoView.fxml'.";
		assert lwCanc != null : "fx:id=\"lwCanc\" was not injected: check your FXML file 'AutoView.fxml'.";
		assert btnView != null : "fx:id=\"btnView\" was not injected: check your FXML file 'AutoView.fxml'.";
		assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'AutoView.fxml'.";

	}
}
