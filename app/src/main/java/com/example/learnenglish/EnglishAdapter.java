package com.example.learnenglish;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class EnglishAdapter extends ArrayAdapter<English>
{
    public EnglishAdapter(Activity context, ArrayList<English> englishes)
    {
        super(context,0 ,englishes);
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        View listView1=convertView;

        if (listView1==null)
        {
            listView1=LayoutInflater.from(getContext()).inflate(R.layout.list_items,parent,false);
        }
        English currentEnglish=getItem(position);

        TextView firstTextView=(TextView) listView1.findViewById(R.id.text1);
        firstTextView.setText(currentEnglish.getmAlphabut());

        TextView secondTextView=(TextView) listView1.findViewById(R.id.text2);
        secondTextView.setText(currentEnglish.getmWord());

        ImageView imageView=(ImageView) listView1.findViewById(R.id.image);
        imageView.setImageResource(currentEnglish.getmImage());

        return listView1;
    }

}
