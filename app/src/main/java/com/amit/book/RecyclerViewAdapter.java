package com.amit.book;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class RecyclerViewAdapter extends  RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext ;
    private List<Book> mData ;
    public RecyclerViewAdapter(Context mContext, List<Book> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_book,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.tv_book_title.setText(mData.get(position).getTitle());
        holder.img_book_thumbnail.setImageResource(mData.get(position).getThumbnail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (position == 0) {

                    Intent intent = new Intent(mContext, c.class);
                    mContext.startActivity(intent);
                }

                if (position == 1) {

                    Intent intent = new Intent(mContext, ccc.class);
                    mContext.startActivity(intent);
                }





                if (position == 2) {

                    Intent intent = new Intent(mContext, java.class);
                    mContext.startActivity(intent);
                }


                if (position == 3) {

                    Intent intent = new Intent(mContext, android.class);
                    mContext.startActivity(intent);
                }


                if (position == 4) {

                    Intent intent = new Intent(mContext, python.class);
                    mContext.startActivity(intent);
                }


                if (position == 5) {

                    Intent intent = new Intent(mContext, webdevlopment.class);
                    mContext.startActivity(intent);
                }


                if (position == 6) {

                    Intent intent = new Intent(mContext, java_script.class);
                    mContext.startActivity(intent);
                }


                if (position == 7) {

                    Intent intent = new Intent(mContext, php.class);
                    mContext.startActivity(intent);
                }


                if (position == 8) {

                    Intent intent = new Intent(mContext, Ruby.class);
                    mContext.startActivity(intent);
                }


                if (position == 9) {

                    Intent intent = new Intent(mContext, hacking.class);
                    mContext.startActivity(intent);
                }





            }
        });
    }
    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_book_title;
        ImageView img_book_thumbnail;
        CardView cardView ;

        public MyViewHolder(View itemView) {
            super(itemView);

            tv_book_title = itemView.findViewById(R.id.title);
            img_book_thumbnail = itemView.findViewById(R.id.image);
            cardView = itemView.findViewById(R.id.cardview_id);


        }
    }


}

