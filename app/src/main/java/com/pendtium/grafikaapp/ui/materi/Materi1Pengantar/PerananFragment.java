package com.pendtium.grafikaapp.ui.materi.Materi1Pengantar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;
import com.pendtium.grafikaapp.R;

public class PerananFragment extends Fragment implements View.OnClickListener {

    public PerananFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public ExpandableRelativeLayout mExpandLayout1;
    public ExpandableRelativeLayout mExpandLayout2;
    public ExpandableRelativeLayout mExpandLayout3;
    public ExpandableRelativeLayout mExpandLayout4;
    public ExpandableRelativeLayout mExpandLayout5;
    public ExpandableRelativeLayout mExpandLayout6;
    public ExpandableRelativeLayout mExpandLayout7;
    public ExpandableRelativeLayout mExpandLayout8;
    public ExpandableRelativeLayout mExpandLayout9;
    public ExpandableRelativeLayout mExpandLayout10;
    public ExpandableRelativeLayout mExpandLayout11;
    public LinearLayout linearLayout1;
    public LinearLayout linearLayout2;
    public LinearLayout linearLayout3;
    public LinearLayout linearLayout4;
    public LinearLayout linearLayout5;
    public LinearLayout linearLayout6;
    public LinearLayout linearLayout7;
    public LinearLayout linearLayout8;
    public LinearLayout linearLayout9;
    public LinearLayout linearLayout10;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.materi1_fragment_peranan, container, false);

        mExpandLayout1 = (ExpandableRelativeLayout) root.findViewById(R.id.expandable1);
        mExpandLayout2 = (ExpandableRelativeLayout) root.findViewById(R.id.expandable2);
        mExpandLayout3 = (ExpandableRelativeLayout) root.findViewById(R.id.expandable3);
        mExpandLayout4 = (ExpandableRelativeLayout) root.findViewById(R.id.expandable4);
        mExpandLayout5 = (ExpandableRelativeLayout) root.findViewById(R.id.expandable5);
        mExpandLayout6 = (ExpandableRelativeLayout) root.findViewById(R.id.expandable6);
        mExpandLayout7 = (ExpandableRelativeLayout) root.findViewById(R.id.expandable7);
        mExpandLayout8 = (ExpandableRelativeLayout) root.findViewById(R.id.expandable8);
        mExpandLayout9 = (ExpandableRelativeLayout) root.findViewById(R.id.expandable9);
        mExpandLayout10 = (ExpandableRelativeLayout) root.findViewById(R.id.expandable10);

        linearLayout1 = (LinearLayout) root.findViewById(R.id.lay1);
        linearLayout2 = (LinearLayout) root.findViewById(R.id.lay2);
        linearLayout3 = (LinearLayout) root.findViewById(R.id.lay3);
        linearLayout4 = (LinearLayout) root.findViewById(R.id.lay4);
        linearLayout5 = (LinearLayout) root.findViewById(R.id.lay5);
        linearLayout6 = (LinearLayout) root.findViewById(R.id.lay6);
        linearLayout7 = (LinearLayout) root.findViewById(R.id.lay7);
        linearLayout8 = (LinearLayout) root.findViewById(R.id.lay8);
        linearLayout9 = (LinearLayout) root.findViewById(R.id.lay9);
        linearLayout10 = (LinearLayout) root.findViewById(R.id.lay10);

        linearLayout1.setOnClickListener(this);
        linearLayout2.setOnClickListener(this);
        linearLayout3.setOnClickListener(this);
        linearLayout4.setOnClickListener(this);
        linearLayout5.setOnClickListener(this);
        linearLayout6.setOnClickListener(this);
        linearLayout7.setOnClickListener(this);
        linearLayout8.setOnClickListener(this);
        linearLayout9.setOnClickListener(this);
        linearLayout10.setOnClickListener(this);


        return root;
    }

    //set toggle for description
    public void onClick(final View v) {
        switch (v.getId()) {
            case R.id.lay1:
                mExpandLayout1.toggle();
                break;
            case R.id.lay2:
                mExpandLayout2.toggle();
                break;
            case R.id.lay3:
                mExpandLayout3.toggle();
                break;
            case R.id.lay4:
                mExpandLayout4.toggle();
                break;
            case R.id.lay5:
                mExpandLayout5.toggle();
                break;
            case R.id.lay6:
                mExpandLayout6.toggle();
                break;
            case R.id.lay7:
                mExpandLayout7.toggle();
                break;
            case R.id.lay8:
                mExpandLayout8.toggle();
                break;
            case R.id.lay9:
                mExpandLayout9.toggle();
                break;
            case R.id.lay10:
                mExpandLayout10.toggle();
                break;
        }
    }

}
