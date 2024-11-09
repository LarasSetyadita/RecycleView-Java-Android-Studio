package com.example.recycleactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyBookAdapter extends RecyclerView.Adapter<MyBookAdapter.ViewHolder> {
    MyBookData[] myBookData;
    Context context;

    public MyBookAdapter(MyBookData[] myBookData, MainActivity activity){
        this.myBookData = myBookData;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.book_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final MyBookData myBookDataList = myBookData[position];
        holder.textViewTitle.setText(myBookDataList.getBookTitle());
        holder.textViewAuthor.setText(myBookDataList.getBookAuthor());
        holder.bookCoverImage.setImageResource(myBookDataList.getCoverBookImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, myBookDataList.getBookTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return myBookData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView bookCoverImage;
        TextView textViewTitle;
        TextView textViewAuthor;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            bookCoverImage = itemView.findViewById(R.id.imageview);
            textViewTitle = itemView.findViewById(R.id.booktitle);
            textViewAuthor = itemView.findViewById(R.id.bookauthor);
        }
    }
}
