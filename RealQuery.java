class RealQuery implements Query {
    @Override
    public String execute(String sql) {
        System.out.println("Executando consulta no banco de dados: " + sql);
        return "Resultado da consulta para: " + sql;
    }
}