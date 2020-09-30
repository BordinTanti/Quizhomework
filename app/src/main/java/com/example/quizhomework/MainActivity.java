package com.example.quizhomework;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quizhomework.model.WordItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayoutManager lm = new LinearLayoutManager(MainActivity.this);

        MyAdapter adapter = new MyAdapter();

        RecyclerView rv = findViewById(R.id.word_list_recycler_view);
        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);


    }

    class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

        private WordItem[] items = {
                new WordItem(R.drawable.fishandchip, "fish and chip","80 bath"),
                new WordItem(R.drawable.humberger, "hamberger","80 bath"),
                new WordItem(R.drawable.omelette, "omelette","35 bath"),
                new WordItem(R.drawable.patthai, "pat thai","40 bath"),
                new WordItem(R.drawable.pizza, "pizza","110 bath"),
                new WordItem(R.drawable.ramen, "ramen","65 bath"),
                new WordItem(R.drawable.spaghetti, "spaghetti","50 bath"),
                new WordItem(R.drawable.steak, "steak","90 bath"),
                new WordItem(R.drawable.sushi, "sushi","15 bath"),
                new WordItem(R.drawable.takoyaki, "takoyaki","35 bath"),

        };

        MyAdapter() {
        }

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_word, parent, false);
            MyViewHolder vh = new MyViewHolder(v);
            return vh;
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            holder.imageView.setImageResource(items[position].imageResId);
            holder.engwordTextView.setText(items[position].engword);
            holder.princeTextView.setText(items[position].thaiword);
        }

        @Override
        public int getItemCount() {
            return items.length;
        }

         class MyViewHolder extends RecyclerView.ViewHolder {
            ImageView imageView;
            TextView engwordTextView;
            TextView princeTextView;

            MyViewHolder(@NonNull View itemView) {
                super(itemView);
                imageView = itemView.findViewById(R.id.image_View);
                engwordTextView = itemView.findViewById(R.id.Engname);
                princeTextView = itemView.findViewById(R.id.Princename);
            }
        }
    }
}