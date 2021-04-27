package com.example.simplecanvas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Canvas mCanvas;
    private Paint mPaint = new Paint();
    private Paint mPaintText = new Paint(Paint.UNDERLINE_TEXT_FLAG);
    private Bitmap mBitmap;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = findViewById(R.id.my_imageview);
        mPaint.setColor(Color.YELLOW);
        mPaintText.setColor(ResourcesCompat.getColor(getResources(),
                R.color.purple_200, null));
        mPaintText.setTextSize(60);
    }

    public void drawSomething(View view) {
        int vWidth = view.getWidth();
        int vHeight = view.getHeight();
        mBitmap = Bitmap.createBitmap(vWidth,vHeight, Bitmap.Config.ARGB_8888);
        mImageView.setImageBitmap(mBitmap);
        mCanvas = new Canvas(mBitmap);
        
        mCanvas.drawColor(Color.LTGRAY);

        mCanvas.drawText("TAUFIK KEMAL THAHA", 250, 300, mPaintText);
        mCanvas.drawText("19/441240/SV/16592", 250, 400, mPaintText);

        mPaint.setColor(Color.RED);
        Rect mRect = new Rect();
        mRect.set(100,1200,1000,800);
        mCanvas.drawRect(mRect, mPaint);

        mPaint.setColor(Color.BLUE);
        mPaint.setStrokeWidth(24);
        mCanvas.drawLine(500,500,1000,800, mPaint);

        mPaint.setColor(Color.BLUE);
        mPaint.setStrokeWidth(24);
        mCanvas.drawLine(500,500,100,800, mPaint);

        mPaint.setColor(Color.BLUE);
        mPaint.setStrokeWidth(24);
        mCanvas.drawLine(100,800,1000,800, mPaint);

        mPaint.setColor(Color.YELLOW);
        mPaint.setStrokeWidth(16);
        mCanvas.drawLine(400,900,400,1200, mPaint);

        mPaint.setColor(Color.YELLOW);
        mPaint.setStrokeWidth(16);
        mCanvas.drawLine(700,900,700,1200, mPaint);

        mPaint.setColor(Color.YELLOW);
        mPaint.setStrokeWidth(16);
        mCanvas.drawLine(400,900,700,900, mPaint);




        //mPaint.setColor(Color.YELLOW);
        //mCanvas.drawCircle(700,800,500, mPaint);
    }
}