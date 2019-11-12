package com.pendtium.grafikaapp.ui.informasi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InformasiViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InformasiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Informasi");
    }

    public LiveData<String> getText() {
        return mText;
    }
}