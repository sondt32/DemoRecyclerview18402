package net.spx.demorecyclerview18402.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import net.spx.demorecyclerview18402.DTO.CatDTO;
import net.spx.demorecyclerview18402.R;

import java.util.ArrayList;

public class CatAdapter extends  RecyclerView.Adapter <CatAdapter.ViewHolder>{
    ArrayList<CatDTO> listCat;
    Context context;

    public CatAdapter(ArrayList<CatDTO> listCat, Context context) {
        this.listCat = listCat;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        return null; // xóa dòng null này đi
        LayoutInflater inflater =  ( (Activity) context ).getLayoutInflater();
        View v = inflater.inflate(R.layout.row_cat, parent, false);

        return  new CatAdapter.ViewHolder( v );
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // gắn dữ liệu lên giao diện
        CatDTO objCat = listCat.get( position );
        holder.tv_id.setText(  objCat.getId() +""  ); // không quên chuyển kiểu số về chuỗi
        holder.tv_name.setText( objCat.getName()  );

        // sau này muốn tương tac với view nào thì viết ở đây
    }

    @Override
    public int getItemCount() {
        return listCat.size(); // không được quên
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView tv_id, tv_name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // ánh xạ view
            tv_id = itemView.findViewById(R.id.tv_id);
            tv_name = itemView.findViewById(R.id.tv_name);
        }
    }
}
