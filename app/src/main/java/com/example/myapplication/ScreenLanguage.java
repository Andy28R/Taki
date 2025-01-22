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



public class ScreenLanguage extends View {

    private final Paint paint;
    private final Context context;

    public ScreenLanguage(Context context) {
        super(context);
        this.context = context;
        paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
    }


    @Override
    public void onDraw (Canvas canvas){
        super.onDraw(canvas);
        canvas.drawColor(Color.rgb(220, 180, 240));
        paint.setTextSize(200);
        int[] colorsText = {Color.rgb(210,20,20), Color.rgb(255,200,45), Color.rgb(30,70,210), Color.rgb(50,190,60), Color.rgb(120,0,255)};
        paint.setColor(colorsText[0]);
        canvas.drawText("L", 130, 280, paint);
        paint.setColor(colorsText[1]);
        canvas.drawText("A", 250, 280, paint);
        paint.setColor(colorsText[2]);
        canvas.drawText("N", 390, 280, paint);
        paint.setColor(colorsText[3]);
        canvas.drawText("G", 540, 280, paint);
        paint.setColor(colorsText[0]);
        canvas.drawText("U", 680, 280, paint);
        paint.setColor(colorsText[1]);
        canvas.drawText("A", 810, 280, paint);
        paint.setColor(colorsText[2]);
        canvas.drawText("G", 940, 280, paint);
        paint.setColor(colorsText[3]);
        canvas.drawText("E", 1080, 280, paint);


        paint.setStyle(Paint.Style.FILL); // Filled rectangles
        int rectHeight = 250; // Height of each rectangle
        int spacing = 220; // Space between rectangles
        int startY = 700; // Starting Y position for the first rectangle

        for (int i = 0; i < 3; i++) {
            int top = startY + (rectHeight + spacing) * i;
            paint.setColor(Color.BLACK);
            canvas.drawRect(100, top, getWidth() - 100, top + rectHeight, paint);
        }

        paint.setColor(Color.WHITE);
        paint.setTextSize(170);
        paint.setTextAlign(Paint.Align.CENTER);
        canvas.drawText("ENGLISH", getWidth() / 2f, 880, paint);
        canvas.drawText("עברית", getWidth() / 2f, 1350, paint);
        canvas.drawText("русский", getWidth() / 2f, 1800, paint);

        paint.setTextSize(170);
        paint.setColor(Color.BLACK);
        canvas.drawRect(400, 2300, getWidth() - 400, 2600, paint);
        paint.setColor(Color.WHITE);
        paint.setTextAlign(Paint.Align.CENTER);
        canvas.drawText("BACK", getWidth() / 2f, 2500, paint);

    }
}
