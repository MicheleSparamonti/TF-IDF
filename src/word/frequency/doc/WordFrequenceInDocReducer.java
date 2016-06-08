package word.frequency.doc;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
 
/**
 * LineIndexReducer Takes a list of filename@offset entries for a single word and concatenates them into a list.
 */
public class WordFrequenceInDocReducer extends Reducer<Text, IntWritable, Text, IntWritable> {
 
    public WordFrequenceInDocReducer() {
    }
 
    protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
 
        int sum = 0;
        for (IntWritable val : values) {
            sum += val.get();
        }
        //write the key and the adjusted value (removing the last comma)
        context.write(key, new IntWritable(sum));
    }
}
