package com.example.shivang.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView1;
    private ImageView imageView2;
    private Button button;
    private TextView textView;
    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.roll_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                roll();
            }
        });

    }

    private void roll()
    {
        imageView1=findViewById(R.id.dice1);
        imageView2=findViewById(R.id.dice2);
        textView=findViewById(R.id.tot_text);
        int dice1_res=random.nextInt(6)+1;
        int dice2_res=random.nextInt(6)+1;
        int dice1_num,dice2_num;
        dice1_num=res(dice1_res,imageView1);
        dice2_num=res(dice2_res,imageView2);
        textView.setText("Total:"+(dice1_num+dice2_num));

    }

    private int res(int a,ImageView imageView)
    {

        int num=0;
        switch (a)
        {
            case 1:
                imageView.setImageResource(R.drawable.dice1);
                num=1;
                break;

            case 2:
                imageView.setImageResource(R.drawable.dice2);
                num=2;
                break;
            case 3:
                imageView.setImageResource(R.drawable.dice3);
                num=3;
                break;
            case 4:
                imageView.setImageResource(R.drawable.dice4);
                num=4;
                break;
            case 5:
                imageView.setImageResource(R.drawable.dice5);
                num=5;
                break;
            case 6:
                imageView.setImageResource(R.drawable.dice6);
                num=6;
                break;


        }
        return (num);
    }
}
