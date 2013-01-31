package com.spectrumhealth.webdev.labs;

import java.util.Map;

import com.jivesoftware.community.widget.WidgetContext;
import com.jivesoftware.community.annotations.PropertyNames;
import com.jivesoftware.community.widget.WidgetTypeMarker;
import com.jivesoftware.community.widget.WidgetType;

@WidgetTypeMarker({WidgetType.COMMUNITY, WidgetType.HOMEPAGE, WidgetType.PERSONALIZEDHOMEPAGE, WidgetType.SOCIALGROUP, WidgetType.PROJECT})
@PropertyNames({"countdownDate", "coutndownTime", "numericColor", "labelColor"})
public class CountdownWidget extends com.jivesoftware.community.widget.BaseWidget {
    private static final String FREEMARKER_FILE = "/plugins/countdown-widget/resources/templates/main.ftl";
    private String countdownDate = "1/1/2020";
    private String countdownTime = "5:00PM";
    private String numericColor = "Green";
    private String labelColor = "Black";
    
    protected Map<String, Object> loadProperties(WidgetContext widgetContext, ContainerSize size) {
        Map<String, Object> properties = super.loadProperties(widgetContext, size);
        properties.put("countdownDate", this.countdownDate);
        properties.put("countdownTime", this.countdownTime);
        properties.put("numericColor", this.numericColor);
        properties.put("labelColor", this.labelColor);
        return properties;
    }
	
	public String getDescription(WidgetContext arg0) {
		return "Displays a countdown from a specified date time.";
	}

	public String getTitle(WidgetContext arg0) {
		return "Countdown Timer";
	}

	public String render(WidgetContext widgetContext, ContainerSize containerSize) {
	    return applyFreemarkerTemplate(widgetContext, containerSize,
	            FREEMARKER_FILE);
	}

	public String getCountdownDate() {
	    return countdownDate;
	}
	
	public void setCountdownDate(String countdownDate) {
	    this.countdownDate = countdownDate;
	}
	
	public String getCountdownTime() {
		return countdownTime;
	}
	
	public void setCountdownTime(String countdownTime) {
		this.countdownTime = countdownTime;
	}
	
	public String getNumericColor() {
		return numericColor;
	}
	
	public void setNumericColor(String color) {
		this.numericColor = color;
	}
	
	public String getLabelColor() {
		return this.labelColor;
	}
	
	public void setLabelColor(String color) {
		this.labelColor = color;
	}
}
