package acusido.soundpad;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by nasty on 4/11/2016.
 */

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //setContentView(R.layout.splash);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();

        //new loadData().execute();


    }

    /*private class loadData extends AsyncTask<Void, Void, Void> {
        Context context;

        public loadData(Context context) {
            this.context = context;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            //this.context.getApplicationContext();
            Sons sons = new Sons();
            sons.buildSP(SoundPad.getContext());
            sons.loadSP(SoundPad.getContext());
            return null;
        }

        @Override
        protected void onPostExecute(Void voids) {
            super.onPostExecute(voids);
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }*/
}
