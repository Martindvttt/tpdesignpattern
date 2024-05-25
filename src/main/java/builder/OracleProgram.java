package builder;

public class OracleProgram extends Program {
    private OracleQueryBuilder queryBuilder = new OracleQueryBuilder();

    @Override
    public void addLimitQuery(int limit) {
        queries.add(queryBuilder.buildLimitQuery(limit));
    }

    @Override
    public void addSubstringQuery(String field, int start, int length) {
        queries.add(queryBuilder.buildSubstringQuery(field, start, length));
    }
}