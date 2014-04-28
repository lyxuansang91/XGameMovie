/**
 * 
 */
package com.xgame.vod.multimedia.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xgame.vod.multimedia.R;

/**
 * @author sang
 *
 */
public class BaseMovieFragment extends Fragment {
	
	private static String ARG_CATEGORY_NUMBER = "category_number"; 
	
	public static BaseMovieFragment newInstance(int categoryNumber) {
		 BaseMovieFragment fragment = new BaseMovieFragment();
		 Bundle args = new Bundle();
		 args.putInt(ARG_CATEGORY_NUMBER, categoryNumber);
         fragment.setArguments(args);
         return fragment;
     }

     public BaseMovieFragment() {
		// TODO Auto-generated constructor stub
	 }

     @Override
     public View onCreateView(LayoutInflater inflater, ViewGroup container,
             Bundle savedInstanceState) {
         View rootView = inflater.inflate(R.layout.fragment_movie, container, false);
         /*TextView textView = (TextView) rootView.findViewById(R.id.section_label);
         textView.setText(Integer.toString(getArguments().getInt(ARG_SECTION_NUMBER))); */
         return rootView;
     }

	
	

}
