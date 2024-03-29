package com.example.rickshaw;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity
{
    private Button DriverWelcomeButton;
    private Button CustomerWelcomeButton;

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener firebaseAuthListner;
    private FirebaseUser currentUser;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);





//        mAuth = FirebaseAuth.getInstance();
//
//        firebaseAuthListner = new FirebaseAuth.AuthStateListener() {
//            @Override
//            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth)
//            {
//                currentUser = FirebaseAuth.getInstance().getCurrentUser();
//
//                if(currentUser != null)
//                {
//                    Intent intent = new Intent(WelcomeActivity.this, WelcomeActivity.class);
//                    startActivity(intent);
//                }
//            }
//        };





        DriverWelcomeButton = (Button) findViewById(R.id.driver_welcome_btn);
        CustomerWelcomeButton = (Button) findViewById(R.id.customer_welcome_btn);

        DriverWelcomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent DriverIntent = new Intent(WelcomeActivity.this, DriverLoginRegisterActivity.class);
                startActivity(DriverIntent);
            }
        });

        CustomerWelcomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent CustomerIntent = new Intent(WelcomeActivity.this, CustomerLoginRegisterActivity.class);
                startActivity(CustomerIntent);
            }
        });
    }



//    @Override
//    protected void onStart()
//    {
//        super.onStart();
//
//        mAuth.addAuthStateListener(firebaseAuthListner);
//    }
//
//
//    @Override
//    protected void onStop()
//    {
//        super.onStop();
//
//        mAuth.removeAuthStateListener(firebaseAuthListner);
//    }
}
