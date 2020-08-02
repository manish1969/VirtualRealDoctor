package com.example.virtualrealdoctor;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class PrescriptionFragment extends Fragment {

    private PrescriptionViewModel mViewModel;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
    mViewModel =
            ViewModelProviders.of(this).get(PrescriptionViewModel .class);
    View root = inflater.inflate(R.layout.prescription_fragment, container, false);
    final NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment);
    final Button prbBack = root.findViewById(R.id.pack);

    prbBack.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
                // Code here executes on main thread after user presses button

            navController.navigate(R.id.action_PrescriptionFragment_to_HomeFragment);

            }
        });
    return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(PrescriptionViewModel.class);
        // TODO: Use the ViewModel
    }

}