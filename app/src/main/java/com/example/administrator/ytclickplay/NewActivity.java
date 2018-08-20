package com.example.administrator.ytclickplay;

import android.app.Activity;
import android.os.Bundle;

public class NewActivity extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from new_activity.xml
        setContentView(R.layout.new_activity);
    }
}
