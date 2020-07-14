package Superpowers;

public class SuperHuman extends Human
{
    private String alias;
    private Affiliation affiliation;
    private String ability;
    private String catchPhrase;

    public SuperHuman()
    {
        super();
    }

    public SuperHuman(String alias, Affiliation affiliation, String ability, String catchPhrase)
    {
        this.alias = alias;
        this.affiliation = affiliation;
        this.ability = ability;
        this.catchPhrase = catchPhrase;
    }

    public String catchPhrase()
    {
        return this.catchPhrase;
    }
    public void setCatchPhrase(String catchPhrase)
    {
        this.catchPhrase = catchPhrase;
    }

    public String getAlias()
    {
        return this.alias;
    }
    public void setAlias(String alias)
    {
        this.alias = alias;
    }

    public String getAffiliation()
    {
        return this.affiliation.toString();
    }
    public void setAffiliation(Affiliation affiliation)
    {
        this.affiliation = affiliation;
    }

    public String getAbility()
    {
        return this.ability;
    }
    public void setAbility(String ability)
    {
        this.ability = ability;
    }

    public String usePower()
    {
        return catchPhrase() + " " + "Fwoosh fwip fwop";
    }

}
