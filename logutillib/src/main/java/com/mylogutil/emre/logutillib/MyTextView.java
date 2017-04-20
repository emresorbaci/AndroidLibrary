package com.mylogutil.emre.logutillib;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by EMRE on 21.04.2017.
 */

public class MyTextView extends TextView {

    public MyTextView(Context context) {
        super(context);
        this.setTextColor(10841354);
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTextColor(10841354);
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.setTextColor(10841354);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
