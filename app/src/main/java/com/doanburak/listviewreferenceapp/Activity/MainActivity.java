package com.doanburak.listviewreferenceapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.doanburak.listviewreferenceapp.Adapter.UserAdapter;
import com.doanburak.listviewreferenceapp.Model.User;
import com.doanburak.listviewreferenceapp.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv_userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_userList = findViewById(R.id.lv_userList);

        //User modelinden nesneler oluştur
        User user1 = new User("burak","doğan","doanburak97@gmail.com",R.drawable.user3);
        User user2 = new User("burcu","doğan","doanburcu04@gmail.com",R.drawable.user2);
        User user3 = new User("hamza","doğan","doanhamza68@gmail.com",R.drawable.user4);
        User user4 = new User("özlem","doğan","doanozlem67@gmail.com",R.drawable.user5);

        //User model tipinde ArrayList oluştur. Tanımlanan modelleri içine ekle.
        ArrayList<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        //userAdapter tanımlanması ve listview a set edilmesi.
        UserAdapter userAdapter = new UserAdapter(userList, MainActivity.this);
        lv_userList.setAdapter(userAdapter);

    }
}