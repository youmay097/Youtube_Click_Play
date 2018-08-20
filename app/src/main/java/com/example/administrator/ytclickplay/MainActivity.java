package com.example.administrator.ytclickplay;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = (Button) findViewById(R.id.MyButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent myInten = new Intent(MainActivity.this,NewActivity.class);
//                startActivity(myInten);
                //String videoId = "Fee5vbFLYM4";

                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=VwhJaGVmjwg"));
                startActivity(i);
            }
        });
    }

}
