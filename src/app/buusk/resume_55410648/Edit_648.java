package app.buusk.resume_55410648;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Edit_648 extends Activity implements OnClickListener {
	private Button btnsubmit;
	private EditText editText1, editText2, editText3, editText4, editText5, editText6;
	private String textView7, textView8, textView9, textView10, textView12, textView14;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.edit_kantapon);
		super.onCreate(savedInstanceState);
		ViewMatching();
	}

	private void ViewMatching() {
		btnsubmit = (Button) findViewById(R.id.btnsave);
		btnsubmit.setOnClickListener(this);
		editText1 = (EditText) findViewById(R.id.editText1);
		editText2 = (EditText) findViewById(R.id.editText2);
		editText3 = (EditText) findViewById(R.id.editText3);
		editText4 = (EditText) findViewById(R.id.editText4);
		editText5 = (EditText) findViewById(R.id.editText5);
		editText6 = (EditText) findViewById(R.id.editText6);
	
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnsave:
			textView7 = (editText1.getText().toString());
			textView8 = (editText2.getText().toString());
			textView9 = (editText3.getText().toString());
			textView10 = (editText4.getText().toString());
			textView12 = (editText5.getText().toString());
			textView14 = (editText6.getText().toString());
			
			Intent R = new Intent(getApplicationContext(), MainActivity.class);
			R.putExtra("textView7", textView7);
			R.putExtra("textView8", textView8);
			R.putExtra("textView9", textView9);
			R.putExtra("textView10", textView10);
			R.putExtra("textView12", textView12);
			R.putExtra("textView14", textView14);

			startActivity(R);
			break;
		default:
			break;
		}
	}
}