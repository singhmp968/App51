package com.example.mortezasaadat.app51;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView txtTextNumber1;
    TextView txtTextNumber2;
    TextView txtTextNumber3;



    Typeface fontNumber1;
    Typeface fontNumber2;
    Typeface fontNumber3;


    String textView1Size;
    String textView2Size;
    String textView3Size;


    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtTextNumber1 = (TextView) findViewById(R.id.txtTextNumber1);
        txtTextNumber2 = (TextView) findViewById(R.id.txtTextNumber2);
        txtTextNumber3 = (TextView) findViewById(R.id.txtTextNumber3);




        fontNumber1 = Typeface.createFromAsset(getAssets(), "fonts/Chunkfive.otf");
        fontNumber2 = Typeface.createFromAsset(getAssets(), "fonts/FontleroyBrown.ttf");
        fontNumber3 = Typeface.createFromAsset(getAssets(), "fonts/Wonderbar Demo.otf");





        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);




    }







    public void specifyTheFontForTextView1() {
        boolean fontNumber1ForText1Value;
        boolean fontNumber2ForText1Value;
        boolean fontNumber3ForText1Value;

        fontNumber1ForText1Value = sharedPreferences.getBoolean("CHECKBOX_FONT_NUMBER1_TEXT1", false);
        fontNumber2ForText1Value = sharedPreferences.getBoolean("CHECKBOX_FONT_NUMBER2_TEXT1", false);
        fontNumber3ForText1Value = sharedPreferences.getBoolean("CHECKBOX_FONT_NUMBER3_TEXT1", false);

        if (fontNumber1ForText1Value) {

            txtTextNumber1.setTypeface(fontNumber1);



        } else if (fontNumber2ForText1Value) {

            txtTextNumber1.setTypeface(fontNumber2);

        } else if (fontNumber3ForText1Value) {

            txtTextNumber1.setTypeface(fontNumber3);

        }

    }




    public void specifyTheFontForTextView2() {

        boolean fontNumber1ForText2Value;
        boolean fontNumber2ForText2Value;
        boolean fontNumber3ForText2Value;

        fontNumber1ForText2Value = sharedPreferences.getBoolean("CHECKBOX_FONT_NUMBER1_TEXT2", false);
        fontNumber2ForText2Value = sharedPreferences.getBoolean("CHECKBOX_FONT_NUMBER2_TEXT2", false);
        fontNumber3ForText2Value = sharedPreferences.getBoolean("CHECKBOX_FONT_NUMBER3_TEXT2", false);

        if (fontNumber1ForText2Value) {

            txtTextNumber2.setTypeface(fontNumber1);


        } else if (fontNumber2ForText2Value) {

            txtTextNumber2.setTypeface(fontNumber2);

        } else if (fontNumber3ForText2Value) {

            txtTextNumber2.setTypeface(fontNumber3);

        }

    }



    public void specifyTheFontForTextView3() {

        boolean fontNumber1ForText3Value;
        boolean fontNumber2ForText3Value;
        boolean fontNumber3ForText3Value;

        fontNumber1ForText3Value = sharedPreferences.getBoolean("CHECKBOX_FONT_NUMBER1_TEXT3", false);
        fontNumber2ForText3Value = sharedPreferences.getBoolean("CHECKBOX_FONT_NUMBER2_TEXT3", false);
        fontNumber3ForText3Value = sharedPreferences.getBoolean("CHECKBOX_FONT_NUMBER3_TEXT3", false);

        if (fontNumber1ForText3Value) {

            txtTextNumber3.setTypeface(fontNumber1);

        } else if (fontNumber2ForText3Value) {

            txtTextNumber3.setTypeface(fontNumber2);


        } else if (fontNumber3ForText3Value) {

            txtTextNumber3.setTypeface(fontNumber3);

        }

    }



    public void specifyTheSizeForTextView1() {


        textView1Size = sharedPreferences.getString("FONT_SIZE_TEXT1", "20");

        txtTextNumber1.setTextSize(Float.parseFloat(textView1Size));

    }


    public void specifyTheSizeForTextView2() {


        textView2Size = sharedPreferences.getString("FONT_SIZE_TEXT2", "20");
        txtTextNumber2.setTextSize(Float.parseFloat(textView2Size));

    }



    public void specifyTheSizeForTextView3() {

        textView3Size = sharedPreferences.getString("FONT_SIZE_TEXT3", "20");
        txtTextNumber3.setTextSize(Float.parseFloat(textView3Size));

    }





    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(MainActivity.this, "This onResume Method is Called", Toast.LENGTH_SHORT).show();

        specifyTheFontForTextView1();
        specifyTheFontForTextView2();
        specifyTheFontForTextView3();

        specifyTheSizeForTextView1();
        specifyTheSizeForTextView2();
        specifyTheSizeForTextView3();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);


        return true;

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        switch (id) {

            case R.id.settings:


                Intent intent = new Intent(MainActivity.this, PreferrencesActivity.class);
                startActivity(intent);



                break;

        }


        return super.onOptionsItemSelected(item);
    }
}
