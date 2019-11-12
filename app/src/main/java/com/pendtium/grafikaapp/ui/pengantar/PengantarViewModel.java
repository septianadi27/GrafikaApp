package com.pendtium.grafikaapp.ui.pengantar;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PengantarViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PengantarViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Pengantar");
    }

    public LiveData<String> getText() {
        return mText;
    }
}