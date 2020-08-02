package com.example.virtualrealdoctor.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }


    public LiveData<String> getText() {
        return mText;
    }

    private int clickCountA, clickCountB = 0;

    public int getInitialCountA() {

        return clickCountA;
    }

    public int getInitialCountB() {

        return clickCountB;
    }

    public int getCurrentCountA() {

        clickCountA += 1;
        return clickCountA;
    }

    public int getCurrentCountB() {

        clickCountB += 1;
        return clickCountB;
    }
}