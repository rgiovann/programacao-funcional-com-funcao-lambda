public class RegraPagamentoEmAtraso extends CadeiaRegras{
    public RegraPagamentoEmAtraso()
    {
        super(null);
    }

    public RegraPagamentoEmAtraso(Regra next){
        super(next);
    }

    public boolean aplicar(Cliente cli)
    {
        if( !cli.temPagamentosAtraso())
        {
            return aplicarProximaRegra(cli);
        }
        return false;
    }
}
