package com.bulbulhossen.imagezoom;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

public class MultipleStyleInsideAndroidTextView extends AppCompatActivity {


    TextView textView1, textView2, textView3;
    private android.content.Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiple_style_inside_android_textview);

        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);

        textView1.setText(Html.fromHtml("Multiple style inside android textview: bold text: <b>bold</b>, italic text: <i>italic</i>, small font: <small>small text</small>, " +
                "font color: <font color=\"red\">Text Color</font>, " +
                "font color with bold text: <font color=\"red\"><b>Bold with font color</b></font>"));

        Spanned text = Html.fromHtml("Multiple style inside android textview: bold text: <b>bold</b>, " +
                "italic text: <i>italic</i>, small font: <small>small text</small>, font color: <font color=\"red\">Text Color</font>, " +
                "font color with bold text: <font color=\"red\"><b>Bold with font color</b></font>");
        textView2.setText(text);

        textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText(Html.fromHtml(getString(R.string.text_style)));
    }
}