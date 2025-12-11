package com.example.assignmentthree;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MapActivity extends AppCompatActivity {

    private static final String TAG = "MapActivity";

    // ❌ 注释掉百度地图相关变量
    // private MapView mMapView;
    // private BaiduMap mBaiduMap;

    // ✅ 添加模拟UI组件
    private TextView mapStatusText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        Log.d(TAG, "地图Activity已启动");

        // ✅ 初始化模拟界面
        initializeMockMap();
    }

    private void initializeMockMap() {
        // 查找布局中的TextView用于显示状态
        mapStatusText = findViewById(R.id.map_status_text);

        if (mapStatusText != null) {
            mapStatusText.setText("地图功能准备中...\n百度地图SDK配置中");
        }

        Log.d(TAG, "模拟地图初始化完成");

        // 模拟地图数据加载
        simulateMapDataLoading();
    }

    private void simulateMapDataLoading() {
        // 模拟异步加载地图数据
        new Thread(() -> {
            try {
                Thread.sleep(1000); // 模拟加载延迟

                runOnUiThread(() -> {
                    if (mapStatusText != null) {
                        mapStatusText.setText("地图功能模拟运行中\n" +
                                "当前位置: 模拟坐标\n" +
                                "状态: 百度地图集成进行中");
                    }
                    Log.d(TAG, "模拟地图数据加载完成");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Activity恢复");
        // ❌ 注释百度地图生命周期方法
        // if (mMapView != null) mMapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Activity暂停");
        // ❌ 注释百度地图生命周期方法
        // if (mMapView != null) mMapView.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Activity销毁");
        // ❌ 注释百度地图生命周期方法
        // if (mMapView != null) mMapView.onDestroy();
    }
}