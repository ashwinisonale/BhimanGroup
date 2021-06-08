package com.BhimGroup.tableFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BhimanGroup.mainBase.Constants;

public class DataTable {

	private List<Map<String, String>> data = new ArrayList<Map<String, String>>();
	private List<String> headers = new ArrayList<>();
	private String id = "";

	public DataTable(String id) {
		// id="datatable3";
		this.id = id;
		int rowCount = 1;
		setupHeaders();
		while (true) {

			List<WebElement> cells = Constants.driver
					.findElements(By.xpath("//table[@id='" + id + "']//tr[" + rowCount + "]//td"));
			if (cells.isEmpty()) {
				break;
			}
			Map<String, String> row = new HashMap<String, String>();
			for (int i = 0; i < cells.size(); i++) {
				WebElement element = cells.get(i);
				String cellValue = element.getText();
				String keyHeader = headers.get(i);
				row.put(keyHeader, cellValue);
			}
			data.add(row);

			rowCount++;
		}
	}

	private void setupHeaders() {
		List<WebElement> cells = Constants.driver.findElements(By.xpath("//table[@id='" + id + "']//tr[1]//th//div"));
		for (WebElement element : cells) {
			headers.add(element.getAttribute("innerText"));
		}
	}

	public List<Map<String, String>> getData() {
		return data;
	}

	public void setData(List<Map<String, String>> data) {
		this.data = data;
	}

	public List<String> getHeaders() {
		return headers;
	}

	public void setHeaders(List<String> headers) {
		this.headers = headers;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
