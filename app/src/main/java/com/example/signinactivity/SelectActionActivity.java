package com.example.signinactivity;

import static com.example.signinactivity.SignInActivity.firebaseHelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SelectActionActivity extends AppCompatActivity {

    public final String TAG = "Denna";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_action);
    }

    public void showMemories(View view) {

    }

    public void addMemories(View view) {
        Intent intent = new Intent(SelectActionActivity.this, AddMemoryActivity.class);
        setContentView(R.layout.activity_add_memory);
    }

    public void logOutClicked(View view) {
        firebaseHelper.logOutUser();
        Log.i(TAG, "user logged out");
        Intent intent = new Intent(SelectActionActivity.this, SignInActivity.class);
        startActivity(intent);
    }
}


