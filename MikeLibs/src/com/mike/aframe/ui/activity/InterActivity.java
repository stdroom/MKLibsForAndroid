/**
 * 工程名: MikeLibs
 * 文件名: InterActivity.java
 * 包名: com.mike.aframe.ui.activity
 * 日期: 2015-3-16下午3:03:03
 * Mail: ammike@163.com.
 * QQ: 378640336
 * http://www.cnblogs.com/ammike/
 *
*/

package com.mike.aframe.ui.activity;

import android.view.View;

/**
 * 类名: InterActivity <br/>
 * 功能: TODO 添加功能描述. <br/>
 * 日期: 2015-3-16 下午3:03:03 <br/>
 *
 * @author   mike
 * @version  	 
 */
public interface InterActivity {

	 /** 初始化方法 */
    void initialize();

    /** 设置root界面 */
    void setRootView();

    /** 点击事件回调方法 */
    void widgetClick(View v);
}

