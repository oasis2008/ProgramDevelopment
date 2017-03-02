package com.oasis.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.oasis.android.dagger2.c.Car;
import com.oasis.android.homepage.HomePageActivity;
import com.oasis.android.javabase.concurrent.CountDownLatchTest;
import com.oasis.android.javabase.list.StackTest;

/**
 * @author oasis2008
 *         Created on 2017/2/23.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        try {
            CountDownLatchTest.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Car car = new Car();

        car.getEngineA().run();
        car.getEngineB().run();

        StackTest stackTest = new StackTest();
        stackTest.testPeek();
        stackTest.testPop();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        switchToHomePage();
    }

    private void switchToHomePage(){
        Intent intent = new Intent(this, HomePageActivity.class);
        startActivity(intent);
        this.finish();
    }
}
