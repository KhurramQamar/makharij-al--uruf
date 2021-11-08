package com.example.makharijal_huruf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Practice extends AppCompatActivity {


    public TextView txtView;
    public TextView sound;
    public ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);
        String BtnName = getIntent().getStringExtra("button");
        img=findViewById(R.id.imageView);
        if (BtnName.equals("Halqiyah")) {
            txtView = (TextView) findViewById(R.id.ShowLet);
            sound=(TextView) findViewById(R.id.Showsound);

            for (int i = 0; i < HalqiyahArr.length; i++) {
                    if (i==1) {
                        txtView.append(HalqiyahArr[i].letters + "\n\n");
                        sound.append(HalqiyahArr[i].soundProduced + "\n\n");
                    }
                    else if(i==0)
                    {
                        txtView.append(HalqiyahArr[i].letters + "\n");
                        sound.append(HalqiyahArr[i].soundProduced + "\n\n");
                    }
                    else
                    {
                        txtView.append(HalqiyahArr[i].letters + "\n");
                        sound.append(HalqiyahArr[i].soundProduced + "\n");
                    }



            }
            img.setBackgroundResource(R.drawable.halqiyah);

        } else if (BtnName.equals("Lahatiyah")) {
            txtView = (TextView) findViewById(R.id.ShowLet);
            sound=(TextView) findViewById(R.id.Showsound);

            for (int i = 0; i < LahatiyahArr.length; i++) {
                txtView.append(LahatiyahArr[i].letters + "\n\n");
                sound.append(LahatiyahArr[i].soundProduced + "\n");


            }
            img.setBackgroundResource(R.drawable.lahatiyah);

        } else if (BtnName.equals("Shajariyah")) {
            txtView = (TextView) findViewById(R.id.ShowLet);
            sound=(TextView) findViewById(R.id.Showsound);
            for (int i = 0; i < ShajariyahArr.length; i++) {
                txtView.append(ShajariyahArr[i].letters + "\n");
                sound.append(ShajariyahArr[i].soundProduced + "\n");

            }
            img.setBackgroundResource(R.drawable.shajaraiyah);

        } else if (BtnName.equals("Tarfiyah")) {
            txtView = (TextView) findViewById(R.id.ShowLet);
            sound=(TextView) findViewById(R.id.Showsound);
            for (int i = 0; i < TarfiyahArr.length; i++) {
                txtView.append(TarfiyahArr[i].letters + "\n\n");
                sound.append(TarfiyahArr[i].soundProduced + "\n");

            }
            img.setBackgroundResource(R.drawable.tarfiyah);
        } else if (BtnName.equals("Niteeyah")) {
            txtView = (TextView) findViewById(R.id.ShowLet);
            sound=(TextView) findViewById(R.id.Showsound);
            for (int i = 0; i < NiteeyahArr.length; i++) {
                txtView.append(NiteeyahArr[i].letters + "\n");
                sound.append(NiteeyahArr[i].soundProduced + "\n");


            }
            img.setBackgroundResource(R.drawable.niteyah);
        } else if (BtnName.equals("Lisaveyah")) {
            txtView = (TextView) findViewById(R.id.ShowLet);
            sound=(TextView) findViewById(R.id.Showsound);
            for (int i = 0; i < LisaveyahArr.length; i++) {
                txtView.append(LisaveyahArr[i].letters + "\n");
                sound.append(LisaveyahArr[i].soundProduced + "\n");


            }
            img.setBackgroundResource(R.drawable.losaveyah);
        } else {
            txtView = (TextView) findViewById(R.id.ShowLet);
            sound=(TextView) findViewById(R.id.Showsound);
            for (int i = 0; i < GhunnaArr.length; i++) {
                if (i<2) {
                    txtView.append(GhunnaArr[i].letters + "\n\n");
                    sound.append(GhunnaArr[i].soundProduced + "\n\n");
                }
                else {
                    txtView.append(GhunnaArr[i].letters + "\n");
                    sound.append(GhunnaArr[i].soundProduced + "\n");
                }


            }
            img.setBackgroundResource(R.drawable.ghunaa);
        }

    }

    class Subpoints {
        public String letters;
        public String soundProduced;

        Subpoints() {

        }

        Subpoints(String let, String sound) {
            this.letters = let;
            this.soundProduced = sound;
        }


    }

    class Emissionpoints {
        String name;
        Subpoints[] information;
        String path;

        Emissionpoints(String nm, Subpoints[] info, String pth) {
            this.name = nm;
            this.information = info;
            this.path = pth;

        }
    }

    Subpoints a1 = new Subpoints("ه أ", "End of Throat");
    Subpoints a2 = new Subpoints("ح ع", "Middle of Throat");
    Subpoints a3 = new Subpoints("خ غ", "Start of the Throat");
    Subpoints[] HalqiyahArr = {a1, a2, a3};

    Subpoints a4 = new Subpoints("ق", "Base of Tongue which is near Uvula touching the mouth roof");
    Subpoints a5 = new Subpoints("ک", "Portion of Tongue near its base touching the roof of mouth");
    Subpoints[] LahatiyahArr = {a4, a5};

    Subpoints a6 = new Subpoints("ی ش ج", "Tongue touching the center of the mouth roof");
    Subpoints a7 = new Subpoints("ض", "One side of the tongue touching the molar teeth");
    Subpoints[] ShajariyahArr = {a6, a7,};

    Subpoints a8 = new Subpoints("ل", "Rounded tip of the tongue touching the base of the frontal 8 teeth");
    Subpoints a9 = new Subpoints("ن", "Rounded tip of the tongue touching the base of the frontal 6 teeth");
    Subpoints a10 = new Subpoints("ر", "Rounded tip of the tongue and some portion near it touching the base of the frontal 4 teeth");
    Subpoints[] TarfiyahArr = {a8, a9, a10};

    Subpoints a11 = new Subpoints("ط د ت", "Tip of the tongue touching the base of the front 2 teeth");
    Subpoints[] NiteeyahArr = {a11};

    Subpoints a12 = new Subpoints("ث ذ ظ", "Tip of the tongue touching the tip of the frontal 2 teeth");
    Subpoints a13 = new Subpoints("س ز ص", "Tip of the tongue comes between the front top and bottom teeth");
    Subpoints[] LisaveyahArr = {a12, a13};

    Subpoints a14 = new Subpoints("ن م", "While pronouncing the ending sound of م or ن , bring the vibration to the nose");
    Subpoints a15 = new Subpoints("ف", "Tip of the two upper jaw teeth touches the inner part of the lower lip");
    Subpoints a16 = new Subpoints("ب", "Inner part of the both lips touch each other");
    Subpoints a17 = new Subpoints("م", "Outer part of both lips touch each other");
    Subpoints a18 = new Subpoints("و", "Rounding both lips and not closing the mouth");
    Subpoints a19 = new Subpoints("ىُ بوَ ب", "Mouth empty space while باَ بوُ بىِ like words spe");
    Subpoints[] GhunnaArr = {a14, a15, a16, a17, a18, a19};


}
