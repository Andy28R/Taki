package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class DrawMainScreen extends View {
    private final Paint paint;
    private final Context context;

    public DrawMainScreen(Context context) {
        super(context);
        this.context = context;
        paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        // Set the background color
        canvas.drawColor(Color.rgb(220, 180, 240)); // Bright purple


        // Draw 4 rectangles (centered and stretched from left to right)
        paint.setStyle(Paint.Style.FILL); // Filled rectangles
        int rectHeight = 250; // Height of each rectangle
        int spacing = 100; // Space between rectangles
        int startY = 500; // Starting Y position for the first rectangle

        int[] colorsText = {Color.rgb(210,20,20), Color.rgb(255,200,45), Color.rgb(30,70,210), Color.rgb(50,190,60)};


        // Draw the word "TAKI" at the top
        paint.setColor(colorsText[0]);//Text Color
        paint.setTextSize(300); // Text size
        canvas.drawText("T", 350, 280, paint);
        paint.setColor(colorsText[1]);
        canvas.drawText("A", 500, 280, paint);
        paint.setColor(colorsText[2]);
        canvas.drawText("K", 700, 280, paint);
        paint.setColor(colorsText[3]);
        canvas.drawText("I", 900, 280, paint);


        for (int i = 0; i < 4; i++) {
            int top = startY + (rectHeight + spacing) * i;
            paint.setColor(colorsText[i]);
            canvas.drawRect(100, top, getWidth() - 100, top + rectHeight, paint);
        }

        paint.setColor(Color.WHITE);
        paint.setTextSize(170);
        paint.setTextAlign(Paint.Align.CENTER);
        canvas.drawText("PLAY", getWidth() / 2f, 670, paint);
        canvas.drawText("RULES", getWidth() / 2f, 1020, paint);
        canvas.drawText("LANGUAGE", getWidth() / 2f, 1370, paint);
        canvas.drawText("BACKGROUND", getWidth() / 2f, 1720, paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            int width = getWidth();
            int height = getHeight();
            int rectWidth = width - 200;
            int rectHeight = 250;
            int rectSpacing = 100;
            int top;

            for (int i = 0; i < 4; i++) {
                top = 350 * i + 500;
                if ((event.getX() >= 100) && (event.getX() <= getWidth() - 100) && (event.getY() >= top) && (event.getY() <= top + 250)) {
                    navigateToScreen(i);
                    return true;
                }
            }

        }
        return super.onTouchEvent(event);
    }

    private void navigateToScreen(int index) {
        Class<?> destinationActivity;
        switch (index) {
            case 0:
                destinationActivity = ScreenPlay.class;
                break;
            case 1:
                destinationActivity = ScreenRules.class;
                break;
            case 2:
                destinationActivity = ScreenLanguage.class;
                break;
            case 3:
                destinationActivity = ScreenBackground.class;
                break;
            default:
                return;
        }

        Intent intent = new Intent(context, destinationActivity);
        context.startActivity(intent);
    }
}
