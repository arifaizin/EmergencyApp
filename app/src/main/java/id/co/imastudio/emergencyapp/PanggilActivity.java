package id.co.imastudio.emergencyapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PanggilActivity extends AppCompatActivity {

    Button polisi, ambulan, pemadam, basarnas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panggil);

        polisi = (Button) findViewById(R.id.button);
        polisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                String  nomerTujuan = sharedPrefs.getString("nomer_polisi", "085740482440");
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + nomerTujuan));
                startActivity(intent);
            }
        });

        ambulan = (Button) findViewById(R.id.button2);
        ambulan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                String  nomerTujuan = sharedPrefs.getString("nomer_ambulan", "085740482440");
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + nomerTujuan));
                startActivity(intent);
            }
        });

        pemadam = (Button) findViewById(R.id.button3);
        pemadam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                String  nomerTujuan = sharedPrefs.getString("nomer_pemadam", "085740482440");
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + nomerTujuan));
                startActivity(intent);
            }
        });

        basarnas = (Button) findViewById(R.id.button4);
        basarnas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                String  nomerTujuan = sharedPrefs.getString("nomer_basarnas", "085740482440");
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + nomerTujuan));
                startActivity(intent);
            }
        });

    }
}
