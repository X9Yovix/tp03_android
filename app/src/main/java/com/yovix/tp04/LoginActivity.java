package com.yovix.tp04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private static final String TAG="message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        setTitle(getLocalClassName());

        Button login = findViewById(R.id.btn_login);
        TextView i_username = findViewById(R.id.input_username);
        TextView i_password = findViewById(R.id.input_password);

        Intent intent = new Intent(this, NewsActivity.class);

        AppContext my_app = (AppContext) this.getApplicationContext();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i_username.getText().toString().isEmpty() || i_password.getText().toString().isEmpty()){
                    Toast t = Toast.makeText(getApplicationContext(),"input is empty",Toast.LENGTH_SHORT);
                    t.show();
                }else {
                    intent.putExtra("username", i_username.getText().toString());
                    my_app.setUsed_username(i_username.getText().toString());
                    startActivity(intent);
                    finish();
                }
            }
        });
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.i(TAG,"terminaison de l'activité "+getLocalClassName());
    }
}