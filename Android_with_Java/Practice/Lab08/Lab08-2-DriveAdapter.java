package com.example.customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;

import java.util.ArrayList;
import java.util.List;

public class DriveAdapter extends ArrayAdapter<DriveVO> {
    Context context;
    int resId;
    ArrayList<DriveVO> data;

    public DriveAdapter(@NonNull Context context, int resId, @NonNull ArrayList<DriveVO> data) {
        super(context, resId);
        this.context = context;
        this.resId = resId;
        this.data = data;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(resId, null);
            DriveHolder holder = new DriveHolder(convertView);
            convertView.setTag(holder);
        }

        DriveHolder holder = (DriveHolder) convertView.getTag();

        ImageView typeImageView = holder.typeImageView;
        TextView titleView = holder.titleView;
        TextView dateView = holder.dateView;
        ImageView menuImageView = holder.menuImageView;

        final DriveVO vo = data.get(position);

        titleView.setText(vo.title);
        dateView.setText(vo.date);

        if (vo.type.equals("doc")){
            typeImageView.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(), R.drawable.ic_type_doc, null));
        } else if (vo.type.equals("file")) {
            typeImageView.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(), R.drawable.ic_type_file, null));
        } else if (vo.type.equals("img")) {
            typeImageView.setImageResource(ResourcesCompat.getDrawable(context.getResources(), R.drawable.if_type_img, null));
        }

        menuImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "menu click", Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }
}
