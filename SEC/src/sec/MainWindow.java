package sec;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.*;

public class MainWindow extends JPanel{

	Box box;
	StockUI sTab;
	ExpensesUI eTab;
	CouponsUI cTab;
	JTabbedPane tabbedPane;
	
	public MainWindow() {
		// call the initial UI creation.
		initUI();
	}
	
	public void initUI() {
		//First should have tabbed panes		
		
		setLayout(new BorderLayout());
		sTab = new StockUI();
		eTab = new ExpensesUI();
		cTab = new CouponsUI();		
		
		tabbedPane = new JTabbedPane();
		tabbedPane.setPreferredSize(new Dimension(Common.FRAME_X,Common.FRAME_Y));			
	
		tabbedPane.add(sTab.initStockTab(),"STOCK");
		tabbedPane.add(eTab.initExpensesTab(),"EXPENSES");
		tabbedPane.add(cTab.initCouponsTab(),"COUPONS");		
		
		// set background colour.
		tabbedPane.setBackground(Color.YELLOW);
		add(tabbedPane, BorderLayout.CENTER);
		
	}
	
	public static void main(String[] args) {
		
		/* Added these variables for external users who would try running
		 * this application to be able to access their MySQL database.
		 * 
		 */
		try {
			/* Won't block the application from running so that viewers can
			 * atleast have a look at the GUI if no db is set up. 
			 */
			if(args[0] == null || args[1] == null) {
				System.out.println("Please provide a username and password of your database.");			
			}	
			else {
				String userName = args[0];
				String password = args[1];
			 
				Common.dbUser = userName;
				Common.dbPwd = password;
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		 
		JFrame guiApp = new JFrame();
		MainWindow mainWindow = new MainWindow();
		
		guiApp.getRootPane().addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                // This is only called when the user releases the mouse button.
            	//guiApp.resize(new Dimension(getSize().width/5, getSize().height/3));
            	//guiApp.resize(1200, 1200);
            	guiApp.revalidate();
            	guiApp.repaint();
            }
        });
		
		guiApp.getContentPane().add(mainWindow);		
		guiApp.pack();
		guiApp.setVisible(true);		
		guiApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
