package com.example.kingdomanimalia.puzzle;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class CustomPuzzle extends BaseAdapter {
    private ArrayList<Button> mButtons = null;
    private int mColumnWidth, mColumnHeight;

    public CustomPuzzle(ArrayList<Button> buttons, int columnWidth, int columnHeight) {
        mButtons = buttons;
        mColumnWidth = columnWidth;
        mColumnHeight = columnHeight;
    }
    @Override
    public int getCount() {
        return mButtons.size();
    }

    @Override
    public Object getItem(int position) {
        return (Object) mButtons.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Button button;


        if (convertView == null) {
            button = mButtons.get(position);
        } else {
            button = (Button) convertView;

            }

        android.widget.AbsListView.LayoutParams params =
                new android.widget.AbsListView.LayoutParams(mColumnWidth, mColumnHeight);
        button.setLayoutParams(params);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.animate().scaleX((float) 1.2);
                v.animate().scaleY((float) 1.2);
            }
        });
        return button;
    }
}
