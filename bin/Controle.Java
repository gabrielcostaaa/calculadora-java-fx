import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controle{

    @FXML
    private TextField campoNumero1;

    @FXML
    private TextField campoNumero2;

    @FXML
    private Button campoSoma;

    @FXML
    private Button campoMultiplicacao;

    @FXML
    private Button campoSubtracao;

    @FXML
    private Button campoDivisao;

    @FXML
    private TextField campoResultado;

    @FXML
    private Text resultado;

    @FXML
    private void somar(ActionEvent event) {
        double num1 = Double.parseDouble(campoNumero1.getText());
        double num2 = Double.parseDouble(campoNumero2.getText());
        double soma = num1 + num2;
        campoResultado.setText(Double.toString(soma));
    }

    @FXML
    private void subtrair(ActionEvent event) {
        double num1 = Double.parseDouble(campoNumero1.getText());
        double num2 = Double.parseDouble(campoNumero2.getText());
        double diferenca = num1 - num2;
        campoResultado.setText(Double.toString(diferenca));
    }

    @FXML
    private void multiplicar(ActionEvent event) {
        double num1 = Double.parseDouble(campoNumero1.getText());
        double num2 = Double.parseDouble(campoNumero2.getText());
        double produto = num1 * num2;
        campoResultado.setText(Double.toString(produto));
    }

    @FXML
    private void dividir(ActionEvent event) {
        double num1 = Double.parseDouble(campoNumero1.getText());
        double num2 = Double.parseDouble(campoNumero2.getText());

        if (num2 == 0) {
            campoResultado.setText("Divisão por zero não é permitida");
        } else {
            double quociente = num1 / num2;
            campoResultado.setText(Double.toString(quociente));
        }
    }
}
