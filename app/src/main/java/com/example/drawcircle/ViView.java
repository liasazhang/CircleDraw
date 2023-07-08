package com.example.drawcircle;


import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
public class ViView extends View {

    public ViView(Context context) {
        super(context);
    }
    public ViView(Context context, AttributeSet attrs) {
        super(context, attrs);

    }
    public ViView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec){
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom){
        super.onLayout(changed, left, top, right, bottom);
    }
    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        int width = getWidth();
        int radius = width - 450/2;
        int height = getHeight();
        Paint paint1 = new Paint();
        paint1.setAntiAlias(true);
        paint1.setColor(Color.RED);
        RectF oval = new RectF(width-radius, width-radius,width+radius,width+radius);
        paint1.setStrokeWidth(450);
        canvas.drawArc(oval,-90,90,false,paint1);
        canvas.drawCircle(width/2, height/2, 200, paint1);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }
}
