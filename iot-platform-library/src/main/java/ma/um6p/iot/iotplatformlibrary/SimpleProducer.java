package ma.um6p.iot.iotplatformlibrary;

//Created by Abdeljalil BENETTALEB on 3/14/2018.

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class SimpleProducer {
    public static void main(String[] args) throws Exception {
        System.out.println("Hi From SimpleProducer");
        createTopic("Topic","Key", "Value");
    }

    public static void createTopic(String topicName, String key, String value) {
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092,localhost:9093");
        props.put("key.serializer","org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        Producer<String, String> producer = new KafkaProducer<>(props);

        ProducerRecord<String, String> record = new ProducerRecord<>(topicName, key, value);
        producer.send(record);
        producer.close();

        System.out.println("SimpleProducer Completed");
    }
}
