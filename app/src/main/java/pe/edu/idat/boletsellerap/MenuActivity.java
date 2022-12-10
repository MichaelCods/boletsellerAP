package pe.edu.idat.boletsellerap;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;
import pe.edu.idat.boletsellerap.databinding.ActivityMenuBinding;

public class MenuActivity extends AppCompatActivity {

    private ActivityMenuBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.nav_host_fragment);
        NavController navCo = navHostFragment.getNavController();
        NavigationUI.setupWithNavController(binding.bottombarnavigationview,navCo);

      /*  binding.bottombarnavigationview.setOnItemSelectedListener( item -> {

                    switch (item.getItemId()) {
                        case R.id.inicio:
                            break;
                        case R.id.buscareventos:
                            break;
                        case R.id.subirticket:
                            break;
                        case R.id.perfilusuario:
                            break;
                    }

                    return true;
                }
        ); */



    }
}