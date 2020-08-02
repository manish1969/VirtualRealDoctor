package com.example.virtualrealdoctor.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.virtualrealdoctor.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PaymentFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PaymentFragment extends Fragment {


    public PaymentFragment() {
        // Required empty public constructor
    }


    public static PaymentFragment newInstance(String param1, String param2) {
        PaymentFragment fragment = new PaymentFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_payment, container, false);


        final NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment);
        final Button btnBack = root.findViewById(R.id.backButton);

        btnBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button

                navController.navigate(R.id.action_PaymentFragment_to_HomeFragment);


            }
        });
        return root;
    }
}