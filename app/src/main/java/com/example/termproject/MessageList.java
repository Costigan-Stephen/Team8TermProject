package com.example.termproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.termproject.adapter.MessageItemAdapter;

import java.util.ArrayList;

public class MessageList extends AppCompatActivity {

    ArrayList<Messages> messages;
    //@Override
    public void onCreate(Bundle savedInstanceState) {
        // ...
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message_list);

        // Lookup the recyclerview in activity layout
        RecyclerView rvMessages = (RecyclerView) findViewById(R.id.rvMessages);

        // Initialize contacts
//        messages = Messages.createMessageList(20);
//        // Create adapter passing in the sample user data
//        MessageItemAdapter adapter = new MessageItemAdapter(messages);
//        // Attach the adapter to the recyclerview to populate items
//        rvMessages.setAdapter(adapter);
//        // Set layout manager to position the items
//        rvMessages.setLayoutManager(new LinearLayoutManager(this));
        // That's all!
    }
}