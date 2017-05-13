package com.example.iossenac.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void responderQuestao(View v){
        RadioGroup radioCurso = (RadioGroup)findViewById(R.id.radioCurso);
                int op = radioCurso.getCheckedRadioButtonId();
        if(op == R.id.radioAndroid){
            Toast.makeText(this,"Resposta Correta!", Toast.LENGTH_SHORT)
                    .show();
        }else{
            Toast.makeText(this,"Resposta Incoorreta!", Toast.LENGTH_SHORT)
                        .show();
        }
    }


}
