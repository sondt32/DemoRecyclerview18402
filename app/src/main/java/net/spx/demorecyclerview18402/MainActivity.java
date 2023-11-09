package net.spx.demorecyclerview18402;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import net.spx.demorecyclerview18402.Adapter.CatAdapter;
import net.spx.demorecyclerview18402.DAO.CatDAO;
import net.spx.demorecyclerview18402.DTO.CatDTO;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    CatDAO catDAO;
    ArrayList<CatDTO> listCat;
    RecyclerView rc_cat;
    CatAdapter catAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rc_cat = findViewById(R.id.rc_cat);

        catDAO = new CatDAO(this);

        listCat = catDAO.getList();

        catAdapter = new CatAdapter(listCat, this);

        rc_cat.setAdapter( catAdapter );

    }
}