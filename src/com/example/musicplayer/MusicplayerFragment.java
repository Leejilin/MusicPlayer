package com.example.musicplayer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class MusicplayerFragment extends Fragment {
	private Button mplaybtn;
	private Button mstopbtn;
	private AudioPlayer mplayer=new AudioPlayer();
	
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v = inflater.inflate(R.layout.musicpalyer_fragment,container,false);
		mplaybtn=(Button)v.findViewById(R.id.playbutton);
		mstopbtn=(Button)v.findViewById(R.id.stopbutton);
		//listener
		mplaybtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mplayer.play(getActivity());
				
			}
		});
		
		mstopbtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mplayer.stop();
			}
		});
		return v;
	}
}
