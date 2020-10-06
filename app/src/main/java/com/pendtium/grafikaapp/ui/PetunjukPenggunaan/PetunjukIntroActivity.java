package com.pendtium.grafikaapp.ui.PetunjukPenggunaan;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.TypefaceSpan;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;
import com.pendtium.grafikaapp.R;

public class PetunjukIntroActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setButtonBackVisible(true);
        setButtonBackFunction(BUTTON_BACK_FUNCTION_BACK);
        setButtonNextVisible(true);
        //Button cta is disabled
        setButtonCtaVisible(false);
        setButtonCtaTintMode(BUTTON_CTA_TINT_MODE_BACKGROUND);
        TypefaceSpan labelSpan = new TypefaceSpan(
                Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP ? "sans-serif-medium" : "sans serif");
        SpannableString label = SpannableString
                .valueOf("Get Started");
        label.setSpan(labelSpan, 0, label.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        setButtonCtaLabel(label);

        setPageScrollDuration(500);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            setPageScrollInterpolator(android.R.interpolator.fast_out_slow_in);
        }

        addSlide(new SimpleSlide.Builder()
                .description("Tampilan Ketika Aplikasi Pertama Berjalan")
                .image(R.drawable.petunjuk_1)
                .background(R.color.color_grey)
                .backgroundDark(R.color.color_dark_grey)
                .canGoBackward(false)
                .build());

        addSlide(new SimpleSlide.Builder()
                .description("Tampilan Menu Navigasi")
                .image(R.drawable.petunjuk_2)
                .background(R.color.color_grey)
                .backgroundDark(R.color.color_dark_grey)
                .build());

        addSlide(new SimpleSlide.Builder()
                .description("Tampilan Halaman Materi untuk Memilih Materi")
                .image(R.drawable.petunjuk_3)
                .background(R.color.color_grey)
                .backgroundDark(R.color.color_dark_grey)
                .build());
        addSlide(new SimpleSlide.Builder()
                .description("Tampilan dalam Materi Beserta Sub-Materi")
                .image(R.drawable.petunjuk_4)
                .background(R.color.color_grey)
                .backgroundDark(R.color.color_dark_grey)
                .build());
        addSlide(new SimpleSlide.Builder()
                .description("Tampilan Menu Video yang terdapat Materi Berupa Video")
                .image(R.drawable.petunjuk_5)
                .background(R.color.color_grey)
                .backgroundDark(R.color.color_dark_grey)
                .build());
        addSlide(new SimpleSlide.Builder()
                .description("Tampilan Menu Kuis yang terdapat pilihan kuis berdasarkan materi")
                .image(R.drawable.petunjuk_6)
                .background(R.color.color_grey)
                .backgroundDark(R.color.color_dark_grey)
                .build());
        addSlide(new SimpleSlide.Builder()
                .description("Tampilan kuis ketika berlansung")
                .image(R.drawable.petunjuk_7)
                .background(R.color.color_grey)
                .backgroundDark(R.color.color_dark_grey)
                .build());

        autoplay(2500, INFINITE);
    }

}
