package prac;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class CodingAttack191208_3 extends JFrame {

	public CodingAttack191208_3() {
		setTitle("My homepage");
		setSize(400, 400);
		setVisible(true);
		createMenu();

	}

	void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu jMenu = new JMenu("test");
		JMenuItem menuItem = new JMenuItem("test항목1"); 
		jMenu.addMenuListener(new Diary());
		
		mb.add(new JMenu("일기"));
		mb.add(new JMenu("주소록"));
		mb.add(new JMenu("달력"));
		mb.add(new JMenu("앨범"));
		mb.add(new JMenu("그림판"));
		
		mb.add(jMenu);
		jMenu.add(menuItem);
		
		setJMenuBar(mb);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new CodingAttack191208_3();
	}

}