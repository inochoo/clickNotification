package com.sibaamap.clicknotification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListProductActivity extends AppCompatActivity {

    private Button btnGoToDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_product);

        getSupportActionBar().setTitle("List Product");

        btnGoToDetail = findViewById(R.id.btn_go_to_detail);

        btnGoToDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListProductActivity.this,DetailActivity.class);
                startActivity(intent);
            }
        });


    }
}