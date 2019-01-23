package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Team A variables
    int points;
    int fouls;
    int corners;
    int teamThrows;

    //Team B variables
    int pointsB;
    int foulsB;
    int cornersB;
    int teamThrowsB;

    int resetAll = 0;

    //thanks for watching

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //method for adding one point to team A
    public void AddOnePointA(View view) {
        points++;
        String message = " " + points + "  Goal(s)";
        displayPointsA(message);
    }

    //method for displaying team A points
    private void displayPointsA(String forAddOne) {
        TextView teamAPointView = (TextView) findViewById(R.id.team_a__points_view);
        teamAPointView.setText(forAddOne);
    }

    //method for adding fouls to team A
    public void AddOneFoulA(View view) {
        fouls++;
        String message = " " + fouls + " Foul(s)";
        displayFoulsA(message);
    }

    //method for displaying fouls for Team A
    private void displayFoulsA(String message) {
        TextView foulsTextView = (TextView) findViewById(R.id.team_a__points_view);
        foulsTextView.setText(message);
    }

    //method for adding corner to team A
    public void AddOneCornerA(View view) {
        corners++;
        String message = " " + corners + " corner(s)";
        displayCornerA(message);
    }

    //method to display corners for team A
    private void displayCornerA(String message) {
        TextView cornersTextView = (TextView) findViewById(R.id.team_a__points_view);
        cornersTextView.setText(message);
    }

    //method for adding throw to team A
    public void AddOneThrowA(View view) {
        teamThrows++;
        String myThrow = " " + teamThrows + " Throw(s)";
        displayThrowA(myThrow);
    }

    //method to display corners for team A
    private void displayThrowA(String message) {
        TextView cornersTextView = (TextView) findViewById(R.id.team_a__points_view);
        cornersTextView.setText(message);
    }




    //TEAM B
    //method for adding one point to team A
    public void AddOnePointB(View view) {
        pointsB++;
        String message = " " + pointsB + " Goal(s)";
        displayPointsB(message);
    }

    //method for displaying team A points
    private void displayPointsB(String forAddOne) {
        TextView teamAPointView = (TextView) findViewById(R.id.team_b__text_view);
        teamAPointView.setText(forAddOne);
    }

    //method for adding fouls to team A
    public void AddOneFoulB(View view) {
        foulsB++;
        String message = " " + foulsB + " Foul(s)";
        displayFoulsB(message);
    }

    //method for displaying fouls for Team A
    private void displayFoulsB(String message) {
        TextView foulsTextView = (TextView) findViewById(R.id.team_b__text_view);
        foulsTextView.setText(message);
    }

    //method for adding corner to team A
    public void AddOneCornerB(View view) {
        cornersB++;
        String message = " " + cornersB + " Corner(s)";
        displayCornerB(message);
    }

    //method to display corners for team A
    private void displayCornerB(String message) {
        TextView cornersTextView = (TextView) findViewById(R.id.team_b__text_view);
        cornersTextView.setText(message);
    }

    //method for adding throw to team A
    public void AddOneThrowB(View view) {
        teamThrowsB++;
        String myThrow = " " + teamThrowsB + " Throw(s)";
        displayThrowB(myThrow);
    }

    //method to display corners for team A
    private void displayThrowB(String message) {
        TextView cornersTextView = (TextView) findViewById(R.id.team_b__text_view);
        cornersTextView.setText(message);
    }


    //method for reset
    public void resetScores (View view){
       points = fouls = corners = teamThrows = resetAll;
       String message = " " + resetAll;
       displayReset(message);

    }
    //method for displaying reset
    private void displayReset (String clear) {
        TextView resetTextViewA = (TextView) findViewById(R.id.team_a__points_view);
        TextView resetTextViewB = (TextView) findViewById(R.id.team_b__text_view);

        resetTextViewA.setText(clear);
        resetTextViewB.setText(clear);
    }


}
