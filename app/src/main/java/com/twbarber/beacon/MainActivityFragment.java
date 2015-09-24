package com.twbarber.beacon;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private static final String TAG = "MainFragmentActivity";

    private EditText mTitleField;
    private int mInterval;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);

        mTitleField = (EditText) v.findViewById(R.id.interval_text_field);


        mTitleField.addTextChangedListener(new TextWatcher() {

            private static final String TAG = "TextWatcher";

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s == null) {
                    mInterval = 0;
                } else {
                    mInterval = Integer.parseInt(s.toString());
                }
                Toast.makeText(getActivity().getApplicationContext(), String.valueOf(mInterval), Toast.LENGTH_SHORT).show();
            }

        });
        return v;
    }
}
