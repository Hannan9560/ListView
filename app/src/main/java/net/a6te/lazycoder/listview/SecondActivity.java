package net.a6te.lazycoder.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView showTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        showTv = (TextView) findViewById(R.id.showText);
        showTv.setText("Selected Area name is : "+getIntent().getStringExtra("area"));
    }
}
