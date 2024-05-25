package builder;
import java.util.ArrayList;
import java.util.List;

public abstract class Program {
    protected List<String> queries = new ArrayList<>();

    public abstract void addLimitQuery(int limit);
    public abstract void addSubstringQuery(String field, int start, int length);

    public List<String> getQueries() {
        return queries;
    }
}
