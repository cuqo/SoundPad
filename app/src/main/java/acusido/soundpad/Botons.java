package acusido.soundpad;

import android.content.Context;
import android.os.CountDownTimer;
import android.widget.ImageButton;


/**
 * Created by nasty on 02/11/2016.
 */

public class Botons {
    protected Context context;
    //ImageButton verd1,verd2, verd3, verd4, lila1, lila2, lila3, lila4, taronja1, taronja2, taronja3, taronja4;
    CountDownTimer temps1, temps2, temps3, temps4, temps5, temps6, temps7, temps8;


    public void botonsClick(int id, final ImageButton verd1, ImageButton verd2, ImageButton verd3, ImageButton verd4, ImageButton lila1, ImageButton lila2, ImageButton lila3, ImageButton lila4) {

        switch (id) {
            case R.id.verd1:

                temps1.cancel();
                temps1.start();

                verd1.setBackgroundResource(R.drawable.azulverdea);
                break;

            case R.id.verd2:
                verd2.setBackgroundResource(R.drawable.azulverdea);
                break;

            case R.id.verd3:
                verd3.setBackgroundResource(R.drawable.azulverdea);
                break;

            case R.id.verd4:
                verd4.setBackgroundResource(R.drawable.azulverdea);
                break;

            case R.id.lila1:
                lila1.setBackgroundResource(R.drawable.lilaa);
                break;

            case R.id.lila2:
                lila2.setBackgroundResource(R.drawable.lilaa);
                break;

            case R.id.lila3:
                lila3.setBackgroundResource(R.drawable.lilaa);
                break;

            case R.id.lila4:
                lila4.setBackgroundResource(R.drawable.lilaa);
                break;
        }
    }

    public void botonsClickTornar(final ImageButton verd1, final ImageButton verd2, final ImageButton verd3, final ImageButton verd4, final ImageButton lila1, final ImageButton lila2, final ImageButton lila3, final ImageButton lila4) {
        temps1 = new CountDownTimer(2000, 50) {

            @Override
            public void onTick(long arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onFinish() {

                verd1.setBackgroundResource(R.drawable.azulverde);

            }
        };

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

        temps5.cancel();
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
}

