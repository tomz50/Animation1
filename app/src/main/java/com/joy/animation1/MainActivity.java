package com.joy.animation1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button[] button;
    ImageView image;
    int resType;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = new Button[12];
        for(int i = 1; i< button.length; i++){
            String buttonID = "button"+i;

            int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
            Log.i("button",String.valueOf(resID));
            button[i] = (Button) findViewById(resID);
            button[i].setOnClickListener(this);
        }
        image = findViewById(R.id.pin);
    }


public void animation(View view, int type,ImageView img){

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                type);
        image.startAnimation(animation);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.button1:
                resType = getResources().getIdentifier("zoom", "anim", getPackageName());
                animation(view,resType,image);
                break;
            case R.id.button2:
                resType = getResources().getIdentifier("clockwise", "anim", getPackageName());
                animation(view,resType,image);

                break;
            case R.id.button3:
                resType = getResources().getIdentifier("fade", "anim", getPackageName());
                animation(view,resType,image);
                break;
            case R.id.button4:
                resType = getResources().getIdentifier("blink", "anim", getPackageName());
                animation(view,resType,image);
                break;



            case R.id.button5:
                MainActivity.this.startActivity(new Intent(MainActivity.this,SplashActivity.class));
                break;




            case R.id.button6:
                resType = getResources().getIdentifier("slide", "anim", getPackageName());
                animation(view,resType,image);
                break;
            case R.id.button7:
                resType = getResources().getIdentifier("right2left", "anim", getPackageName());
                animation(view,resType,image);
                break;

            case R.id.button8:
                resType = getResources().getIdentifier("left2right", "anim", getPackageName());
                animation(view,resType,image);
                break;

            case R.id.button9:
                resType = getResources().getIdentifier("down2up", "anim", getPackageName());
                animation(view,resType,image);
                break;

            case R.id.button10:
                resType = getResources().getIdentifier("up2down", "anim", getPackageName());
                animation(view,resType,image);
                break;

            case R.id.button11:
                resType = getResources().getIdentifier("zoomout", "anim", getPackageName());
                animation(view,resType,image);
                break;


        }
    }
}
