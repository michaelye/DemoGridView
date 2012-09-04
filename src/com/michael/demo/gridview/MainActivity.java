package com.michael.demo.gridview;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

/**
 * This Five Direction Pad is made by the widget of GridView and Button
 * 
 * ����͹���˵����õ���GridView��Button��ʵ�ֵ�
 * 
 * @author MichaelYe
 * @since 2012-9-4
 * */
public class MainActivity extends Activity 
{

	private ViewHolder viewHolder;
	private final static String STR_WORKBANCH = "����̨";
	private final static String STR_COMPANY = "��˾�ſ�";
	private final static String STR_ZHIXINLI = "ִ����";
	private final static String STR_MANAGE = "�˲Ź���";
	private final static String STR_ARCHIVE = "Ա������";
	private final static String STR_ADDRESS_BOOK = "ͨѶ¼";
	private final static String STR_PLACARD = "����";
	private final static String STR_MY_ARCHIVE = "�ҵĵ���";
	private final static String STR_SET = "����";
	
	class ViewHolder
	{
		private Button btnLogout;
		private TextView tvAdd;
		private GridView gvGridView;
	}
	
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        viewHolder = new ViewHolder();
        iniComponent();
        viewHolder.gvGridView.setSelector(R.drawable.main_icon_bg_selector);//����GridView�����Item���Ч��
        viewHolder.gvGridView.setAdapter(new GridViewAdapter(stringList));
        viewHolder.gvGridView.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {

				Log.e("++++++++++++++++:", ""+position);
				
			}
		});
    }
    
    private List<String> stringList;
    private void iniComponent()
    {
    	viewHolder.btnLogout = (Button)findViewById(R.id.btn_logout);
    	viewHolder.tvAdd = (TextView)findViewById(R.id.tv_add);
    	viewHolder.gvGridView = (GridView)findViewById(R.id.gv_gridview);
    	viewHolder.btnLogout.setOnClickListener(clickListener);
    	viewHolder.tvAdd.setOnClickListener(clickListener);
    	
    	stringList = new ArrayList<String>();
    	stringList.add("����̨");
    	stringList.add("��˾�ſ�");
    	stringList.add("ִ����");
    	stringList.add("�˲Ź���");
    	stringList.add("Ա������");
    	stringList.add("ͨѶ¼");
    	stringList.add("����");
    	stringList.add("�ҵĵ���");
    	stringList.add("����");
    }
    
    private class GridViewAdapter extends BaseAdapter
    {
    	List<String> stringList;
    	int textColor;
    	Drawable iconBg;
    	public GridViewAdapter(List<String> stringList)
    	{
    		this.stringList = stringList;
    		textColor = MainActivity.this.getResources().getColor(R.color.main_button_color);//������ɫ
        	iconBg = MainActivity.this.getResources().getDrawable(R.drawable.main_icon_bg_normal);//͸������
    	}
    	
		public int getCount() {
			return this.stringList.size();
		}

		public Object getItem(int position) {
			return null;
		}

		public long getItemId(int position) {
			return position;
		}
		class ViewHolder
		{
			private Button btn;
		}
		
		public View getView(int position, View convertView, ViewGroup parent) {

			ViewHolder viewHolder;
			if(convertView == null)
			{
				//����һ��ͨ�������ļ�����Item������
//				LayoutInflater myInflater = LayoutInflater.from(Act_Main.this);  
//	            convertView = myInflater.inflate(R.layout.gridview_item, null);
//				viewHolder = new ViewHolder();
//				viewHolder.btn = (Button)convertView.findViewById(R.id.button);
//				convertView.setTag(viewHolder);
				
				viewHolder = new ViewHolder();
				viewHolder.btn = new Button(MainActivity.this);
				viewHolder.btn.setClickable(false);
				viewHolder.btn.setFocusable(false);
				convertView = viewHolder.btn;
				convertView.setTag(viewHolder);
			}
			else
			{
				viewHolder = (ViewHolder)convertView.getTag();
			}
			String str = this.stringList.get(position);
			if(str.equals(STR_WORKBANCH))
			{
				viewHolder.btn.setCompoundDrawablesWithIntrinsicBounds(null,MainActivity.this.getResources().getDrawable(R.drawable.main_icon_workbench),null,null);
				viewHolder.btn.setBackgroundDrawable(iconBg);
				viewHolder.btn.setTextColor(textColor);
				viewHolder.btn.setText(STR_WORKBANCH);
			}
			if(str.equals(STR_COMPANY))
			{
				viewHolder.btn.setCompoundDrawablesWithIntrinsicBounds(null,MainActivity.this.getResources().getDrawable(R.drawable.main_icon_company),null,null);
				viewHolder.btn.setBackgroundDrawable(iconBg);
				viewHolder.btn.setTextColor(textColor);
				viewHolder.btn.setText(STR_COMPANY);
			}
			if(str.equals(STR_ZHIXINLI))
			{
				viewHolder.btn.setCompoundDrawablesWithIntrinsicBounds(null,MainActivity.this.getResources().getDrawable(R.drawable.main_icon_zxl),null,null);
				viewHolder.btn.setBackgroundDrawable(iconBg);
				viewHolder.btn.setTextColor(textColor);
				viewHolder.btn.setText(STR_ZHIXINLI);
			}
			if(str.equals(STR_MANAGE))
			{
				viewHolder.btn.setCompoundDrawablesWithIntrinsicBounds(null,MainActivity.this.getResources().getDrawable(R.drawable.main_icon_manage),null,null);
				viewHolder.btn.setBackgroundDrawable(iconBg);
				viewHolder.btn.setTextColor(textColor);
				viewHolder.btn.setText(STR_MANAGE);
			}
			if(str.equals(STR_ARCHIVE))
			{
				viewHolder.btn.setCompoundDrawablesWithIntrinsicBounds(null,MainActivity.this.getResources().getDrawable(R.drawable.main_icon_record),null,null);
				viewHolder.btn.setBackgroundDrawable(iconBg);
				viewHolder.btn.setTextColor(textColor);
				viewHolder.btn.setText(STR_ARCHIVE);
			}
			if(str.equals(STR_ADDRESS_BOOK))
			{
				viewHolder.btn.setCompoundDrawablesWithIntrinsicBounds(null,MainActivity.this.getResources().getDrawable(R.drawable.main_icon_addlist),null,null);
				viewHolder.btn.setBackgroundDrawable(iconBg);
				viewHolder.btn.setTextColor(textColor);
				viewHolder.btn.setText(STR_ADDRESS_BOOK);
			}
			if(str.equals(STR_PLACARD))
			{
				viewHolder.btn.setCompoundDrawablesWithIntrinsicBounds(null,MainActivity.this.getResources().getDrawable(R.drawable.main_icon_placard),null,null);
				viewHolder.btn.setBackgroundDrawable(iconBg);
				viewHolder.btn.setTextColor(textColor);
				viewHolder.btn.setText(STR_PLACARD);
			}
			if(str.equals(STR_MY_ARCHIVE))
			{
				viewHolder.btn.setCompoundDrawablesWithIntrinsicBounds(null,MainActivity.this.getResources().getDrawable(R.drawable.main_icon_myrecord),null,null);
				viewHolder.btn.setBackgroundDrawable(iconBg);
				viewHolder.btn.setTextColor(textColor);
				viewHolder.btn.setText(STR_MY_ARCHIVE);
			}
			if(str.equals(STR_SET))
			{
				viewHolder.btn.setCompoundDrawablesWithIntrinsicBounds(null,MainActivity.this.getResources().getDrawable(R.drawable.main_icon_set),null,null);
				viewHolder.btn.setBackgroundDrawable(iconBg);
				viewHolder.btn.setTextColor(textColor);
				viewHolder.btn.setText(STR_SET);
//				viewHolder.btn.setOnClickListener(new OnClickListener() {
//					
//					public void onClick(View v) {
//						// TODO Auto-generated method stub
//						Log.e("111111111111111", "");
//					}
//				});
			}
			
			return convertView;
		}
    	
    };
    
    private View.OnClickListener clickListener = new View.OnClickListener() 
    {
		
		public void onClick(View v) 
		{
			switch (v.getId()) 
			{
				case R.id.btn_logout:
					Intent intent = new Intent();
					intent.setClass(MainActivity.this, CommonActivity.class);
					startActivity(intent);
					break;
				case R.id.tv_add:
					break;
			}
		}
    };

}