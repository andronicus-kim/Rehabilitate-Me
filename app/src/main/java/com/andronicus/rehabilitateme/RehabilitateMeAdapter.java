package com.andronicus.rehabilitateme;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by andronicus on 3/30/2018.
 */

public class RehabilitateMeAdapter extends RecyclerView.Adapter<RehabilitateMeAdapter.RehabilitateMeViewHolder> {

    private List<User> mUsers;

    public RehabilitateMeAdapter (@NonNull List<User> users){
        this.mUsers = users;
    }
    @Override
    public RehabilitateMeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rehab_info,parent,false);
        return new RehabilitateMeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RehabilitateMeViewHolder holder, int position) {
        holder.bind(mUsers.get(position));
    }

    @Override
    public int getItemCount() {
        return mUsers.size();
    }

    public class RehabilitateMeViewHolder extends RecyclerView.ViewHolder{

        private TextView mName;
        private TextView mAge;
        private TextView mAddiction;

        public RehabilitateMeViewHolder(View view) {
            super(view);
            mName = view.findViewById(R.id.tv_name);
            mAge = view.findViewById(R.id.tv_age);
            mAddiction = view.findViewById(R.id.tv_addiction);
        }

        public void bind(User user){
            mName.setText(user.getName());
            mAge.setText(String.valueOf(user.getAge()));
            mAddiction.setText(user.getAddiction());
        }
    }
}
