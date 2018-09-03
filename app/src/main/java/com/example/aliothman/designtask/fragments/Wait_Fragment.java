package com.example.aliothman.designtask.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.aliothman.designtask.R;
import com.example.aliothman.designtask.adaptors.Adaptor_wait;
import com.example.aliothman.designtask.models.model;

import java.util.ArrayList;
import java.util.List;

public class Wait_Fragment extends Fragment {
    private ListView listView ;
    Adaptor_wait adaptor_wait ;
    List<model> strings ;


    public Wait_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_wait_, container, false);
        listView = view.findViewById(R.id.list_wait);
        strings = new ArrayList<model>();
        strings.add( new model( "ابى اروح الهايبر وما عندى سياره ممكن حد يودينى" ));
        strings.add(new model("بنات ضرورى عندى عزومه وابى حد يساعدنى " ));
        strings.add( new model( "ابى اروح الهايبر وما عندى سياره ممكن حد يودينى" ));
        adaptor_wait = new Adaptor_wait(getContext() ,strings );
        listView.setAdapter(adaptor_wait);
        return  view ;
    }
}
