package com.example.appbangiaycomplete.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.appbangiaycomplete.Adapter.OderAdapter;
import com.example.appbangiaycomplete.Product;
import com.example.appbangiaycomplete.R;

import java.util.ArrayList;
import java.util.List;

public class AddOderProduct extends AppCompatActivity {
    EditText edtNameProduct, edtBrand, edtPrice, edtAmount, edtDes, edtSize, edtColor;
    ImageButton imgBtnAddPhoto;
    Button btnSave;
    private Product product;
    private List<Product> mProduct;
    private OderAdapter oderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.them_san_pham02);
        anhXa();
        mProduct = new ArrayList<>();
        oderAdapter = new OderAdapter(AddOderProduct.this, mProduct);
    }

    private void anhXa() {
        edtNameProduct = findViewById(R.id.ten_sp);
        edtNameProduct.getText().toString().trim();
        edtBrand = findViewById(R.id.hang);
        edtNameProduct.getText().toString().trim();

        edtPrice = findViewById(R.id.gia);
        edtNameProduct.getText().toString().trim();

        edtAmount = findViewById(R.id.so_luong);
        edtNameProduct.getText().toString().trim();

        edtDes = findViewById(R.id.noi_dung);
        edtNameProduct.getText().toString().trim();

        edtSize = findViewById(R.id.size);
        edtNameProduct.getText().toString().trim();

        edtColor = findViewById(R.id.mau);
        edtNameProduct.getText().toString().trim();

        imgBtnAddPhoto = findViewById(R.id.anh);

        btnSave = findViewById(R.id.btn_save);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mProduct.add(product);
                Toast.makeText(AddOderProduct.this, "đã lưu ", Toast.LENGTH_SHORT).show();
                oderAdapter.notifyDataSetChanged();
            }
        });


    }


}