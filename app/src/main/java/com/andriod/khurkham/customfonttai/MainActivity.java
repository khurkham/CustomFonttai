package com.andriod.khurkham.customfonttai;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bnt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ၽွၼ်ႉတႃႇၸႂ်ႉၼႂ်း Button

        Typeface algerFont = Typeface.createFromAsset(getAssets(), "fonts/namteng.ttf");
        bnt1 = (Button) findViewById(R.id.button);
        bnt1.setTypeface(algerFont);
    }
}
