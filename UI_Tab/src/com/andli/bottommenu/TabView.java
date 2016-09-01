package com.andli.bottommenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class TabView extends Activity implements
		android.view.View.OnClickListener {
	// 底部按钮
	private RadioButton main_bottom_news_RadioButton;
	private RadioButton fbQuestion;
	private RadioButton fbTweet;
	private RadioButton fbactive;

	private Button btn0;
	private Button btn1;
	private Button btn2;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		main_bottom_news_RadioButton = (RadioButton) findViewById(R.id.main_footbar_news);
		fbQuestion = (RadioButton) findViewById(R.id.main_footbar_question);
		fbTweet = (RadioButton) findViewById(R.id.main_footbar_tweet);
		fbactive = (RadioButton) findViewById(R.id.main_footbar_active);

		btn0 = (Button) findViewById(R.id.frame_btn_news_lastest);
		btn1 = (Button) findViewById(R.id.frame_btn_news_blog);
		btn2 = (Button) findViewById(R.id.frame_btn_news_recommend);

		btn0.setOnClickListener(this);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);

		btn0.setEnabled(false);

		fbQuestion.setChecked(false);
	}

	@Override
	protected void onResume() {
		if (main_bottom_news_RadioButton.isChecked()) {
			main_bottom_news_RadioButton.setChecked(true);
			fbQuestion.setChecked(false);
			fbTweet.setChecked(false);
			fbactive.setChecked(false);
		} else if (fbQuestion.isChecked()) {
			main_bottom_news_RadioButton.setChecked(false);
			fbQuestion.setChecked(true);
			fbTweet.setChecked(false);
			fbactive.setChecked(false);
		} else if (fbTweet.isChecked()) {
			main_bottom_news_RadioButton.setChecked(false);
			fbQuestion.setChecked(false);
			fbTweet.setChecked(true);
			fbactive.setChecked(false);
		} else if (fbactive.isChecked()) {
			main_bottom_news_RadioButton.setChecked(false);
			fbQuestion.setChecked(false);
			fbTweet.setChecked(false);
			fbactive.setChecked(true);
		}
		super.onResume();
	}

	@Override
	public void onClick(View btn) {
		if (btn == btn0) {
			btn0.setEnabled(false);
		} else {
			btn0.setEnabled(true);
		}
		if (btn == btn1) {
			btn1.setEnabled(false);
		} else {
			btn1.setEnabled(true);
		}
		if (btn == btn2) {
			btn2.setEnabled(false);
		} else {
			btn2.setEnabled(true);
		}

	}
}