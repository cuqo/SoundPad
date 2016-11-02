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
    ImageButton verd1, verd2, verd3, verd4, lila1, lila2, lila3, lila4,taronja1,taronja2,taronja3,taronja4;
    //SoundPool soundpool;
    int bass1,bass2,bass3,bass4, piano1,piano2,piano3,piano4,synth1,synth2,synth3,synth4, bass1so,bass2so,bass3so,bass4so,piano1so,piano2so,piano3so,piano4so,synth1so,synth2so,synth3so,synth4so, botoid;
    //boolean loaded = false;
    public CountDownTimer temps1, temps2, temps3, temps4,temps5,temps6,temps7,temps8;

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
        taronja1=(ImageButton) findViewById(R.id.taronja1);
        taronja2=(ImageButton) findViewById(R.id.taronja2);
        taronja3=(ImageButton) findViewById(R.id.taronja3);
        taronja4=(ImageButton) findViewById(R.id.taronja4);

        sons.buildSP(this);
        sons.loadSP(this);


    }

    @Override
    protected void onStart(){
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

        //carregar les pistes d'audio
        /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes attributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_GAME)
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .build();
            soundpool = new SoundPool.Builder()
                    .setAudioAttributes(attributes)
                    .setMaxStreams(10)
                    .build();
            soundpool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
                @Override
                public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
                    loaded = true;
                }
            });

        } else {
            soundpool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
            soundpool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
                @Override
                public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
                    loaded = true;
                }
            });
        }

        piano1 = soundpool.load(this, R.raw.piano1, 1);
        piano2 = soundpool.load(this, R.raw.piano2, 1);
        piano3 = soundpool.load(this, R.raw.piano3, 1);
        piano4 = soundpool.load(this, R.raw.piano4, 1);

        bass1 = soundpool.load(this, R.raw.bass1, 1);
        bass2 = soundpool.load(this, R.raw.bass2, 1);
        bass3 = soundpool.load(this, R.raw.bass3, 1);
        bass4 = soundpool.load(this, R.raw.bass4, 1);

        synth1 = soundpool.load(this, R.raw.synth1, 1);
        synth2 = soundpool.load(this, R.raw.synth2, 1);
        synth3 = soundpool.load(this, R.raw.synth3, 1);
        synth4 = soundpool.load(this, R.raw.synth4, 1);*/




            //fer que el boto es pari al cap de 2 segons
            temps1 = new CountDownTimer(2000, 50) {

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
            }.start();

    }

    @Override
    protected void onPause(){
        super.onPause();
        soundpool.autoPause();



    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        soundpool.release();
        soundpool=null;
        sons.setLoaded(false);
    }

    @Override
    protected void onStop() {
        super.onStop();
        soundpool.autoPause();
    }

    @Override
    protected void onResume(){
        super.onResume();
    }

    //botons que fas click
    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (sons.isLoaded()) {
            switch (id) {
                case R.id.verd1:

                    soundpool.stop(piano1so);
                    verd1.setBackgroundResource(R.drawable.azulverdea);
                    temps1.cancel();
                    temps1.start();

                    if (sons.isLoaded()) {
                        piano1so = soundpool.play(piano1, 1, 1, 1, 0, 1f);

                    }

                    botoid = 1;
                    break;

                case R.id.verd2:

                    soundpool.stop(piano2so);
                    verd2.setBackgroundResource(R.drawable.azulverdea);

                    temps2.cancel();
                    temps2.start();

                    if (sons.isLoaded()) {
                        piano2so = soundpool.play(piano2, 1, 1, 1, 0, 1f);

                    }
                    botoid = 2;
                    break;

                case R.id.verd3:

                    soundpool.stop(piano3so);
                    verd3.setBackgroundResource(R.drawable.azulverdea);
                    temps3.cancel();
                    temps3.start();

                    if (sons.isLoaded()) {
                        piano3so = soundpool.play(piano3, 1, 1, 1, 0, 1f);

                    }
                    botoid = 3;
                    break;

                case R.id.verd4:

                    soundpool.stop(piano4so);
                    verd4.setBackgroundResource(R.drawable.azulverdea);
                    temps4.cancel();
                    temps4.start();

                    if (sons.isLoaded()) {
                        piano4so = soundpool.play(piano4, 1, 1, 1, 0, 1f);

                    }
                    botoid = 4;
                    break;

                case R.id.lila1:

                    soundpool.stop(synth1so);
                    lila1.setBackgroundResource(R.drawable.lilaa);
                    temps5.cancel();
                    temps5.start();

                    if (sons.isLoaded()) {
                        synth1so = soundpool.play(synth1, 1, 1, 1, 0, 1f);

                    }

                    botoid = 5;
                    break;

                case R.id.lila2:

                    soundpool.stop(synth2so);
                    lila2.setBackgroundResource(R.drawable.lilaa);
                    temps6.cancel();
                    temps6.start();

                    if (sons.isLoaded()) {
                        synth2so = soundpool.play(synth2, 1, 1, 1, 0, 1f);

                    }

                    botoid = 6;
                    break;

                case R.id.lila3:

                    soundpool.stop(synth3so);
                    lila3.setBackgroundResource(R.drawable.lilaa);
                    temps7.cancel();
                    temps7.start();

                    if (sons.isLoaded()) {
                        synth3so = soundpool.play(synth3, 1, 1, 1, 0, 1f);

                    }

                    botoid = 7;
                    break;

                case R.id.lila4:

                    soundpool.stop(synth4so);
                    lila4.setBackgroundResource(R.drawable.lilaa);
                    temps8.cancel();
                    temps8.start();

                    if (sons.isLoaded()) {
                        synth4so = soundpool.play(synth4, 1, 1, 1, 0, 1f);

                    }

                    botoid = 8;
                    break;
            }
        }
    }

    //botons que mantens pitjat
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int id=v.getId();

        switch (id){
            case R.id.taronja1:
                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    taronja1.setBackgroundResource(R.drawable.naranjaa);

                    if (Sons sons = new Sons();){
                        bass1so = soundpool.play(bass1, 1, 1, 1, -1, 1f);

                    }
                    return true;
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {

                    taronja1.setBackgroundResource(R.drawable.naranja);
                    soundpool.stop(bass1so);
                    return true;
                }
                return false;

            case R.id.taronja2:
                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    taronja2.setBackgroundResource(R.drawable.naranjaa);

                    if (Sons sons = new Sons();){
                        bass2so = soundpool.play(bass2, 1, 1, 1, -1, 1f);

                    }
                    return true;
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {

                    taronja2.setBackgroundResource(R.drawable.naranja);
                    soundpool.stop(bass2so);
                    return true;
                }
                return false;

            case R.id.taronja3:
                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    taronja3.setBackgroundResource(R.drawable.naranjaa);

                    if (Sons sons = new Sons();){
                        bass3so = soundpool.play(bass3, 1, 1, 1, -1, 1f);

                    }
                    return true;
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {

                    taronja3.setBackgroundResource(R.drawable.naranja);
                    soundpool.stop(bass3so);
                    return true;
                }
                return false;

            case R.id.taronja4:
                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    taronja4.setBackgroundResource(R.drawable.naranjaa);

                    if (Sons sons = new Sons();){
                        bass4so = soundpool.play(bass4, 1, 1, 1, -1, 1f);

                    }
                    return true;
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {

                    taronja4.setBackgroundResource(R.drawable.naranja);
                    soundpool.stop(bass4so);
                    return true;
                }
                return false;

        }

        return false;
    }


}
