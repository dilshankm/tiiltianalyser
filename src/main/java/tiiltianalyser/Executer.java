package tiiltianalyser;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import com.google.gson.Gson;

public class Executer {

	public static void main(String[] args) {
		Gson gson = new Gson();
		try {
			BufferedReader br = new BufferedReader(new FileReader("/home/dilshan/audit.json"));
			Result result = gson.fromJson(br, Result.class);
			List<Data> inputData = Arrays.asList(result.getData());
			List<Data> outputData = new ArrayList<Data>();
			for (Iterator iterator = inputData.iterator(); iterator.hasNext();) {
				Data data = (Data) iterator.next();
				if (data.getEvent().equals("INTERNAL_SERVER_ERROR")) {
					outputData.add(data);
				}
			}
			new SpreadSheetExecuter().insertData(outputData);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
