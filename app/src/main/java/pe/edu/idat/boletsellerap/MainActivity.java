package pe.edu.idat.boletsellerap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import pe.edu.idat.boletsellerap.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnAcceder.setOnClickListener(this);
        binding.btnCrearCuenta.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnAcceder:accederMenu();
                break;
            case R.id.btnCrearCuenta:irAlRegistro();
                break;
        }
    }

    private void accederMenu(){
        Intent intentAcceder = new Intent(this,MenuActivity.class);
        startActivity(intentAcceder);
    }

    private void irAlRegistro(){
        Intent intentregister = new Intent(this, RegistroActivity.class);
        startActivity(intentregister);
    }
}