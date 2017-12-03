package io.github.jhipster.sample.service.util;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

public class TransformItem {

	private String name;
	private int columnIndex;
	private List<String> paras;
	
	public TransformItem(String name, int columnIndex, List<String>paras) {
		this.columnIndex = columnIndex;
		this.name = name;
		this.paras = paras;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getColumnIndex() {
		return columnIndex;
	}
	public void setColumnIndex(int columnIndex) {
		this.columnIndex = columnIndex;
	}
	public List<String> getParas() {
		return paras;
	}
	public void setParas(List<String> paras) {
		this.paras = paras;
	}
	
	
	public String toString(){
		JSONObject res = new JSONObject();
		JSONObject parameter = new JSONObject();
		try{
		parameter.put("columnIndex", columnIndex);
		parameter.put("paras", paras);
		
		res.put("name",name);
		res.put("parameter", parameter);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return res.toString();
	}
	
}
