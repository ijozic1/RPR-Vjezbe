package ba.unsa.etf.rpr.tutorijal06;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    public Button btn0;
    public Button btn1;

    public Button btn4;
    public Button btn7;
    public Button modBtn;
    public Button btn2;
    public Button btn5;
    public Button btn8;
    public Button divBtn;
    public Button mulBtn;
    public Button minusBtn;

    public Button btn9;
    public Button btn6;
    public Button btn3;
    public Button dotBtn;
    public Button plusBtn;
    public Button equalsBtn;
    @FXML
    private Label display;
    private StringBuilder string = new StringBuilder();
    private boolean eqWasCalled = false;

    public Controller() {
    }

    private void calculate() {
        double a = 0.0;
        double b = 0.0;

        int i;
        for(i = 0; i < this.string.length() && this.string.charAt(i) >= '0' && this.string.charAt(i) <= '9'; ++i) {
            a = a * 10.0 + (double)(this.string.charAt(i) - 48);
        }

        if (i >= this.string.length()) {
            this.display.setText(String.valueOf(a));
        }
        else {
            char operator = this.string.charAt(i);
            ++i;
            double c;
            if (operator == '.') {
                c = 0.0;

                int dec;
                for(dec = 0; i < this.string.length() && this.string.charAt(i) >= '0' && this.string.charAt(i) <= '9'; ++dec) {
                    c = c * 10.0 + (double)(this.string.charAt(i) - 48);
                    ++i;
                }

                a += c / Math.pow(10.0, (double)dec);
                if (i >= this.string.length()) {
                    this.display.setText(String.valueOf(a));
                    return;
                }

                operator = this.string.charAt(i);
                ++i;
            }

            if (i >= this.string.length()) {
                this.display.setText("Error");
            }
            else {
                while(i < this.string.length() && this.string.charAt(i) >= '0' && this.string.charAt(i) <= '9') {
                    b = b * 10.0 + (double)(this.string.charAt(i) - 48);
                    ++i;
                }

                if (i < this.string.length()) {
                    char operator2 = this.string.charAt(i);
                    ++i;
                    int dec = 0;
                    double tmp = 0.0;
                    if (operator2 == '.') {
                        while(i < this.string.length() && this.string.charAt(i) >= '0' && this.string.charAt(i) <= '9') {
                            tmp = tmp * 10.0 + (double)(this.string.charAt(i) - 48);
                            ++i;
                            ++dec;
                        }

                        b += tmp / Math.pow(10.0, (double)dec);
                    }
                }

                c = 0.0;
                if (operator == '+') {
                    c = a + b;
                }
                else if (operator == '-') {
                    c = a - b;
                }
                else if (operator == 'x') {
                    c = a * b;
                }
                else if (operator == '/') {
                    c = a / b;
                }
                else if (operator == '%') {
                    c = a % b;
                }

                this.display.setText(String.valueOf(c));
            }
        }
    }

    @FXML
    protected void onButtonModClick() {
        this.display.setText(this.display.getText() + "%");
        this.string.append('%');
    }

    @FXML
    protected void onButtonDivClick() {
        this.display.setText(this.display.getText() + "/");
        this.string.append('/');
    }

    @FXML
    protected void onButtonMulClick() {
        this.display.setText(this.display.getText() + "x");
        this.string.append('x');
    }

    @FXML
    protected void onButtonMinusClick() {
        this.display.setText(this.display.getText() + "-");
        this.string.append('-');
    }

    @FXML
    protected void onButtonPlusClick() {
        this.display.setText(this.display.getText() + "+");
        this.string.append('+');
    }

    @FXML
    protected void onButtonEqClick() throws InterruptedException {
        this.display.setText(this.display.getText() + "=");
        this.calculate();
        this.string.setLength(0);
        this.eqWasCalled = true;
    }

    @FXML
    protected void onButtonPtClick() {
        this.display.setText(this.display.getText() + ".");
        this.string.append('.');
    }

    @FXML
    protected void onButton0Click() {
        if (this.eqWasCalled) {
            this.display.setText("");
            this.eqWasCalled = false;
        }

        this.display.setText(this.display.getText() + "0");
        this.string.append('0');
    }

    @FXML
    protected void onButton1Click() {
        if (this.eqWasCalled) {
            this.display.setText("");
            this.eqWasCalled = false;
        }

        this.display.setText(this.display.getText() + "1");
        this.string.append('1');
    }

    @FXML
    protected void onButton2Click() {
        if (this.eqWasCalled) {
            this.display.setText("");
            this.eqWasCalled = false;
        }

        this.display.setText(this.display.getText() + "2");
        this.string.append('2');
    }

    @FXML
    protected void onButton3Click() {
        if (this.eqWasCalled) {
            this.display.setText("");
            this.eqWasCalled = false;
        }

        this.display.setText(this.display.getText() + "3");
        this.string.append('3');
    }

    @FXML
    protected void onButton4Click() {
        if (this.eqWasCalled) {
            this.display.setText("");
            this.eqWasCalled = false;
        }

        this.display.setText(this.display.getText() + "4");
        this.string.append('4');
    }

    @FXML
    protected void onButton5Click() {
        if (this.eqWasCalled) {
            this.display.setText("");
            this.eqWasCalled = false;
        }

        this.display.setText(this.display.getText() + "5");
        this.string.append('5');
    }

    @FXML
    protected void onButton6Click() {
        if (this.eqWasCalled) {
            this.display.setText("");
            this.eqWasCalled = false;
        }

        this.display.setText(this.display.getText() + "6");
        this.string.append('6');
    }

    @FXML
    protected void onButton7Click() {
        if (this.eqWasCalled) {
            this.display.setText("");
            this.eqWasCalled = false;
        }

        this.display.setText(this.display.getText() + "7");
        this.string.append('7');
    }

    @FXML
    protected void onButton8Click() {
        if (this.eqWasCalled) {
            this.display.setText("");
            this.eqWasCalled = false;
        }

        this.display.setText(this.display.getText() + "8");
        this.string.append('8');
    }

    @FXML
    protected void onButton9Click() {
        if (this.eqWasCalled) {
            this.display.setText("");
            this.eqWasCalled = false;
        }

        this.display.setText(this.display.getText() + "9");
        this.string.append('9');
    }

}
