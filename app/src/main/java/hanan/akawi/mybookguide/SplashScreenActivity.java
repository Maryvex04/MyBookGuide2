package hanan.akawi.mybookguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class SplashScreenActivity extends AppCompatActivity {
    private ImageView iv1,imgv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        iv1=findViewById(R.id.iv1);
        imgv2=findViewById(R.id.imgv2);

        //thread1
        Thread th=new Thread(){
            //thread2
            @Override
            public void run() {
                //thread3
                //المقطع الذي سيعمل بالتزامن مع مقاطع الاخرى
                int ms=3*1000;//milliseconds
                try {
                    sleep(ms);
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        //thread4
        th.start();
    }
    }
