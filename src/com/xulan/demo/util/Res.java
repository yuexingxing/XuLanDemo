package com.xulan.demo.util;

import com.xulan.demo.MyApplication;

import android.graphics.drawable.Drawable;

public class Res {

	public Res(){
		
	}
	
	/**
	 * 获取value值
	 * @param name id
	 * @return
	 */
	public static String getString(int name){
		
		return MyApplication.getInstance().getString(name);
	}
	
	/**
	 * 获取颜色值
	 * @param name id
	 * @return
	 */
	public static int getColor(int name){
		
		return MyApplication.getInstance().getResources().getColor(name);
	}
	
	/**
	 * 获取颜色值
	 * @param name id
	 * @return
	 */
	public static Drawable getDrawable(int name){
		
		return MyApplication.getInstance().getResources().getDrawable(name);
	}
}
