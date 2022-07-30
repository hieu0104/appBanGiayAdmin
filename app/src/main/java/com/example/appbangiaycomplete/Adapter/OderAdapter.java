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

public class OderAdapter extends RecyclerView.Adapter<OderAdapter.OderViewHolder> {
private  List<Product> mListOderProduct;

    public OderAdapter(List<Product> mListOderProduct) {
        this.mListOderProduct = mListOderProduct;
    }

    @NonNull
    @Override
    public OderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chi_tiet_don_hang_custom,
                parent, false);
        return new OderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OderViewHolder holder, int position) {
        Product oderProduct = mListOderProduct.get(position);
        if (oderProduct == null) {
            return;
        }
        holder.imgProduct.setImageResource(oderProduct.getImageProduct());
        holder.tvTxtProductName.setText(oderProduct.getProductName());
        holder.tvTxtBrand.setText(oderProduct.getBrand());
        holder.tvOderTxtPrice.setText(oderProduct.getPrice());
        holder.tvTxtSize.setText(oderProduct.getSize());
        holder.tvTxtColor.setText(oderProduct.getColor());
        holder.tvOderTxtAmount.setText(oderProduct.getAmount());
    }

    @Override
    public int getItemCount() {
        if (mListOderProduct != null) {
            return mListOderProduct.size();
        }
        return 0;
    }

    public class OderViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgProduct;
        private TextView tvProductName;
        private TextView tvTxtProductName;
        private TextView tvBrand;
        private TextView tvTxtBrand;
        private TextView tvOderPrice;
        private TextView tvOderTxtPrice;
        private TextView tvCurrencyUnit;
        private CheckBox checkBox;
        private TextView tvsize;
        private TextView tvTxtSize;
        private TextView tvColor;
        private TextView tvTxtColor;
        private TextView tvOderAmount;
        private TextView tvOderTxtAmount;

        public OderViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProduct = itemView.findViewById(R.id.img_oder_product);
            tvProductName = itemView.findViewById(R.id.tv_product_name);
            tvTxtProductName = itemView.findViewById(R.id.tv_txt_name_product);
            tvBrand = itemView.findViewById(R.id.tv_brand);
            tvTxtBrand = itemView.findViewById(R.id.tv_txt_brand);
            tvOderPrice = itemView.findViewById(R.id.tv_oder_price);
            tvOderTxtPrice = itemView.findViewById(R.id.tv_oder_txt_price);
            tvCurrencyUnit = itemView.findViewById(R.id.tv_currency_unit);
            checkBox = itemView.findViewById(R.id.cb_checkBox);
            tvsize = itemView.findViewById(R.id.tv_size);
            tvTxtSize = itemView.findViewById(R.id.tv_txt_size);
            tvColor = itemView.findViewById(R.id.tv_color);
            tvTxtColor = itemView.findViewById(R.id.tv_txt_color);
            tvOderAmount = itemView.findViewById(R.id.tv_amount);
            tvOderTxtAmount = itemView.findViewById(R.id.tv_oder_txt_amount);
        }

    }
}
