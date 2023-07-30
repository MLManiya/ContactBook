package com.example.contactbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    int ImgArr[] = {R.drawable.img_1,R.drawable.img_2,R.drawable.img_3,R.drawable.img_4,R.drawable.img_5,R.drawable.img_6,R.drawable.img_7,R.drawable.img_8,R.drawable.img_9,R.drawable.img_13,};
    String ContactName[] = {"Ajay","Balo","Chandani","Dharmendra","Eshita","Falgun","Ganesh","Hardy","Ishita","Me"};
    String ContactNo[] = {"7854123658","8541256341","9657451235","6521478452","9658742141","9898657485","9587451356","6325148988","7541259652","8153806451"};
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
        myAdapter = new MyAdapter(MainActivity.this,ImgArr,ContactName,ContactNo);
        listView.setAdapter(myAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(MainActivity.this,Details_Second_Activity.class);
                intent.putExtra("Position",position);
                intent.putExtra("Image",ImgArr);
                intent.putExtra("ConName",ContactName);
                intent.putExtra("ConNo",ContactNo);
                startActivity(intent);
               // finish();
            }
        });
    }
}