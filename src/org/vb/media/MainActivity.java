
package org.vb.media;

import org.vb.media.mp3.R;
import org.vb.media.mp3.lame.LameInterface;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {	
	

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);

		final TextView resText = (TextView) findViewById(R.id.resText);
		
		try
		{
			System.loadLibrary("mp3lame");
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		Button startButton = (Button) findViewById(R.id.startBtn);
		startButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				
				int init_code = LameInterface.initLame(44100, 1, 44100, 16, 7);
				resText.setText("Lame init result: "+init_code);
			}
		});		
	}


	@Override
	protected void onDestroy() {
		super.onDestroy();
		LameInterface.close();
	}
}
