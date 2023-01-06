package com.example.recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler);

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add("item = "+i);
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new CustomAdapter(list));
        recyclerView.addItemDecoration(new CustomItemDecoration());
    }

    private class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;

        public ViewHolder(@NonNull View view) {
            super(view);

            textView = view.findViewById(android.R.id.text1);
        }

        TextView getTextView(){
            return textView;
        }
    }

    private class CustomAdapter extends RecyclerView.Adapter<ViewHolder> {
        private List<String> dataSet;

        CustomAdapter(List<String> dataSet) {
            this.dataSet = dataSet;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
            View view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(android.R.layout.simple_list_item_1, viewGroup, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
            viewHolder.getTextView().setText(dataSet.get(position));
        }

        @Override
        public int getItemCount() {
            return dataSet.size();
        }
    }

    private class CustomItemDecoration extends RecyclerView.ItemDecoration {
        // 항목을 배치하기 전에 호출
        @Override
        public void onDraw(@NonNull Canvas c, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.onDraw(c, parent, state);
            // RecyclerView의 사이즈 계산
            int width = parent.getWidth();
            int height = parent.getHeight();
            Paint paint = new Paint();
            paint.setColor(Color.RED);
            c.drawRect(0, 0, width/2, height,paint);
        }

        // 각 항목을 배치할 때 호출
        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            int index = parent.getChildAdapterPosition(view) + 1;

            if (index % 3 == 0)
                outRect.set(20, 20, 20, 60);    // 여백
            else
                outRect.set(20, 20,20, 20);     // 여백

            view.setBackgroundColor(0xFFECE9E9);    // 바탕색
            ViewCompat.setElevation(view, 20.0f);   // 떠 있는 듯한 효과
        }

        // 모든 항목이 배치된 후에 호출
        @Override
        public void onDrawOver(@NonNull Canvas c, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.onDrawOver(c, parent, state);
            int width = parent.getWidth();
            int height = parent.getHeight();

            Drawable dr = ResourcesCompat.getDrawable(getResources(), R.drawable.android, null);

            int drWidth = dr.getIntrinsicWidth();
            int drHeight = dr.getIntrinsicHeight();

            int left = width / 2 - drWidth / 2;
            int top = height / 2 - drHeight / 2;

            c.drawBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.android), left, top, null);

        }
    }
}