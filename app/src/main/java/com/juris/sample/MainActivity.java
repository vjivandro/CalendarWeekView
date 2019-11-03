package com.juris.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.juris.weekencalendar.WeekCalendar;
import com.juris.weekencalendar.listener.OnDateClickListener;
import com.juris.weekencalendar.listener.OnWeekChangeListener;

import org.joda.time.DateTime;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WeekCalendar weekCalendar = (WeekCalendar) findViewById(R.id.weekCalendar);
        weekCalendar.setOnDateClickListener(new OnDateClickListener() {
            @Override
            public void onDateClick(DateTime dateTime) {
                Toast.makeText(MainActivity.this, "You Selected " + dateTime.toString(), Toast
                        .LENGTH_SHORT).show();
            }

        });
        weekCalendar.setOnWeekChangeListener(new OnWeekChangeListener() {
            @Override
            public void onWeekChange(DateTime firstDayOfTheWeek, boolean forward) {
                Toast.makeText(MainActivity.this, "Week changed: " + firstDayOfTheWeek +
                        " Forward: " + forward, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
