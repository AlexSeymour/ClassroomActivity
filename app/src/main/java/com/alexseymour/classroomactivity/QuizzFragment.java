package com.alexseymour.classroomactivity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.util.Log;

/**
 * A simple {@link Fragment} subclass.
 */
public class QuizzFragment extends Fragment {


    public QuizzFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        getActivity().setTitle("Liste de quizz");
        return inflater.inflate(R.layout.fragment_quizz, container, false);
    }

}
