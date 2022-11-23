package vicdron.com.maispromocoes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;

public class SplashScreenActivity extends AppCompatActivity {

    ImageView logo;
    LottieAnimationView lottieAnimationView;
    TextView textv;
    final private static int SPLASH_TIME_OUT=2000;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_splash_screen);
        //    getSupportActionBar().hide();

        new Handler().postDelayed(() -> SplashScreenActivity.this.TelaInicial(),SPLASH_TIME_OUT);

        logo = findViewById(R.id.logo);
        lottieAnimationView = findViewById(R.id.lottie);
        textv=findViewById(R.id.tv);


        int unicode=0x270c;
        String emoji = getEmoji(unicode);

        String text="Criado por  "+emoji+"  by  VICDRON";
        textv.setText(text);

    }

    public String getEmoji(int uni) {
        return new String(Character.toChars(uni));
    }

    private void TelaInicial() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

}