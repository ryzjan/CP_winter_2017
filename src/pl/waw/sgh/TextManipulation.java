package pl.waw.sgh;

public class TextManipulation {
    public static void main(String[] args) {
        //String myText = "Two journalists working on stories about Rohingya in Myanmar for the news agency Reuters have been arrested and detained in the Southeast Asian country's largest city, Yangon.\n" +
                               //"The two reporters, named by the agency as Wa Lone and Kyaw Soe Oo, were arrested under the Official Secrets Act, a colonial-era law which carries a maximum";
                String myText = "Totalna kontrola społeczeństwa. Władza, która wie, co jesz, gdzie bywasz, co myślisz i z kim sypiasz – każdego dnia, przez całe twoje życie. Ta wizja od lat przeraża i inspiruje. A jednocześnie właśnie staje się rzeczywistością – od 2020 roku dla przeszło miliarda ludzi. (http://www.tvn24.pl)";
        String s = "sypiasz – każdego";
        String s1 = "sypiasz - każdego";

        myText=myText.replace(",","");
        myText=myText.replace(".","");
        myText=myText.replace("-","");
        myText=myText.toLowerCase();
        //System.out.println(myText);

        int hyph= s.indexOf("–");
        System.out.println((int)s.charAt(hyph));
        System.out.println((int)s1.charAt(s1.indexOf("-")));

        System.out.println(s);


    }

}
