package com.example.appbangiaycomplete.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appbangiaycomplete.Activity.MainActivity;
import com.example.appbangiaycomplete.Adapter.OderAdapter;
import com.example.appbangiaycomplete.Product;
import com.example.appbangiaycomplete.R;

import java.util.ArrayList;
import java.util.List;

public class QuanLyDonHangFragment extends Fragment {
    private RecyclerView rcvOder;
    private View mview;
    private MainActivity mMainActivity;
    Button btnAddProduct, btnEditProduct, btnDeleteProduct;


    public QuanLyDonHangFragment() {

    }

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mview = inflater.inflate(R.layout.chi_tiet_don_hang, container, false);
        rcvOder = mview.findViewById(R.id.rcv_oder);
        mMainActivity = (MainActivity) getActivity();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mMainActivity);
        rcvOder.setLayoutManager(linearLayoutManager);
        OderAdapter oderAdapter = new OderAdapter(getListOderProduct());
        rcvOder.setAdapter(oderAdapter);
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(mMainActivity,
                DividerItemDecoration.VERTICAL);
        rcvOder.addItemDecoration(itemDecoration);

        return mview;
    }

    private List<Product> getListOderProduct() {
        List<Product> listOderProduct = new ArrayList<>();
        listOderProduct.add(new Product(R.drawable.img_giay, "adidas", "adidas",
                200, 2, "hàng chính hãng ", 32, "trắng "));

        return listOderProduct;
    }
}
