package presentation;

import javafx.scene.control.TextFormatter;

class TextFieldVerifiers {
	//returns different TextFormatter instances to restrict input
	//naming pattern follows <validtype>Validater
	
	
	
	public static TextFormatter<String> strictStringValidater() {
		TextFormatter<String> ssVal;
		 //lambda Expression(unary)
		//with TextFormatter(UnaryOperator<TextFormatter.Change> filter)
		// https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/TextFormatter.Change.html
		
		
		//returns new TextField.change value by changing the corresponging (array,array,string)
		ssVal = new TextFormatter<>( newInput ->{
			
			//check whether content or selection change or other..
			if(!newInput.isContentChange()) {
				return newInput;
			}
			
			//now get string
			String textValue = newInput.getControlNewText();
			if(textValue.matches("[A-Za-z]+")) {
				return newInput;
			}else {
				return null;
			}
		});
		
		return ssVal;
	}
	
	public static TextFormatter<String> IntegerValidater() {
		TextFormatter<String> ssVal;
		ssVal = new TextFormatter<>( newInput ->{
			
			//check whether content or selection change or other..
			if(!newInput.isContentChange()) {
				return newInput;
			}
			
			//now get string
			String textValue = newInput.getControlNewText();
			if(textValue.matches("[0-9]+")) {
				return newInput;
			}else {
				return null;
			}
			
		});
		return ssVal;
	}
	
	//NOT WORKING YET
	//must be some kind of DateTimeFormatter
	public static TextFormatter<String> LocalDateValidater() {
		TextFormatter<String> ssVal;
		ssVal = new TextFormatter<>( newInput ->{
			
			//check whether content or selection change or other..
			if(!newInput.isContentChange()) {
				return newInput;
			}
			
			//now get string
			String textValue = newInput.getControlNewText();
			if(textValue.matches("[0-9][0-9]?/[0-9][0-9]?/[0-9][0-9][0-9][0-9]")) {
				//should parse date but doesnt, propably wrong reg ex,and wrong way to parse date
				return newInput;
			}else {
				return null;
			}
			
		});
		return ssVal;
	}
}





















