package com.example.thecall;
// FAJRIYAN NUR - 180403010038 //
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button tombol1,tombol2,tombol3,tombol4,tombol5,tombol6,tombol7,tombol8,tombol9,tombol0,tombolTambah,tombolKurang,
            tombolBagi,tombolKali,tombolTitik,tombolSamaDengan;
    Button tombolHapus;
    EditText tulis;
    float hasil1,hasil2;
    boolean Tambah,Kurang,Kali,Bagi;

// FAJRIYAN NUR - 180403010038 //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tombol1= (Button) findViewById(R.id.btn1);
        tombol2= (Button) findViewById(R.id.btn2);
        tombol3= (Button) findViewById(R.id.btn3);
        tombol4= (Button) findViewById(R.id.btn4);
        tombol5= (Button) findViewById(R.id.btn5);
        tombol6= (Button) findViewById(R.id.btn6);
        tombol7= (Button) findViewById(R.id.btn7);
        tombol8= (Button) findViewById(R.id.btn8);
        tombol9= (Button) findViewById(R.id.btn9);
        tombol0= (Button) findViewById(R.id.btn0);

        tombolTambah= (Button) findViewById(R.id.btnPlus);
        tombolKurang= (Button) findViewById(R.id.btnMin);
        tombolKali= (Button) findViewById(R.id.btnKali);
        tombolBagi= (Button) findViewById(R.id.btnBagi);
        tombolTitik= (Button) findViewById(R.id.btnTitik);
        tombolSamaDengan= (Button) findViewById(R.id.btnSD);
        tombolHapus= (Button) findViewById(R.id.btnC);
        tulis = (EditText) findViewById(R.id.penulisan);

        ///////////////////////////[ START MASUKKAN NILAI ]////////////////////////////////////

        tombol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tulis.setText(tulis.getText()+"1");
            }
        });
        tombol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tulis.setText(tulis.getText()+"2");
            }
        });
        tombol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tulis.setText(tulis.getText()+"3");
            }
        });
        tombol4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tulis.setText(tulis.getText()+"4");
            }
        });
        tombol5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tulis.setText(tulis.getText()+"5");
            }
        });
        tombol6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tulis.setText(tulis.getText()+"6");
            }
        });
        tombol7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tulis.setText(tulis.getText()+"7");
            }
        });
        tombol8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tulis.setText(tulis.getText()+"8");
            }
        });
        tombol9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tulis.setText(tulis.getText()+"9");
            }
        });
        tombol0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tulis.setText(tulis.getText()+"0");
            }
        });
        tombolTitik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tulis.setText(tulis.getText()+".");
            }
        });
        ///////////////////////////[ END MASUKKAN NILAI ]////////////////////////////////////

        ///////////////////////////[ AWAL HAPUS ]////////////////////////////////////
        tombolHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tulis.setText(null);
            }
        });
        ///////////////////////////[ END HAPUS ]////////////////////////////////////

        ///////////////////////////[ START AMBIL NILAI AWAL ]////////////////////////////////////
        tombolTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tulis==null){
                    tulis.setText("");
                }
                else {
                    hasil1 = Float.parseFloat(tulis.getText()+"");
                    Tambah = true;
                    tulis.setText(null);
                }
            }
        });
        tombolKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tulis==null){
                    tulis.setText("");
                }
                else {
                    hasil1 = Float.parseFloat(tulis.getText()+"");
                    Kurang = true;
                    tulis.setText(null);
                }
            }
        });
        tombolKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tulis==null){
                    tulis.setText("");
                }
                else {
                    hasil1 = Float.parseFloat(tulis.getText()+"");
                    Kali = true;
                    tulis.setText(null);
                }
            }
        });
        tombolBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tulis==null){
                    tulis.setText("");
                }
                else {
                    hasil1 = Float.parseFloat(tulis.getText()+"");
                    Bagi = true;
                    tulis.setText(null);
                }
            }
        });
        ///////////////////////////[ END AMBIL NILAI AWAL ]////////////////////////////////////

        ///////////////////////////[ START OPERASI KALKULATOR ]////////////////////////////////////
        tombolSamaDengan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil2= Float.parseFloat(tulis.getText()+"");

                if (Tambah==true){
                    tulis.setText(hasil1+hasil2+"");
                    Tambah=false;
                }
                if (Kurang==true){
                    tulis.setText(hasil1-hasil2+"");
                    Kurang=false;
                }
                if (Kali==true){
                    tulis.setText(hasil1*hasil2+"");
                    Kali=false;
                }
                if (Bagi==true){
                    tulis.setText(hasil1/hasil2+"");
                    Bagi=false;
                }
            }
        });
        ///////////////////////////[ END OPERASI KALKULATOR ]////////////////////////////////////
    }
}
// FAJRIYAN NUR - 180403010038 //