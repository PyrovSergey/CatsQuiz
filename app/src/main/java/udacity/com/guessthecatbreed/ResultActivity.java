package udacity.com.guessthecatbreed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener {

    Button againButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        againButton = (Button) findViewById(R.id.button_again);
        againButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_again:
                Intent intent = new Intent(this, StartActivity.class);
                startActivity(intent);
        }
    }
}
