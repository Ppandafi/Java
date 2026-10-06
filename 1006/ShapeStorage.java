import java.io.*;

class ShapeStorage{
	private String filename;
	
	public ShapeStorage(String filename) {
		this.filename = filename;
	}
	
	public void readShapes() throws IOException {
		BufferedReader inFile = null;
		
		try {
			inFile = new BufferedReader(new FileReader(this.filename));
			String line = null;
			
			while ((line = inFile.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			throw new IOException("File read failed");
		} finally {
			if(inFile != null) inFile.close();
		}
	}
	
	public void WriteShapes(String text) throws IOException {
		PrintWriter outFile = null;
		try {
			outFile = new PrintWriter(this.filename);
			outFile.println(text);
		} catch(IOException e) {
			throw new IOException("Failed to write", e);
		} finally {
			if(outFile != null) {
				outFile.close();
			}
		}
	}
}