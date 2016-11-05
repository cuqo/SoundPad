package acusido.soundpad;

import android.content.Intent;
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
    //int bass1, bass2, bass3, bass4, piano1, piano2, piano3, piano4, synth1, synth2, synth3, synth4, bass1so, bass2so, bass3so, bass4so, piano1so, piano2so, piano3so, piano4so, synth1so, synth2so, synth3so, synth4so, botoid;
    //boolean loaded = false;
    CountDownTimer temps1, temps2, temps3, temps4, temps5, temps6, temps7, temps8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Intent intent = new Intent(this, SplashActivity.class);
        startActivity(intent);
        setContentView(R.layout.activity_main);
        sons.buildSP(this);
        sons.loadSP(this);

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

        //Countdown per apagar botons click
        botons.countDownClick(verd1, verd2, verd3, verd4, lila1, lila2, lila3, lila4);
    }

    @Override
    protected void onPause() {
        super.onPause();
        sons.soundPause();
        botons.countZero();


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        sons.soundDestroy();
        sons.setLoaded(false);
    }

    @Override
    protected void onStop() {
        super.onStop();
        sons.soundPause();
        botons.countZero();
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
        return sons.soTouch(id, event,taronja1,taronja2,taronja3,taronja4);

    }


}
