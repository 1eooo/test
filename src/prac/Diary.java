package prac;

import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class Diary implements MenuListener  {

	@Override
	public void menuCanceled(MenuEvent arg0) {
		System.out.println("click");
		
	}

	@Override
	public void menuDeselected(MenuEvent arg0) {
		System.out.println("click");
		
	}

	@Override
	public void menuSelected(MenuEvent arg0) {
		System.out.println("click");
		
	}

	
}

