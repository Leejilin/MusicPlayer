package com.example.musicplayer;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

public class AudioPlayer {
	private MediaPlayer mMediaPlayer;
	public void stop(){
		if(mMediaPlayer!=null)
			mMediaPlayer.release();
			mMediaPlayer=null;
	}
	public void play(Context c){
		stop();		
		mMediaPlayer=MediaPlayer.create(c, R.raw.test_ring);	
		mMediaPlayer.start();
		mMediaPlayer.setOnCompletionListener(new OnCompletionListener() {			
			@Override
			public void onCompletion(MediaPlayer mp) {
				// TODO Auto-generated method stub
				stop();
			}
		});
	}


}
