public class RegraSPC extends CadeiaRegras{

    public RegraSPC()
    {
        super(null);
    }

    public RegraSPC(Regra next){
        super(next);
    }

    public boolean aplicar(Cliente cli)
    {
        if( !cli.temRestricoesSPC())
        {
            return aplicarProximaRegra(cli);
        }
        return false;
    }

}
