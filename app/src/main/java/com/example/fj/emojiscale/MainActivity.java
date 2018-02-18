package com.example.fj.emojiscale;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import com.vdurmont.emoji.EmojiManager;
import com.vdurmont.emoji.EmojiParser;

// finding emoji help from: https://hotemoji.com/ and https://emojipedia.org/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SeekBar mseekbar = (SeekBar) findViewById(R.id.seekBar3);
        final TextView mtextview = (TextView) findViewById(R.id.textView);
        mtextview.setText(getEmojiText(20));

        mseekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
                mtextview.setText(getEmojiText(progress));

            }

            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }


    private String getEmojiText(int progress){

        // for emoji using: Shortcodes, or Decimal HTML Entity

        String toreturn = "";
        switch (progress) {
            case 0:
                // Angry face
                toreturn =  ":angry:";
                break;
            case 1:
                // Loudly Crying Face
                toreturn =  ":sob:";
            break;
            case 2:
                // Crying Face
                toreturn =  ":cry:";
            break;
            case 3:
                // Slightly frowning
                toreturn =  "&#128577;";
            break;
            case 4:
                // Confused face
                toreturn =  "&#128533;";
            break;
            case 5:
                // Neutral Face
                toreturn =  ":neutral_face:";
            break;
            case 6:
                // Slightly Smiling face, Unicode 7 using Decimal HTML Entity, &#128578;
                toreturn =  "&#128578;";
            break;
            case 7:
                // Grinning
                toreturn =  ":grinning:";
            break;
            case 8:
                // Smiling Face With Smiling Eyes
                toreturn =  ":blush:";
            break;
            case 9:
                // Face Blowing a Kiss
                toreturn =  ":kissing_heart:";
            break;
            case 10:
                // Smiling Face With Heart-Eyes
                toreturn =  ":heart_eyes:";
            break;
            default:
                // Shrug as default
                toreturn =  "&#129335;";
            break;

        }

        return EmojiParser.parseToUnicode(toreturn);

    }
}
