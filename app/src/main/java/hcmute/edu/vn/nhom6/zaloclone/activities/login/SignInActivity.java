package hcmute.edu.vn.nhom6.zaloclone.activities.login;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import hcmute.edu.vn.nhom6.zaloclone.activities.MainActivity;
import hcmute.edu.vn.nhom6.zaloclone.databinding.ActivitySignInBinding;

public class SignInActivity extends AppCompatActivity {

    private ActivitySignInBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners() {
        binding.buttonSignUp.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), SignUpActivity.class)));

        binding.buttonSignIn.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), MainActivity.class)));

        binding.textForgotPassword.setOnClickListener(view ->
                startActivity(new Intent(getApplicationContext(), ForgotPasswordActivity.class)));
    }
}