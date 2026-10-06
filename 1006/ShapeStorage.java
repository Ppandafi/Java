import java.io.*;

class ShapeStorage{
	private String filename;
	
	public ShapeStorage(String filename) {
		this.filename = filename;
	}
	
	public Shape[] readShapes() throws IOException {
		BufferedReader inFile = null;
		Shape[] shapeArr = new Shape[10];
		int index = 0;
		
		try {
			inFile = new BufferedReader(new FileReader(this.filename));
			String line = null;
			
			while ((line = inFile.readLine()) != null) {
				//kor feldolgozasa
				String[] components = line.split(",");
				if (components[0].equals("C")) {
					Double x = Double.parseDouble(components[1]);
					Double y = Double.parseDouble(components[2]);
					Double radius = Double.parseDouble(components[3]);
					shapeArr[index] = new Circle(new Point(x, y, 'P'), radius);
					index++;
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			throw new IOException("File read failed");
		} finally {
			if(inFile != null) inFile.close();
		}
		
		return shapeArr;
	}
	
	public void WriteShapes(Shape[] shapeArr) throws IOException {
		PrintWriter outFile = null;
		try {
			outFile = new PrintWriter(this.filename);
			for(int i=0; i<shapeArr.length; i++) {
				outFile.println(shapeArr[i].fileFormat());
			}
		} catch(IOException e) {
			throw new IOException("Failed to write", e);
		} finally {
			if(outFile != null) {
				outFile.close();
			}
		}
	}
}