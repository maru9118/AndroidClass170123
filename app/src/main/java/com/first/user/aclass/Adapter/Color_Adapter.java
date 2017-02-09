package com.first.user.aclass.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.first.user.aclass.Model.ColorData;
import com.first.user.aclass.R;

import java.util.ArrayList;

/**
 * Created by user on 2017-02-09.
 */

public class Color_Adapter extends BaseAdapter {

    Context mContext;
    ArrayList<ColorData> mData;
    LayoutInflater mLayoutInflater;


    public Color_Adapter(Context context, ArrayList<ColorData> data) {
        mContext = context;
        mData = data;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = mLayoutInflater.inflate(R.layout.item_color, null);
            TextView nameTv = (TextView) convertView.findViewById(R.id.item_text);
            viewHolder.mName = nameTv;
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder)convertView.getTag();
        }

        viewHolder.mName.setText(mData.get(position).mDataName);

        if(position == 0) {
            convertView.setBackgroundColor(Color.BLACK);
        } else if (position % 2 == 1) {
            convertView.setBackgroundColor(Color.RED);
        } else {
            convertView.setBackgroundColor(Color.BLUE);
        }
        return convertView;
    }
    class ViewHolder {
        TextView mName;
    }
}
