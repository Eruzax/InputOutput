public class Message
{
    private String receiver;
    private String sender;
    private String message;

    public Message();
    {
        receiver = "";
        sender = "";
        message = "";
    }
    public Message(String receiver, String sender)
    {
        this.receiver = receiver;
        this.sender = sender;
        message = "";
    }

    public String getSender()
    {
        return sender;
    }

    public String getReceiver()
    {
        return receiver;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String m)
    {
        message = m;
    }

    public String toString()
    {
        return "From: " + sender + " To: " + receiver + "\n" + message;
    }
}
