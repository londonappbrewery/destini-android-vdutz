package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mButtonTop;
    Button mButtonBottom;
    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        HashMap<String, String> buttonDictionary = new HashMap<String, String> [
//                ]

//        }
//
//        String[] buttonArray = new String[] {
//                getString(R.string.T1_Ans1),
//                getString(R.string.T1_Ans2),
//
//        };


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1 || mStoryIndex == 2) {
                    mStoryIndex = 3;
                    mStoryTextView.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                } else if (mStoryIndex == 3) {
                    mStoryIndex = 6;
                    mStoryTextView.setText(R.string.T6_End);
                } else {
                    // Nothing
                }
                if (mStoryIndex == 4 || mStoryIndex == 5 || mStoryIndex == 6) {
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1) {
                    mStoryIndex = 2;
                    mStoryTextView.setText(R.string.T2_Story);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mButtonBottom.setText(R.string.T2_Ans2);
                } else if (mStoryIndex == 2) {
                    mStoryIndex = 4;
                    mStoryTextView.setText(R.string.T4_End);
                } else if (mStoryIndex == 3) {
                    mStoryIndex = 5;
                    mStoryTextView.setText(R.string.T5_End);
                } else {
                    // Nothing
                }

                if (mStoryIndex == 4 || mStoryIndex == 5 || mStoryIndex == 6) {
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                }
            }
        });
    }

//    private void updateStory(int buttonId) {
//        if
//    }
}
