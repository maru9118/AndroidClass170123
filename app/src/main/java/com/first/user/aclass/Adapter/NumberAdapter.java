package com.first.user.aclass.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.first.user.aclass.Model.ClassNumber;
import com.first.user.aclass.R;

import java.util.ArrayList;

/**
 * Created by user on 2017-02-09.
 */

public class NumberAdapter extends BaseAdapter {
    Context mContext;
    ArrayList<ClassNumber> mData;

    public NumberAdapter(Context context, ArrayList<ClassNumber> Data) {
        mContext = context;
        mData = Data;
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
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_number, null, false);
            TextView name = (TextView) convertView.findViewById(R.id.number_text);
            viewHolder.mTextTest = name;
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder)convertView.getTag();
        }

        viewHolder.mTextTest.setText(mData.get(position).numberName);
        return convertView;
    }

    class ViewHolder {
        TextView mTextTest;
    }
}
