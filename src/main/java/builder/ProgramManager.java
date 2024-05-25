package builder;

public class ProgramManager {
    public Program createProgram(String dbType) {
        if (dbType.equalsIgnoreCase("oracle")) {
            return new OracleProgram();
        } else if (dbType.equalsIgnoreCase("mysql")) {
            return new MySQLProgram();
        } else {
            throw new IllegalArgumentException("Unknown database type");
        }
    }
}