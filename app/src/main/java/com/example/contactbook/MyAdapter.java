package com.example.contactbook;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

    MainActivity mainActivity;
    int[] imgArr;
    String[] contactName;
    String[] contactNo;

    public MyAdapter(MainActivity mainActivity, int[] imgArr, String[] contactName, String[] contactNo) {
        this.mainActivity=mainActivity;
        this.imgArr=imgArr;
        this.contactName=contactName;
        this.contactNo=contactNo;
    }

    @Override
    public int getCount() {
        return contactName.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(mainActivity).inflate(R.layout.activity_main_item,parent,false);
        ImageView imageView = convertView.findViewById(R.id.activity_main_item_imgview);
        TextView Contactname = convertView.findViewById(R.id.activity_main_item_contname);
        TextView ContactNo = convertView.findViewById(R.id.activity_main_item_contno);

        imageView.setImageResource(imgArr[position]);
        Contactname.setText(contactName[position]);
        ContactNo.setText(contactNo[position]);

       /* Contactname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/

        return convertView;

    }
}
