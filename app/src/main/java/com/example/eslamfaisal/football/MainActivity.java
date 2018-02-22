package com.example.eslamfaisal.football;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int TEAM_ONE_YELLOW_CARD = 0;
    private int TEAM_TWO_YELLOW_CARD = 0;
    private int TEAM_ONE_RED_CARD = 0;
    private int TEAM_TWO_RED_CARD = 0;
    private int TEAM_ONE_FOULS = 0;
    private int TEAM_TWO_FOULS = 0;
    private int TEAM_ONE_GOALS = 0;
    private int TEAM_TWO_GOALS = 0;
    Button resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resetButton = (Button) findViewById(R.id.reset_Button);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TEAM_ONE_YELLOW_CARD = 0;
                TEAM_TWO_YELLOW_CARD = 0;
                TEAM_ONE_RED_CARD = 0;
                TEAM_TWO_RED_CARD = 0;
                TEAM_ONE_FOULS = 0;
                TEAM_TWO_FOULS = 0;
                TEAM_ONE_GOALS = 0;
                TEAM_TWO_GOALS = 0;
                displayTeamOneGoals(TEAM_ONE_GOALS);
                displayTeamTwoGoals(TEAM_TWO_GOALS);
                displayTeamOneFouls(TEAM_ONE_FOULS);
                displayTeamTwoFouls(TEAM_TWO_FOULS);
                displayTeamOneButtonYellowCard(TEAM_ONE_YELLOW_CARD);
                displayTeamTwoButtonYellowCard(TEAM_TWO_YELLOW_CARD);
                displayTeamOneButtonRedCard(TEAM_ONE_RED_CARD);
                displayTeamTwoButtonRedCard(TEAM_TWO_RED_CARD);
            }
        });
    }

    public void teamOneButtonGoals(View v){
        TEAM_ONE_GOALS+= 1;
        displayTeamOneGoals(TEAM_ONE_GOALS);
    }

    public void displayTeamOneGoals(int number){
        TextView teamOneTextGoals = (TextView) findViewById(R.id.team_one_goals);
        teamOneTextGoals.setText(String.valueOf(number));
    }

    public void teamTwoButtonGoals(View v){
        TEAM_TWO_GOALS+= 1;
        displayTeamTwoGoals(TEAM_TWO_GOALS);
    }

    public void displayTeamTwoGoals(int number){
        TextView teamOneTextGoals = (TextView) findViewById(R.id.team_two_goals);
        teamOneTextGoals.setText(String.valueOf(number));
    }

    public void teamOneButtonFouls(View v){
        TEAM_ONE_FOULS+= 1;
        displayTeamOneFouls(TEAM_ONE_FOULS);
    }

    public void displayTeamOneFouls(int number){
        TextView teamOneTextGoals = (TextView) findViewById(R.id.team_one_button_fouls);
        teamOneTextGoals.setText(String.valueOf("Fouls = " + number));
    }

    public void teamTwoButtonFouls(View v){
        TEAM_TWO_FOULS+= 1;
        displayTeamTwoFouls(TEAM_TWO_FOULS);
    }

    public void displayTeamTwoFouls(int number){
        TextView teamTwoTextGoals = (TextView) findViewById(R.id.team_two_button_fouls);
        teamTwoTextGoals.setText(String.valueOf("Fouls = " + number));
    }

    public void teamOneButtonYellowCard(View v){
        TEAM_ONE_YELLOW_CARD+= 1;
        displayTeamOneButtonYellowCard(TEAM_ONE_YELLOW_CARD);
    }

    public void displayTeamOneButtonYellowCard(int number){
        TextView teamOneButtonYellowCard = (TextView) findViewById(R.id.team_one_button_yellow_card);
        teamOneButtonYellowCard.setText(String.valueOf( number));
    }

    public void teamTwoButtonYellowCard(View v){
        TEAM_TWO_YELLOW_CARD+= 1;
        displayTeamTwoButtonYellowCard(TEAM_TWO_YELLOW_CARD);
    }

    public void displayTeamTwoButtonYellowCard(int number){
        TextView teamTwoButtonYellowCard = (TextView) findViewById(R.id.team_two_button_yellow_card);
        teamTwoButtonYellowCard.setText(String.valueOf( number));
    }

    public void teamOneButtonRedCard(View v){
        TEAM_ONE_RED_CARD+= 1;
        displayTeamOneButtonRedCard(TEAM_ONE_RED_CARD);
    }

    public void displayTeamOneButtonRedCard(int number){
        TextView teamOneButtonRedCard = (TextView) findViewById(R.id.team_one_button_red_card);
        teamOneButtonRedCard.setText(String.valueOf( number));
    }

    public void teamTwoButtonRedCard(View v){
        TEAM_TWO_RED_CARD+= 1;
        displayTeamTwoButtonRedCard(TEAM_TWO_RED_CARD);
    }

    public void displayTeamTwoButtonRedCard(int number){
        TextView teamTwoButtonRedCard = (TextView) findViewById(R.id.team_two_button_red_card);
        teamTwoButtonRedCard.setText(String.valueOf( number));
    }

}
