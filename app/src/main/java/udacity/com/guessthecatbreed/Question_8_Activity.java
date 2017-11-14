package udacity.com.guessthecatbreed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Question_8_Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView catImage;

    CheckBox chekboxButton1;
    CheckBox chekboxButton2;
    CheckBox chekboxButton3;
    CheckBox chekboxbutton4;

    Button button_answer;
    Button button_next;

    TextView congratulation;
    TextView numberOfQuestion;

    boolean isAnswer = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questions);

        setContentView(R.layout.questions);
        catImage = (ImageView) findViewById(R.id.cat_image);
        catImage.setImageResource(R.drawable.birman_q8);

        numberOfQuestion = (TextView) findViewById(R.id.number_of_question);
        numberOfQuestion.setText("Question №8");

        chekboxButton1 = (CheckBox) findViewById(R.id.chekbox_button_1);
        chekboxButton2 = (CheckBox) findViewById(R.id.chekbox_button_2);
        chekboxButton3 = (CheckBox) findViewById(R.id.chekbox_button_3);
        chekboxbutton4 = (CheckBox) findViewById(R.id.chekbox_button_4);

        chekboxButton1.setText(getString(R.string.cyprus));
        chekboxButton2.setText(getString(R.string.ragamuffin));
        chekboxButton3.setText(getString(R.string.peterbald));
        chekboxbutton4.setText(getString(R.string.birman));

        congratulation = (TextView) findViewById(R.id.congratulation);

        button_answer = (Button) findViewById(R.id.button_answer);
        button_next = (Button) findViewById(R.id.button_next);

        chekboxButton1.setOnClickListener(this);
        chekboxButton2.setOnClickListener(this);
        chekboxButton3.setOnClickListener(this);
        chekboxbutton4.setOnClickListener(this);
        button_answer.setOnClickListener(this);
        button_next.setOnClickListener(this);

        button_next.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.chekbox_button_1:
                chekboxButton2.setChecked(false);
                chekboxButton3.setChecked(false);
                chekboxbutton4.setChecked(false);
                break;
            case R.id.chekbox_button_2:
                chekboxButton1.setChecked(false);
                chekboxButton3.setChecked(false);
                chekboxbutton4.setChecked(false);
                break;
            case R.id.chekbox_button_3:
                chekboxButton1.setChecked(false);
                chekboxButton2.setChecked(false);
                chekboxbutton4.setChecked(false);
                break;
            case R.id.chekbox_button_4:
                chekboxButton1.setChecked(false);
                chekboxButton2.setChecked(false);
                chekboxButton3.setChecked(false);
                break;
            case R.id.button_answer:
                if (chekboxbutton4.isChecked()) {
                    congratulation.setText("That's right!");
                    isAnswer = true;
                }
                if (isAnswer) {
                    button_next.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(this, "Incorrect answer. Try again! :)", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.button_next:
                Intent intent = new Intent(this, Question_9_Activity.class);
                startActivity(intent);
                break;
        }
    }
}
