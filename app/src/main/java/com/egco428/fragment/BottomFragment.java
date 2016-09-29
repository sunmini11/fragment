package com.egco428.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BottomFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BottomFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BottomFragment extends Fragment {
    private static TextView topMessage;
    private static TextView bottomMessage;

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_bottom,container,false);
        topMessage = (TextView)view.findViewById(R.id.topMessage);
        bottomMessage = (TextView)view.findViewById(R.id.bottomMessage);

        return view;
    }
    public void setMessage(String top,String bottom){
        topMessage.setText(top);
        bottomMessage.setText(bottom);
    }


}