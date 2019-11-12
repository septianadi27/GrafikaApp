package com.pendtium.grafikaapp.ui.PetunjukPenggunaan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PetunjukPenggunaanViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PetunjukPenggunaanViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Petunjuk Penggunaan");
    }

    public LiveData<String> getText() {
        return mText;
    }
}