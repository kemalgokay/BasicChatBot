
package bot;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author kemal
 */
public class Bot extends JFrame{

    private JTextField txtEnter=new JTextField();
	int s1;
        String word;
	private JTextArea txtChat=new JTextArea();
        
	
	public Bot(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
		 this.setVisible(true);
		 this.setResizable(false);
		 this.setLayout(null);
		 this.setTitle("Java Al");
		 
		 
		 txtEnter.setLocation(2,540);
		 txtEnter.setSize(590,30);
		 
		 
		 txtEnter.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String uText=txtEnter.getText();
				txtChat.append("You: "+uText+"\n");
                               // word=txtEnter.getText();
                            
				
                              if(uText.contains("hi")){
				botSay("Hello!");
			
				}
                              
				else if(uText.contains("how are you?")){
					int rndNum=(int) (Math.random()*3+1);
					System.out.println(rndNum);
					if(rndNum ==1){
						botSay("I am fine and you?");
					}else if(rndNum==2){
						botSay("Not too bad");
						System.out.println(rndNum);
					}
					
				}
				
                               
				
				
				else{
					int rndNum=(int) (Math.random()*3+1);
					System.out.println(rndNum);
					if(rndNum ==1){
						//botSay("I didnt get that");
					}else if(rndNum==2){
						botSay("Please rephrase that");
						System.out.println(rndNum);
					}
					else if(rndNum == 3){
						botSay("???");
						System.out.println(rndNum);
					}
				}
				txtEnter.setText("");
                                
                                if(uText.contains("not bad") ||uText.contains("bad")){
                                    botSay("Why?");
                                }
                                if(uText.contains("good") || uText.contains("I'm fine")){
                                    botSay("Can I help you?");
                                }
                                /*if(uText.contains(word)){
                                    botSay("ssss");
                                }*/
                                
                                
                                
				
                             
			}
		});
		 
		 txtChat.setLocation(15,5);
		 txtChat.setSize(560,510);
		 txtChat.setEditable(false);
		 
		 this.add(txtEnter);
		 this.add(txtChat);
		
		 
		 
		
	}
        
       
	
	public void botSay(String s){
		txtChat.append("Al:"+s+"\n");
	}
        
        

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Bot();

	}

    
    
}
