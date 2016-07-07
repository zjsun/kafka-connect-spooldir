package io.confluent.kafka.connect.source.io.processing;

import org.apache.kafka.connect.source.SourceRecord;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public interface RecordProcessor extends AutoCloseable {
  void configure(Map<?, ?> configValues,
                 InputStream inputStream,
                 String fileName) throws IOException;

  long lineNumber();

  List<SourceRecord> poll() throws IOException;
}
