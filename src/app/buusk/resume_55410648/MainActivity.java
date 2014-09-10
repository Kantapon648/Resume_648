package app.buusk.resume_55410648;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener {
	private Button btn1, btn2;
	private TextView textView7, textView8, textView9, textView10, textView12, textView14;
	private String show1, show2, show3, show4, show5, show6;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ViewMatching();
	}

	private void ViewMatching() {
		btn1 = (Button) findViewById(R.id.btnedit);
		btn2 = (Button) findViewById(R.id.btnimg);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		textView7 = (TextView) findViewById(R.id.textView7);
		textView8 = (TextView) findViewById(R.id.textView8);
		textView9 = (TextView) findViewById(R.id.textView9);
		textView10 = (TextView) findViewById(R.id.textView10);
		textView12 = (TextView) findViewById(R.id.textView12);
		textView14 = (TextView) findViewById(R.id.textView14);
		
		textView7.setText("Tour");
		textView8.setText("20");
		textView9.setText("169cm");
		textView10.setText("65kg");
		textView12.setText("Saraburi");
		textView14.setText("087-0879524");
		
		show1 = getIntent().getStringExtra("textView7");
		show2 = getIntent().getStringExtra("textView8");
		show3 = getIntent().getStringExtra("textView9");
		show4 = getIntent().getStringExtra("textView10");
		show5 = getIntent().getStringExtra("textView12");
		show6 = getIntent().getStringExtra("textView14");
		
		textView7.setText(show1);
		textView8.setText(show2);
		textView9.setText(show3);
		textView10.setText(show4);
		textView12.setText(show5);
		textView14.setText(show6);
	
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnedit:
			Intent i = new Intent(getApplicationContext(), Edit_648.class);
			startActivity(i);
			break;
		case R.id.btnimg:
			Intent j = new Intent(getApplicationContext(), ImageActivity.class);
			startActivity(j);
			break;
		default:
			break;
		}
	}
}