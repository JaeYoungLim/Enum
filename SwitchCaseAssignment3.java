import javax.swing.JOptionPane;

public class SwitchCaseAssignment3 {
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
					String[] choices = { "Admin", "Student", "Staff"};
					String input = (String) JOptionPane.showInputDialog(null, "Choose account type...","Account Type",
							JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]); 

						switch(input){
						case "Admin":
							JOptionPane.showMessageDialog(null, "Welcome Admin! You can update and read file.");
							break;
						case "Student":
							JOptionPane.showMessageDialog(null, "Welcome Student! You can only read file.");
							break;
						case "Staff":
							JOptionPane.showMessageDialog(null, "Welcome Staff! You can update, read, add, delete file.");
							break;
						} break;
						
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