package Brown_Hack.Project_50;

import com.mashape.unirest.http.exceptions.UnirestException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ToText test = new ToText();
        ToAudio test1 = new ToAudio();
        try {
            test1.toRun(test.run("Automatic summarization is the process of reducing a text document with a computer program in order to create a summary that retains the most important points of the original document. As the problem of information overload has grown, and as the quantity of data has increased, so has interest in automatic summarization. Technologies that can make a coherent summary take into account variables such as length, writing style and syntax. An example of the use of summarization technology is search engines such as Google. Document summarization is another.", 2),false,"test_one");
        } catch (UnirestException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println( "Hello World!" );
    }
}
