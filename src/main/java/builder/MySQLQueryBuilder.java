package builder;

public class MySQLQueryBuilder extends QueryBuilder {
    @Override
    public String buildLimitQuery(int limit) {
        return "SELECT * FROM table LIMIT " + limit;
    }

    @Override
    public String buildSubstringQuery(String field, int start, int length) {
        return "SELECT SUBSTRING(" + field + ", " + start + ", " + length + ") FROM table";
    }
}