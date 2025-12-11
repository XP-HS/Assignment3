package com.example.assignmentthree;

import android.content.Intent; // 新增Intent导入
import android.os.Bundle;
import android.widget.Button; // 新增Button导入

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button btnStart; // Start按钮实例

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        initView(); // 初始化控件
        setListener(); // 设置点击监听
    }

    // 初始化控件
    private void initView() {
        // 绑定布局中的Start按钮（对应布局中id为btn_start的Button）
        btnStart = findViewById(R.id.btn_start);
    }

    // 设置按钮监听
    private void setListener() {
        // Start按钮点击事件：跳转至MapActivity并关闭当前页
        btnStart.setOnClickListener(v -> jumpToMap());
    }

    // 跳转至地图页面MapActivity
    private void jumpToMap() {
        Intent intent = new Intent(MainActivity.this, MapActivity.class);
        startActivity(intent); // 启动地图页
        finish(); // 关闭当前MainActivity
    }
}