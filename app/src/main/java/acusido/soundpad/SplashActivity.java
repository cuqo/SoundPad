package acusido.soundpad;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by nasty on 4/11/2016.
 */

public class SplashActivity extends AppCompatActivity {
    private static int SPLASH_TIME=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);


        /*Thread closeActivity = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Log.e("Test","Sleep");
                    setContentView(R.layout.splash);
                    Thread.sleep(3000);

                } catch (Exception e) {
                    e.getLocalizedMessage();
                }
            }
        });
        closeActivity.run();*/

        /*Thread timerThread = new Thread(){
            public void run(){
                try{
                    setContentView(R.layout.splash);
                    sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        timerThread.run();*/

        //finish();
        //Intent intent = new Intent(this, MainActivity.class);
        //startActivity(intent);
        //finish();

        //new loadData().execute();

        new CountDownTimer(4000, 50) {

            @Override
            public void onTick(long arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onFinish() {

                finish();


            }
        }.start();






    }

    /*private class loadData extends AsyncTask<Void, Void, Void> {


        @Override
        protected Void doInBackground(Void... voids) {
            //this.context.getApplicationContext();
            Sons sons = new Sons();
            sons.buildSP(getApplicationContext());
            sons.loadSP(getApplicationContext());

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
