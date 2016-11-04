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


    public void botonsClick(int id, ImageButton verd1, final ImageButton verd2, final ImageButton verd3, final ImageButton verd4, final ImageButton lila1, final ImageButton lila2, final ImageButton lila3, final ImageButton lila4) {

        switch (id) {
            case R.id.verd1:

                temps1.cancel();
                temps1.start();

                verd1.setBackgroundResource(R.drawable.azulverdea);
                break;

            case R.id.verd2:
                temps2.cancel();
                temps2.start();
                verd2.setBackgroundResource(R.drawable.azulverdea);
                break;

            case R.id.verd3:
                temps3.cancel();
                temps3.start();
                verd3.setBackgroundResource(R.drawable.azulverdea);
                break;

            case R.id.verd4:
                temps4.cancel();
                temps4.start();
                verd4.setBackgroundResource(R.drawable.azulverdea);
                break;

            case R.id.lila1:
                temps5.cancel();
                temps5.start();
                lila1.setBackgroundResource(R.drawable.lilaa);
                break;

            case R.id.lila2:
                temps6.cancel();
                temps6.start();
                lila2.setBackgroundResource(R.drawable.lilaa);
                break;

            case R.id.lila3:
                temps7.cancel();
                temps7.start();
                lila3.setBackgroundResource(R.drawable.lilaa);
                break;

            case R.id.lila4:
                temps8.cancel();
                temps8.start();
                lila4.setBackgroundResource(R.drawable.lilaa);
                break;
        }
    }

    public void countDownClick(final ImageButton verd1, final ImageButton verd2, final ImageButton verd3, final ImageButton verd4, final ImageButton lila1, final ImageButton lila2, final ImageButton lila3, final ImageButton lila4) {
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
        };


        temps3 = new CountDownTimer(2000, 50) {

            @Override
            public void onTick(long arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onFinish() {

                verd3.setBackgroundResource(R.drawable.azulverde);

            }
        };


        temps4 = new CountDownTimer(2000, 50) {

            @Override
            public void onTick(long arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onFinish() {

                verd4.setBackgroundResource(R.drawable.azulverde);

            }
        };


        temps5 = new CountDownTimer(8000, 50) {

            @Override
            public void onTick(long arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onFinish() {

                lila1.setBackgroundResource(R.drawable.lila);


            }
        };


        temps6 = new CountDownTimer(8000, 50) {

            @Override
            public void onTick(long arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onFinish() {

                lila2.setBackgroundResource(R.drawable.lila);


            }
        };


        temps7 = new CountDownTimer(8000, 50) {

            @Override
            public void onTick(long arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onFinish() {

                lila3.setBackgroundResource(R.drawable.lila);


            }
        };


        temps8 = new CountDownTimer(8000, 50) {

            @Override
            public void onTick(long arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onFinish() {

                lila4.setBackgroundResource(R.drawable.lila);


            }
        };


    }

    public void countZero(){
        temps1.onFinish();
        temps2.onFinish();
        temps3.onFinish();
        temps4.onFinish();
        temps5.onFinish();
        temps6.onFinish();
        temps7.onFinish();
        temps8.onFinish();

    }

    public void botonsTouchDown(int id, ImageButton taronja1, ImageButton taronja2, ImageButton taronja3, ImageButton taronja4){
        switch(id){
            case R.id.taronja1:
                taronja1.setBackgroundResource(R.drawable.naranjaa);
                break;

            case R.id.taronja2:
                taronja2.setBackgroundResource(R.drawable.naranjaa);
                break;
            case R.id.taronja3:
                taronja3.setBackgroundResource(R.drawable.naranjaa);
                break;
            case R.id.taronja4:
                taronja4.setBackgroundResource(R.drawable.naranjaa);
                break;
        }
    }

    public void botonsTouchUp(int id, ImageButton taronja1, ImageButton taronja2, ImageButton taronja3, ImageButton taronja4){
        switch(id){
            case R.id.taronja1:
                taronja1.setBackgroundResource(R.drawable.naranja);
                break;

            case R.id.taronja2:
                taronja2.setBackgroundResource(R.drawable.naranja);
                break;
            case R.id.taronja3:
                taronja3.setBackgroundResource(R.drawable.naranja);
                break;
            case R.id.taronja4:
                taronja4.setBackgroundResource(R.drawable.naranja);
                break;
        }
    }
}

