package com.yovix.tp04;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);
        setTitle(getLocalClassName());

        AppContext my_app = (AppContext) this.getApplicationContext();
        String context = my_app.getUsed_username();

        TextView username_details= findViewById(R.id.username_details);
        username_details.setText(context);
        /*Application context = my_app.getMyApp();

        TextView username_details= findViewById(R.id.username_details);
        username_details.setText(context.getText(R.id.input_username));
*/

        Button btn_ok = findViewById(R.id.btn_ok);
        Intent i = new Intent(this, NewsActivity.class);
        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });
    }
}