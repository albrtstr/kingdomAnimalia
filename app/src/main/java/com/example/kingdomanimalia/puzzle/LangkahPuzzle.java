package com.example.kingdomanimalia.puzzle;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.GridView;

import com.example.kingdomanimalia.b_coelenterata.hal19_coelenterata;

public class LangkahPuzzle extends GridView {
   GestureDetector gDetector;
    boolean mFlingConfirmed = false;
    float mTouchX;
    float mTouchY;

    int SWIPE_MIN_DISTANCE = 100;
    int SWIPE_MAX_OFF_PATH = 100;
    int SWIPE_THRESHOLD_VELOCITY = 100;

    public LangkahPuzzle(Context context) {
        super(context);
        init(context);
    }

    public LangkahPuzzle(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public LangkahPuzzle(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP) // API 21
    public LangkahPuzzle(Context context, AttributeSet attrs, int defStyleAttr,
                         int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    private void init(Context context) {
        gDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            @Override
            public boolean onDown(MotionEvent event) {
                return true;
            }

            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
                                   float velocityY) {
                final int position = LangkahPuzzle.this.pointToPosition
                        (Math.round(e1.getX()), Math.round(e1.getY()));

                if (Math.abs(e1.getY() - e2.getY()) > SWIPE_MAX_OFF_PATH) {
                    if (Math.abs(e1.getX() - e2.getX()) > SWIPE_MAX_OFF_PATH
                            || Math.abs(velocityY) < SWIPE_THRESHOLD_VELOCITY) {
                        return false;
                    }
                    if (e1.getY() - e2.getY() > SWIPE_MIN_DISTANCE) {
                        hal19_coelenterata.moveTiles(context, hal19_coelenterata.up, position);
                    } else if (e2.getY() - e1.getY() > SWIPE_MIN_DISTANCE) {
                        hal19_coelenterata.moveTiles(context, hal19_coelenterata.down, position);
                    }
                } else {
                    if (Math.abs(velocityX) < SWIPE_THRESHOLD_VELOCITY) {
                        return false;
                    }
                    if (e1.getX() - e2.getX() > SWIPE_MIN_DISTANCE) {
                        hal19_coelenterata.moveTiles(context, hal19_coelenterata.left, position);
                    } else if (e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE) {
                        hal19_coelenterata.moveTiles(context, hal19_coelenterata.right, position);
                    }
                }

                return super.onFling(e1, e2, velocityX, velocityY);
            }
        });
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        int action = ev.getActionMasked();
        gDetector.onTouchEvent(ev);

        if (action == MotionEvent.ACTION_CANCEL || action == MotionEvent.ACTION_UP) {
            mFlingConfirmed = false;
        } else if (action == MotionEvent.ACTION_DOWN) {
            mTouchX = ev.getX();
            mTouchY = ev.getY();
        } else {

            if (mFlingConfirmed) {
                return true;
            }

            float dX = (Math.abs(ev.getX() - mTouchX));
            float dY = (Math.abs(ev.getY() - mTouchY));
            if ((dX > SWIPE_MIN_DISTANCE) || (dY > SWIPE_MIN_DISTANCE)) {
                mFlingConfirmed = true;
                return true;
            }
        }

        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return gDetector.onTouchEvent(ev);
    }
}
