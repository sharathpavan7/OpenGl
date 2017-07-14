package com.sharath.opengl;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

/**
 * Created by yaksee on 7/14/17.
 */

public class OpenGLView extends GLSurfaceView {
    public OpenGLView(Context context) {
        super(context);
        inti();
    }

    public OpenGLView(Context context, AttributeSet attrs) {
        super(context, attrs);
        inti();
    }

    private void inti(){
        setEGLContextClientVersion(2);
        setPreserveEGLContextOnPause(true);
        setRenderer(new OpenGLRenderer());
    }
}
