package com.example.application_timer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        String[] values = new String[]{
                "Afghanistan          GMT+3:30 ",
                "Albania              GMT+0h",
                "Algeria              GMT+0h",
                "Andorre              GMT+0h",
                "Angola               GMT+0h",
                "Antigua & Deps       GMT-5h",
                "Argentine            GMT-4h",
                "Armenia              GMT+3h",
                "Australia            GMT+9h",
                "Austria              GMT+0h",
                "Azerbaijan           GMT+3h",
                "Bahamas              GMT-1h",
                "Benin                GMT+0",


        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1,
                android.R.id.text1, values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(view.getContext(),Activity_Afghanistan.class);
                    startActivity(intent);
                } if (position == 1){
                    Intent intent = new Intent(view.getContext(),Activity_Albanie.class);
                    startActivity(intent);
                }
                if (position == 2){
                    Intent intent = new Intent(view.getContext(),Activity_Algeria.class);
                    startActivity(intent);
                } if (position == 3){
                    Intent intent = new Intent(view.getContext(),Activity_Andorre.class);
                    startActivity(intent);
                } if (position == 4){
                    Intent intent = new Intent(view.getContext(),Activity_Angola.class);
                    startActivity(intent);
                }if (position == 5){
                    Intent intent = new Intent(view.getContext(),Activity_Antigua.class);
                    startActivity(intent);
                }if (position == 6){
                    Intent intent = new Intent(view.getContext(),Activity_Argentine.class);
                    startActivity(intent);
                }if (position == 7){
                    Intent intent = new Intent(view.getContext(),Activity_Amenia.class);
                    startActivity(intent);
                }if (position == 8){
                    Intent intent = new Intent(view.getContext(),Activity_Australia.class);
                    startActivity(intent);
                }if (position == 9){
                    Intent intent = new Intent(view.getContext(),Activity_Austria.class);
                    startActivity(intent);
                }if (position == 10){
                    Intent intent = new Intent(view.getContext(),Activity_Azerbaijan.class);
                    startActivity(intent);
                }if (position == 12){
                    Intent intent = new Intent(view.getContext(),Activity_Bahamas.class);
                    startActivity(intent);
                }if (position == 13){
                    Intent intent = new Intent(view.getContext(),Activity_Benin.class);
                    startActivity(intent);
                }
            }
        });
    }
}