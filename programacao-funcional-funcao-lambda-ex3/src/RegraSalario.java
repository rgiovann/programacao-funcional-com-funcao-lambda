public class RegraSalario extends CadeiaRegras{
    public RegraSalario()
    {
        super(null);
    }

    public RegraSalario(Regra next){
        super(next);
    }

    public boolean aplicar(Cliente cli)
    {
        if( cli.getSalario() > 2000.0)
        {
            return aplicarProximaRegra(cli);
        }
        return false;
    }
}
