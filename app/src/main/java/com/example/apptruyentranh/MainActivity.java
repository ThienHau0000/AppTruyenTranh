package com.example.apptruyentranh;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
GridView gdvDSTruyen;
TruyenTranhAdapter adapter;
ArrayList<TruyenTranh> truyenTranhArrayList;
EditText edtTimKiem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        anhXa();
        setUp();
        setClick();
    }
    private void init(){
        truyenTranhArrayList = new ArrayList<>();
        truyenTranhArrayList.add(new TruyenTranh("Biorg Trinity","Chapter 13","https://st.nettruyenbing.com/data/comics/142/biorg-trinity.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Atsumare! Fushigi Kenkyuubu","Chapter 74","https://st.nettruyenbing.com/data/comics/0/atsumare-fushigi-kenkyuubu.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Một gia đình như vậy có đáng để giữ lại không?","Chapter 46","https://st.nettruyenbing.com/data/comics/78/mot-gia-dinh-nhu-vay-co-dang-de-giu-lai-170.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Sủng Bé Cá Koi 3 Tuổi Rưỡi","Chapter 190","https://st.nettruyenbing.com/data/comics/233/sung-be-ca-koi-3-tuoi-ruoi.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Biorg Trinity","Chapter 13","https://st.nettruyenbing.com/data/comics/142/biorg-trinity.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Atsumare! Fushigi Kenkyuubu","Chapter 74","https://st.nettruyenbing.com/data/comics/0/atsumare-fushigi-kenkyuubu.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Một gia đình như vậy có đáng để giữ lại không?","Chapter 46","https://st.nettruyenbing.com/data/comics/78/mot-gia-dinh-nhu-vay-co-dang-de-giu-lai-170.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Sủng Bé Cá Koi 3 Tuổi Rưỡi","Chapter 190","https://st.nettruyenbing.com/data/comics/233/sung-be-ca-koi-3-tuoi-ruoi.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Biorg Trinity","Chapter 13","https://st.nettruyenbing.com/data/comics/142/biorg-trinity.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Atsumare! Fushigi Kenkyuubu","Chapter 74","https://st.nettruyenbing.com/data/comics/0/atsumare-fushigi-kenkyuubu.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Một gia đình như vậy có đáng để giữ lại không?","Chapter 46","https://st.nettruyenbing.com/data/comics/78/mot-gia-dinh-nhu-vay-co-dang-de-giu-lai-170.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Sủng Bé Cá Koi 3 Tuổi Rưỡi","Chapter 190","https://st.nettruyenbing.com/data/comics/233/sung-be-ca-koi-3-tuoi-ruoi.jpg"));

        adapter = new TruyenTranhAdapter(this, 0, truyenTranhArrayList);
    }
    private void anhXa(){
        gdvDSTruyen = findViewById(R.id.gdvDSTruyen);
        edtTimKiem = findViewById(R.id.edtTimKiem);
    }
    private void setUp(){
        gdvDSTruyen.setAdapter(adapter);
    }
    private void setClick(){
        edtTimKiem.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String s = edtTimKiem.getText().toString();
                adapter.sortTruyen(s);
            }
        });
    }
}