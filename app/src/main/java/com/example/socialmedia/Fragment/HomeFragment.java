package com.example.socialmedia.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socialmedia.Adapter.DashboardAdapter;
import com.example.socialmedia.Adapter.storyAdapter;
import com.example.socialmedia.Model.DasboardModel;
import com.example.socialmedia.Model.StoryModel;
import com.example.socialmedia.R;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    RecyclerView storyRV, dashboardRV;
    ArrayList<StoryModel> list;
    ArrayList<DasboardModel>  dashboardlist;





    public HomeFragment() {

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View view = inflater.inflate(R.layout.fragment_home, container, false);

            storyRV = view.findViewById(R.id.storyRV);

            list = new ArrayList<>();
            list.add(new StoryModel(R.drawable.profile, R.drawable.ic_vireo_camera, R.drawable.deaf, "abc"));
            list.add(new StoryModel(R.drawable.profile, R.drawable.ic_live, R.drawable.deaf, "def"));
            list.add(new StoryModel(R.drawable.deaf, R.drawable.ic_vireo_camera, R.drawable.deaf, "ghi"));
            list.add(new StoryModel(R.drawable.der, R.drawable.ic_vireo_camera, R.drawable.deaf, "jkl"));

            storyAdapter adapter = new storyAdapter(list, getContext());
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
            storyRV.setLayoutManager(linearLayoutManager);
            storyRV.setNestedScrollingEnabled(false);
            storyRV.setAdapter(adapter);

            dashboardRV = view.findViewById(R.id.dashboardRV);

            dashboardlist = new ArrayList<>();
            dashboardlist.add(new DasboardModel(R.drawable.profile, R.drawable.dennis,R.drawable.deu, "sfsfs", "Travler", "88", "44", "31"));

            dashboardlist.add(new DasboardModel(R.drawable.profile, R.drawable.new_hope,R.drawable.original, "qwer", "Travler", "345", "18", "13"));
            dashboardlist.add(new DasboardModel(R.drawable.profile, R.drawable.deaf,R.drawable.dey, "fghfg", "Travler", "545", "43", "63"));
            dashboardlist.add(new DasboardModel(R.drawable.profile, R.drawable.dennis,R.drawable.original, "qwer", "Travler", "345", "34", "3"));
            dashboardlist.add(new DasboardModel(R.drawable.profile, R.drawable.new_hope,R.drawable.original, "qwer", "Travler", "345", "34", "3"));

            DashboardAdapter dashboardAdapter = new DashboardAdapter( dashboardlist, getContext());

            LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
            dashboardRV.setLayoutManager(layoutManager);
            dashboardRV.setNestedScrollingEnabled(false);
            dashboardRV.setAdapter(dashboardAdapter);


            return view;

        }
}

