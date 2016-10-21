package acusido.soundpad;

import android.media.AudioManager;
import android.media.Image;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener,View.OnTouchListener{
    ImageButton verd1,verd2,verd3,verd4,lila1,lila2,lila3,lila4;
    SoundPool soundpool;
    int soundid,streamid;
    boolean loaded=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        verd1=(ImageButton) findViewById(R.id.imageButton);
        verd2=(ImageButton) findViewById(R.id.imageButton2);
        verd3=(ImageButton) findViewById(R.id.imageButton3);
        verd4=(ImageButton) findViewById(R.id.imageButton4);
        lila1=(ImageButton) findViewById(R.id.imageButton5);
        lila2=(ImageButton) findViewById(R.id.imageButton6);
        lila3=(ImageButton) findViewById(R.id.imageButton7);
        lila4=(ImageButton) findViewById(R.id.imageButton8);
        soundpool=new SoundPool(10, AudioManager.STREAM_MUSIC,0);
        soundpool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
                loaded=true;
            }
        });
        soundid=soundpool.load(this,R.raw.bass1,1);


        verd1.setOnClickListener(new View.OnClickListener() {
            boolean pitjat;
            @Override
            public void onClick(View v) {

                if(!pitjat) {
                    verd1.setBackgroundResource(R.drawable.azulverdea);
                    pitjat = true;

                } else{
                    verd1.setBackgroundResource(R.drawable.azulverde);
                    pitjat=false;
                }


            }
        });

        verd2.setOnClickListener(new View.OnClickListener() {
            boolean pitjat;
            @Override
            public void onClick(View v) {

                if(!pitjat) {
                    verd2.setBackgroundResource(R.drawable.azulverdea);
                    pitjat = true;
                } else{
                    verd2.setBackgroundResource(R.drawable.azulverde);
                    pitjat=false;
                }
            }
        });

        verd3.setOnClickListener(new View.OnClickListener() {
            boolean pitjat;
            @Override
            public void onClick(View v) {

                if(!pitjat) {
                    verd3.setBackgroundResource(R.drawable.azulverdea);
                    pitjat = true;
                } else{
                    verd3.setBackgroundResource(R.drawable.azulverde);
                    pitjat=false;
                }
            }
        });

        verd4.setOnClickListener(new View.OnClickListener() {
            boolean pitjat;
            @Override
            public void onClick(View v) {

                if(!pitjat) {
                    verd4.setBackgroundResource(R.drawable.azulverdea);
                    pitjat = true;
                } else{
                    verd4.setBackgroundResource(R.drawable.azulverde);
                    pitjat=false;
                }
            }
        });

        lila1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){

                    lila1.setBackgroundResource(R.drawable.lilaa);

                    AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
                    float actualVolume = (float) audioManager
                            .getStreamVolume(AudioManager.STREAM_MUSIC);
                    float maxVolume = (float) audioManager
                            .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
                    float volume = actualVolume / maxVolume;
                    // Is the sound loaded already?

                    if(loaded){
                        streamid = soundpool.play(soundid, volume, volume, 1, -1, 1f);

                    }

                    return true;
                }
                if(event.getAction() == MotionEvent.ACTION_UP){

                    lila1.setBackgroundResource(R.drawable.lila);

                    soundpool.stop(streamid);


                    return true;
                }
                return false;

            }
        });

        lila2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){

                    lila2.setBackgroundResource(R.drawable.lilaa);
                    return true;
                }
                if(event.getAction() == MotionEvent.ACTION_UP){

                    lila2.setBackgroundResource(R.drawable.lila);
                    return true;
                }
                return false;
            }
        });

        lila3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){

                    lila3.setBackgroundResource(R.drawable.lilaa);
                    return true;
                }
                if(event.getAction() == MotionEvent.ACTION_UP){

                    lila3.setBackgroundResource(R.drawable.lila);
                    return true;
                }
                return false;
            }
        });

        lila4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){

                    lila4.setBackgroundResource(R.drawable.lilaa);
                    return true;
                }
                if(event.getAction() == MotionEvent.ACTION_UP){

                    lila4.setBackgroundResource(R.drawable.lila);
                    return true;
                }
                return false;
            }
        });
    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){

        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }
}
