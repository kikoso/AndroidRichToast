/**
 * RichToast Java Source code 
 * @author Enrique L—pez Ma–as (eenriquelopez@gmail.com)
 * @copyright: Enrique L—pez Ma–as 
 * @license: GPL3
 */

package com.enrique.richtoast;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class RichToast extends Toast {

	/**
	 * Example resources, GPL
	 */
	public static final int RICHTOAST_ADMIN    = R.drawable.icon_admins   ;
	public static final int RICHTOAST_BUDGET   = R.drawable.icon_budget   ;
	public static final int RICHTOAST_HEART    = R.drawable.icon_heart    ;
	public static final int RICHTOAST_SPEAKERS = R.drawable.icon_speakers ;
	
	public RichToast(Context context) {
		super(context);
	}

	@Override
	public void setView(View view) {
		super.setView(view);
	}
	
	/**
	 * MakeText funcion allows you to create a Rich Toast. Use the following parameters:
	 * 
	 * @param context context of the application
	 * @param text CharSequence you want to display in the RichToast
	 * @param duration Duration of the rich toast. Either Toast.LENGTH_LONG or Toast.LENGTH_SHORT
	 * @param type Image resource. Can be either RichToast.RICHTOAST_ADMIN, RichToast.RICHTOAST_BUDGET, RichToast.RICHTOAST_HEART or RichToast.RICHTOAST_SPEAKERS. 
	 * @return
	 */
	public static RichToast makeText(Context context, CharSequence text, int duration, int type) {
	
		LayoutInflater inflater = ((Activity) context).getLayoutInflater();
		
		View layout = inflater.inflate(R.layout.rich_layout, (ViewGroup) ((Activity) context). findViewById(R.id.toast_layout_root));
		
		((TextView)layout.findViewById(R.id.textView)).setText(text);
		((ImageView)layout.findViewById(R.id.imageView)).setBackgroundResource(type);
		
		Typeface tf = Typeface.createFromAsset(context.getAssets(),
	            "fonts/Roboto-Light.ttf");
		((TextView)layout.findViewById(R.id.textView)).setTypeface(tf);
		
		RichToast toast = new RichToast(context.getApplicationContext());
		toast.setDuration(duration);
		toast.setView(layout);
		
		return toast;
	}
}