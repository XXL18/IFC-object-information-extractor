import java.util.*;

public class infoExtractor {
    public static void main(String[] args){

        String rdfPathName = "src/main/resources/instances/Duplex_A_20110505.ttl";

        infoExtractorUtil colorExtractorUtil = new infoExtractorUtil(rdfPathName,"IfcElement",
                "inst:IfcWallStandardCase_3758","IfcMaterial");
        System.out.println("============== Initial input ===================");
        System.out.println("IFC object instance" + ":IfcWallStandardCase_3758" );
        System.out.println("IFC information entity" + ":IfcMaterial");
        System.out.println("=====================end========================\n");

        System.out.println("========Intermediate results in SPARQL query generation process=========");
        List<String> finalQueryResult = colorExtractorUtil.queryInfoForElement();
        System.out.println("=================================end====================================\n");

        System.out.println("============== Final query result ===================");
        System.out.println(finalQueryResult);
        System.out.println("===================== end ===========================\n");


    }
}