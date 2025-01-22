package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;



public class ScreenRules extends View {

    private final Paint paint;
    private final Context context;

    public ScreenRules(Context context) {
        super(context);
        this.context = context;
        paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
    }


    @Override
    public void onDraw (Canvas canvas){
        super.onDraw(canvas);
        canvas.drawColor(Color.rgb(220, 180, 240));
        paint.setTextSize(300);
        int[] colorsText = {Color.rgb(210,20,20), Color.rgb(255,200,45), Color.rgb(30,70,210), Color.rgb(50,190,60), Color.rgb(120,0,255)};
        paint.setColor(colorsText[0]);
        canvas.drawText("R", 240, 280, paint);
        paint.setColor(colorsText[1]);
        canvas.drawText("U", 420, 280, paint);
        paint.setColor(colorsText[2]);
        canvas.drawText("L", 600, 280, paint);
        paint.setColor(colorsText[3]);
        canvas.drawText("E", 750, 280, paint);
        paint.setColor(colorsText[4]);
        canvas.drawText("S", 920, 280, paint);
        paint.setColor(Color.BLACK);
        paint.setTextSize(100);
        canvas.drawText("1) - - - - - - - - - - - - - - - - - - - - - ", 50, 400, paint);
        canvas.drawText("2) - - - - - - - - - - - - - - - - - - - - - ", 50, 600, paint);
        canvas.drawText("3) - - - - - - - - - - - - - - - - - - - - - ", 50, 800, paint);
        canvas.drawText("4) - - - - - - - - - - - - - - - - - - - - - ", 50, 1000, paint);
        canvas.drawText("5) - - - - - - - - - - - - - - - - - - - - - ", 50, 1200, paint);
        canvas.drawText("6) - - - - - - - - - - - - - - - - - - - - - ", 50, 1400, paint);
        canvas.drawText("7) - - - - - - - - - - - - - - - - - - - - - ", 50, 1600, paint);

        paint.setTextSize(170);
        paint.setColor(Color.BLACK);
        canvas.drawRect(400, 2300, getWidth() - 400, 2600, paint);
        paint.setColor(Color.WHITE);
        paint.setTextAlign(Paint.Align.CENTER);
        canvas.drawText("BACK", getWidth() / 2f, 2500, paint);
    }
}
