package com.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropOperation extends BaseTest{
	
	
	
	public void dragAndDropOperation() throws InterruptedException {
		
		
		//Thread.sleep(3000);
		
		//Property of the Frame
		//<iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
		
				By jQueryFrameProperty=By.className("demo-frame");
				WebElement jQueryFrame=driver.findElement(jQueryFrameProperty);
				
				// we should Switch into the Frame of the Webpage
				driver.switchTo().frame(jQueryFrame);
				
				
				//finding the Element in the Frame of the Webpage
				
				//<div id="draggable" class="ui-widget-content ui-draggable ui-draggable-handle" style="position: relative;">
				             //  property of "Drag Me TO My Target"
				
				By dragMeToMyTargetProperty=By.id("draggable");
				WebElement dragMeToMyTarget=driver.findElement(dragMeToMyTargetProperty);
				String dragMeToMyTarget_Text=dragMeToMyTarget.getText();
				
				
				System.out.println("The Text of the WebElement is :-  "+dragMeToMyTarget_Text);
				
		
		       //<div id="droppable" class="ui-widget-header ui-droppable">  --->>>  Drop Here WebElement Property
				
				By dropPableProprety=By.id("droppable");
				WebElement dropPable=driver.findElement(dropPableProprety);
				String dropPable_Text=dropPable.getText();
				
				System.out.println("The Text of DropPable WebElement is :- "+dropPable_Text);
				
				
				// Drag and Drop Operation
				
				Actions action =new Actions(driver);
				action.dragAndDrop(dragMeToMyTarget, dropPable).build().perform();
	
		
		
		
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		DragAndDropOperation dragAndDropTest=new DragAndDropOperation();
		
		dragAndDropTest.applicationLaunch();
		dragAndDropTest.dragAndDropOperation();
		//dragAndDropTest.applicationClose();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
