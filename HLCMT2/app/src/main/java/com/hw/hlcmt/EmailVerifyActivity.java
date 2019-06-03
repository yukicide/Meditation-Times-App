package com.hw.hlcmt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class EmailVerifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_verify);

        final FirebaseAuth fa = FirebaseAuth.getInstance();

        //String id = fa.getUid();
        //String id2 = fa.getCurrentUser().getUid();
        //String email = fa.getCurrentUser().getEmail();

        //TextView tv = findViewById(R.id.textView4);
        //tv.setText("UID 1 - " + id + "\nUID2 - " + id2 + "\nEmail - " + email);

        Button confirm = findViewById(R.id.btnConfirmEmail);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fa.signOut();
                startActivity(new Intent(EmailVerifyActivity.this, LoginActivity.class));
                finish();
            }
        });
    }
}
