package code.segael.bryantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import code.segael.bryantapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.tvCrearCuenta.setOnClickListener(v -> {
            String correo = "";
            if (binding.etCorreo.getText() != null) {
                correo = binding.etCorreo.getText().toString();
            }
            startActivity(new Intent(MainActivity.this, RegistroActivity.class));
            RegistroActivity.correo = correo;
            finish();
        });
    }
}