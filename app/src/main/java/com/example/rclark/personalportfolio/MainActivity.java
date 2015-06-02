package com.example.rclark.personalportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void buttonPress(View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my ";
        int duration = Toast.LENGTH_SHORT;
        switch (view.getId())
        {
            case R.id.streamerButton:
                text = text + "Spotify Streamer app!";
                break;

            case R.id.scoresButton:
                text = text + "Scores app!";
                break;

            case R.id.libraryButton:
                text = text + "Library app!";
                break;

            case R.id.buildItBiggerButton:
                text = text + "Build it Bigger app!";
                break;

            case R.id.xyzReaderButton:
                text = text + "XYZ Reader app!";
                break;

            case R.id.myOwnAppButton:
                text = text + "Capstone app!";
                break;

            default:
                text = "I don't know what button you pressed!";
                break;
        }

        Toast.makeText(context, text, duration).show();
    }
}
