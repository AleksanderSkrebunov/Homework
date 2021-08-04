package groupID.FirstMaven;

import java.util.*;

/** First test class documentation
 *
 */
public class Credit9 {

    /** Method, wich calculate the number of occurrences of a string
     * in a substring
     * @param str - string
     * @param substring - searched substring
     * @return count - number of occurrences of a string
     */
    public static int substringCount(String str, String substring) {
        int count1 = 0, count = 0;
        for (int i = 0; i < str.length(); i++) {
            count1 = str.indexOf(substring, i);
            if (count1 >= i) {
                i = count1 + substring.length() - 1;
                count++;
            }
        }
        return count;
    }

    Singers singer1 = new Singers("Nico", 0);
    Singers singer2 = new Singers("Zatochka", 0);
    Singers singer3 = new Singers("DU", 0);
    Genres juze = new Genres("juze",0);
    Genres bluse = new Genres("bluse",0);
    Genres reggy = new Genres("reggy",0);
    Genres rock = new Genres("rock",0);
    Genres folk = new Genres("folk",0);
    Genres metal = new Genres("metal",0);
    Genres pop = new Genres("pop",0);
    Genres techno = new Genres("techno",0);
    Genres house = new Genres("house",0);
    Genres indie = new Genres("indie",0);
    List<Singers> singersList = new ArrayList<>();
    List<Comment> commentList = new ArrayList<>();

    /**
     *
     * @param answer
     * @return
     */
    public Singers whatASinger(String answer){
        Singers singerReturn = new Singers(null,0);
        if(singer1.getName().equals(answer)){
            singer1.setVoices(singer1.getVoices()+1);
            singerReturn = singer1;
        }else if(singer2.getName().equals(answer)){
            singer2.setVoices(singer2.getVoices()+1);
            singerReturn = singer2;
        }else if(singer3.getName().equals(answer)){
            singer3.setVoices(singer3.getVoices()+1);
            singerReturn = singer3;
        }
        return singerReturn;
    }

    public List<Genres> bestGenres(String[] s){
        List<Genres> genresList = new ArrayList<>();
        genresList.add(juze); genresList.add(bluse);genresList.add(reggy);genresList.add(rock);genresList.add(folk);
        genresList.add(metal);genresList.add(pop);genresList.add(techno);genresList.add(house);genresList.add(indie);
        for(Genres g:genresList){
            for(String t:s){
                if(t.equals(g.getName())){
                    g.setVoices(g.getVoices()+1);
                } } }
        Collections.sort(genresList, new Comparator<Genres>() {
            @Override
            public int compare(Genres o1, Genres o2) {return o2.getVoices() - o1.getVoices();}});
        return genresList; }

    public List<Singers> bestSingers() {
        singersList.clear();
        singersList.add(singer1);
        singersList.add(singer2);
        singersList.add(singer3);
        singersList.sort(new Comparator<Singers>() {
            @Override
            public int compare(Singers o1, Singers o2) {
                return o2.getVoices() - o1.getVoices();
            }
        });
        return singersList;}

    public List<Comment> commentsByTime(String s){
        Date date = new Date(); long millis = date.getTime(); int temp = (int) (millis/3600);
        Comment com = new Comment(s,temp);
        commentList.add(com);
        Collections.sort(commentList, new Comparator<Comment>() {
            @Override
            public  int compare(Comment o1, Comment o2) {return o2.getTime() - o1.getTime();}});
        return commentList; }
}
