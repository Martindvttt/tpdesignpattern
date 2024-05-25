package builder;

public class OracleQueryBuilder extends QueryBuilder {
    @Override
    public String buildLimitQuery(int limit) {
        return "SELECT * FROM (SELECT a.*, ROWNUM rnum FROM (SELECT * FROM table) a WHERE ROWNUM <= " + limit + ") WHERE rnum > " + (limit - 10);
    }

    @Override
    public String buildSubstringQuery(String field, int start, int length) {
        return "SELECT SUBSTR(" + field + ", " + start + ", " + length + ") FROM table";
    }
}
