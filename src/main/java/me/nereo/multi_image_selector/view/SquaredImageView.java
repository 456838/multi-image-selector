package me.nereo.multi_image_selector.view;

import android.content.Context;
import android.util.AttributeSet;

import com.facebook.drawee.view.SimpleDraweeView;

/** An image view which always remains square with respect to its width. */
public class SquaredImageView extends SimpleDraweeView {
  public SquaredImageView(Context context) {
    super(context);
  }

  public SquaredImageView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  @Override protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
  }
}
