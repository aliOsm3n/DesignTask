package com.example.aliothman.designtask.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.aliothman.designtask.R;
import com.example.aliothman.designtask.adaptors.Adaptor_cancel;
import com.example.aliothman.designtask.models.model;

import java.util.ArrayList;
import java.util.List;


public class Cancel_Fragment extends Fragment {

    private ListView listView ;
    Adaptor_cancel adaptor_cancel ;
    List<model> strings ;

    public Cancel_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_accept_, container, false);
        listView = view.findViewById(R.id.list_wait);
        strings = new ArrayList<model>();
        strings.add( new model( "ابى اروح الهايبر وما عندى سياره ممكن حد يودينى" ));
        strings.add(new model("بنات ضرورى عندى عزومه وابى حد يساعدنى " ));
        adaptor_cancel = new Adaptor_cancel(getContext() ,strings );
        listView.setAdapter(adaptor_cancel);
        return  view ;
    }
}
