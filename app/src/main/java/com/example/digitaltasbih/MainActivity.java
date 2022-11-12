package com.example.digitaltasbih;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.TextView;

import java.awt.font.TextAttribute;


public class MainActivity extends AppCompatActivity {



    int countDisplay =0;
    int countAlham =0;
    int countSubha =0;
    int countAllahuakber=0;
    int countLailaha=0;

    Vibrator vibrator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        final TextView tvCounterDisplay = findViewById(R.id.counterDisplay);
        final TextView tvCounterAlham = findViewById(R.id.counterAlham);
        final TextView tvCounterSubha = findViewById(R.id.counterSubha);
        final TextView tvCounterAllahuAkbar = findViewById(R.id.counterAllahuakbar);
        final TextView tvCounterLaIlahaIllah = findViewById(R.id.counterLailaha);

        final CardView cardViewAlhamdulillahButton = findViewById(R.id.cardViewAlham);
        final CardView cardViewSubhanallahButton = findViewById(R.id.cardViewSubha);
        final CardView cardViewAllahuAkbaButton = findViewById(R.id.cardViewAllahuakbar);
        final CardView cardViewLaIlahaIllahButton = findViewById(R.id.cardViewLaIlaha);
        final CardView cardViewClearButton = findViewById(R.id.cardViewClearButton);


        tvCounterAlham.setVisibility(View.GONE);
        tvCounterSubha.setVisibility(View.GONE);
        tvCounterAllahuAkbar.setVisibility(View.GONE);
        tvCounterLaIlahaIllah.setVisibility(View.GONE);


        tvCounterDisplay.setText(""+0);


        vibrator= (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        cardViewAlhamdulillahButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               countDisplay++;
                countAlham++;
               tvCounterDisplay.setText(""+countDisplay);

               tvCounterAlham.setVisibility(View.VISIBLE);
                tvCounterAlham.setText(""+countAlham);

                if (countAlham==33||countDisplay==100){
                    vibrator.vibrate(100);
                }
            }
        });

        cardViewSubhanallahButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                countDisplay++;
                countSubha++;
                tvCounterDisplay.setText(""+countDisplay);

                tvCounterSubha.setVisibility(View.VISIBLE);
                tvCounterSubha.setText(""+countSubha);

                if (countSubha==33||countDisplay==100){
                    vibrator.vibrate(100);
                }
            }
        });

        cardViewAllahuAkbaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                countDisplay++;
                countAllahuakber++;
                tvCounterDisplay.setText(""+countDisplay);

                tvCounterAllahuAkbar.setVisibility(View.VISIBLE);
                tvCounterAllahuAkbar.setText(""+countAllahuakber);

                if (countAllahuakber==33||countDisplay==100){
                    vibrator.vibrate(100);
                }
            }
        });


        cardViewLaIlahaIllahButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                countDisplay++;
                countLailaha++;
                tvCounterDisplay.setText(""+countDisplay);

                tvCounterLaIlahaIllah.setVisibility(View.VISIBLE);
                tvCounterLaIlahaIllah.setText(""+countLailaha);


                if (countLailaha==33||countDisplay==100){
                    vibrator.vibrate(100);
                }
            }
        });


        cardViewClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                tvCounterDisplay.setText(""+0);

                countDisplay=0;
                 countAlham =0;
                 countSubha =0;
                 countAllahuakber=0;
                 countLailaha=0;

                tvCounterAlham.setVisibility(View.GONE);
                tvCounterSubha.setVisibility(View.GONE);
                tvCounterAllahuAkbar.setVisibility(View.GONE);
                tvCounterLaIlahaIllah.setVisibility(View.GONE);

            }
        });





    }



        public void onBackPressed() {

        new AlertDialog.Builder(MainActivity.this)
                .setTitle("Exit!")
                .setMessage("Do you want to exit?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finishAndRemoveTask();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                })
                .setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                })

                .setIcon(R.drawable.ic_error)
                .show();


    }
}