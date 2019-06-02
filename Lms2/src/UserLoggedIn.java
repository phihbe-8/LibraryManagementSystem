import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *-1.S�ka utan inlogg 
 *-2.L�na, reservera, �terl�mna
 * 3.Kvitto(titel, id, datum, L�mna tillbaka)
 * 5.Logga in och registrera ny anv�ndare
 *-6.Se l�n & l�nhistorik
 *x7.Hantera B�cker, tidsskrifter, filmer.
 *x8.L�gga till nya objekt
 *x9.L�gga till �ndra och ta bort objekt
 *x10.L�gga till �nra ta bort l�ntagare 
 * @author Philip
 *
 */

public class UserLoggedIn {

	private JFrame frame;
	private JButton btnMinaLn;
	private JButton btnLneHistorik;
	private JButton btnLoanObject;
	private JButton btnSearch;
	private JLabel lblVlkommen;
	private JButton btnTillbaka;
	private JButton btnRetunerabok;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public UserLoggedIn() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	
	private void initialize() {
		frame = new JFrame();
		btnLoanObject = new JButton();
		btnSearch = new JButton();
		btnMinaLn = new JButton();
		lblVlkommen = new JLabel();
		btnTillbaka = new JButton();
		btnLneHistorik = new JButton();
		btnRetunerabok = new JButton();
		
		frame.setBounds(100, 100, 457, 686);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		btnLoanObject.setBounds(94, 100, 255, 42);
		btnLoanObject.setText("L\u00C5NA");
		btnLoanObject.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		frame.getContentPane().add(btnLoanObject);
		btnLoanObject.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				btnLoanObjectActionPerformed(evt);
			}
		});
		
		
		btnSearch.setBounds(94, 315, 255, 42);
		btnSearch.setText("S\u00D6K");
		btnSearch.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		frame.getContentPane().add(btnSearch);
		btnSearch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				btnSearchActionPerformed(evt);
			}
		});
		
		btnMinaLn.setBounds(94, 153, 255, 42);
		btnMinaLn.setText("MINA L\u00C5N");
		btnMinaLn.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		frame.getContentPane().add(btnMinaLn);
		btnMinaLn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				btnMinaLnActionPerformed(evt);
			}
		});
		
		
		lblVlkommen.setBounds(10, 11, 414, 61);
		lblVlkommen.setText("V\u00C4LKOMMEN");
		lblVlkommen.setHorizontalAlignment(SwingConstants.CENTER);
		lblVlkommen.setFont(new Font("Tempus Sans ITC", Font.BOLD, 30));
		frame.getContentPane().add(lblVlkommen);
		
		btnTillbaka.setText("LOGGA UT");
		btnTillbaka.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		btnTillbaka.setBounds(94, 368, 255, 42);
		frame.getContentPane().add(btnTillbaka);
		btnTillbaka.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				btnTillbakaActionPerformed(evt);
			}
		});
		
		btnLneHistorik.setText("L\u00C5NE HISTORIK");
		btnLneHistorik.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		btnLneHistorik.setBounds(94, 209, 255, 42);
		frame.getContentPane().add(btnLneHistorik);
		btnLneHistorik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnLneHistorikActionPerformed(evt);
			}
		});
		
		
		btnRetunerabok.setText("RETUNERA BOK");
		btnRetunerabok.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		btnRetunerabok.setBounds(94, 262, 255, 42);
		frame.getContentPane().add(btnRetunerabok);
		btnRetunerabok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnRetunerabokActionPerformed(evt);
			}
		});
	}
	//6.Se l�nhistorik
	public void btnLneHistorikActionPerformed(ActionEvent evt) {
		LoanHistory ObjectLoanHistory = new LoanHistory();
		this.frame.setVisible(false);
		}
	//2.�terl�mna
	public void btnRetunerabokActionPerformed(ActionEvent evt) {
		ReturnBook ObjectReturnBook = new ReturnBook();
		this.frame.setVisible(false);
	}
	//2.L�na
	public void btnLoanObjectActionPerformed(ActionEvent evt) {
		Loan ObjectLoan = new Loan();
		this.frame.setVisible(false);
	}
	//6.Se l�n 
	public void btnMinaLnActionPerformed(ActionEvent evt) {
		MyLoans Object = new MyLoans();
		this.frame.setVisible(false);
	}
	//1.S�ka
	public void btnSearchActionPerformed(ActionEvent evt) {
		Search ObjectSearch = new Search();
		this.frame.setVisible(false);
	}
	public void btnTillbakaActionPerformed(ActionEvent evt) {
		LibraryMain ObjectLibraryMain = new LibraryMain();
		this.frame.setVisible(false);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					UserLoggedIn window = new UserLoggedIn();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
