package com.bobx.appmanage.model;

public class AppDataModel {
	
	public static AppDataModel mAppDataModel;
	
	private AppDataModel(){
		
	}
	
	public AppDataModel getInstance(){
		if(mAppDataModel==null){
			return new AppDataModel();
		}else{
			return mAppDataModel;
		}
	}
}
