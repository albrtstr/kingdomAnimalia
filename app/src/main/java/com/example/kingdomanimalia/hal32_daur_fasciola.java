package com.example.kingdomanimalia;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.kingdomanimalia.b_coelenterata.hal20_coelenterata;
import com.example.kingdomanimalia.h_platyhelminthes.hal25_filum_platyhelminthes;
import com.example.kingdomanimalia.h_platyhelminthes.hal29_kelas_platyhelminthes_2_trematoda;
import com.example.kingdomanimalia.h_platyhelminthes.hal30_kelas_platyhelminthes_3_cestoda;
import com.example.kingdomanimalia.h_platyhelminthes.hal33_daurfasciola_2;
import com.example.kingdomanimalia.puzzle.CustomPuzzle;
import com.example.kingdomanimalia.puzzle.LangkahPuzzle;
import com.example.kingdomanimalia.puzzle.LangkahPuzzle1;

import java.util.ArrayList;
import java.util.Random;

public class hal32_daur_fasciola extends AppCompatActivity {
    float x1,x2,y1,y2;

    static LangkahPuzzle1 mGridView;

    static int COLUMNS = 3;
    static int DIMENSIONS = COLUMNS * COLUMNS;

    static int mColumnWidth;
    static int mColumnHeight;

    public static final String up = "up";
    public static final String down = "down";
    public static final String left = "left";
    public static final String right = "right";

    private static String[] titleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal32_daur_fasciola);
        init();

        scramble();
        setDimensions();
        ImageView home = findViewById(R.id.btnhome);
        ImageView back = findViewById(R.id.btnback);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal32_daur_fasciola.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal32_daur_fasciola.this, hal4_menu_screen.class));
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal32_daur_fasciola.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal32_daur_fasciola.this, hal7_menu_jelajah_filum.class));
                finish();
            }
        });
    }

