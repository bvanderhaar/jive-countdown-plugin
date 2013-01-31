package com.spectrumhealth.webdev.labs;

import com.jivesoftware.community.widget.WidgetContext;
import com.jivesoftware.community.annotations.PropertyNames;
import com.jivesoftware.community.widget.WidgetTypeMarker;
import com.jivesoftware.community.widget.WidgetType;

@WidgetTypeMarker({WidgetType.COMMUNITY, WidgetType.HOMEPAGE, WidgetType.PERSONALIZEDHOMEPAGE, WidgetType.SOCIALGROUP, WidgetType.PROJECT})
@PropertyNames("countdownDate")
public class CountdownWidget extends com.jivesoftware.community.widget.BaseWidget {
    private static final String FREEMARKER_FILE = "/plugins/countdown-widget/resources/templates/main.ftl";
    private java.util.Date countdownDate = new java.util.Date();
	
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

	public java.util.Date getCountdownDate() {
	    return countdownDate;
	}
	
	public void setCountdownDate(java.util.Date countdownDate) {
	    this.countdownDate = countdownDate;
	}
}
