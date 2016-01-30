package com.zacck.basicfrenchphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonTapped(View view)
    {
        int id = view.getId();
        String ourId ="";

        //try get the string ID of the tapped button
        ourId = view.getResources().getResourceEntryName(id);
        Log.i("Button Tapped ",ourId );

        //get iD of the resource we want to play
        int resourceId = getResources().getIdentifier(ourId,"raw", getPackageName());

        //lets instantiate a mediaplayer
        MediaPlayer mPlayer = MediaPlayer.create(this,resourceId);
        mPlayer.start();
    }

}
