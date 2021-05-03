package com.example.socialmedia.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socialmedia.Adapter.NotificationAdapter;
import com.example.socialmedia.Model.NotificationModel;
import com.example.socialmedia.R;

import java.util.ArrayList;


public class RequestFragment extends Fragment {

    RecyclerView requestRv;
    ArrayList<NotificationModel> list;

    public RequestFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_request, container, false);

        requestRv = view.findViewById(R.id.requestRecyclerView);

        list = new ArrayList<>();
        list.add(new NotificationModel(R.drawable.profile,"<b>Alicia Addams</b> Send you a friend request","just now"));
        list.add(new NotificationModel(R.drawable.original,"<b>Janeeleona</b> Send you a friend request","40 minutes ago"));
        list.add(new NotificationModel(R.drawable.dey,"<b>Katherinn</b> Suggested for you","2 hours"));
        list.add(new NotificationModel(R.drawable.dennis,"<b>Alicia Addams</b> Send you a friend request","3 hours"));
        list.add(new NotificationModel(R.drawable.profile,"<b>Janeeleona</b> Suggested for you","3 hours"));
        list.add(new NotificationModel(R.drawable.deu,"<b>Alicia Addams</b> Send you a friend request","3 hours"));
        list.add(new NotificationModel(R.drawable.der,"<b>Alicia Addams</b> Send you a friend request","3 hours"));
        list.add(new NotificationModel(R.drawable.original,"<b>Alicia Addams</b> Send you a friend request","3 hours"));


        NotificationAdapter adapter = new NotificationAdapter(list, getContext());

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);

        requestRv.setLayoutManager(layoutManager);
        requestRv.setNestedScrollingEnabled(false);
        requestRv.setAdapter(adapter);

        return view;
    }
}