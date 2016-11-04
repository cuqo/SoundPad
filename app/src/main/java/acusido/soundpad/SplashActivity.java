package acusido.soundpad;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by nasty on 4/11/2016.
 */

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    /*@Override
    protected void onStart() {
        //super.onCreate(savedInstanceState);
        super.onStart();

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }*/
}
