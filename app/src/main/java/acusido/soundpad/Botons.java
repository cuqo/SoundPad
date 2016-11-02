package acusido.soundpad;

import android.content.Context;
import android.widget.ImageButton;

/**
 * Created by nasty on 02/11/2016.
 */

public class Botons {
    protected Context context;
    ImageButton verd1, verd2, verd3, verd4, lila1, lila2, lila3, lila4, taronja1, taronja2, taronja3, taronja4;


    public void botonsClick(int id){
        switch(id){
            case R.id.verd1:
                verd1.setImageResource(R.drawable.azulverdea);
                break;

            case R.id.verd2:
                verd2.setImageResource(R.drawable.azulverdea);
                break;

            case R.id.verd3:
                verd3.setImageResource(R.drawable.azulverdea);
                break;

            case R.id.verd4:
                verd4.setImageResource(R.drawable.azulverdea);
                break;

            case R.id.lila1:
                lila1.setImageResource(R.drawable.lilaa);
                break;

            case R.id.lila2:
                lila2.setImageResource(R.drawable.lilaa);
                break;

            case R.id.lila3:
                lila3.setImageResource(R.drawable.lilaa);
                break;

            case R.id.lila4:
                lila4.setImageResource(R.drawable.lilaa);
                break;
        }
    }
}
