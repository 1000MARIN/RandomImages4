package com.example.randomimages4;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.randomimages4.result.result1;

public class Cdt4_res extends AppCompatActivity {

    TextView resultCount, resultTime;

    result1 rq = new result1();
//    result6 rt = new result6();

    Button finalRes;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cdt4_res);

        resultCount = (TextView) findViewById(R.id.resultCount);
        resultTime = (TextView) findViewById(R.id.resultTime);

        finalRes = (Button) findViewById(R.id.next4_btn);

        resultCount.setText(" 맞힌 갯수 : " + rq.getSet3_point() + " / 6 개");
        resultTime.setText(" 걸린 시간 : " + rq.getSet3_time() + " / 120 초");


//        finalRes.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), Final_res.class);
//                startActivity(intent);
//            }
//        });
    }
}
