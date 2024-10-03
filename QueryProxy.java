class QueryProxy implements Query {
    private RealQuery realQuery;
    private Map<String, String> cache;

    public QueryProxy() {
        this.realQuery = new RealQuery();
        this.cache = new HashMap<>();
    }

    @Override
    public String execute(String sql) {
        if (cache.containsKey(sql)) {
            System.out.println("Retornando resultado do cache para: " + sql);
            return cache.get(sql);
        } else {
            System.out.println("Consulta não encontrada no cache. Realizando consulta...");
            String result = realQuery.execute(sql);
            cache.put(sql, result);
            return result;
        }
    }
}