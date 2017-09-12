package tiiltianalyser;

public class Result
{
    private String draw;

    private String recordsFiltered;

    private Data[] data;

    private String recordsTotal;

    public String getDraw ()
    {
        return draw;
    }

    public void setDraw (String draw)
    {
        this.draw = draw;
    }

    public String getRecordsFiltered ()
    {
        return recordsFiltered;
    }

    public void setRecordsFiltered (String recordsFiltered)
    {
        this.recordsFiltered = recordsFiltered;
    }

    public Data[] getData ()
    {
        return data;
    }

    public void setData (Data[] data)
    {
        this.data = data;
    }

    public String getRecordsTotal ()
    {
        return recordsTotal;
    }

    public void setRecordsTotal (String recordsTotal)
    {
        this.recordsTotal = recordsTotal;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [draw = "+draw+", recordsFiltered = "+recordsFiltered+", data = "+data+", recordsTotal = "+recordsTotal+"]";
    }
}
