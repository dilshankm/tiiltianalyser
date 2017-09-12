package tiiltianalyser;

public class Data
{
    private HistoryLists[] historyLists;

    private String platform;

    private String status;

    private String assignmentIdTii;

    private String courseId;

    private String type;

    private String assignmentId;

    private String draft;

    private String assignmentTimestamp;

    private String tiiPaperId;

    private String json;

    private String studentId;

    private String retryCount;

    private String event;

    private String docId;

    public HistoryLists[] getHistoryLists ()
    {
        return historyLists;
    }

    public void setHistoryLists (HistoryLists[] historyLists)
    {
        this.historyLists = historyLists;
    }

    public String getPlatform ()
    {
        return platform;
    }

    public void setPlatform (String platform)
    {
        this.platform = platform;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public String getAssignmentIdTii ()
    {
        return assignmentIdTii;
    }

    public void setAssignmentIdTii (String assignmentIdTii)
    {
        this.assignmentIdTii = assignmentIdTii;
    }

    public String getCourseId ()
    {
        return courseId;
    }

    public void setCourseId (String courseId)
    {
        this.courseId = courseId;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getAssignmentId ()
    {
        return assignmentId;
    }

    public void setAssignmentId (String assignmentId)
    {
        this.assignmentId = assignmentId;
    }

    public String getDraft ()
    {
        return draft;
    }

    public void setDraft (String draft)
    {
        this.draft = draft;
    }

    public String getAssignmentTimestamp ()
    {
        return assignmentTimestamp;
    }

    public void setAssignmentTimestamp (String assignmentTimestamp)
    {
        this.assignmentTimestamp = assignmentTimestamp;
    }

    public String getTiiPaperId ()
    {
        return tiiPaperId;
    }

    public void setTiiPaperId (String tiiPaperId)
    {
        this.tiiPaperId = tiiPaperId;
    }

    public String getJson ()
    {
        return json;
    }

    public void setJson (String json)
    {
        this.json = json;
    }

    public String getStudentId ()
    {
        return studentId;
    }

    public void setStudentId (String studentId)
    {
        this.studentId = studentId;
    }

    public String getRetryCount ()
    {
        return retryCount;
    }

    public void setRetryCount (String retryCount)
    {
        this.retryCount = retryCount;
    }

    public String getEvent ()
    {
        return event;
    }

    public void setEvent (String event)
    {
        this.event = event;
    }

    public String getDocId ()
    {
        return docId;
    }

    public void setDocId (String docId)
    {
        this.docId = docId;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [historyLists = "+historyLists+", platform = "+platform+", status = "+status+", assignmentIdTii = "+assignmentIdTii+", courseId = "+courseId+", type = "+type+", assignmentId = "+assignmentId+", draft = "+draft+", assignmentTimestamp = "+assignmentTimestamp+", tiiPaperId = "+tiiPaperId+", json = "+json+", studentId = "+studentId+", retryCount = "+retryCount+", event = "+event+", docId = "+docId+"]";
    }
}
