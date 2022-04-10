package hcmute.edu.vn.nhom6.zaloclone.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import hcmute.edu.vn.nhom6.zaloclone.R;
import hcmute.edu.vn.nhom6.zaloclone.databinding.ActivityForgotPasswordBinding;
import hcmute.edu.vn.nhom6.zaloclone.databinding.ActivitySignInBinding;

public class ForgotPasswordActivity extends AppCompatActivity {

    private ActivityForgotPasswordBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityForgotPasswordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners() {
        binding.textSignIn.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), SignInActivity.class)));
    }
}