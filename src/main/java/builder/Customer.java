package builder;

public class Customer {
    public static void main(String[] args) {
        ProgramManager manager = new ProgramManager();

        Program oracleProgram = manager.createProgram("oracle");
        oracleProgram.addLimitQuery(10);
        oracleProgram.addSubstringQuery("name", 1, 5);
        System.out.println("Oracle Queries: " + oracleProgram.getQueries());

        Program mySQLProgram = manager.createProgram("mysql");
        mySQLProgram.addLimitQuery(10);
        mySQLProgram.addSubstringQuery("name", 1, 5);
        System.out.println("MySQL Queries: " + mySQLProgram.getQueries());
    }
}