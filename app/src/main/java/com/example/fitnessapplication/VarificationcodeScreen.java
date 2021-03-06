 package com.example.fitnessapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class VarificationcodeScreen extends AppCompatActivity {
     //EditText code;
    //The edittext to input the code
    private EditText editTextCode;
    Button btncode;

    //It is the verification id that will be sent to the user
    private String mVerificationId;

    //firebase auth object
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_varificationcode_screen);
        getSupportActionBar().hide();
        editTextCode=findViewById(R.id.codeverify);
        btncode=findViewById(R.id.btnverification);

        //receiving the phone number from the previous activity
        Bundle extras = getIntent().getExtras();
        String phonenumber = extras.getString("PN");//The key argument here must match that used in the other activity

       //initializing objects
        mAuth = FirebaseAuth.getInstance();
        //editTextCode = findViewById(R.id.editTextCode);



        sendVerificationCode(phonenumber);
        //Toast.makeText(this, ""+phonenumber, Toast.LENGTH_SHORT).show();


        //if the automatic sms detection did not work, user can also enter the code manually
        //so adding a click listener to the button
        btncode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String code = editTextCode.getText().toString().trim();
                if (code.isEmpty() || code.length() < 6) {
                    editTextCode.setError("Enter valid code");
                    editTextCode.requestFocus();
                    return;
                }

                //verifying the code entered manually
                verifyVerificationCode(code);
            }
        });

        //the method is sending verification code
        //the country id is concatenated
        //you can take the country id as user input as well
    }

    private void sendVerificationCode(String mobile) {
        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                "+" + mobile,
                60,
                TimeUnit.SECONDS,VarificationcodeScreen.this,
                mCallbacks);
        //PhoneAuthProvider.getInstance().verifyPhoneNumber(mobile,60,TimeUnit.SECONDS, (Activity) TaskExecutors.MAIN_THREAD,mCallbacks);
    }
    //the callback to detect the verification status
    private PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallbacks = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
        @Override
        public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {

            //Getting the code sent by SMS
            String code = phoneAuthCredential.getSmsCode();

            //sometime the code is not detected automatically
            //in this case the code will be null
            //so user has to manually enter the code
            if (code != null) {
                editTextCode.setText(code);
                //verifying the code
                verifyVerificationCode(code);
            }
        }

        @Override
        public void onVerificationFailed(FirebaseException e) {
            Toast.makeText(VarificationcodeScreen.this, e.getMessage(), Toast.LENGTH_LONG).show();
        }

        @Override
        public void onCodeSent(String s, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
            super.onCodeSent(s, forceResendingToken);

            //storing the verification id that is sent to the user
            mVerificationId = s;
        }
    };

    private void verifyVerificationCode(String code) {
        //creating the credential
        PhoneAuthCredential credential = PhoneAuthProvider.getCredential(mVerificationId, code);

        //signing the user
        signInWithPhoneAuthCredential(credential);
    }

    private void signInWithPhoneAuthCredential(PhoneAuthCredential credential) {
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(VarificationcodeScreen.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            //verification successful we will start the profile activity
                            Intent intent = new Intent(VarificationcodeScreen.this, GenderSelectionscreen.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);

                        } else {

                            //verification unsuccessful.. display an error message

                            if (task.getException() instanceof FirebaseAuthInvalidCredentialsException) {
                                Toast.makeText(VarificationcodeScreen.this, "You Entered the Wrong Code",
                                        Toast.LENGTH_LONG).show();

                            }
                        }
                    }
                });
    }

}
