package be.jcdo.mp3droid;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import android.widget.Toast;

public class SearchActivity extends Activity implements OnKeyListener{

	EditText etSearch;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.searchtab);
        
        etSearch = (EditText) findViewById(R.id.etSearch);
        etSearch.setOnKeyListener(this);
    }

	@Override
	public boolean onKey(View arg0, int keyCode, KeyEvent event)
	{
		// If the event is a key-down event on the "enter" button
        if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
            (keyCode == KeyEvent.KEYCODE_ENTER)) {
          // Perform action on key press
          Toast.makeText(this, etSearch.getText(), Toast.LENGTH_SHORT).show();
          return true;
        }
        return false;
	}
}
