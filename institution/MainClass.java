public class MainClass{
    public static void main(String[] args) {
        // Création d'instances ou objets de nos fameux class 
        Institution ins=new Institution("ISP", "public","RDC" ,2000 ); 
        Universite u1 = new Universite("ULPGL", "privée", "RDC",1995,"LMD",8,"prof WASO" );
        Universite u2 = new Universite("UCS", "public", "RDC", 2000, "LMD", 7, "Recteur_UCS");
        
        Ecole e1 = new Ecole("École Primaire karibu", "Eglise catholique", "RDC", 2000,"privée","primaire",18);
        Ecole e2 = new Ecole("Institut Isidore Bakanja", "Eglise catholique", "RDC", 1989, "Public", "Secondaire",24);
        Ecole e3 = new Ecole("Institut Technique Kyeshero", "Eglise CEPAC", "RDC", 1990, "public", "Secondaire",24);

        // Affichage des informations
        System.out.println("==== Description Institution ==\n");
        System.out.println(ins.decrireInstitution());
        
        System.out.println("\n\n==== Description Université ====\n");
        System.out.println(u1.decrireUniversite());
        System.out.println("\n==================================\n");
        System.out.println(u2.decrireUniversite());
        System.out.println("\n\n==== Liste des Recteurs ====\n");
        System.out.println(Universite.listerRecteurs(u1, u2));
        
        System.out.println("\n==== Description École ====\n");
        System.out.println("\n==================================\n");
        System.out.println(e1.decrireEcole());
        System.out.println("\n==================================\n");
        System.out.println(e2.decrireEcole());
        System.out.println("\n==================================\n");
        System.out.println(e3.decrireEcole());
        System.out.println("\n\n==== Liste des Promoteurs ====\n");
        System.out.println(Ecole.listerPromoteurs(e1, e2, e3));
    }
}
