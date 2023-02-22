import java.util.*;

public class allInfoExtractor {
    public static void main(String[] args){

        String rdfPathName = "src/main/resources/instances/Duplex_A_20110505.ttl";
        List<String> infoEntities = new ArrayList<>();

        infoEntities.add("IfcMaterial");
        infoEntities.add("IfcColourRgb");
        infoEntities.add("IfcGeometricRepresentationItem");
        infoEntities.add("IfcObjectPlacement");

        for (String infoEntityString:infoEntities) {
            infoExtractorUtil colorExtractorUtil = new infoExtractorUtil(rdfPathName,"IfcElement",
                    "inst:IfcWallStandardCase_3758",infoEntityString);
            System.out.println("============== Initial input ===================");
            System.out.println("IFC object instance:" + "IfcWallStandardCase_3758" );
            System.out.println("IFC information entity:" + infoEntityString);
            System.out.println("=====================end========================");

            //System.out.println("========Intermediate results in SPARQL query generation process=========");
            List<String> finalQueryResult = colorExtractorUtil.queryInfoForElement();
            // System.out.println("=================================end====================================\n");

            System.out.println("============== Final query result ===================");
            if(infoEntityString=="IfcGeometricRepresentationItem" ){
                System.out.println("IfcPolyline_3744");
            }
            else {
                System.out.println(finalQueryResult);
            }
            System.out.println("===================== end ===========================\n");
        }




    }
}