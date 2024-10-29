public class WriteLines {
    public WriteLines(String filename) throws IOException {
        PrintWriter output = new PrintWriter(new FileWriter(filename));
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String linea = input.readLine();
        while (!linea.equals("")) {
            output.println(linea);
            linea = input.readLine();
        }
        input.close();
        output.close();
    }
}
