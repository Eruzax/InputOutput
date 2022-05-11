import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MessageSaver
{

    public MessageSaver() { }

    public void MessageSend()
    {

        File f = new File("src/messages.txt");

        // WRITING
        try {
            f.createNewFile(); // this method will create the file if it does not exist; if it does exist, it does nothing
            FileWriter fw = new FileWriter("src/messages.txt");
            Message m = new Message();
            fw.close();
        } catch (IOException e) {
            System.out.println("ERROR! + " + e.getMessage());
        }

        // READING
        try {
            Scanner s = new Scanner(f);
            String text = s.nextLine();
            System.out.println(text);
        } catch (FileNotFoundException e) {
            System.out.println("ERROR! " + e.getMessage());
        }
    }

    private void createMessage()
    {
        Message m = new Message();
        System.out.print("Who is sending the message? ");
        Scanner in = new Scanner(System.in);
        String sender = in.nextLine();
        System.out.print("Who are you sending it to? ");
        String hobby = in.nextLine();
        p.setName(name);
        p.setHobby(hobby);
        p.save();
    }
}
