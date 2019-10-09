package dcu.ie.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Initial onCreate() method activated once the app starts.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Function added to show a toast msg once button is pressed.
    public void showToast(View view)
    {
        CharSequence text = getResources().getString(R.string.mess_1);
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(this, text, duration);
        toast.show();
    }

}
