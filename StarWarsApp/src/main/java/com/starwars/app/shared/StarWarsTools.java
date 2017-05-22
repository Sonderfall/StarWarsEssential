package com.starwars.app.shared;

public class StarWarsTools {

	public static native void alert(String result) /*-{
		alert(result);
	}-*/;
	
	public static native void init(String iMctObro, String iBin) /*-{
		var lMyVM = bootstrap (iMctObro, iBin);
		setVM(lMyVM);
        init(lMyVM);
	}-*/;
	
	//yacas.Evaluate(lCmd);
	public static native void run(String iScript) /*-{
		var lMyVM = getVM();
    	interpScript(lMyVM, iScript);
	}-*/;
	
	//yacas.Evaluate(lCmd);
	public static native void runCmd(String iCmd) /*-{
		var lMyVM = getVM();
    	interpC(lMyVM, iCmd);
	}-*/;
}
