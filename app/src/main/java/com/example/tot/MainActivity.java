package com.example.tot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView vi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        vi = findViewById(R.id.N1);

    }

    public void dorel(View view) {
        int x = (int)(101*Math.random())%3+1;
        btn.setText(x);
        if (x==1) {
            vi.setImageResource(R.drawable.n1);
        }
        else if (x==2){
            vi.setImageResource(R.drawable.n2);
        }
        else{
            vi.setImageResource(R.drawable.n3);
        }

    }
}