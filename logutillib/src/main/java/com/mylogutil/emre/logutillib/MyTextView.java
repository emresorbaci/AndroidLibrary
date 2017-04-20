package com.mylogutil.emre.logutillib;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by EMRE on 21.04.2017.
 */

public class MyTextView extends TextView {

    public MyTextView(Context context) {
        super(context);
        Typeface face = Typeface.createFromAsset(context.getAssets(), "murray.ttf");
        this.setTypeface(face);
        this.setTextColor(10841354);
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Typeface face = Typeface.createFromAsset(context.getAssets(), "murray.ttf");
        this.setTypeface(face);
        this.setTextColor(10841354);
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Typeface face = Typeface.createFromAsset(context.getAssets(), "murray.ttf");
        this.setTypeface(face);
        this.setTextColor(10841354);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
