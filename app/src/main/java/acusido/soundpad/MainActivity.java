package acusido.soundpad;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.Image;
import android.media.SoundPool;
import android.os.Build;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {
    Sons sons = new Sons();
    Botons botons = new Botons();
    ImageButton verd1, verd2, verd3, verd4, lila1, lila2, lila3, lila4, taronja1, taronja2, taronja3, taronja4;
    //SoundPool soundpool;
    int bass1, bass2, bass3, bass4, piano1, piano2, piano3, piano4, synth1, synth2, synth3, synth4, bass1so, bass2so, bass3so, bass4so, piano1so, piano2so, piano3so, piano4so, synth1so, synth2so, synth3so, synth4so, botoid;
    //boolean loaded = false;
    CountDownTimer temps1, temps2, temps3, temps4, temps5, temps6, temps7, temps8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        verd1 = (ImageButton) findViewById(R.id.verd1);
        verd2 = (ImageButton) findViewById(R.id.verd2);
        verd3 = (ImageButton) findViewById(R.id.verd3);
        verd4 = (ImageButton) findViewById(R.id.verd4);
        lila1 = (ImageButton) findViewById(R.id.lila1);
        lila2 = (ImageButton) findViewById(R.id.lila2);
        lila3 = (ImageButton) findViewById(R.id.lila3);
        lila4 = (ImageButton) findViewById(R.id.lila4);
        taronja1 = (ImageButton) findViewById(R.id.taronja1);
        taronja2 = (ImageButton) findViewById(R.id.taronja2);
        taronja3 = (ImageButton) findViewById(R.id.taronja3);
        taronja4 = (ImageButton) findViewById(R.id.taronja4);

        sons.buildSP(this);
        sons.loadSP(this);


    }

    @Override
    protected void onStart() {
        super.onStart();

        verd1.setOnClickListener(this);
        verd2.setOnClickListener(this);
        verd3.setOnClickListener(this);
        verd4.setOnClickListener(this);

        lila1.setOnClickListener(this);
        lila2.setOnClickListener(this);
        lila3.setOnClickListener(this);
        lila4.setOnClickListener(this);

        taronja1.setOnTouchListener(this);
        taronja2.setOnTouchListener(this);
        taronja3.setOnTouchListener(this);
        taronja4.setOnTouchListener(this);

        //perque puguem fer servir els controls de volum
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);




        //fer que el boto es pari al cap de 2 segons
        /*temps1 = new CountDownTimer(2000, 50) {

            @Override
            public void onTick(long arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onFinish() {

                verd1.setBackgroundResource(R.drawable.azulverde);

            }
        }.start();

        temps2 = new CountDownTimer(2000, 50) {

            @Override
            public void onTick(long arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onFinish() {

                verd2.setBackgroundResource(R.drawable.azulverde);


            }
        }.start();

        temps3 = new CountDownTimer(2000, 50) {

            @Override
            public void onTick(long arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onFinish() {

                verd3.setBackgroundResource(R.drawable.azulverde);


            }
        }.start();

        temps4 = new CountDownTimer(2000, 50) {

            @Override
            public void onTick(long arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onFinish() {

                verd4.setBackgroundResource(R.drawable.azulverde);


            }
        }.start();

        temps5 = new CountDownTimer(8000, 50) {

            @Override
            public void onTick(long arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onFinish() {

                lila1.setBackgroundResource(R.drawable.lila);


            }
        }.start();

        temps6 = new CountDownTimer(8000, 50) {

            @Override
            public void onTick(long arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onFinish() {

                lila2.setBackgroundResource(R.drawable.lila);


            }
        }.start();

        temps7 = new CountDownTimer(8000, 50) {

            @Override
            public void onTick(long arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onFinish() {

                lila3.setBackgroundResource(R.drawable.lila);


            }
        }.start();

        temps8 = new CountDownTimer(8000, 50) {

            @Override
            public void onTick(long arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onFinish() {

                lila4.setBackgroundResource(R.drawable.lila);


            }
        }.start();*/
        botons.countDownClick(verd1, verd2, verd3, verd4, lila1, lila2, lila3, lila4);
    }

    @Override
    protected void onPause() {
        super.onPause();
        //soundpool.autoPause();


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //soundpool.release();
        //soundpool = null;
        sons.setLoaded(false);
    }

    @Override
    protected void onStop() {
        super.onStop();
        //soundpool.autoPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    //botons que fas click
    @Override
    public void onClick(View v) {
        int id = v.getId();

        sons.soClick(id);
        botons.botonsClick(id, verd1, verd2, verd3, verd4, lila1, lila2, lila3, lila4);

    }

    //botons que mantens pitjat
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int id = v.getId();

        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            //taronja1.setBackgroundResource(R.drawable.naranjaa);
            return sons.soTouchDown(id, event);
        }


        if (event.getAction() == MotionEvent.ACTION_UP) {
            //taronja1.setBackgroundResource(R.drawable.naranja);
            return sons.soTouchUp(id, event);
        }
        return false;


    }


}
