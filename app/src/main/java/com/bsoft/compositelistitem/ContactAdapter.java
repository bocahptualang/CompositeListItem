package com.bsoft.compositelistitem;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Budi on 11/11/2014.
 */
public class ContactAdapter extends BaseAdapter{
    private List<Contact> data;
    private Context context;

    public ContactAdapter(Context context) {
        this.data = new ArrayList<Contact>();
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        View returnView;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            returnView = inflater.inflate(R.layout.list_item, null);
        } else {
            returnView = convertView;
        }

        ImageView photo = (ImageView) returnView.findViewById(R.id.picProfile);
        TextView name = (TextView) returnView.findViewById(R.id.txtName);
        TextView status = (TextView) returnView.findViewById(R.id.txtStatus);

        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "fonts/segoeuil.ttf");
        name.setTypeface(typeface);
        status.setTypeface(typeface);

        Contact dataItem = data.get(i);
        Bitmap bmp = getBitmapFromAsset("photos/" + dataItem.getPhoto());
        photo.setImageBitmap(bmp);
        name.setText(dataItem.getName());
        status.setText(dataItem.getStatus());

        return returnView;
    }

    public Bitmap getBitmapFromAsset(String filePath) {
        AssetManager assetManager = context.getAssets();
        InputStream istr;
        Bitmap bitmap = null;
        try {
            istr = assetManager.open(filePath);
            bitmap = BitmapFactory.decodeStream(istr);
        } catch (IOException e) {
            // handle exception
        }

        return bitmap;
    }

    public List<Contact> getData() {
        return data;
    }

    public void setData(List<Contact> data) {
        this.data = data;
    }
}
