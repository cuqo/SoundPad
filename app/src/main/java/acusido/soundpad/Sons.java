package acusido.soundpad;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;

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

    public boolean isLoaded() {
        return loaded;
    }

    public void setLoaded(boolean loaded) {
        this.loaded = loaded;
    }
}
