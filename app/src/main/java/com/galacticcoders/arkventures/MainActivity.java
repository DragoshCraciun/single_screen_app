package com.galacticcoders.arkventures;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dialPhoneNumber(View view) {
        Intent makeCall = new Intent(Intent.ACTION_DIAL);
        makeCall.setData(Uri.parse("tel:0097714411451"));
        if (makeCall.resolveActivity(getPackageManager()) != null) {
            startActivity(makeCall);
        }
    }

    public void openWebPage(View view) {
        Uri webpage = Uri.parse("https://www.arkventures.com.np/");
        Intent openBrowser = new Intent(Intent.ACTION_VIEW, webpage);
        if (openBrowser.resolveActivity(getPackageManager()) != null) {
            startActivity(openBrowser);
        }
    }

    public void showMap(View view) {
        Intent openMap = new Intent(Intent.ACTION_VIEW);
        openMap.setData(Uri.parse("geo:0,0?q=Ark%20Ventures%20Baluwatar%20"));
        if (openMap.resolveActivity(getPackageManager()) != null) {
            startActivity(openMap);
        }
    }

    public void openEmail(View view) {
        Intent composeEmail = new Intent(Intent.ACTION_SENDTO);
        composeEmail.setData(Uri.parse("mailto:info@arkventures.com.np"));
        if (composeEmail.resolveActivity(getPackageManager()) !=null) {
            startActivity(composeEmail);
        }
    }

}
