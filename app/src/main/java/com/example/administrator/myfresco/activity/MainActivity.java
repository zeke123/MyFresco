package com.example.administrator.myfresco.activity;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.example.administrator.myfresco.R;
import com.facebook.drawee.view.SimpleDraweeView;


/**
 * @author 周建 2016-08-16
 *
 * 中文文档:http://www.fresco-cn.org/docs/getting-started.html
 *
 * Fresco壁画
 *
 * Android最好用、最强大的图片加载框架
 *
 * Fresco是Facebook最新推出的一款用于Android应用中展示图片的强大图片库，
 * 可以从网络、本地存储和本地资源中加载图片。其中的Drawees可以显示占位符，
 * 直到图片加载完成。而当图片从屏幕上消失时，会自动释放内存。
 *
 * 剩下的，Fresco会替你完成:
 * 显示占位图直到加载完成；
 * 下载图片；
 * 缓存图片；
 * 图片不再显示时，从内存中移除；
 *
 *
 *
 */

public class MainActivity extends AppCompatActivity
{

    private SimpleDraweeView image_view1;

    private SimpleDraweeView image_view2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView()
    {
        //提取变量的快捷键是:option+command+f
        image_view1 = (SimpleDraweeView) findViewById(R.id.image_view1);
        image_view2 = (SimpleDraweeView) findViewById(R.id.image_view2);

        Uri uri1 = Uri.parse("http://e.hiphotos.baidu.com/image/h%3D200/sign=5f5941a28344ebf87271633fe9f8d736/2e2eb9389b504fc2e15bc8a4e1dde71190ef6d0e.jpg");
        image_view1.setImageURI(uri1);

        Uri uri2 = Uri.parse("http://c.hiphotos.baidu.com/image/h%3D200/sign=1fad2b46952397ddc9799f046983b216/dc54564e9258d109c94bbb13d558ccbf6d814de2.jpg");
        image_view2.setImageURI(uri2);
    }
}
