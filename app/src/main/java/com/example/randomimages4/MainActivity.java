package com.example.randomimages4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.randomimages4.result.result1;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    int[] images = new int[] {
            R.drawable.ic_baseline_add_24,
            R.drawable.ic_baseline_heart_24,
            R.drawable.ic_baseline_local_shipping_24,
            R.drawable.ic_baseline_pedal_bike_24,
            R.drawable.ic_baseline_star_24,
            R.drawable.ic_baseline_wb_cloudy_24
    };

    ImageView[] box_be = new ImageView[6];
    ImageView[] box_bl = new ImageView[6];

    ImageView box_q1;
    TextView text_1;

    int selected[] = new int[6];
    int _view[] = new int[6];
    int _location[] = new int[6];
    int k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        box_be[0] = findViewById(R.id.box_be_1);
        box_be[1] = findViewById(R.id.box_be_2);
        box_be[2] = findViewById(R.id.box_be_3);
        box_be[3] = findViewById(R.id.box_be_4);
        box_be[4] = findViewById(R.id.box_be_5);
        box_be[5] = findViewById(R.id.box_be_6);

        box_bl[0] = findViewById(R.id.box_bl_1);
        box_bl[1] = findViewById(R.id.box_bl_2);
        box_bl[2] = findViewById(R.id.box_bl_3);
        box_bl[3] = findViewById(R.id.box_bl_4);
        box_bl[4] = findViewById(R.id.box_bl_5);
        box_bl[5] = findViewById(R.id.box_bl_6);

        box_bl[0].setOnClickListener(this);
        box_bl[1].setOnClickListener(this);
        box_bl[2].setOnClickListener(this);
        box_bl[3].setOnClickListener(this);
        box_bl[4].setOnClickListener(this);
        box_bl[5].setOnClickListener(this);

        box_be[0].setOnClickListener(this);
        box_be[1].setOnClickListener(this);
        box_be[2].setOnClickListener(this);
        box_be[3].setOnClickListener(this);
        box_be[4].setOnClickListener(this);
        box_be[5].setOnClickListener(this);

        box_q1 = findViewById(R.id.box_q1);
        text_1 = findViewById(R.id.text_1);

        int minimumValue = 0;
        int maximumValue = 5;

        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        // ?????? ????????? ?????????
        for (int i = 0; i < 6; i++) {
            box_bl[i].setVisibility(View.INVISIBLE);
        }

        // ????????? ?????? ?????? ?????? ??????
        for (int i = 0; i < 6; i++) {
            selected[i] = random.nextInt(maximumValue - minimumValue + 1) + minimumValue;
            for (int j = 0; j < i; j++) {
                if (selected[i] == selected[j]) {
                    i--;
                }
            }
        }

        // ????????? ?????? ?????? ?????? ?????? ??????
        for (int i = 0; i < 6; i++) {
            _view[i] = random.nextInt(maximumValue - minimumValue + 1) + minimumValue;
            for (int j = 0; j < i; j++) {
                if (_view[i] == _view[j]) {
                    i--;
                }
            }
        }

        // ????????? ?????? ??????
        for (int k = 0; k < 6; k++) {
            _location[k] = random.nextInt(maximumValue - minimumValue + 1) + minimumValue;
            for (int l = 0; l < k; l++) {
                if (_location[k] == _location[l]) {
                    k--;
                }
            }
            box_bl[k].setImageResource(images[selected[_location[k]]]);
        }

        // ??????????????? ?????? ???????????? ????????? ??? ?????????
        for (int i = 0; i < 6; i++) {
            final Handler handler = new Handler();
            int finalI = i;
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    box_bl[_view[finalI]].setVisibility(View.VISIBLE);
                    if ( finalI> 0 )
                        box_bl[_view[finalI - 1 ]].setVisibility(View.INVISIBLE);
                }
            }, 1000*i);
        }

        // ?????? ?????????
        final Handler handler2 = new Handler();
        handler2.postDelayed(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 6; i++) {
                    box_bl[i].setVisibility(View.INVISIBLE);
                }

                // ?????? ?????? ??????
                box_q1.setVisibility(View.VISIBLE);
                box_q1.setImageResource(images[selected[k]]);
                text_1.setText("?????? ????????? ????????? ????????? ????????? ????????? ?????? ?????????.");

                // ?????? ????????? ??????
                demon = false;

            }
        }, 6000 );

    }
    boolean demon = true;

    // ??? ?????? ???
    @Override
    public void onClick(View v) {
        if (demon == true) return;

        for (int i = 0; i < 6; i++) {
            box_bl[i].setVisibility(View.INVISIBLE);
            if(v  == box_bl[i])
                box_bl[i].setVisibility(View.VISIBLE);
            if(v  == box_be[i]) {
                box_bl[i].setVisibility(View.VISIBLE);

                // ?????? ??????
                if (images[selected[k]] == images[selected[_location[i]]]) {

                    text_1.setText("??????");

                } else {

                    text_1.setText("??????");

                }
            }
        }
    }
}
