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
	private Button mpausebtn;
	private Button mrestartbtn;
	private AudioPlayer mplayer=new AudioPlayer();
	   /**
	    * Control whether a fragment instance is retained across Activity re-creation 
		*(such as from a configuration change). 
		*This can only be used with fragments not in the back stack. 
		*If set, the fragment lifecycle will be slightly different when an activity is recreated.
		*
	    *public void setRetainInstance(boolean retain) {
	    *    if (retain && mParentFragment != null) {
	    *        throw new IllegalStateException(
	    *               "Can't retain fragements that are nested in other fragments");
	    *   }
	    *   mRetainInstance = retain;
	    * }
	    */	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setRetainInstance(true);

	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v = inflater.inflate(R.layout.musicpalyer_fragment,container,false);
		mplaybtn=(Button)v.findViewById(R.id.playbutton);
		mstopbtn=(Button)v.findViewById(R.id.stopbutton);
		mpausebtn=(Button)v.findViewById(R.id.pausebutton);
		mrestartbtn=(Button)v.findViewById(R.id.restarbutton);
		
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
		
		mpausebtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mplayer.pause();
			}
		});
		
		mrestartbtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mplayer.restart();
			}
		});
		return v;
	}
}
