package com.example.appbangiaycomplete.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appbangiaycomplete.Product;
import com.example.appbangiaycomplete.R;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    private List<Product> mListProduct;

    public ProductAdapter(List<Product> mListProductProduct) {
        this.mListProduct = mListProductProduct;
    }

    @NonNull
    @Override
    public ProductAdapter.ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.xoa_san_pham_custom, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product product = mListProduct.get(position);
        if (product == null) {
            return;
        }
        holder.imgProduct.setImageResource(product.getImageProduct());
        holder.tvProduct.setText(product.getProductName());
        holder.tvProduct.setText(product.getPrice());
        holder.tvAmount.setText(product.getAmount());

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public class ProductViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgProduct;
        private TextView tvProduct;
        private TextView tvPrice;
        private TextView tvAmount;
        private CheckBox cbCheckBox;
        public ProductViewHolder(View itemView) {
            super(itemView);
            imgProduct = itemView.findViewById(R.id.image_product);
            tvProduct = itemView.findViewById(R.id.name_product);
            tvPrice = itemView.findViewById(R.id.tv_price);
            tvAmount = itemView.findViewById(R.id.tv_amount);
            cbCheckBox = itemView.findViewById(R.id.cb_checkBox);

        }
    }
}
