package net.androidbootcamp.ratethatrecord;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static java.sql.Types.NULL;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6;
    MediaPlayer mpFater, mpGillicudy, mpPodington;
    int playing;
    String selected[] = new String[3];
    Boolean completed = false;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.btnFater);
        button2 = (Button) findViewById(R.id.btnGillicudy);
        button3 = (Button) findViewById(R.id.btnPodington);
        button4 = (Button) findViewById(R.id.btnRateFater);
        button5 = (Button) findViewById(R.id.btnRateGillicudy);
        button6 = (Button) findViewById(R.id.btnRatePodington);

        button1.setOnClickListener(bFater);
        button2.setOnClickListener(bGillicudy);
        button3.setOnClickListener(bPodington);
        button4.setOnClickListener(bRateFater);
        button5.setOnClickListener(bRateGillicudy);
        button6.setOnClickListener(bRatePodington);

        mpFater = new MediaPlayer();
        mpGillicudy = new MediaPlayer();
        mpPodington = new MediaPlayer();

        mpFater = MediaPlayer.create(this, R.raw.blackantfaterlee);
        mpGillicudy = MediaPlayer.create(this, R.raw.gillicuddyspringish);
        mpPodington = MediaPlayer.create(this, R.raw.podingtonbearsadcyclops);
        playing = 0;




    }


    Button.OnClickListener bFater = new Button.OnClickListener() {
        @Override
        public void onClick(View v)
        {
            switch (playing)

            {
                case 0:
                    mpFater.start();
                    playing = 1;
                    button1.setText("Pause Fater Lee");
                    button2.setVisibility(View.INVISIBLE);
                    button3.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpFater.pause();
                    playing = 0;
                    button1.setText("Play Fater Lee");
                    button2.setVisibility(View.VISIBLE);
                    button3.setVisibility(View.VISIBLE);
                    break;

            }

        }
    };

    Button.OnClickListener bGillicudy = new Button.OnClickListener() {
        @Override
        public void onClick(View v)
        {
            switch (playing)

            {
                case 0:
                    mpGillicudy.start();
                    playing = 1;
                    button2.setText("Pause Gillicudy");
                    button1.setVisibility(View.INVISIBLE);
                    button3.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpGillicudy.pause();
                    playing = 0;
                    button2.setText("Play Gillicudy");
                    button1.setVisibility(View.VISIBLE);
                    button3.setVisibility(View.VISIBLE);
                    break;


            }
        }

    };

    Button.OnClickListener bPodington = new Button.OnClickListener() {
        @Override
        public void onClick(View v)
        {
            switch (playing)

            {
                case 0:
                    mpPodington.start();
                    playing = 1;
                    button3.setText("Pause Podington Bear");
                    button1.setVisibility(View.INVISIBLE);
                    button2.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpPodington.pause();
                    playing = 0;
                    button3.setText("Play Podington Bear");
                    button1.setVisibility(View.VISIBLE);
                    button2.setVisibility(View.VISIBLE);
                    break;


            }
        }

    };

    Button.OnClickListener bRateFater = new Button.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            button4.setVisibility(View.INVISIBLE);

           // for(int i = 0; i < selected.length;i++)
           // {
               // if(i == NULL)
                //{

                    selected[i] = "Fater Lee";
                    i++;
                    allButtonsCompleted();
                    if(completed == true)
                    {
                        //Intent intent = new Intent(context, Results.class);
                        //startActivity(new Intent(MainActivity.this, Results.class));
                        //intent.putExtra("string-array", selected);
                        //MainActivity.startActivity(intent);

                        Intent k =new Intent(MainActivity.this,Results.class);
                        k.putExtra("key",selected);
                        startActivity(k);

                    }
                    //break;
                //}

            //}

        }

    };

    Button.OnClickListener bRateGillicudy = new Button.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {

            button5.setVisibility(View.INVISIBLE);
            //for(int i = 0; i < selected.length;i++)
            //{
                //if(i == NULL)
                //{
                    selected[i] = "Gillicudy";
                    i++;
                    allButtonsCompleted();
                    if(completed == true)
                    {
                       // startActivity(new Intent(MainActivity.this, Results.class));
                        Intent k =new Intent(MainActivity.this,Results.class);
                        k.putExtra("key",selected);
                        startActivity(k);
                        //break;
                    }


               // }

            //}




        }

    };

    Button.OnClickListener bRatePodington = new Button.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            button6.setVisibility(View.INVISIBLE);
           // for(int i = 0; i < selected.length;i++)
            //{
               // if(i == NULL)
                //{
                    selected[i] = "Podington Bear";
                    i++;
                    allButtonsCompleted();
                    if(completed == true)
                    {
                        //startActivity(new Intent(MainActivity.this, Results.class));
                        Intent k =new Intent(MainActivity.this,Results.class);
                        k.putExtra("key",selected);
                        startActivity(k);
                        //break;
                    }

                //}

            //}
        }

    };

    protected void allButtonsCompleted()
    {
        if(i == 3)//button4.getVisibility() == View.INVISIBLE && button5.getVisibility() == View.INVISIBLE && button6.getVisibility() == View.INVISIBLE)
        {

            completed = true;

        }



    }

}                                                                     