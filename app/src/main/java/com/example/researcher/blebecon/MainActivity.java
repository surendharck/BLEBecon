package com.example.researcher.blebecon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.estimote.coresdk.service.BeaconManager;


public class MainActivity extends AppCompatActivity {
    BeaconManager beaconManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BeaconManager beaconManager=new BeaconManager(getApplicationContext());
        beaconManager.connect(beaconManager::startConfigurableDevicesDiscovery);

    }
}
