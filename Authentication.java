import javax.swing.JOptionPane;

public class Authentication {
	public static void main (String [] args) {
		String username, password;
		String U = "CSC200";
		String P = "JL23868";
		
		username = JOptionPane.showInputDialog("Enter username");
		
		for(int i=0; i<3; i++) {
			
			if(username.equals(U)) { 	
			password = JOptionPane.showInputDialog("Enter password");
							
				for(int j=0; j<3; j++) {
					
					if(password.equals(P)) {
					JOptionPane.showMessageDialog(null, "Welcome, " + password);
					break;				
							
					} else if(j==2) {
					JOptionPane.showMessageDialog(null, "contact administrator");
					break;
							
					} else
					password = JOptionPane.showInputDialog("Invalid password. Enter the password again");
						
					} break;
					
			} else if(i==2) {
			JOptionPane.showMessageDialog(null, "contact administrator");
			break;
				
			} else {
			username = JOptionPane.showInputDialog("Invalid username. Enter the username again");
				}
			}
		
		}
}