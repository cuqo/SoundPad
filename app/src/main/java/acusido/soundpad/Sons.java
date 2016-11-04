package acusido.soundpad;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.view.MotionEvent;

/**
 * Created by nasty on 2/11/2016.
 */

public class Sons {
    protected Context context;
    private boolean loaded = false;
    private int bass1, bass2, bass3, bass4, piano1, piano2, piano3, piano4, synth1, synth2, synth3, synth4, bass1so, bass2so, bass3so, bass4so, piano1so, piano2so, piano3so, piano4so, synth1so, synth2so, synth3so, synth4so, botoid;
    private SoundPool soundpool;

    public void buildSP(Context context) {

        this.context = context.getApplicationContext();


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
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
    }

    public void loadSP(Context context) {
        this.context = context.getApplicationContext();

        piano1 = soundpool.load(context, R.raw.piano1, 1);
        piano2 = soundpool.load(context, R.raw.piano2, 1);
        piano3 = soundpool.load(context, R.raw.piano3, 1);
        piano4 = soundpool.load(context, R.raw.piano4, 1);

        bass1 = soundpool.load(context, R.raw.bass1, 1);
        bass2 = soundpool.load(context, R.raw.bass2, 1);
        bass3 = soundpool.load(context, R.raw.bass3, 1);
        bass4 = soundpool.load(context, R.raw.bass4, 1);

        synth1 = soundpool.load(context, R.raw.synth1, 1);
        synth2 = soundpool.load(context, R.raw.synth2, 1);
        synth3 = soundpool.load(context, R.raw.synth3, 1);
        synth4 = soundpool.load(context, R.raw.synth4, 1);


    }

    public void soClick(int id) {

        switch (id) {
            case R.id.verd1:

                soundpool.stop(piano1so);

                if (loaded) {
                    piano1so = soundpool.play(piano1, 1, 1, 1, 0, 1f);

                }
                break;

            case R.id.verd2:

                soundpool.stop(piano2so);

                if (loaded) {
                    piano2so = soundpool.play(piano2, 1, 1, 1, 0, 1f);

                }
                break;

            case R.id.verd3:

                soundpool.stop(piano3so);

                if (loaded) {
                    piano3so = soundpool.play(piano3, 1, 1, 1, 0, 1f);

                }
                break;

            case R.id.verd4:

                soundpool.stop(piano4so);

                if (loaded) {
                    piano4so = soundpool.play(piano4, 1, 1, 1, 0, 1f);

                }
                break;

            case R.id.lila1:

                soundpool.stop(synth1so);

                if (loaded) {
                    synth1so = soundpool.play(synth1, 1, 1, 1, 0, 1f);

                }
                break;

            case R.id.lila2:

                soundpool.stop(synth2so);

                if (loaded) {
                    synth2so = soundpool.play(synth2, 1, 1, 1, 0, 1f);

                }
                break;

            case R.id.lila3:

                soundpool.stop(synth3so);


                if (loaded) {
                    synth3so = soundpool.play(synth3, 1, 1, 1, 0, 1f);

                }
                break;

            case R.id.lila4:

                soundpool.stop(synth4so);


                if (loaded) {
                    synth4so = soundpool.play(synth4, 1, 1, 1, 0, 1f);

                }
                break;
        }

    }

    public boolean soTouchDown(int id, MotionEvent event) {

        switch (id) {
            case R.id.taronja1:

                if (loaded) {
                    bass1so = soundpool.play(bass1, 1, 1, 1, -1, 1f);

                }

            case R.id.taronja2:

                if (loaded) {
                    bass2so = soundpool.play(bass2, 1, 1, 1, -1, 1f);

                }

            case R.id.taronja3:

                if (loaded) {
                    bass3so = soundpool.play(bass3, 1, 1, 1, -1, 1f);

                }

            case R.id.taronja4:

                if (loaded) {
                    bass4so = soundpool.play(bass4, 1, 1, 1, -1, 1f);

                }
        }
        return true;


        /*if (event.getAction() == MotionEvent.ACTION_UP) {
            switch (id) {
                case R.id.taronja1:

                    soundpool.stop(bass1so);

                case R.id.taronja2:

                    soundpool.stop(bass2so);

                case R.id.taronja3:

                    soundpool.stop(bass3so);

                case R.id.taronja4:

                    soundpool.stop(bass4so);

            }
            return true;
        }*/
        //return false;
    }

    public boolean soTouchUp(int id, MotionEvent event) {
        //if (event.getAction() == MotionEvent.ACTION_UP) {
        switch (id) {
            case R.id.taronja1:

                soundpool.stop(bass1so);

            case R.id.taronja2:

                soundpool.stop(bass2so);

            case R.id.taronja3:

                soundpool.stop(bass3so);

            case R.id.taronja4:

                soundpool.stop(bass4so);

        }
        //}
        return true;
    }

    public boolean isLoaded() {
        return loaded;
    }

    public void setLoaded(boolean loaded) {
        this.loaded = loaded;
    }
}
