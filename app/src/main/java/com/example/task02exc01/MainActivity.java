package com.example.task02exc01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Random rnd;
    ImageView iv;
    int x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.btn);
    }
    public void Click(View view) {
        Random rnd=new Random();
        x=rnd.nextInt(3)+1;
        if (x==1){
            btn.setText("1");
            iv.setImageResource(R.drawable.chat);
        }
        else if (x==2){
            btn.setText("2");
            iv.setImageResource(R.drawable.deadpool);
        }
        else if(x==3){
            btn.setText("3");
            iv.setImageResource(R.drawable.photograph);
        }
    }
}
