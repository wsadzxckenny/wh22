package com.example.user.wh22;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void myfun(View btnView){

        EditText et=(EditText) findViewById(R.id.editText);
        TextView tv=(TextView) findViewById(R.id.textView);
        tv.setText(et.getText());
    }
}
