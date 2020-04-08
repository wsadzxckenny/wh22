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
    String ans ="1234";
    public void myfun(View btnView){

        EditText et=(EditText) findViewById(R.id.editText);
        TextView tv=(TextView) findViewById(R.id.textView);
        char[] guess=et.getText().toString().toCharArray();
        char[] ansArray= ans.toCharArray();
        int nA =0;
        int nB =0;
        for(int i=0; i < guess.length; i++) {
            for (int j = 0; j < ansArray.length; j++) {
                if ( guess[i]==ansArray[j])
                {
                    if ( i==j)
                        nA++;
                    else
                        nB++;
                }
            }
        }
        String ret =nA +"A"+nB+"B";
        tv.setText(ret);
    }

}
