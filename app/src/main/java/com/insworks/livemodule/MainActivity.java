package com.insworks.livemodule;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.johnny.livelayout.ui.activity.FirstLiveActvity_back;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.btn_first, R.id.btn_second, R.id.btn_third, R.id.btn_fourth, R.id.btn_fifth, R.id.btn_sixth})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_first://第一种 直播布局
                startActivity(new Intent(getApplicationContext(), FirstLiveActvity_back.class));
                break;
 /*             case R.id.btn_second://
                startActivity(new Intent(getApplicationContext(), SecondTextActivity.class));
                break;
          case R.id.btn_third://自定义普通侧滑菜单 include布局
                startActivity(new Intent(getApplicationContext(), ThirdImplementionsActivity.class));
                break;
            case R.id.btn_fourth://使用第三方开源库SlidingMenu
                startActivity(new Intent(getApplicationContext(), FourthImplementionsActivity.class));
                break;
            case R.id.btn_fifth://使用谷歌自带DrawerLayout 包裹NavigationView
                startActivity(new Intent(getApplicationContext(), FifthImplementionsActivity.class));
                break;
            case R.id.btn_sixth://第六种 github成品
                startActivity(new Intent(getApplicationContext(), SixthImplementionsActivity.class));
                break;*/
        }
    }
}
