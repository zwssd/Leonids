package com.plattysoft.leonids.examples;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateInterpolator;

import com.plattysoft.leonids.ParticleSystem;

public class MutilShotExampleActivity extends Activity implements OnClickListener {

	private int[] iconInts = new int[]{R.drawable.af0,
			R.drawable.af1,
			R.drawable.af2,
			R.drawable.af3,
			R.drawable.af4,
			R.drawable.af5,
			R.drawable.af6,
			R.drawable.af7,
			R.drawable.af8,
			R.drawable.af9};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_particle_system_example);
		findViewById(R.id.button1).setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		ParticleSystem ps = new ParticleSystem(this, 50, iconInts, 800);
		ps.setScaleRange(0.7f, 1.3f);
		//setting angle（设置角度，只是上面显示）
        ps.setSpeedModuleAndAngleRange(0.1f, 0.5f, 180, 360);
		ps.setAcceleration(0.0001f, 90);
		ps.setRotationSpeedRange(90, 180);
		ps.setFadeOut(200, new AccelerateInterpolator());
		ps.oneShot(arg0, 10);
	}

}
