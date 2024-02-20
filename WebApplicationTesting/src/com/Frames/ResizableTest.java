package com.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ResizableTest extends BaseTest{
	
	
	public void dragAndDropOperation() {
		
		

		//Thread.sleep(3000);
		
		//Property of the Frame
		//<iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
		
				By jQureyFrameProperty=By.className("demo-frame");
				WebElement jQureyFrame=driver.findElement(jQureyFrameProperty);
				
				// we should Switch into the Frame of the Webpage
				driver.switchTo().frame(jQureyFrame);
				
				
				//finding the Element in the Frame of the Webpage
				
				//<div id="draggable" class="ui-widget-content ui-draggable ui-draggable-handle" style="position: relative;">
				             //  property of "Drag Me TO My Target"
				
				By dragMeToMyTargetProperty=By.id("draggable");
				WebElement dragMeToMyTarget=driver.findElement(dragMeToMyTargetProperty);
				String dragMeToMyTarget_Text=dragMeToMyTarget.getText();
				
				
				System.out.println("The Text of the WebElement is :-  "+dragMeToMyTarget_Text);
				
		
		       //<div id="droppable" class="ui-widget-header ui-droppable">  --->>>  Drop Here WebElement Property
				
				By dropPableProprety=By.id("droppable");
				WebElement dropPable=driver.findElement(dragMeToMyTargetProperty);
				String dropPable_Text=dropPable.getText();
				
				System.out.println("The Text of DropPable WebElement is :- "+dropPable_Text);
				
				
				// Drag and Drop Operation
				
				Actions action =new Actions(driver);
				action.dragAndDrop(dragMeToMyTarget, dropPable).build().perform();
	
		
		
		// driver should be made to exit from the frame - should be made it back to the Actual Webpage
		
		driver.switchTo().defaultContent();
		
	}
	
	
	public void resizableTest() {
		
		
		// <a href="https://jqueryui.com/resizable/">Resizable</a>
		// <a href="https://jqueryui.com/resizable/">Resizable</a>

		// Thread.sleep(5000);

		By reziableProperty=By.linkText("Resizable");
		WebElement resizable=driver.findElement(reziableProperty);

		resizable.click();

		System.out.println(" The Title of the Resizable WebPage is :- "+driver.getTitle());
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		ResizableTest test =new ResizableTest();
		
		test.applicationLaunch();
		test.dragAndDropOperation();
		test.resizableTest();
				
		
		
		
		
		
	}

}
