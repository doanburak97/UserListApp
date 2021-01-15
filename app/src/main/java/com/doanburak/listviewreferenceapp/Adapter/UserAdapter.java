package com.doanburak.listviewreferenceapp.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.doanburak.listviewreferenceapp.Model.User;
import com.doanburak.listviewreferenceapp.R;

import java.util.ArrayList;

public class UserAdapter extends ArrayAdapter {

    private ArrayList<User> users;
    private Activity context;

    //constructor
    public UserAdapter(ArrayList<User> users, Activity context){
        super(context, R.layout.userlist_view, users);
        this.users = users;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //userlist_view listview tasarımını kullanmamız için
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View userView = layoutInflater.inflate(R.layout.userlist_view, null, true);

        //tanımlama
        ImageView iv_user = userView.findViewById(R.id.iv_user);
        TextView tv_name = userView.findViewById(R.id.tv_name);
        TextView tv_surname = userView.findViewById(R.id.tv_surname);
        TextView tv_mail = userView.findViewById(R.id.tv_mail);

        //değerleri atama
        iv_user.setImageResource(users.get(position).getPictureInt());
        tv_name.setText(users.get(position).getName());
        tv_surname.setText(users.get(position).getSurname());
        tv_mail.setText(users.get(position).getEmail());

        return userView;
    }
}
