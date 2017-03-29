package net.a6te.lazycoder.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView areaListView;
    private ArrayList<String >  areaName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        areaListView = (ListView) findViewById(R.id.myListView );
        areaName = new ArrayList<>();
        areaName.add("Mirpur");
        areaName.add("Dhanmondi");
        areaName.add("Kollanpur");
        areaName.add("Mirpur Dohs");
        areaName.add("Syamoli");
        areaName.add("Jigaola");
        areaName.add("Mirpur 12");
        areaName.add("Mirpur 13");
        areaName.add("Mirpur 14");
        areaName.add("Mirpur 1");
        areaName.add("Mirpur 2");
        areaName.add("Mirpur 3");
        areaName.add("Mirpur 4");
        areaName.add("Mirpur 5");
        areaName.add("Mirpur 6");
        areaName.add("Mirpur 7");

        ArrayAdapter<String > adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,areaName);
        areaListView.setAdapter(adapter);

        areaListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("area",areaName.get(i));
                startActivity(intent);
            }
        });
    }
}
