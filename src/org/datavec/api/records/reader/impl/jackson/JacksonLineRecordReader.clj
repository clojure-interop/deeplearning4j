(ns org.datavec.api.records.reader.impl.jackson.JacksonLineRecordReader
  "JacksonLineRecordReader will read a single file line-by-line when .next() is
 called. It uses Jackson ObjectMapper and FieldSelection to read the fields in
 each line.

 Each line should be a valid JSON entry without separator at the end. This is similar
 to other readers and follows Hadoop convention. Hadoop and Spark use this format to
 to make sure splits work properly in a cluster environment. For those new to Hadoop
 file format convention, the reason is a large file can be split into chunks and
 sent to different nodes in a cluster. If a record spanned multiple lines, split
 might not get the complete record, which will result in runtime errors and calculation
 errors. Where and how a job splits a file varies depending on the job configuration
 and cluster size.

 A couple of important notes. The reader doesn't automatically create labels for each
 record like JacksonRecordReader. JacksonRecordReader uses the folder name for the label
 at runtime. It assumes a top level folder has multiple subfolders. The labels are the
 subfolder names.

 In the case of JacksonLineRecordReader, you have to provide the labels in the configuration
 for the training. Please look at the examples in dl4j-examples repository on how to provide
 labels."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.reader.impl.jackson JacksonLineRecordReader]))

(defn ->jackson-line-record-reader
  "Constructor.

  selection - `org.datavec.api.records.reader.impl.jackson.FieldSelection`
  mapper - `org.nd4j.shade.jackson.databind.ObjectMapper`"
  (^JacksonLineRecordReader [^org.datavec.api.records.reader.impl.jackson.FieldSelection selection ^org.nd4j.shade.jackson.databind.ObjectMapper mapper]
    (new JacksonLineRecordReader selection mapper)))

(defn next
  "Description copied from interface: RecordReader

  returns: `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^JacksonLineRecordReader this]
    (-> this (.next))))

(defn get-labels
  "Description copied from interface: RecordReader

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^JacksonLineRecordReader this]
    (-> this (.getLabels))))

