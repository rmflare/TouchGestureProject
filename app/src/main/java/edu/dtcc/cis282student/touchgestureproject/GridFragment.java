package edu.dtcc.cis282student.touchgestureproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GridFragment extends Fragment  {
    static final String POSITION_KEY = "position key";
    int position;

    static GridFragment newInstance(Bundle args) {
        GridFragment frag = new GridFragment();
        frag.setArguments(args);

        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_grid, container, false);
        position = getArguments().getInt(POSITION_KEY);

        return v;
    }
}