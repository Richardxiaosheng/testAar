package com.fiveplay.library;

import android.content.Context;
import android.widget.Toast;

/**
 * ================================================
 * 创 建 人：wx
 * 版    本：1.0
 * 创建日期：2020/9/18
 * 描    述：
 * 修 改 人：
 * 修改时间：2020/9/18
 * ================================================
 */
public class MyTestUtils {

    public static void Toast(Context context,String msg){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();
    }

}
