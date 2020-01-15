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
                .title("Tittle 1")
                .description("Description 1")
                .image(R.drawable.whatsapp)
                .background(R.color.color_grey)
                .backgroundDark(R.color.color_dark_grey)
                .canGoBackward(false)
                .build());

        addSlide(new SimpleSlide.Builder()
                .title("Tittle 2")
                .description("Description 2")
                .image(R.drawable.github)
                .background(R.color.color_grey)
                .backgroundDark(R.color.color_dark_grey)
                .build());

        addSlide(new SimpleSlide.Builder()
                .title("Tittle 3")
                .description("Description 3")
                .image(R.drawable.email)
                .background(R.color.color_grey)
                .backgroundDark(R.color.color_dark_grey)
                .build());

        autoplay(2500, INFINITE);
    }
    @Override
    public void onBackPressed() {
        // Do Here what ever you want do on back press;
    }

}
