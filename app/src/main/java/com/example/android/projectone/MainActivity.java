package com.example.android.projectone;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Method of the button that redirects the user to the company's website
    public void goToWebsite(View view){

        Uri homepage = Uri.parse("https://amazing-land.com");
        Intent openLink = new Intent(Intent.ACTION_VIEW, homepage);
        startActivity(openLink);

    }

    //Method that displays the source of the materials used
    public void credits(View view){

        String credits = getString(R.string.credits) + "\n";
        credits += getString(R.string.creditOne) + "\n";
        credits += getString(R.string.creditTwo);

        Toast.makeText(this, credits, Toast.LENGTH_LONG).show();
    }

}
