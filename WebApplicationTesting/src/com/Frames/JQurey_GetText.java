package com.Frames;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JQurey_GetText extends BaseTest {
	
	
	
	
	public void jQurey_getText_DragMeToMyTarget() throws InterruptedException 
	{
		
		Thread.sleep(5000);
		
		//Property of the Frame
		//<iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
		               //  property of "Drag Me TO My Target"
		
		By jQureyFrameProperty=By.className("demo-frame");
		WebElement jQureyFrame=driver.findElement(jQureyFrameProperty);
		
		// we should Switch into the Frame of the Webpage
		driver.switchTo().frame(jQureyFrame);
		
		
		//finding the Element in the Frame of the Webpage
		
		//<div id="draggable" class="ui-widget-content ui-draggable ui-draggable-handle" style="position: relative;">
		By dragMeToMyTargetProperty=By.id("draggable");
		WebElement dragMeToMyTarget=driver.findElement(dragMeToMyTargetProperty);
		String dragMeToMyTarget_Text=dragMeToMyTarget.getText();
		
		
		System.out.println("The Text of the WebElement is :-  "+dragMeToMyTarget_Text);
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		
		JQurey_GetText jQuery= new JQurey_GetText();
		jQuery.applicationLaunch();
		jQuery.jQurey_getText_DragMeToMyTarget();
		
		
		
		// org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element:
		// Exception in thread "main" org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element

		
		jQuery.applicationClose();
		
		
		
		
		
	}
	
	
	

}
