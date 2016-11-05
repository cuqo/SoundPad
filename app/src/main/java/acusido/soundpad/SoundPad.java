package acusido.soundpad;

import android.app.Application;
import android.content.Context;

/**
 * Created by nasty on 05/11/2016.
 */

public class SoundPad extends Application{
    private static Application instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static Context getContext() {
        return instance.getApplicationContext();
    }
}
