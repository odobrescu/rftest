package com.example.oanna.test;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.oanna.test.data.model.User;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<User> mUsers = new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter( Context mContext, ArrayList<User> mUsers) {
        this.mUsers = mUsers;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        User currentUser = mUsers.get(position);

        Glide.with(mContext).asBitmap().load(currentUser.getPictureURL()).into(holder.userImage);

        holder.userName.setText(currentUser.getName());
        String description = currentUser.getAge()+" years from "+ currentUser.getNationality();
        holder.userDescription.setText(description);

        holder.userTime.setText(currentUser.getRegisteredDate());
    }

    @Override
    public int getItemCount() {
        return mUsers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView userImage;
        TextView userName;
        TextView userDescription;
        TextView userTime;
        ImageView star;
        ImageView attachment;

        public ViewHolder(View itemView) {
            super(itemView);
            userImage = itemView.findViewById(R.id.user_image);
            userName = itemView.findViewById(R.id.user_name);
            userDescription = itemView.findViewById(R.id.user_description);
            userTime = itemView.findViewById(R.id.user_time);
            star = itemView.findViewById(R.id.star_icon);
            attachment = itemView.findViewById(R.id.attach_icon);
        }
    }
}
