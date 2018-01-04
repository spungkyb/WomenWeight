package com.example.android.womenweight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {


    EditText beratbadan;
    EditText tinggibadan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        beratbadan = (EditText) findViewById(R.id.bb_view);
        tinggibadan = (EditText) findViewById(R.id.tb_view);
    }
    /**
     * This method is called when the order button is clicked.
     */
    public void cekHasil(View view) {
        String beratb= beratbadan.getText().toString();
        int bb= Integer.valueOf(beratb).intValue();
        String tinggib= tinggibadan.getText().toString();
        int tb= Integer.valueOf(tinggib).intValue();
        double ketBmi = bb/(tb*tb*0.0001);
        String ket;
        if (ketBmi >27){
            ket= "OBESITAS - BMI>27";
        }
        else if(ketBmi >25){
            ket= "KEGEMUKAN - BMI 25-27";
        }
        else if (ketBmi >=18){
            ket= "NORMAL - BMI 18-25";
        }
        else {
            ket = "KURUS - BMI<18";
        }
        String ketBMId = "Body Mess Index (BMI) = "+(ketBmi)+" ";
        displayMessage(ketBMId);
        String kategori = "Kategori = "+(ket)+"";
        displayMessage2(kategori);
        double bbideal =  (tb-100)-(0.15*(tb-100));
        String priceMessage = "Berat Badan Ideal Anda Sekitar";
        displayMessage3(priceMessage);
        String hasilBBideal= ""+(bbideal)+" kg";
        displayMessage4(hasilBBideal);
    }

    public void resetHasil(View view){
        String dM1= "";
        String dM2= "";
        String dM3= "";
        String dM4= "";
        displayMessage(dM1);
        displayMessage2(dM2);
        displayMessage3(dM3);
        displayMessage4(dM4);
    }


    /**
     * This method displays the given quantity value on the screen.
     */


    private void displayMessage(String message) {
        TextView BMITextView = (TextView) findViewById(R.id.BMI_text_view);
        BMITextView.setText(message);
    }
    private void displayMessage2(String message) {
        TextView kategoriTextView = (TextView) findViewById(R.id.kategori_text_view);
        kategoriTextView.setText(message);
    }
    private void displayMessage3(String message) {
        TextView ketTextView = (TextView) findViewById(R.id.ket_text_view);
        ketTextView.setText(message);
    }
    private void displayMessage4(String message) {
        TextView hasilTextView = (TextView) findViewById(R.id.hasil_text_view);
        hasilTextView.setText(message);
    }


}
