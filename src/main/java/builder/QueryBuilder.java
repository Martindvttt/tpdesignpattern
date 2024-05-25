package builder;

public abstract class QueryBuilder {
    public abstract String buildLimitQuery(int limit);
    public abstract String buildSubstringQuery(String field, int start, int length);
}
