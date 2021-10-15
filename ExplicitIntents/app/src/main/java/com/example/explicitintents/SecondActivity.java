package com.example.explicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            String imgIndex = bundle.getString("ImageIndex");
            setImage(imgIndex);
        }
    }

    private void setImage(String index) {
        ImageView imgView = (ImageView)findViewById(R.id.imageViewFood);

        switch (index){
            case "1":
                imgView.setImageResource(R.drawable.burger);
                break;
            case "2":
                imgView.setImageResource(R.drawable.chicken);
                break;
            case "3":
                imgView.setImageResource(R.drawable.drinks);
                break;
            case "4":
                imgView.setImageResource(R.drawable.mix);
                break;
            default:
                imgView.setImageResource(R.drawable.burger);

        }
    }
}