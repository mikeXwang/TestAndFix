package com.hotpatch.mike.testandfix;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView mTvShow;
    private Button mBtnShowTestString;

    private TestString mTestString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTestString = new TestString();
        initView();
    }

    private void initView() {
        mTvShow = (TextView) findViewById(R.id.tv_show);
        mBtnShowTestString = (Button) findViewById(R.id.btn_show_text);
        mBtnShowTestString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTvShow.setText(mTestString.getString());
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        System.exit(0);
    }
}
