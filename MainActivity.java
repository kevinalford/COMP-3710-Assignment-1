package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   EditText txtF, txtC;
   Button btnConvertF2C, btnConvertC2F;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
   
      
      txtF = (EditText) findViewById(R.id.txtF);
      txtC = findViewById(R.id.txtC);
   
      btnConvertF2C = findViewById(R.id.btnConvertFc);
      btnConvertC2F = findViewById(R.id.btnConvertCf);
   
      btnConvertF2C.setOnClickListener(
         new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String strF = txtF.getText().toString();
               Log.i("Info", "String of txtF = " + strF);
            
            //testing
               if (strF.length() == 0) {
                  Toast.makeText(v.getContext(),
                     "ERROR: Input value for F degree is empty",
                     Toast.LENGTH_LONG).show();
                  Log.e("Error", "String of txtF is empty");
                  return;
               }
            
               double valF;
               try {
                  valF = Double.parseDouble(strF);
               } catch (Exception ex) {
                  ex.printStackTrace();
                  Log.e("Error", "String of txtF is not parsable");
                  Toast.makeText(v.getContext(),
                     "ERROR: Input value for txtF is not parsable",
                     Toast.LENGTH_LONG).show();
               }
            //testing
            
               valF = Double.parseDouble(strF);
            
               double valC = (valF - 32)*5/9;
            
               String strC = Double.toString(valC);
            
               Log.i("Info", "String of txtC = " + strC);
            
               txtC.setText(strC);
            }
         });
   
      btnConvertC2F.setOnClickListener(
         new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String strC = txtC.getText().toString();
               Log.i("Info", "String of txtF = " + strC);
            
            //testing
               if (strC.length() == 0) {
                  Toast.makeText(v.getContext(),
                     "ERROR: Input value for C degree is empty",
                     Toast.LENGTH_LONG).show();
                  Log.e("Error", "String of txtC is empty");
                  return;
               }
            
               double valC;
               try {
                  valC = Double.parseDouble(strC);
               } catch (Exception ex) {
                  ex.printStackTrace();
                  Log.e("Error", "String of txtF is not parsable");
                  Toast.makeText(v.getContext(),
                     "ERROR: Input value for txtF is not parsable",
                     Toast.LENGTH_LONG).show();
               }
            //testing
            
               valC = Double.parseDouble(strC);
            
               double valF = (valC * (9/5)) + 32;
            
               String strF = Double.toString(valF);
            
               Log.i("Info", "String of txtF = " + strF);
            
               txtF.setText(strF);
            }
         });
   }
}
