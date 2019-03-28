package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Label labelCreateTable;
    @FXML
    private Label labelNawiasPoczatek;
    @FXML
    private Label labelPrzecinek;
    @FXML
    private Label labelPrimaryKey;
    @FXML
    private Label labelNawiasKoniec;
    @FXML
    private Button generujButton;
    @FXML
    private Button dodajButton;
    @FXML
    private TextField tekstFieldNazwaTabeli;
    @FXML
    private TextField tekstFieldNazwaKolumny;
    @FXML
    private TextField tekstFieldRozmiar;
    @FXML
    private TextField tekstFieldWartoscPoczatkowa;
    @FXML
    private TextField tekstFieldNotNull;
    @FXML
    private TextField tekstFieldAutoIncrement;
    @FXML
    private TextField tekstFieldNazwaPrimaryKey;
    @FXML
    private TextField tekstFieldWynikynik;
    @FXML
    private TextField tekstFieldNazwaKolumnyDoDodania;
    @FXML
    private TextField tekstFieldRozmiarDoDodania;
    @FXML
    private TextField tekstFieldNotNullDoDodania;
    @FXML
    private TextField tekstFieldDefaultDoDodania;
    @FXML
    private TextField tekstFieldZakresDoDodania;

    @FXML
    private TextField tekstFieldKolumny;

    @FXML
    private void dodaj() {
        tekstFieldKolumny.setText(tekstFieldKolumny.getText()
                + " " + tekstFieldNazwaKolumnyDoDodania.getText()
                + " " + tekstFieldRozmiarDoDodania.getText()
                + " " + tekstFieldNotNullDoDodania.getText()
                + " " + tekstFieldDefaultDoDodania.getText()
                + " " + tekstFieldZakresDoDodania.getText() + " , "
        );
    }

    @FXML
    private void generuj() {
        tekstFieldWynikynik.setText(labelCreateTable.getText()
                + " " + tekstFieldNazwaTabeli.getText()
                + " " + labelNawiasPoczatek.getText()
                + " " + tekstFieldNazwaKolumny.getText()
                + " " + tekstFieldRozmiar.getText()
                + " " + tekstFieldWartoscPoczatkowa.getText()
                + " " + tekstFieldNotNull.getText()
                + " " + tekstFieldAutoIncrement.getText()
                + " " + labelPrzecinek.getText() + " "

                + tekstFieldKolumny.getText() //tekstField z kolumnami


                + " " + labelPrimaryKey.getText() + " "
                + " " + tekstFieldNazwaPrimaryKey.getText() + " "
                + " " + labelNawiasKoniec.getText());
    }

}
