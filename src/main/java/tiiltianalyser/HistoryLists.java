package tiiltianalyser;

public class HistoryLists
{
    private String timestamp;

    private String status;

    private String event;

    public String getTimestamp ()
    {
        return timestamp;
    }

    public void setTimestamp (String timestamp)
    {
        this.timestamp = timestamp;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public String getEvent ()
    {
        return event;
    }

    public void setEvent (String event)
    {
        this.event = event;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [timestamp = "+timestamp+", status = "+status+", event = "+event+"]";
    }
}
