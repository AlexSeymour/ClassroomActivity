package com.alexseymour.classroomactivity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class QuizzListFragment extends Fragment {


    public QuizzListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final String[] friendItem = {"Football", "Informatique", "Culture general", "Paris"};

        View view = inflater.inflate(R.layout.fragment_quizz_list, container, false);

        ListView listView = (ListView) view.findViewById(R.id.quizz_list);


        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                friendItem);

        listView.setAdapter(listViewAdapter);

        getActivity().setTitle("Quizz disponibles");
        return view;
    }

}
