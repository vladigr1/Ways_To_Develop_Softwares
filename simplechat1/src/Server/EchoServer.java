// This file contains material supporting section 3.7 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 
package Server;

import java.io.*;
import java.util.Vector;

import logic.Faculty;
import logic.Student;
import ocsf.server.*;

/**
 * This class overrides some of the methods in the abstract 
 * superclass in order to give more functionality to the server.
 *
 * @author Dr Timothy C. Lethbridge
 * @author Dr Robert Lagani&egrave;re
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Paul Holden
 * @version July 2000
 */

public class EchoServer extends AbstractServer 
{
  //Class variables *************************************************
  
  /**
   * The default port to listen on.
   */
  //final public static int DEFAULT_PORT = 5555;
  
  //Constructors ****************************************************
  
  /**
   * Constructs an instance of the echo server.
   *
   * @param port The port number to connect on.
   * 
   */
 public static Student [] students=new Student[4];

  public EchoServer(int port) 
  {
    super(port);
  }

  //Instance methods ************************************************
  
  /**
   * This method handles any messages received from the client.
   *
   * @param msg The message received from the client.
   * @param client The connection from which the message originated.
   * @param 
   */
  public void handleMessageFromClient  (Object msg, ConnectionToClient client)
  {
	 int flag=0;
	    System.out.println("Message received: " + msg + " from " + client);
	    for(int  i=0;i<4;i++)
		{
			if(students[i].getId().equals(msg))
			{ 
				System.out.println("Server Found");
				try {
				client.sendToClient(students[i].toString());
				}catch(Exception e) {
					e.printStackTrace();
				}
				flag=1;
			}
		
		}
	if (flag!=1)
		{
			System.out.println("Not Founded");
			this.sendToAllClients("Error");
		}        
	  }
   
  /**
   * This method overrides the one in the superclass.  Called
   * when the server starts listening for connections.
   */
  protected void serverStarted()
  {
    System.out.println ("Server listening for connections on port " + getPort());
    students[0]=new Student("12345","Yossi","Cohen",new Faculty("SE","9901000"));
    students[1]=new Student("66666","Yossefa","Levi",new Faculty("IE","9901123"));
    students[2]=new Student("77777","moshe","galili",Faculty.getFaculty("SE"));
    students[3]=new Student("77778","moran","galil",Faculty.getFaculty("SE")); 

  }
  /**
   * This method overrides the one in the superclass.  Called
   * when the server stops listening for connections.
   */
  protected void serverStopped()
  {
    System.out.println ("Server has stopped listening for connections.");
  }
  
  public void setSt0(Student s) {
	  students[0]=s;
  }
}
//End of EchoServer class
