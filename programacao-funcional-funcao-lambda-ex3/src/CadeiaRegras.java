public abstract class CadeiaRegras implements Regra
{
    private Regra proxima;

    public CadeiaRegras(Regra proximaRegra)
    {
        this.proxima  = proximaRegra;
    }

    protected boolean  aplicarProximaRegra(Cliente cli)
    {
        if (proxima == null)
        {
            return true;
        }
        return proxima.aplicar(cli);
    }
}
