package com.sherlockshi.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Author: SherlockShi
 * Date:   2016-09-29 21:54
 * Description:
 */

public class AspectRatioImageView extends ImageView {

    private int defaultWidthRatio   = 3;
    private int defaultHeightRatio  = 2;

    private int widthRatio;
    private int heightRatio;

    public AspectRatioImageView(Context context) {
        this(context, null);
    }

    public AspectRatioImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AspectRatioImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.AspectRatioImageView);
        try {
            widthRatio = a.getInteger(R.styleable.AspectRatioImageView_width_ratio, 0);
            heightRatio = a.getInteger(R.styleable.AspectRatioImageView_height_ratio, 0);

            if (widthRatio == 0 || heightRatio == 0) {
                widthRatio = defaultWidthRatio;
                heightRatio = defaultHeightRatio;
            }
        } finally {
            a.recycle();
        }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int height = MeasureSpec.getSize(widthMeasureSpec) * heightRatio / widthRatio;
        int heightSpec = MeasureSpec.makeMeasureSpec(height, MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, heightSpec);
    }
}
