package com.michael.demo.gridview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * This Five Direction Pad is made by the widget of ScrollView and Button 
 * 
 * 这种做法使用的是ScrollView嵌套Button来实现九宫格，相对于GridView的做法，灵活性较差
 * 
 * @author MichaelYe
 * @since 2012-9-4
 * */
public class CommonActivity extends Activity
{

	private ViewHolder viewHolder;
	class ViewHolder
	{
		private Button btnBack;
		private Button btnWorkbanch;
		private Button btnCompany;
		private Button btnZXL;
		private Button btnmanage;
		private Button btnArchive;
		private Button btnAddBook;
		private Button btnPlacard;
		private Button btnMyArchive;
		private Button btnSet;
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_common);
	    viewHolder = new ViewHolder();
	    iniComponent();
	}
	
	private void iniComponent()
	{
		viewHolder.btnBack = (Button)findViewById(R.id.btn_back);
		viewHolder.btnWorkbanch = (Button)findViewById(R.id.btn_workbench);
		viewHolder.btnCompany = (Button)findViewById(R.id.btn_company);
		viewHolder.btnZXL = (Button)findViewById(R.id.btn_zxl);
		viewHolder.btnmanage = (Button)findViewById(R.id.btn_manage);
		viewHolder.btnArchive = (Button)findViewById(R.id.btn_record);
		viewHolder.btnAddBook = (Button)findViewById(R.id.btn_addlist);
		viewHolder.btnPlacard = (Button)findViewById(R.id.btn_placard);
		viewHolder.btnMyArchive = (Button)findViewById(R.id.btn_my_record);
		viewHolder.btnSet = (Button)findViewById(R.id.btn_set);
		
		viewHolder.btnBack.setOnClickListener(clickListener);
		viewHolder.btnWorkbanch.setOnClickListener(clickListener);
		viewHolder.btnCompany.setOnClickListener(clickListener);
		viewHolder.btnZXL.setOnClickListener(clickListener);
		viewHolder.btnmanage.setOnClickListener(clickListener);
		viewHolder.btnArchive.setOnClickListener(clickListener);
		viewHolder.btnAddBook.setOnClickListener(clickListener);
		viewHolder.btnPlacard.setOnClickListener(clickListener);
		viewHolder.btnMyArchive.setOnClickListener(clickListener);
		viewHolder.btnSet.setOnClickListener(clickListener);
	}
	 
	private View.OnClickListener clickListener = new View.OnClickListener() 
	{
		
		public void onClick(View v) 
		{
			switch (v.getId()) 
			{
				case R.id.btn_back:
					finish();
					break;
				case R.id.btn_workbench:
					break;
				case R.id.btn_company:
					break;
				case R.id.btn_zxl:
					break;
				case R.id.btn_manage:
					break;
				case R.id.btn_record:
					break;
				case R.id.btn_addlist:
					break;
				case R.id.btn_placard:
					break;
				case R.id.btn_my_record:
					break;
				case R.id.btn_set:
					break;
			}
		}
	};
}
