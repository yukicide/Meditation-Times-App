package com.yukisoft.hlcmt.JavaActivities.Admin;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.view.View;

import com.google.gson.Gson;
import com.yukisoft.hlcmt.JavaActivities.Dashboard.HomeActivity;
import com.yukisoft.hlcmt.JavaRepositories.Models.UserModel;
import com.yukisoft.hlcmt.MainActivity;
import com.yukisoft.hlcmt.R;

public class AdminActivity extends AppCompatActivity {
    private UserModel currentUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        Intent i = getIntent();
        String userJSON = i.getStringExtra(MainActivity.LOGGED_IN_USER);
        currentUser = (new Gson()).fromJson(userJSON, UserModel.class);

        CardView users = findViewById(R.id.btnUserManagement);
        users.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AdminActivity.this, UserManagementActivity.class)
                        .putExtra(MainActivity.LOGGED_IN_USER, (new Gson()).toJson(currentUser)));
            }
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, HomeActivity.class)
                .putExtra(MainActivity.LOGGED_IN_USER, (new Gson()).toJson(currentUser)));
        finish();
    }
}
