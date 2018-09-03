package com.example.aliothman.designtask.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import com.example.aliothman.designtask.R;
import com.example.aliothman.designtask.fragments.Fathaghany_Fragment;

public class MainActivity extends AppCompatActivity {
    private Button mFathagany, mOther ;
    private ImageButton mBack ;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //defineviews
        mFathagany = findViewById(R.id.fa_button);
        mOther = findViewById(R.id.other_button);
        mBack = findViewById(R.id.ibBack);
        frameLayout = findViewById(R.id.main_frame);

        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });

        mFathagany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFathagany.setTextColor(getResources().getColor(R.color.black));
                mFathagany.setBackgroundResource(R.drawable.fill_shape);
                mOther.setTextColor(getResources().getColor(R.color.colorDarkGrey));
                mOther.setBackgroundResource(R.drawable.fill_shape_cat);
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_frame, new Fathaghany_Fragment(), "true")
                        .commit();
            }
        });

        mOther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFathagany.setTextColor(getResources().getColor(R.color.colorDarkGrey));
                mFathagany.setBackgroundResource(R.drawable.fill_shape_cat);
                mOther.setTextColor(getResources().getColor(R.color.black));
                mOther.setBackgroundResource(R.drawable.fill_shape);
            }
        });

    }
}
