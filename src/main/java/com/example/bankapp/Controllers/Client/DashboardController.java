package com.example.bankapp.Controllers.Client;

import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    public Text user_name;
    public Label login_date;
    public Label checking_bal;
    public Label checking_acc_num;
    public Label saving_bal;
    public Label saving_acc_num;
    public Label incom_lbl;
    public Label expense_lbl;
    public ListView transaction_list;
    public TextField payee_address_fld;
    public TextArea messafe_fld;
    public Button send_money_btn;
    public TextField ammoung_fld;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
