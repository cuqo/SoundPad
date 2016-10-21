package acusido.soundpad;

import android.media.AudioManager;
import android.media.Image;
import android.media.SoundPool;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {
    ImageButton verd1, verd2, verd3, verd4, lila1, lila2, lila3, lila4;
    SoundPool soundpool;
    int bass1,bass2,bass3,bass4, piano1,piano2,piano3,piano4,synth1,synth2,synth3,synth4, bass1so,bass2so,bass3so,bass4so, botoid;
    boolean loaded = false, pitjat1 = false, pitjat2 = false, pitjat3 = false, pitjat4 = false;
    public CountDownTimer temps;

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

        verd1.setOnClickListener(this);
        verd2.setOnClickListener(this);
        verd3.setOnClickListener(this);
        verd4.setOnClickListener(this);

        //carregar les pistes d'audio (OBSOLET, S'HA d'ARREGLAR)
        soundpool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
        soundpool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
                loaded = true;
            }
        });

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
        synth4 = soundpool.load(this, R.raw.synth4, 1);


        //fer que el boto es pari al cap de 2 segons
        temps = new CountDownTimer(2000, 50) {


            @Override
            public void onTick(long arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onFinish() {
                switch (botoid){
                    case 1:
                        verd1.setBackgroundResource(R.drawable.azulverde);
                        break;
                    case 2:
                        verd2.setBackgroundResource(R.drawable.azulverde);
                        break;
                    case 3:
                        verd3.setBackgroundResource(R.drawable.azulverde);
                        break;
                    case 4:
                        verd4.setBackgroundResource(R.drawable.azulverde);
                        break;
                }

            }
        }.start();



        /*verd1.setOnClickListener(new View.OnClickListener() {
            boolean pitjat;
            @Override
            public void onClick(View v) {

                if(pitjat) {
                    verd1.setBackgroundResource(R.drawable.azulverdea);

                    }

                } else{
                    verd1.setBackgroundResource(R.drawable.azulverde);

                }pitjat=!pitjat;


            }
        });

        /*verd2.setOnClickListener(new View.OnClickListener() {
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
        });*/

        //botons que mantens pulsats
        lila1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    lila1.setBackgroundResource(R.drawable.lilaa);

                    AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
                    float actualVolume = (float) audioManager
                            .getStreamVolume(AudioManager.STREAM_MUSIC);
                    float maxVolume = (float) audioManager
                            .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
                    float volume = actualVolume / maxVolume;
                    // Is the sound loaded already?

                    if (loaded) {
                        bass1so = soundpool.play(bass1, 1, 1, 1, -1, 1f);

                    }

                    return true;
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {

                    lila1.setBackgroundResource(R.drawable.lila);

                    soundpool.stop(bass1so);

                    return true;
                }
                return false;

            }
        });

        lila2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    lila2.setBackgroundResource(R.drawable.lilaa);

                    if (loaded) {
                        bass2so = soundpool.play(bass2, 1, 1, 1, -1, 1f);

                    }
                    return true;
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {

                    lila2.setBackgroundResource(R.drawable.lila);
                    soundpool.stop(bass2so);
                    return true;
                }
                return false;
            }
        });

        lila3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    lila3.setBackgroundResource(R.drawable.lilaa);

                    if (loaded) {
                        bass3so = soundpool.play(bass3, 1, 1, 1, -1, 1f);

                    }
                    return true;
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {

                    lila3.setBackgroundResource(R.drawable.lila);
                    soundpool.stop(bass3so);
                    return true;
                }
                return false;
            }
        });

        lila4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    lila4.setBackgroundResource(R.drawable.lilaa);

                    if (loaded) {
                        bass4so = soundpool.play(bass4, 1, 1, 1, -1, 1f);

                    }
                    return true;
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {

                    lila4.setBackgroundResource(R.drawable.lila);
                    soundpool.stop(bass4so);
                    return true;
                }
                return false;
            }
        });
    }

    //botons que fas click
    @Override
    public void onClick(View v) {
        int id = v.getId();


        switch (id) {
            case R.id.verd1:

                verd1.setBackgroundResource(R.drawable.azulverdea);




                //Volum (no es fa servir)
                AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
                float actualVolume = (float) audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
                float maxVolume = (float) audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
                float volume = actualVolume / maxVolume;
                // Is the sound loaded already?

                temps.cancel();
                temps.start();

                if (loaded) {
                    soundpool.play(piano1, 1, 1, 1, 0, 1f);

                }

                botoid=1;
                break;

            case R.id.verd2:

                /*if (!pitjat2) {
                    verd2.setBackgroundResource(R.drawable.azulverdea);

                } else {
                    verd2.setBackgroundResource(R.drawable.azulverde);
                }
                pitjat2 = !pitjat2;*/
                verd2.setBackgroundResource(R.drawable.azulverdea);

                temps.cancel();
                temps.start();

                if (loaded) {
                    soundpool.play(piano2, 1, 1, 1, 0, 1f);

                }
                botoid=2;
                break;

            case R.id.verd3:

                verd3.setBackgroundResource(R.drawable.azulverdea);
                temps.cancel();
                temps.start();

                if (loaded) {
                    soundpool.play(piano3, 1, 1, 1, 0, 1f);

                }
                botoid=3;
                break;

            case R.id.verd4:

                verd4.setBackgroundResource(R.drawable.azulverdea);
                temps.cancel();
                temps.start();

                if (loaded) {
                    soundpool.play(piano4, 1, 1, 1, 0, 1f);

                }
                botoid=4;
                break;
        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }
}
