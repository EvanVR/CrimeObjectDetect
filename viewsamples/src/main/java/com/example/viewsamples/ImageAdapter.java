package com.example.viewsamples;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context mContext;
    public int[] imageArray = {
            R.drawable.output1, R.drawable.output2, R.drawable.output3, R.drawable.output4,
            R.drawable.output5, R.drawable.output6, R.drawable.output7, R.drawable.output8,
            R.drawable.output9, R.drawable.output10, R.drawable.output11, R.drawable.output12
    };

    public ImageAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object getItem(int position) {

        return imageArray[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(imageArray[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(400,400));
        return imageView;
    }
}