//    public boolean onTouchEvent(MotionEvent touchEvent) {
//
//        switch(touchEvent.getAction()){
//            case MotionEvent.ACTION_DOWN:
//                x1 = touchEvent.getX();
//                y1 = touchEvent.getY();
//                break;
//            case MotionEvent.ACTION_UP:
//                x2 = touchEvent.getX();
//                y2 = touchEvent.getY();
//                if(x1 > x2){
//                    Intent i = new Intent(hal32_daur_fasciola.this, hal33_daurfasciola_2.class);
//                    startActivity(i);
//                    finish();
//
//                }
//                else if(x1 < x2){
//                    Intent i = new Intent(hal32_daur_fasciola.this, hal31_regenerasi_dugesia.class);
//                    startActivity(i);
//                    finish();
//                }
//                break;
//        }
//        return false;
//    }

    private void init() {
        mGridView = (LangkahPuzzle1) findViewById(R.id.grid1);
        mGridView.setNumColumns(COLUMNS);

        titleList = new String[DIMENSIONS];
        for (int i = 0; i < DIMENSIONS; i++) {
            titleList[i] = String.valueOf(i);
        }
    }

    private void scramble() {
        int index;
        String temp;
        Random random = new Random();

        for (int i = titleList.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            temp = titleList[index];
            titleList[index] = titleList[i];
            titleList[i] = temp;
        }
    }

    private void setDimensions() {
        ViewTreeObserver vto = mGridView.getViewTreeObserver();
        vto.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                mGridView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int displayWidth = mGridView.getMeasuredWidth();
                int displayHeight = mGridView.getMeasuredHeight();

                int statusbarHeight = getStatusBarHeight(getApplicationContext());
                int requiredHeight = displayHeight - statusbarHeight;

                mColumnWidth = displayWidth / COLUMNS;
                mColumnHeight = requiredHeight / COLUMNS;

                display(getApplicationContext());
            }
        });
    }

    private int getStatusBarHeight(Context context) {
        int result = 0;
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen",
                "android");

        if (resourceId > 0) {
            result = context.getResources().getDimensionPixelSize(resourceId);
        }

        return result;
    }

    private static void display(Context context) {
        ArrayList<Button> buttons = new ArrayList<>();
        Button button;

        for (int i = 0; i < titleList.length; i++) {
            button = new Button(context);

            if (titleList[i].equals("0"))
                button.setBackgroundResource(R.drawable.img_1);
            else if (titleList[i].equals("1"))
                button.setBackgroundResource(R.drawable.img_2);
            else if (titleList[i].equals("2"))
                button.setBackgroundResource(R.drawable.img_3);
            else if (titleList[i].equals("3"))
                button.setBackgroundResource(R.drawable.img_4);
            else if (titleList[i].equals("4"))
                button.setBackgroundResource(R.drawable.img_5);
            else if (titleList[i].equals("5"))
                button.setBackgroundResource(R.drawable.img_6);
            else if (titleList[i].equals("6"))
                button.setBackgroundResource(R.drawable.img_7);
            else if (titleList[i].equals("7"))
                button.setBackgroundResource(R.drawable.img_8);
            else if (titleList[i].equals("8"))
                button.setBackgroundResource(R.drawable.img_9);

            buttons.add(button);
        }

        mGridView.setAdapter(new CustomPuzzle(buttons, mColumnWidth, mColumnHeight));
    }

    private static void swap(Context context, int currentPosition, int swap) {
        String newPosition = titleList[currentPosition + swap];
        titleList[currentPosition + swap] = titleList[currentPosition];
        titleList[currentPosition] = newPosition;

        display(context);

        if (isSolved()) {
            Toast.makeText(context, "Kamu berhasil! Selamat melanjutkan perjalananmu!", Toast.LENGTH_SHORT).show();

            (new Handler())
                    .postDelayed(
                            new Runnable() {
                                public void run() {
                                    // launch your activity here
                                    context.startActivity(new Intent(context, hal33_daurfasciola_2.class));
                                    ((Activity)context).finish();

                                }
                            }, 2000);

        }
    }


    public static void moveTiles(Context context, String direction, int position) {

        // Upper-left-corner tile
        if (position == 0) {

            if (direction.equals(right)) swap(context, position, 1);
            else if (direction.equals(down)) swap(context, position, COLUMNS);
            else Toast.makeText(context, "Salah", Toast.LENGTH_SHORT).show();

            // Upper-center tiles
        } else if (position > 0 && position < COLUMNS - 1) {
            if (direction.equals(left)) swap(context, position, -1);
            else if (direction.equals(down)) swap(context, position, COLUMNS);
            else if (direction.equals(right)) swap(context, position, 1);
            else Toast.makeText(context, "Salah", Toast.LENGTH_SHORT).show();

            // Upper-right-corner tile
        } else if (position == COLUMNS - 1) {
            if (direction.equals(left)) swap(context, position, -1);
            else if (direction.equals(down)) swap(context, position, COLUMNS);
            else Toast.makeText(context, "Salah", Toast.LENGTH_SHORT).show();

            // Left-side tiles
        } else if (position > COLUMNS - 1 && position < DIMENSIONS - COLUMNS &&
                position % COLUMNS == 0) {
            if (direction.equals(up)) swap(context, position, -COLUMNS);
            else if (direction.equals(right)) swap(context, position, 1);
            else if (direction.equals(down)) swap(context, position, COLUMNS);
            else Toast.makeText(context, "Salah", Toast.LENGTH_SHORT).show();

            // Right-side AND bottom-right-corner tiles
        } else if (position == COLUMNS * 2 - 1 || position == COLUMNS * 3 - 1) {
            if (direction.equals(up)) swap(context, position, -COLUMNS);
            else if (direction.equals(left)) swap(context, position, -1);
            else if (direction.equals(down)) {

                // Tolerates only the right-side tiles to swap downwards as opposed to the bottom-
                // right-corner tile.
                if (position <= DIMENSIONS - COLUMNS - 1) swap(context, position,
                        COLUMNS);
                else Toast.makeText(context, "Salah", Toast.LENGTH_SHORT).show();
            } else Toast.makeText(context, "Salah", Toast.LENGTH_SHORT).show();

            // Bottom-left corner tile
        } else if (position == DIMENSIONS - COLUMNS) {
            if (direction.equals(up)) swap(context, position, -COLUMNS);
            else if (direction.equals(right)) swap(context, position, 1);
            else Toast.makeText(context, "Salah", Toast.LENGTH_SHORT).show();

            // Bottom-center tiles
        } else if (position < DIMENSIONS - 1 && position > DIMENSIONS - COLUMNS) {
            if (direction.equals(up)) swap(context, position, -COLUMNS);
            else if (direction.equals(left)) swap(context, position, -1);
            else if (direction.equals(right)) swap(context, position, 1);
            else Toast.makeText(context, "Salah", Toast.LENGTH_SHORT).show();

            // Center tiles
        } else {
            if (direction.equals(up)) swap(context, position, -COLUMNS);
            else if (direction.equals(left)) swap(context, position, -1);
            else if (direction.equals(right)) swap(context, position, 1);
            else swap(context, position, COLUMNS);
        }
    }

    private static boolean isSolved() {
        boolean solved = false;

        for (int i = 0; i < titleList.length; i++) {
            if (titleList[i].equals(String.valueOf(i))) {
                solved = true;
            } else {
                solved = false;
                break;
            }
        }

        return solved;
    }
}