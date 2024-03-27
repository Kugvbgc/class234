package com.khair.class234;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editTextTextEditText;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextTextEditText=findViewById(R.id.editTextText);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText("");
                String string=editTextTextEditText.getText().toString();

                if (editTextTextEditText.length()>0){
                    int text=Integer.parseInt(string);

                    for (int x=2;x<+text;x++){

                        if (text%x==0){
                            textView.setText(text+" is  NoT a prime number");
                            break;
                        }else {
                            textView.setText(text+" is  a prime number");
                        }




                    }







                }else{
                    editTextTextEditText.setError("Please enter a number ");
                }




            }
        });











        }
    }
