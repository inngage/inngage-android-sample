package br.com.inngage.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.inngage.sdk.InngageIntentService;
import br.com.inngage.sdk.InngageUtils;

public class MainActivity extends AppCompatActivity {

    private static final String inngageAppToken = "45ca292644b422c7c9bb5f1ed9c766e9";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handleSubscription();
        handleNotification();
    }

    private void handleSubscription() {

        InngageIntentService.startInit(this, inngageAppToken);
    }

    private void handleNotification() {

        String notifyID = "", title = "", body = "";

        if (getIntent().hasExtra("notifyID")) {

            Intent intent = getIntent();
            Bundle bundle  = intent.getExtras();

            if (bundle.getString("notifyID") != null) {

                notifyID = bundle.getString("notifyID");
            }
            if (bundle.getString("title") != null) {

                title =  bundle.getString("title");
            }
            if (bundle.getString("body") != null) {

                body =  bundle.getString("body");
            }
            InngageUtils.showDialog(title, body, notifyID, inngageAppToken, this);
        }
    }
}