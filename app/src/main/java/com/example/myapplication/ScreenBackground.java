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



public class ScreenBackground extends View {

    private final Paint paint;
    private final Context context;

    public ScreenBackground(Context context) {
        super(context);
        this.context = context;
        paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
    }


    @Override
    public void onDraw (Canvas canvas){
        super.onDraw(canvas);
        canvas.drawColor(Color.rgb(220, 180, 240));
        paint.setTextSize(170);
        int[] colorsText = {Color.rgb(210,20,20), Color.rgb(255,200,45), Color.rgb(30,70,210), Color.rgb(50,190,60), Color.rgb(120,0,255)};
        paint.setColor(colorsText[0]);
        canvas.drawText("B", 80, 280, paint);
        paint.setColor(colorsText[1]);
        canvas.drawText("A", 190, 280, paint);
        paint.setColor(colorsText[2]);
        canvas.drawText("C", 300, 280, paint);
        paint.setColor(colorsText[3]);
        canvas.drawText("K", 420, 280, paint);
        paint.setColor(colorsText[0]);
        canvas.drawText("G", 530, 280, paint);
        paint.setColor(colorsText[1]);
        canvas.drawText("R", 660, 280, paint);
        paint.setColor(colorsText[2]);
        canvas.drawText("O", 770, 280, paint);
        paint.setColor(colorsText[3]);
        canvas.drawText("U", 900, 280, paint);
        paint.setColor(colorsText[0]);
        canvas.drawText("N", 1010, 280, paint);
        paint.setColor(colorsText[1]);
        canvas.drawText("D", 1140, 280, paint);



        int rectHeight = 400; // Height of each square
        int rectLength = 400; // Length of each square
        int spacingY = 200; // Space between squares (Y)
        int spacingX = 200; // Space between squares (X)
        int startY = 500; // Starting Y position for the first square
        int startX = 170; // Starting X position for the first square

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                int top = startY + (rectHeight + spacingY) * j;
                int left = startX + (rectLength + spacingX) * i;
                paint.setColor(Color.BLACK);
                canvas.drawRect(left, top, left + rectLength, top + rectHeight, paint);
            }
        }

        int[] colorsBG = {Color.rgb(0,110,110), Color.rgb(255,200,100),Color.rgb(220, 180, 240),  Color.rgb(100,50,0), Color.rgb(220,220,220), Color.rgb(100, 40, 80)};

        int colorChange = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                int top = startY + 30 + (rectHeight + spacingY) * j;
                int left = startX + 30 + (rectLength + spacingX) * i;
                paint.setColor(colorsBG[colorChange]);
                colorChange++;
                canvas.drawRect(left, top, left + rectLength - 60, top + rectHeight - 60, paint);
            }
        }

        paint.setColor(Color.BLACK);
        canvas.drawRect(400, 2300, getWidth() - 400, 2600, paint);
        paint.setColor(Color.WHITE);
        paint.setTextAlign(Paint.Align.CENTER);
        canvas.drawText("BACK", getWidth() / 2f, 2500, paint);

    }
}
