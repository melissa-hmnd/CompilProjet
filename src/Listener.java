public class Listener extends LTBaseListener {

    // Creation d'un objet de type TS
    private Ts ts = new Ts();

    // Declaration de la liste qui contiendra les erreurs rencontrees
    ArrayList<String> listeErreurs = new ArrayList<>();
    //table de hashage pour y mettre le type et la regle
    private HashMap<ParserRuleContext, Integer> types = new HashMap<>();
    
    // compatibilite des types
    private static int typesC[] = {0, INT | FLOAT, INT | FLOAT, INT | FLOAT}; 
    private static int typesA[] = {0, INT, INT | FLOAT, INT | FLOAT}; 

    // valeur correspondante a une variable declaree
    private static final int DECLARED = 1;
    // valeur correspondante a une variable non declaree
    private static final int UNDECLARED = 2;
    // valeur correspondante au type float
    private static final int FLOAT = 2;
    // valeur correspondante au type int
    private static final int INT = 1;
    // valeur correspondante au type string
    private static final int STRING = 3;

    public void exitProgram(TinyParser.ProgContext ctx) {

        if (listeErreurs.size() == 0) // aucune erreur rencontree lors de la compilation
        {
            // Affichage de la TS
            System.out.println("Aucune erreur rencontree. \n");
        } else {
            int j;
            System.out.println("\n\t\t les différentes erreurs de votre programme: \n");
            nberreur = listeErreurs.size();
            for (j = 0; j < listeErreurs.size(); j++) {
                System.out.println(listeErreurs.get(j));
            }
        }

    }

    public void exitDec(TLParser.DecContext ctx) {
        int type;
        if (ctx.type().getText().equals("intCompil") == True )
        {type = INT;}
        else if (ctx.type().getText().equals("floatCompil") == True )
        {type = FLOAT;}
        else {type = STRING;}

        TLParser.VarsContext var = ctx.var();

        for (; ; var = vars.var()) // loop over vars
        {
            String varName = var.getChild(0).getText();
            if (ts.containsElement(varName)) {
                errors.add("Double declaration of variable: " + varName);
            } else
                ts.addElement(new Ts.Element(varName, DECLARED, type, ""));
            if (var.var() == null)
                return;
        }

    }

    public void exitIdentifier(TLParser.IdentifierContext ctx) {
        // verifier si L'ID a ete declare
        if (!ts.containsElement(ctx.ID().getText())) {
            listeErreurs.add("variable " + ctx.ID().getText() + " has not been declared at line " + ctx.ID().getSymbol().getLine());
            // Ajouter l'idf non declare a ts pour ne pas regenerer la meme erreur
            ts.addElement(new ts.Element(ctx.ID().getText(), false, INT | FLOAT, ""));

        }
    }


    public void exitAff(TinyParser.AffContext ctx) {

        if (ctx.ID() != null) {
            if (!ts.containsElement(ctx.ID().getText())) {
                //on verifie si l'identificateur existe dans la TS
                //la variable n'est pas declaree
                listeErreurs.
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    ("Ereeur: la variable " + ctx.ID().getText() + " n'est pas declaree");
            } else {
                //la variable est declaree, on verifie le type de l'idf et la variable affectee
                //on recupere le type de la variable de la ts de hachage Ruletype
                if ((ts.getElement(ctx.ID().getText()).type) != (Ruletype.get(ctx.oprt()))) {
                    String typevar;
                    if (Ruletype.get(ctx.oprt()) == 1)
                        typevar = " int";
                    else
                        typevar = "float";
                    listeErreurs.add("Ereeur: incompatibilité des types de la variable " + ts.getElement(ctx.ID().getText()) + " et la variable " + ctx.oprt().getText() + " type :" + typevar);
                }
            }
        }
    }

    public void exitWrite(TLParser.WriteContext ctx) {
        if (ctx.listeid().IDF() != null) {
            //si c'est un idf a afficher on verifie s'il est declaré
            if (!ts.containsElement(ctx.listeid().getText())) {
                listeErreurs.add("Erreur: la variable " + ctx.t().getText() + " n'est pas declaree");
            }
        }
    }

    public void exitExp(TLParser.ExpContext ctx) {
        if (ctx.exp() == null)
            addCtxType(ctx, getCtxType(ctx.complicated()));
        else {
            showText(ctx.complicated().getText() + " type: " + getCtxType(ctx.complicated()) + " and " + ctx.exp().getText() + " type: " + getCtxType(ctx.exp()), TextDisplayer.RANDOMCOMMENTS);
            if (typesCompatible(getCtxType(ctx.complicated()), getCtxType(ctx.exp())))
                addCtxType(ctx, getResultingType(getCtxType(ctx.tcomplicated), getCtxType(ctx.exp())));
            else {
                addCtxType(ctx, 0); // type 0 will always generate error
                listeErreurs.add("Ereeur: incompatibilité des types entre" + ctx.t().getText() + " et " + ctx.exp().getText(), TextDisplayer.IMPORTANTCOMMENTS);
            }

        }
    }


    @Override
    public void exitcomplicated(TLParser.TContext ctx) {
        if (ctx.complicated() == null)
            addCtxType(ctx, getCtxType(ctx.fex()));
        else {
            system.out.print(ctx.complicated().getText() + " type: " + getCtxType(ctx.complicated()) + " and " + ctx.fex().getText() + " type: " + getCtxType(ctx.fex()), TextDisplayer.MOREINFORMATIONS);
            if (typesCompatible(getCtxType(ctx.fex()), getCtxType(ctx.complicated)))
                addCtxType(ctx, getResultingType(getCtxType(ctx.complicated()), getCtxType(ctx.fex())));
            else {
                addCtxType(ctx, 0); // type 0 will always generate error
                listeErreurs.add("Erreur: incompatibilité des types entre  " + ctx.complicated().getText() + " et " + ctx.fex().getText(), TextDisplayer.IMPORTANTCOMMENTS);
            }
        }
    }

    @Override
    public void exitFex(TLParser.EndExContext ctx) {
        if (ctx.ID() != null)
            addCtxType(ctx, table.getElement(ctx.ID().getText()).type);
        else if (ctx.exp() != null)
            addCtxType(ctx, getCtxType(ctx.exp()));
        else
            addCtxType(ctx, getCtxType(ctx.val()));
    }


    @Override
    public void exitVal(TinyLangageSIIParser.ValContext ctx) {
        addCtxType(ctx, (ctx.INTEGERVAL() != null) ? INT : FLOAT);
    }


    private void addCtxType(ParserRuleContext ctx, int type) {
        types.put(ctx, type);
    }

    private int getCtxType(ParserRuleContext ctx) {
        return types.get(ctx);
    }

    private void clearMap() {
        types.clear();
    }

    private static boolean typesCompatible(int t1, int t2) {
        return (typesC[t1] & t2) != 0;
    }

    private static boolean affectTypesCompatible(int t1, int t2) {
        return (typesA[t1] & t2) != 0;
    }

    private static int getResultingType(int t1, int t2) {
        return ((t1 & t2 & INT) != 0) ? INT : FLOAT;
    }

    private void showText(String text, int typeOfText) {
        TextDisplayer.getInstance().showText(text, typeOfText, TextDisplayer.SEMANTICERR);
    }

    public Ts getTable() {
        return table;
    }
}




