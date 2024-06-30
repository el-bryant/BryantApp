package code.segael.bryantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import code.segael.bryantapp.databinding.ActivityRegistroBinding;

public class RegistroActivity extends AppCompatActivity {
    ActivityRegistroBinding binding;
    public static String correo = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegistroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        if (getIntent().getExtras() != null) {
//            correo = getIntent().getStringExtra("correo");
//            binding.tvCorreo.setText(correo);
//        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        binding.tvCorreo.setText(correo);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(RegistroActivity.this, MainActivity.class));
        finish();
    }
}