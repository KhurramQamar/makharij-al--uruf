package com.example.makharijal_huruf;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.concurrent.ThreadLocalRandom;


public class Exam extends AppCompatActivity {

    private Question [] questions;
    private Question [] quiz;
    private ScrollView scrollView;
    private TableLayout tbLayout;
    private Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
        initialize();
        generateQuiz();
        loadQuiz();
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int  correctCount = 0;
                for (int i =0; i<10;i++){
                    RadioGroup rg = findViewById(i+4000);
                    RadioButton rb = findViewById(rg.getCheckedRadioButtonId());
//                    Log.d("STATE",rb.getText().toString());
                    Log.d("STATE",quiz[i].correct_option);
                    Log.d("STATE",rb.getText().toString());

                    if (quiz[i].correct_option.equals(rb.getText().toString())) {
                        correctCount++;
                        Log.d("STATE", "rb.getText().toString()");
                    }

                }
                tbLayout.removeAllViews();
                loadResult(correctCount);
            }
        });
    }
    private void loadResult(int count){
        TableRow tbRow = new TableRow(this);


        TextView tv0 = new TextView(this);

        tv0.setText("Corrected : " + String.valueOf(count));
        tv0.setTextSize(25);
        tv0.setTypeface(null, Typeface.BOLD);
        tbRow.addView(tv0);

        tbLayout.addView(tbRow);
        tbRow = new TableRow(this);


        tv0 = new TextView(this);

        tv0.setText("Wrong : " + String.valueOf(10-count));
        tv0.setTextSize(25);
        tv0.setTypeface(null, Typeface.BOLD);
        tbRow.addView(tv0);

        tbLayout.addView(tbRow);
    }
    private void initialize(){
        scrollView = findViewById(R.id.scrollid);
        tbLayout = findViewById(R.id.tablelayoutExam);

        questions = new Question[]{
                new Question("The letters خ غ is belong from which makharij","Halqiyah",new Options[]
                        {
                                new Options("Lahatiyah"),
                                new Options("Tarfiyah"),
                                new Options("Halqiyah"),
                                new Options("Ghunna"),
                        }),
                new Question("Lahatiyah letters produced sound from which region\n","Tongue",new Options[]
                        {
                                new Options("Tongue"),
                                new Options("Throat"),
                                new Options("lips"),
                                new Options("Nose"),
                        }),
                new Question("Shajariyah-Haafiyah includes letters","ی",new Options[]
                        {
                                new Options("ی"),
                                new Options("ل"),
                                new Options("ن"),
                                new Options("ر"),
                        }),
                new Question("For Niteeyah the tip of tongue touch how many teeths","2",new Options[]
                        {
                                new Options("3"),
                                new Options("8"),
                                new Options("2"),
                                new Options("4"),
                        }),
                new Question("The letter ذ is belong from which makharij\n","Lisaveyah3",new Options[]
                        {
                                new Options("Lisaveyah"),
                                new Options("Tarfiyah"),
                                new Options("Halqiyah"),
                                new Options("Ghunna"),
                        }),

                new Question("Which letters when pronounced produce\na ‘whistling’ sound?\n","ز",new Options[]
                        {
                                new Options("ط"),
                                new Options("ز"),
                                new Options("ب"),
                        }),
                new Question("How many emission points are in makharij ul-huruf\n","17",new Options[]
                        {
                                new Options("17"),
                                new Options("19"),
                                new Options("16"),
                                new Options("18"),
                        }),
                new Question("How many letters are in Tarfiyah\n","3",new Options[]
                        {
                                new Options("1"),
                                new Options("2"),
                                new Options("3"),
                                new Options("4"),
                        }),
               new Question("Which part of both lips touch in pronouncing ب \n","inner",new Options[]
                        {
                                new Options("outer"),
                                new Options("inner"),
                                new Options("both"),
                                new Options("none"),
                        }),
               new Question("Which part of both lips touch in pronouncing م \n","outer",new Options[]
                        {
                                new Options("outer"),
                                new Options("inner"),
                                new Options("both"),
                                new Options("none"),
                        }),
                new Question("How many letters are in Arabic Language\n","29",new Options[]
                        {
                                new Options("27"),
                                new Options("29"),
                                new Options("26"),
                                new Options("28"),
                        }),
                new Question("The letters م is belong from which makharij","Ghunna",new Options[]
                        {
                                new Options("Lahatiyah"),
                                new Options("Tarfiyah"),
                                new Options("Halqiyah"),
                                new Options("Ghunna"),
                        }),
                new Question("The letters د is belong from which makharij","Niteeyah",new Options[]
                        {
                                new Options("Lahatiyah"),
                                new Options("Tarfiyah"),
                                new Options("Niteeyah"),
                                new Options("Ghunna"),
                        }),

        };
    }

    private void generateQuiz(){
        quiz = new Question[10];
        for(int i=0;i<10;i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, 12 + 1);
            quiz[i] = questions[randomNum];
        }
    }
    private void createRadioButton(TableLayout tb, @NonNull Options[] options , int id) {
        RadioButton[] rb = new RadioButton[options.length];
        RadioGroup rg = new RadioGroup(this);
        rg.setId(id+4000);
        TableRow tbRow = new TableRow(this);

        for(int i=0; i<options.length; i++){
            rb[i]  = new RadioButton(this);
            rb[i].setText(options[i].value);
            rb[i].setId(id+i*100 + 100);
            rg.addView(rb[i]);
            if (i==1) {
                tbRow.addView(rg);
                tb.addView(tbRow);
                tbRow = new TableRow(this);
            }

        }
        tb.addView(tbRow);

    }
    @SuppressLint("ResourceType")
    private void loadQuiz(){
        TextView tv;
        Button bt;
        TableRow tbRow;
        for(int i=0;i<10;i++) {
            tbRow = new TableRow(this);


            TextView tv0 = new TextView(this);
            int num = i+1;
            tv0.setText("Question # "+num);
            tv0.setTextSize(17);
            tv0.setTypeface(null, Typeface.BOLD);

            tbRow.addView(tv0);
            tbLayout.addView(tbRow);
            tbRow = new TableRow(this);


            TextView tv2 = new TextView(this);
            tv2.setText(quiz[i].statement);
            tv2.setTypeface(null, Typeface.BOLD);
            tv2.setTextSize(17);
            tbRow.addView(tv2);
            tbLayout.addView(tbRow);

            tbRow = new TableRow(this);
            createRadioButton(tbLayout ,quiz[i].options ,i );


            tbLayout.addView(tbRow);

        }

        submit = new Button(this);
        submit.setText("Submit");
//        submit.setId(101);
        tbRow = new TableRow(this);
        tbRow.addView(submit);
        tbLayout.addView(tbRow);

    }





    class Options{
        public String value;

        Options ()
        {
        }
        Options(String val)
        {
            this.value=val;
        }


    }
    class Question {
        String statement;
        String correct_option;
        Boolean correct;
        Options[] options;

        Question(String st, String correct_option,Options[] options)
        {
            this.statement=st;
            this.correct_option=correct_option;
            this.options=options;
        }
    }
}