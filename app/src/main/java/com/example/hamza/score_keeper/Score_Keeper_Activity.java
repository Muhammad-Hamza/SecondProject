package com.example.hamza.score_keeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Score_Keeper_Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score__keeper_);

    }

    public int scoreUpdater;
    public void updateScoreByThree(View view)
    {
        scoreUpdater = scoreUpdater +3;

        ScoreText(scoreUpdater);

    }

    public void updateScoreByTwo(View view)
    {
        scoreUpdater = scoreUpdater +2;

        ScoreText(scoreUpdater);
    }
    public void updateScoreByOne(View view)
    {
        scoreUpdater = scoreUpdater +1;

        ScoreText(scoreUpdater);
    }
    public void ScoreText(int scr)
    {
        TextView scrDisplay = (TextView) findViewById(R.id.team_a_score);
        scrDisplay.setText(String.valueOf(scr));
    }


    //Team B Score getter
    public void ScoreTextB(int scr)
    {
        TextView scrDisplayB = (TextView) findViewById(R.id.team_b_score);
        scrDisplayB.setText(String.valueOf(scr));
    }

    public int scoreUpdaterB;
    public void updateBteamScoreByThree(View view)
    {
        scoreUpdaterB = scoreUpdaterB +3;

        ScoreTextB(scoreUpdaterB);

    }

    public void updateBteamScoreByTwo(View view)
    {
        scoreUpdaterB = scoreUpdaterB +2;

        ScoreTextB(scoreUpdaterB);
    }
    public void updateBteamScoreByOne(View view)
    {
        scoreUpdaterB = scoreUpdaterB +1;

        ScoreTextB(scoreUpdaterB);
    }
    public void ResetScore(View view)
    {
        ScoreText(0);
        ScoreTextB(0);
    }
}
