package com.example.appbangiaycomplete.fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.appbangiaycomplete.R;
import com.example.appbangiaycomplete.fragment.QuanLySanPham;

public class ThemSanPhamFragment extends Fragment  {
//    private TextView tvNname ;
//    private Button btnAddProduct;
//    private View mView ;
//    public ThemSanPhamFragment() {
//
//    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
   return  inflater.inflate(R.layout.them_san_pham02, container, false);


//        return mView ;
    }
}