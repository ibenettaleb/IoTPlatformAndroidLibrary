package ma.um6p.iot.iotlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ma.um6p.iot.iotplatformlibrary.LogDebug;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogDebug.d("Hello Again");
    }
}
