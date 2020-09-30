import java.io.*;

public class ReadFileExample {
    public void readFileText (String path) throws FileNotFoundException{
        try {
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tổng= " + sum);
        } catch (IOException e) {
            System.err.print("File không tồn tại");
        }
        catch (NumberFormatException e){
            System.err.print("File có dữ liệu không thể chuyển sang số để tính tổng. ");
        }
    }
}
