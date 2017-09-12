package tiiltianalyser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class SpreadSheetExecuter {

	public SpreadSheetExecuter() {
		// TODO Auto-generated constructor stub
	}

	public void insertData(List<Data> outputDatas) {

		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("LtiData");

		Map<String, Object[]> data = new HashMap<String, Object[]>();
		int index = 0;
		for (Data outputData : outputDatas) {
			if (index == 0) {
				data.put(Integer.toString(index),
						new Object[] { "Platform", "CourseId", "AssignmentId", "Student_Id", "DocId", "TiiAssignmentId",
								"TiiPaperId", "Submission Message", "Retry count", "Draft", "Assignment timestamp" });
			}
			else{
				data.put(Integer.toString(index), new Object[] { outputData.getPlatform(), outputData.getCourseId(), outputData.getAssignmentId(), outputData.getStudentId(), outputData.getDocId(), outputData.getAssignmentIdTii(),
						outputData.getTiiPaperId(), outputData.getEvent(), outputData.getRetryCount(), outputData.getDraft(), Util.convertMilistoDate(outputData.getAssignmentTimestamp())});
			}
			index = index+1;
		}

		Set<String> keyset = data.keySet();
		int rownum = 0;
		for (String key : keyset) {
			Row row = sheet.createRow(rownum++);
			Object[] objArr = data.get(key);
			int cellnum = 0;
			for (Object obj : objArr) {
				Cell cell = row.createCell(cellnum++);
				if (obj instanceof Date)
					cell.setCellValue((Date) obj);
				else if (obj instanceof Boolean)
					cell.setCellValue((Boolean) obj);
				else if (obj instanceof String)
					cell.setCellValue((String) obj);
				else if (obj instanceof Double)
					cell.setCellValue((Double) obj);
			}
		}

		try {
			FileOutputStream out = new FileOutputStream(new File("/home/dilshan/test.xls"));
			workbook.write(out);
			out.close();
			System.out.println("Excel written successfully..");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
