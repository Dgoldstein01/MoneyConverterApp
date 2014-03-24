package com.example.MoneyConverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     * I'm gonna...
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final EditText editDollars = (EditText) findViewById(R.id.editDollars);
        final EditText editDinars = (EditText) findViewById(R.id.editDinars);
        Button convert = (Button) findViewById(R.id.buttonConvert);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double dinars;
                double dollars;

                dollars = Double.valueOf(editDollars.getText().toString());
                if(dollars>0){
                    dinars = dollars * 1164.79;
                    editDinars.setText(String.valueOf(dinars));
                }
                else{
                    editDinars.setText(0);
                }

            }
        });
    }
}
