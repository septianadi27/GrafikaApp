package com.pendtium.grafikaapp.ui.HalamanUtama;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HalamanUtamaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HalamanUtamaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Halaman Utama\n\n\nHalaman Utama\n\n\nHalaman Utama" +
                "\n\n\nHalaman Utama\n\n\nHalaman Utama\n\n\nHalaman Utama" +
                "\n\n\nHalaman Utama\n\n\nHalaman Utama\n\n\nHalaman Utama" +
                "\n\n\nHalaman Utama\n\n\nHalaman Utama\n\n\nHalaman Utama" +
                "\n\n\nHalaman Utama\n\n\nHalaman Utama\n\n\nHalaman Utama");
    }

    public LiveData<String> getText() {
        return mText;
    }
}