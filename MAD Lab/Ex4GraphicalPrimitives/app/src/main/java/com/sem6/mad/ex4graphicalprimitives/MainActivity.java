package com.sem6.mad.ex4graphicalprimitives;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new myView(this));
    }

    public class myView extends View {

        Paint myPaint;

        public myView (Context context)
        {
            super(context);
            myPaint = new Paint();
            myPaint.setColor(Color.GREEN);
            myPaint.setStrokeWidth(10f);
        }

        @Override
        protected void onDraw(Canvas canvas) {

            canvas.drawRect(10,10,300,300,myPaint);
            canvas.drawCircle(300,500,150,myPaint);
            canvas.drawLine(1000,500,1000,1150,myPaint);
            canvas.drawRect(400,1200,650,700,myPaint);
        }
    }
}