package vicdron.com.maispromocoes;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import vicdron.com.maispromocoes.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflate the layout using View Binding
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Usar a referência do binding para o BottomNavigationView
        BottomNavigationView navView = binding.navView;

        // Configuração atrasada do NavController
        binding.getRoot().post(() -> {
            // Obter o NavController
            NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);

            // Configurar a ActionBar com o NavController
            AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                    R.id.navigation_pelando, R.id.navigation_jacotei, R.id.navigation_promobit, R.id.navigation_zoom)
                    .build();

            //  NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

            // Configurar o BottomNavigationView com o NavController
            NavigationUI.setupWithNavController(navView, navController);
        });
    }
}