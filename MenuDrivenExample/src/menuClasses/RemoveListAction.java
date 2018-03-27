package menuClasses;

import dataManager.DMComponent;
import ioManagementClasses.IOComponent;

public class RemoveListAction implements Action {
	@Override
	public void execute(Object arg) {
		DMComponent dm = (DMComponent) arg; 
		IOComponent io = IOComponent.getComponent(); 
		String listName = io.getInput("\nEnter name of the list to be deleted: "); 
		dm.removeList(listName); 
	}

}
