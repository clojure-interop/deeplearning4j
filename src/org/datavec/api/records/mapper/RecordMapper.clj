(ns org.datavec.api.records.mapper.RecordMapper
  "This takes data from a specified RecordReader
 and writes the data out with the specified RecordWriter.
 The setup is as follows:
 Specify a RecordReader as the data source
 Specify a RecordWriter as the destination.
 When setting up the locations, use 2 different InputSplit
 callling RecordWriter.initialize(InputSplit, Partitioner)
 and RecordReader.initialize(InputSplit)
 respectively to configure the locations of where the data will be
 read from and written to.
 When writing the data, you need to specify a link Partitioner to
 determine how to slice up the data being written (say in to number of lines per record per file
 per NumberOfRecordsPartitioner among other implementations.
 Finally, you may specify a batch size for batch read and write if the record reader and writer support it.
 Of note, is you can also specify multiple readers.
 In which case, it will read from every stream jointly and write out the specified
 writer accordingly.
 copy() will work the same with the following exceptions, you must specify
 splitPerReader (one split per reader)
 readersToConcat and the readers which will be read from
 writing to the same record writer.
 See copy() for more information here."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.mapper RecordMapper]))

(defn ->record-mapper
  "Constructor."
  (^RecordMapper []
    (new RecordMapper )))

(defn copy
  "Copy the RecordReader
  data using the RecordWriter.
  Note that unless batch is supported by
  both the RecordReader and RecordWriter
  then writes will happen one at a time.
  You can see if batch is enabled via RecordReader.batchesSupported()
  and RecordWriter.supportsBatch() respectively.

  throws: java.lang.Exception"
  ([^RecordMapper this]
    (-> this (.copy))))

