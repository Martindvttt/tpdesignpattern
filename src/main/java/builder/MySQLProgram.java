package builder;

public class MySQLProgram extends Program {
    private MySQLQueryBuilder queryBuilder = new MySQLQueryBuilder();

    @Override
    public void addLimitQuery(int limit) {
        queries.add(queryBuilder.buildLimitQuery(limit));
    }

    @Override
    public void addSubstringQuery(String field, int start, int length) {
        queries.add(queryBuilder.buildSubstringQuery(field, start, length));
    }
}