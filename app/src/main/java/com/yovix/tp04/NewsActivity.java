package com.yovix.tp04;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NewsActivity extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate (Bundle savedInBundle){
        super.onCreate(savedInBundle);
        setContentView(R.layout.news_activity);

        TextView name = findViewById(R.id.username_details);
        Intent intent_get = getIntent();
        name.setText(intent_get.getStringExtra("username"));

        Button btn_lib = findViewById(R.id.btn_lib);
        Button btn_logout = findViewById(R.id.btn_logout);
        Button btn_details = findViewById(R.id.btn_details);

        btn_lib.setOnClickListener(this);
        btn_logout.setOnClickListener(this);
        btn_details.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        Intent intent;
        switch(v.getId()){
            case R.id.btn_lib:
                String url = "https://developer.android.com/reference/android/content/Intent";
                intent = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
                startActivity(intent);
                break;
            case R.id.btn_logout:
                Log.i("message","temchi");
                intent = new Intent(this,LoginActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.btn_details:
                intent = new Intent(this,DetailsActivity.class);
                startActivity(intent);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }
    }
}

/*
public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_activity);
        setTitle(getLocalClassName());

        TextView name = findViewById(R.id.username_details);
        Intent intent_get = getIntent();
        name.setText(intent_get.getStringExtra("username"));

        Button lib_about = findViewById(R.id.btn_lib);
        String url="https://developer.android.com/reference/android/content/Intent";
        Intent intent_about =new Intent(Intent.ACTION_VIEW, Uri.parse(url));

        lib_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent_about);
            }
        });

        Button logout = findViewById(R.id.btn_logout);
        Intent intent_logout =new Intent(this, LoginActivity.class);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent_logout);
                finish();
            }
        });

        Button details = findViewById(R.id.btn_details);
        Intent intent_details =new Intent(this, DetailsActivity.class);

        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent_details);
            }
        });
    }

 */
