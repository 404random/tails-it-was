package Brown_Hack.Project_50;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class ToText {
    public ToText(){
    }
    
    public String run(String in, int length) throws UnirestException{
        HttpResponse<JsonNode> response = Unirest.post("https://textanalysis-text-summarization.p.mashape.com/text-summarizer-text")
                .header("X-Mashape-Key", "SUf4NVLPMxmshlTgrjCpu0Lfawynp1vyziEjsnWvrXoNP1g7AS")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .header("Accept", "application/json")
                .field("sentnum", length)
                .field("text", in)
                .asJson();
       String out= response.getBody().getObject().toString(2);
       System.out.println(out);
       out=out.substring(16,out.length()-3);
       System.out.println(out);
        return out;
        
    }
}
