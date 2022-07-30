package com.example.appbangiaycomplete.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.appbangiaycomplete.R;

public class QuanLySanPham extends Fragment {
    Button btnAddProduct, btnEditProduct, btnDeleteProduct;
//lang nghe gọi activity
//private static EditText edittext;
//
//    QuanLySanPhamListener activityCallback;
//    public interface QuanLySanPhamListener {
//        public void onButtonClick(int fontsize, String text);
//    }
//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        try {
//            activityCallback = (QuanLySanPhamListener) context;
//        } catch (ClassCastException e) {
//            throw new ClassCastException(context.toString()
//                    + " You must implement FirstFragmentListener");
//        }
//    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        // co View mới dudocj anh xa trong fragment
        View view = inflater.inflate(R.layout.quan_ly_san_pham, container, false);
        init(view);
        btnAddProduct.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "", Toast.LENGTH_SHORT).show();
                Fragment addProductFragment = new ThemSanPhamFragment();
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.quan_ly_san_pham, addProductFragment);
                fragmentTransaction.commit();
            }
        });
        return view;

    }

    //anh xa
    private void init(View view) {
        btnAddProduct = (Button) view.findViewById(R.id.btn_add_product);
        btnEditProduct = (Button) view.findViewById(R.id.btn_edit_product);
        btnDeleteProduct = (Button) view.findViewById(R.id.btn_delete_product);
    }

//    private void buttonClicked(View view) {
//        activityCallback.onButtonClick(20,edittext.getText().toString());
//    }
}
