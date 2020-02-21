package com.example.employeemanagementsystem;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<Employee> mdata;

    public RecyclerViewAdapter(Context mContext, List<Employee> mdata)
    {
        this.mContext = mContext;
        this.mdata = mdata;
    }


    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewtype) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_book,parent,false);
        return new MyViewHolder(view);

    }

    public void onBindViewHolder(MyViewHolder holder, final int position)
    {
        holder.tv_book_title.setText(mdata.get(position).getTitle());
        holder.img_book_thumbnail.setImageResource(mdata.get(position).getThumbnail());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext, EmployeeAct.class);

                intent.putExtra("Title",mdata.get(position).getTitle());
                intent.putExtra("Thumbnails",mdata.get(position).getThumbnail());

                mContext.startActivity(intent);

            }
        });


    }

    public  int getItemCount(){return mdata.size();}

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tv_book_title;
        ImageView img_book_thumbnail;
        CardView cardView;

        public MyViewHolder(View itemView)
        {
            super(itemView);

            tv_book_title = (TextView)itemView.findViewById(R.id.emp_title_id);
            img_book_thumbnail = (ImageView) itemView.findViewById(R.id.emp_img_id);
            cardView = (CardView) itemView.findViewById(R.id.card_view);

        }

    }
}
