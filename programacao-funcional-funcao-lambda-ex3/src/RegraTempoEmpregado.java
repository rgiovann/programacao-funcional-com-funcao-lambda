public class RegraTempoEmpregado extends CadeiaRegras{

    public RegraTempoEmpregado()
    {
        super(null);
    }

    public RegraTempoEmpregado(Regra next){
        super(next);
    }

    public boolean aplicar(Cliente cli)
    {
        if( cli.getTempoEmpregado() > 0)
        {
            return aplicarProximaRegra(cli);
        }
        return false;
    }
}
