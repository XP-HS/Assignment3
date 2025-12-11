package com.example.assignmentthree;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

/**
 * 主活动页面 - 应用入口点
 * 提供导航到地图功能的入口
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 初始化UI组件
        initializeViews();
    }

    /**
     * 初始化界面组件和事件监听
     */
    private void initializeViews() {
        // 找到开始按钮
        Button btnStart = findViewById(R.id.btn_start);

        // 设置按钮点击监听器 - 跳转到地图页面
        btnStart.setOnClickListener(v -> {
            navigateToMapActivity();
        });
    }

    /**
     * 跳转到地图活动页面
     */
    private void navigateToMapActivity() {
        Intent intent = new Intent(MainActivity.this, MapActivity.class);
        startActivity(intent);
    }
}