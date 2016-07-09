package br.com.inngage.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.inngage.sdk.InngageIntentService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InngageIntentService.startInit(this, "36b9ced7ecb9755335080c279c64a58c");
    }
}
